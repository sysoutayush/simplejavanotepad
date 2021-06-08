package notepad;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.*;
import javax.swing.*;
public class Notepad extends JFrame{
    Notepad(){
        setBounds(0, 0, 1950, 1050);
        JMenuBar menuBar= new JMenuBar();

        JMenu file = new JMenu("File");
        
        JMenuItem newdoc = new JMenuItem("New");
        newdoc.setAccelerator(KeyStroke.getKeyStroke(keyEvent.VK_N, ActionEvent.CTRL_MASK));
        
        JMenuItem open = new JMenuItem("New");
        open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        
        JMenuItem saveItem = new JMenuItem("New");
        saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        JMenuItem printItem = new JMenuItem("New");
        printItem.setAccelerator(KeyStroke.getKeyStroke(keyEvent.VK_N, ActionEvent.CTRL_MASK));
        
        JMenuItem exiItem= new JMenuItem("New");
        exiItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0));
        
        file.add(newdoc);
        file.add(open);
        file.add(saveItem);
        file.add(printItem);
        file.add(exiItem);
        
        JMenu edit = new JMenu("Edit");
        
        JMenuItem copyItem = new JMenuItem("New");
        copyItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        
        JMenuItem cut= new JMenuItem("New");
        cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK));
        
        JMenuItem paste = new JMenuItem("New");
        paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
        
       edit.add(copyItem);
       edit.add(cut);
       edit.add(paste);

        JMenu help = new JMenu("Help");


        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);
        setJMenuBar(menuBar);
    }
    public static void main(String[] args) {
        new Notepad().setVisible(true);
    }

}