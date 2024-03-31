package Map;

import java.awt.Color;

import javax.swing.*;

public class map {

    private JFrame frame;
    private JPanel selectPanel;

    public map(){
        frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);

        selectPanel = new JPanel();
        frame.add(selectPanel);
        selectPanel.setSize(150,1000);
        selectPanel.setBackground(Color.lightGray);

        JButton add = new JButton();
        selectPanel.add(add);

    }

}
