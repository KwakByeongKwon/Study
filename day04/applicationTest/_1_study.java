package day04.applicationTest;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;

public class _1_study {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                JFrame frame = new JFrame("HelloWorld GUI");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setPreferredSize(new Dimension(400, 300)); // 화면의 크기 조정
                JLabel label = new JLabel("Hello World!!",SwingConstants.CENTER); // 텍스트를 가운데로
                frame.getContentPane().add(label);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation(dim.width/2-400/2,dim.height/2-300/2);

                frame.pack();
                frame.setVisible(true);

            }
        });
    }
}
