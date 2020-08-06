package com.zzxx.exam.ui;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;

/**
 * 主菜单界面
 */
public class MsgFrame extends JFrame {
    public static void main(String[] args) throws IOException {
        MsgFrame msgFrame = new MsgFrame();
        msgFrame.setVisible(true);
        BufferedReader reader = new BufferedReader(new FileReader("src/com/zzxx/exam/util/rule.txt"));
        String tempString = null;
        String show = "";
        int line = 1;
        // 一次读入一行，直到读入null为文件结束
        while ((tempString = reader.readLine()) != null) {
            // 显示行号
            show = show + tempString + "\n";
            line++;
        }
        msgFrame.showMsg(show);
    }

    private JTextArea ta;

    public MsgFrame() {
        init();
    }

    private void init() {
        setSize(600, 400);
        setContentPane(createContentPane());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    private JScrollPane createContentPane() {
        JScrollPane jsp = new JScrollPane();
        ta = new JTextArea();
        jsp.add(ta);
        jsp.getViewport().add(ta);
        return jsp;
    }

    public void showMsg(String file) {
        ta.setText(file);
        ta.setLineWrap(true);// 允许折行显示
        ta.setEditable(false);// 不能够编辑内容
    }
}
