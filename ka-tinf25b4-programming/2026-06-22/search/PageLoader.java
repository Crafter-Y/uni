package search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;

public class PageLoader implements Runnable {
    private final String url;
    private String content = "";
    private volatile boolean loaded = false;

    public PageLoader(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean pageLoaded() {
        return this.loaded;
    }

    public String getPageContent() {
        return this.content;
    }

    @Override
    public void run() {
        StringBuilder buffer = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new URI(this.url).toURL().openStream(), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                buffer.append(line).append(System.lineSeparator());
            }
        } catch (Exception e) {
            System.out.println("Fehler: " + this.url + " (" + e + ")");
        }
        this.content = buffer.toString();
        this.loaded = true;
    }
}
