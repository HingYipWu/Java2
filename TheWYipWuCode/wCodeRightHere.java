package TheWYipWuCode;
import javax.swing.*;


public class wCodeRightHere {
    private JFrame frame;
    private JLabel carlos;

    public wCodeRightHere(){
        frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        carlos = new JLabel("carlos is a dumbass");
        frame.add(carlos);
    }
}
