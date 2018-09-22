import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainFrame extends JFrame {
    private JPanel jp1 = new JPanel();
    private JPanel jp2 = new JPanel();
    private TextArea tA = new TextArea(20, 50);
    private TextField tF = new TextField("", 30);
    private JButton jB = new JButton("Send");
    private JScrollPane jS = new JScrollPane(tA);

    public MainFrame() {
        setTitle("Main Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300,400,400);
        setLayout(new BorderLayout());

        tA.setFocusable(false);
        tF.requestFocus();
        tA.setEditable(false);
        jB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMsg();
            }
        });
        tF.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    sendMsg();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        jp1.add(jS, BorderLayout.CENTER);
        jp2.add(tF, BorderLayout.WEST);
        jp2.add(jB, BorderLayout.EAST);

        add(jp1, BorderLayout.NORTH);
        add(jp2, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void sendMsg() {
        if (tF.getText().length() != 0) {
            tA.append(tF.getText() + "\n");
        }
        tF.setText("");
        tF.requestFocus();
    }
}
