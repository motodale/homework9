import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dale.
 */
public class Frame extends JFrame {

    private JPanel menu;

    public Frame(){
        this.setLayout(new FlowLayout());
        this.setSize(400,300);
        this.setTitle("DAO");
        this.setBackground(Color.gray);

        this.createMenuPanel();
        this.add(menu);

    }

    private void createMenuPanel(){
        menu = new JPanel();
        JMenuBar statsThing = new JMenuBar();
        JButton winButton = new JButton("win");
        JButton loseButton = new JButton("lose");
        winButton.addActionListener(new WinListener());
        loseButton.addActionListener(new LoseListener());
        menu.add(winButton);
        menu.add(loseButton);

    }

    class WinListener implements ActionListener{

        public void actionPerformed(ActionEvent event){

        }


    }
    class LoseListener implements ActionListener{

        public void actionPerformed(ActionEvent event){

        }


    }

}
