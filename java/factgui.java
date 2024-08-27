import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class fact implements ActionListener{
    JFrame frm;
    JTextField t1,t2;
    JButton b,b1;
    JPanel p;
    JLabel l;
    int v,f=1;
    
    fact()
    {
        frm=new JFrame("Factorial Finder");
        t1=new JTextField(20);
        t2=new JTextField(20);
        b=new JButton("Convert");
        b1=new JButton("Clear");
        l=new JLabel("FACTORIAL");

        frm.setSize(600,700);
        frm.setLayout(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        t1.setBounds(200,100,80,50);
        t2.setBounds(400,100,80,50);
        b.setBounds(300,200,100,30);
        b1.setBounds(300,300,100,30);
        l.setBounds(300,300,80,50);

        frm.add(t1);
        frm.add(t2);
        frm.add(b);
        frm.add(b1);
        frm.add(l);

        t1.addActionListener(this);
        t2.addActionListener(this);
        b.addActionListener(this);
        b1.addActionListener(this);


        frm.setResizable(false);
        frm.setVisible(true);
    }
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==b)
            {
                v=Integer.parseInt(t1.getText());
                t1.setText("");
                t2.setText("");
                for(int i=1;i<=v;i++)
                {
                    f*=i;
                }
                t1.setText(""+v);
                t2.setText(""+f);
                f=1;
                v=0;
            }
            if(e.getSource()==b1)
            {
                t1.setText("");
                t2.setText("");
            }
        }

        public static void main(String args[])
        {
            new fact();
        }
        
}

