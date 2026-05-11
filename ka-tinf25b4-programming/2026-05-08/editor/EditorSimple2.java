package editor;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class EditorSimple2 extends JFrame {

    public EditorSimple2() {
        MenuBar menuBar = new MenuBar();

        MenuSection fileToolSection = new MenuSection.Builder()
                .add(new JMenuItem("Neu"))
                .add(new JMenuItem("Öffnen"))
                .build();

        MenuSection fileCloseSection = new MenuSection.Builder()
                .add(new JMenuItem("Schließen"))
                .build();

        MenuSection fileSaveSection = new MenuSection.Builder()
                .add(new JMenuItem("Speichern"))
                .add(new JMenuItem("Speichern unter ..."))
                .add(new JMenuItem("Als Website speichern"))
                .add(new JMenuItem("Suchen"))
                .build();

        MenuSection versionSection = new MenuSection.Builder()
                .add(new JMenuItem("Versionen"))
                .build();

        MenuSection webPreviewSection = new MenuSection.Builder()
                .add(new JMenuItem("Webseitenvorschau"))
                .build();

        MenuSection pageSection = new MenuSection.Builder()
                .add(new JMenuItem("Seite einrichten ..."))
                .add(new JMenuItem("Seitenansicht"))
                .add(new JMenuItem("Drucken"))
                .build();

        MenuSection mailSection = new MenuSection.Builder()
                .add(new JMenuItem("E-Mail-Empfänger"))
                .add(new JMenuItem("E-Mail-Empfänger (zur Überarbeitung)"))
                .add(new JMenuItem("E-Mail-Empfänger (als Anlage)"))
                .build();

        MenuSection recipientsSection = new MenuSection.Builder()
                .add(new JMenuItem("Verteilerempfänger ..."))
                .add(new JMenuItem("Onlinebesprechungsteilnehmer"))
                .add(new JMenuItem("Exchange-Ordner ..."))
                .add(new JMenuItem("Fax-Empfänger ..."))
                .build();

        MenuSection powerPointSection = new MenuSection.Builder()
                .add(new JMenuItem("Microsoft PowerPoint"))
                .build();

        Menu sendTo = new Menu.Builder()
                .setName("Senden an")
                .addSection(mailSection)
                .addSection(recipientsSection)
                .addSection(powerPointSection)
                .build();

        MenuSection propertySection = new MenuSection.Builder()
                .add(new JMenuItem("Eigenschaften"))
                .build();

        MenuSection documentSection = new MenuSection.Builder()
                .add(new JMenuItem("bilanz_2017.doc"))
                .add(new JMenuItem("bericht_2018_01.doc"))
                .add(new JMenuItem("ziele.doc"))
                .build();

        MenuSection closeSection = new MenuSection.Builder()
                .add(new JMenuItem("Beenden"))
                .build();

        Menu file = new Menu.Builder()
                .setName("Datei")
                .addSection(fileToolSection)
                .addSection(fileCloseSection)
                .addSection(fileSaveSection)
                .addSection(versionSection)
                .addSection(webPreviewSection)
                .addSection(pageSection)
                .addSubMenu(sendTo)
                .addSection(propertySection)
                .addSection(documentSection)
                .addSection(closeSection)
                .build();

        menuBar.add(file);

        MenuSection transActions = new MenuSection.Builder()
                .add(new JMenuItem("Rückgängig"))
                .add(new JMenuItem("Wiederholen"))
                .build();

        MenuSection editActions = new MenuSection.Builder()
                .add(new JMenuItem("Ausschneiden"))
                .add(new JMenuItem("Kopieren"))
                .add(new JMenuItem("Office-Zwischenablage"))
                .add(new JMenuItem("Einfügen"))
                .add(new JMenuItem("Inhalte einfügen"))
                .add(new JMenuItem("Als Hyperlink einfügen"))
                .build();

        MenuSection destructiveActions = new MenuSection.Builder()
                .add(new JMenuItem("Löschen"))
                .add(new JMenuItem("Alles markieren"))
                .build();

        MenuSection querySection = new MenuSection.Builder()
                .add(new JMenuItem("Suchen ..."))
                .add(new JMenuItem("Ersetzen ..."))
                .add(new JMenuItem("Gehe zu ..."))
                .build();

        MenuSection linkSection = new MenuSection.Builder()
                .add(new JMenuItem("Verknüpfungen ..."))
                .add(new JMenuItem("Objekt"))
                .build();

        Menu edit = new Menu.Builder()
                .setName("Bearbeiten")
                .addSection(transActions)
                .addSection(editActions)
                .addSection(destructiveActions)
                .addSection(querySection)
                .addSection(linkSection)
                .build();

        menuBar.add(edit);

        this.setJMenuBar(menuBar);
        this.initialize();
    }

    private void initialize() {
        this.setTitle("Editor");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(800, 800);
        this.setVisible(true);
    }

    private static class Menu implements Displayable {
        private final JMenu menu;

        public Menu(String name) {
            this.menu = new JMenu(name);
        }

        public void addSection(Displayable section) {
            for (JMenuItem item : section.getItems()) {
                menu.add(item);
            }
            menu.addSeparator();
        }

        @Override
        public List<JMenuItem> getItems() {
            return List.of(this.menu);
        }

        public static class Builder {
            private String name;
            private final List<Displayable> sections = new ArrayList<>();

            public Builder setName(String name) {
                this.name = name;

                return this;
            }

            public Builder addSection(MenuSection section) {
                this.sections.add(section);

                return this;
            }

            public Builder addSubMenu(Menu menu) {
                this.sections.add(menu);

                return this;
            }

            public Menu build() {
                Menu menu = new Menu(this.name);

                for (Displayable section : this.sections) {
                    menu.addSection(section);
                }
                return menu;
            }
        }

        public JMenu getMenu() {
            return this.menu;
        }
    }

    private static class MenuSection implements Displayable {
        private final List<JMenuItem> items = new ArrayList<>();

        public void addItem(JMenuItem item) {
            this.items.add(item);
        }

        public static class Builder {
            private final MenuSection menu;

            public Builder() {
                this.menu = new MenuSection();
            }

            public Builder add(JMenuItem item) {
                this.menu.addItem(item);

                return this;
            }

            public MenuSection build() {
                return this.menu;
            }
        }

        @Override
        public List<JMenuItem> getItems() {
            return this.items;
        }
    }

    private static class MenuBar extends JMenuBar {
        public void add(Menu menu) {
            super.add(menu.getMenu());
        }
    }

    public static class Factory {
        public static EditorSimple2 getEditorSimple() {
            return new EditorSimple2();
        }
    }

    private interface Displayable {
        List<JMenuItem> getItems();
    }

    public static void main() {
        EditorSimple2 editorSimple = EditorSimple2.Factory.getEditorSimple();
    }
}
