import javax.swing.*;
import java.awt.*;
import java.nio.file.Path;



public class DataStream extends JFrame {

    private JTextArea regularText;
    private JTextArea filterText;
    private JTextField searchField;
    private Path loadedFile;

    public DataStream() {
        setTitle("Data Stream Filter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());
        setContentPane(mainPanel);

        regularText = new JTextArea();
        filterText = new JTextArea();
        regularText.setEditable(false);
        filterText.setEditable(false);

        JScrollPane regularScrollPane = new JScrollPane(regularText);
        JScrollPane filterScrollPane = new JScrollPane(filterText);

        JPanel textAreaPanel = new JPanel(new GridLayout(1, 2, 10, 0));
        textAreaPanel.add(regularScrollPane);
        textAreaPanel.add(filterScrollPane);

        searchField = new JTextField();
        searchField.setToolTipText("Enter search string here");

        JButton loadFileButton = new JButton("Load File");
        JButton searchButton = new JButton("Search");
        JButton quitButton = new JButton("Quit");
    }
}