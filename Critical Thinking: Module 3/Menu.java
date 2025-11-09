// Kyle Fahey
// CSC372-1
// Critical Thinking Module 3

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.time.LocalDateTime;
import java.util.Random;

// Class menu that holds logic and menu options for the main interface
public class Menu extends JFrame {

    private JTextArea textArea; // text box where output is shown
    private Random rand;

    public Menu() {

    	

        // Frame setup with sizing
        setTitle("Option Menu Program");
        setSize(425, 325);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        rand = new Random();

        // Use a panel so the background color shows around text area
        JPanel panel = new JPanel(new BorderLayout());
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);


        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);
        getContentPane().add(panel);

        
        // Create new menu bar named "Options"
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Options");
        

        // Menu bar options 1-4
        JMenuItem dateTimeItem = new JMenuItem("Show Date/Time");
        JMenuItem saveItem = new JMenuItem("Save to log.txt");
        JMenuItem changeColorItem = new JMenuItem("Change Background");
        JMenuItem exitItem = new JMenuItem("Exit");

   
        // Add items to menu
        menu.add(dateTimeItem);
        menu.add(saveItem);
        menu.add(changeColorItem);
        menu.add(exitItem);
        menuBar.add(menu);
       
        
        // Attach menu bar
        setJMenuBar(menuBar);
    

        // * Option 1: Show Date and Time in text box *
        dateTimeItem.addActionListener(e -> {
            String dateTime = "Current Date/Time: " + LocalDateTime.now();
            textArea.setText(dateTime);
        });

       
        // * Option 2: Save date and time to a text file on desktop *
        saveItem.addActionListener(e -> {
            try {
                String username = System.getProperty("user.name");
                String desktopPath = "/Users/" + username + "/Desktop/log.txt";
                // Writes current date and time
                String dateTime = "Current Date/Time: " + LocalDateTime.now();
                FileWriter writer = new FileWriter(desktopPath, true);
                writer.write(dateTime + "\n");
                writer.close();

                JOptionPane.showMessageDialog(this,
                        "Saved date/time to Desktop/log.txt",
                        "Save Successful",
                        JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this,
                        "Error saving file: " + ex.getMessage(),
                        "Save Failed",
                        JOptionPane.ERROR_MESSAGE);
            }
        });
       

     // * Option 3: Change background to random green hue *
        changeColorItem.addActionListener(e -> {
            // Generate random shade of green
            Color randomGreen = new Color(
                    rand.nextInt(100),         
                    155 + rand.nextInt(100),    
                    rand.nextInt(100));         

            // Instead of just the frame, also update the textArea
            textArea.setBackground(randomGreen);
        });
        

        // * Option 4: Exit *
        exitItem.addActionListener(e -> System.exit(0));
        setVisible(true);
    }

    public static void main(String[] args) {
        new Menu();
    }
}