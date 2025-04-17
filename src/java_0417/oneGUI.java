package java_0417;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class oneGUI {
    private JButton b0;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;

    private JPanel panel1;

    private static bucket bucket1;
    public oneGUI() {
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnBehavior(b0);
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnBehavior(b1);
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnBehavior(b2);
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnBehavior(b3);
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnBehavior(b4);
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnBehavior(b5);
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnBehavior(b6);
            }
        });

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnBehavior(b7);
            }
        });

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnBehavior(b8);
            }
        });

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnBehavior(b9);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("oneGUI");
        frame.setContentPane(new oneGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(200,600);
        frame.setLocation(480,300);
        bucket1 = new bucket();
    }

    public void btnBehavior(JButton btn){
        int number = Integer.parseInt(btn.getText()); // 把按鈕的文字取出，再轉乘整數
        int result = bucket1.put_knifes(number);
        if (result == 1) {
//                    System.out.println("成功");
            btn.setText("成功");
        } else if (result == 0) {
            //System.out.println("失敗");
            btn.setText("失敗");
        } else if (result == -1) {
//                    System.out.println("爆, 失敗");
            btn.setText("爆, 失敗");
        }
        btn.setEnabled(false); // 按完就不能再按
    }
}
