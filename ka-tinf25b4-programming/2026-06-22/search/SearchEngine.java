package search;

import java.util.ArrayList;
import java.util.List;

public class SearchEngine {
    private static final int MAXTHREADS = 3;
    private static final int PREVIEW = 40;

    private static final String[] URLS = {
            "https://www.tagesschau.de",
            "https://www.sueddeutsche.de",
            "https://www.spiegel.de",
            "https://www.kit.edu"
    };

    public SearchEngine() {
        List<PageLoader> running = new ArrayList<>();
        int next = 0;

        while (next < URLS.length || !running.isEmpty()) {
            while (running.size() < MAXTHREADS && next < URLS.length) {
                PageLoader loader = new PageLoader(URLS[next++]);
                running.add(loader);
                System.out.println("Gestartet: " + loader.getUrl());
                new Thread(loader).start();
            }

            for (int i = running.size() - 1; i >= 0; i--) {
                PageLoader loader = running.get(i);
                if (loader.pageLoaded()) {
                    String content = loader.getPageContent().replaceAll("\\R", "##");
                    System.out.println("Geladen: " + loader.getUrl());
                    System.out.println("  Inhalt: " + content.substring(0, Math.min(PREVIEW, content.length())));
                    running.remove(i);
                }
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    public static void main() {
        new SearchEngine();
    }
}
