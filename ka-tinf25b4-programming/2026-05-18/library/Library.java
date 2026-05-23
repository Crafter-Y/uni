package library;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class Library extends JFrame {
    final static String OUTPUT_FILE = "./out/library.txt";

    private final Set<Book> books = new HashSet<>();

    public Library() {
        JPanel vertical = new JPanel();
        vertical.setLayout(new BoxLayout(vertical, BoxLayout.Y_AXIS));

        JPanel inputs = new JPanel();
        inputs.setLayout(new GridLayout(4,2,2,2));

        inputs.add(new JLabel("Title"));
        JTextField title = new JTextField("Der Herr der Ringe");
        inputs.add(title);

        inputs.add(new JLabel("Author"));
        JTextField author = new JTextField("John Ronald Reuel Tolkien");
        inputs.add(author);

        inputs.add(new JLabel("Year"));
        JTextField year = new JTextField("1954");
        inputs.add(year);

        inputs.add(new JLabel("Publisher"));
        JTextField publisher = new JTextField("Houghton Miffin");
        inputs.add(publisher);

        vertical.add(inputs);

        JButton saveButton = new JButton("Save entry");
        saveButton.addActionListener(_ -> saveBook(new Book(title.getText(), author.getText(), year.getText(), publisher.getText())));
        JPanel saveRow = new JPanel();
        saveRow.setLayout(new GridLayout(1,1,0,0));
        saveRow.add(saveButton);

        vertical.add(saveRow);

        JPanel outputPanel = new JPanel();

        outputPanel.add(new JLabel("Ordered output:"));

        JButton titleButton = new JButton("Title");
        titleButton.addActionListener(_ -> {
            List<Book> l = new ArrayList<>(books.stream().toList());
            l.sort(Comparator.comparing(o -> o.title));
            showBookList(l, "Title");
        });
        JButton authorButton = new JButton("Author");
        authorButton.addActionListener(_ -> {
            List<Book> l = new ArrayList<>(books.stream().toList());
            l.sort(Comparator.comparing(o -> o.author));
            showBookList(l, "Author");
        });
        JButton yearButton = new JButton("Year");
        yearButton.addActionListener(_ -> {
            List<Book> l = new ArrayList<>(books.stream().toList());
            l.sort(Comparator.comparingInt(a -> a.year));
            showBookList(l, "Year");
        });
        JButton publisherButton = new JButton("Publisher");
        publisherButton.addActionListener(_ -> {
            List<Book> l = new ArrayList<>(books.stream().toList());
            l.sort(Comparator.comparing(o -> o.publisher));
            showBookList(l, "Publisher");
        });

        outputPanel.add(titleButton);
        outputPanel.add(authorButton);
        outputPanel.add(yearButton);
        outputPanel.add(publisherButton);

        vertical.add(outputPanel);

        this.add(vertical);

        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Library");
        this.setVisible(true);

        try {
            Path path = Paths.get(OUTPUT_FILE);

            if (!Files.exists(path)) {
                return;
            }

            for (String entry : Files.readAllLines(path)) {
                this.books.add(Book.fromDbRow(entry));
            }
        } catch (Exception _) {}
    }

    private void saveBook(Book book) {
        if (books.contains(book)) return;

        try {
            Path path = Paths.get(OUTPUT_FILE);
            if (!Files.exists(path)) {
                Files.createFile(path);
            }

            String line = book.toDbRow();

            Files.writeString(path, line + "\n", StandardOpenOption.APPEND);
            books.add(book);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private void showBookList(List<Book> sortedBooks, String sortCategory) {
        StringBuilder sb = new StringBuilder();
        for (Book book : sortedBooks) {
            sb.append(book).append("\n");
        }
        JOptionPane.showMessageDialog(
                this,
                sb,
                "Books ordered by " + sortCategory,
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    private record Book(String title, String author, int year, String publisher) {
        public Book(String title, String author, String year, String publisher) {
            this(title, author, Integer.parseInt(year), publisher);
        }

        public static Book fromDbRow(String row) {
            try {
                String[] parts = row.split("\t");
                int year = Integer.parseInt(parts[2]);
                return new Book(parts[0], parts[1], year, parts[3]);
            } catch (Exception _) {
                throw new RuntimeException("Parsing failed");
            }
        }
        public String toDbRow() {
            return String.format("%s\t%s\t%d\t%s", this.title, this.author, this.year, this.publisher);
        }

        @Override
        public String toString() {
            return String.format("%s;%s;%d;%s", this.title, this.author, this.year, this.publisher);
        }
    }

    public static void main() {
        new Library();
    }
}
