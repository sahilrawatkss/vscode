package ExamPractice;
import com.sun.jdi.Value;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing2 {
    public static void main(String[] args) {
        new Dev();
    }
}
class Dev extends JFrame implements ActionListener {
    JLabel jl1,jl2,jl3;
    JTextField jt1,jt2,jt3;
    JButton jb1,jb2,jb3;
    JRadioButton jr1,jr2;
    ButtonGroup bj1;
    JTextArea ja1;
    Dev()
    {
        setSize(900,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        jl1=new JLabel("Num1: ");
        add(jl1);
        jt1=new JTextField(10);
        add(jt1);
        jl2=new JLabel("Num2: ");
        add(jl2);
        jt2=new JTextField(10);
        add(jt2);
        jl3=new JLabel("Result: ");
        add(jl3);
        jt3=new JTextField(10);
        add(jt3);
        jb1=new JButton("Calc:)");
        add(jb1);
        jb2=new JButton("Minus");
        add(jb2);
        jb1.addActionListener(this);
        jb2.addActionListener(this);

        jr1=new JRadioButton("MAle");
        add(jr1);
        jr2=new JRadioButton("Female");
        add(jr2);

        bj1=new ButtonGroup();
        bj1.add(jr1);
        bj1.add(jr2);

        ja1=new JTextArea(10,10);
        add(ja1);

        jb3=new JButton("Calc 2");
        add(jb3);
        jb3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int n1=Integer.parseInt(jt1.getText());
        int n2=Integer.parseInt(jt2.getText());
        String text=ja1.getText();
        if(e.getSource()==jb1)
        {
            int result=n1+n2;
            jt3.setText(String.valueOf(result));
        } else if (e.getSource()==jb2) {
            int result=n1-n2;
            jt3.setText(String.valueOf(result));
        }
        else if(e.getSource()==jr1)
        {
            int result=n1+n2;
            jt3.setText(String.valueOf(result));
        }
        else if(e.getSource()==jr2)
        {
            jt3.setText("female");
        }
        else if(e.getSource()==jb3)
        {
            String words[]=text.split("\\s");
            jt3.setText(String.valueOf(words.length));
        }
    }
}
