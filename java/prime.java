
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class prime implements ActionListener{
    JFrame frm;
    JTextField t1,t2;
    JButton b,b1;
    JPanel p;
    JLabel l;
    String a="";
    int v,f=0;
    
    prime()
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
        t2.setBounds(50,200,500,50);
        b.setBounds(190,300,100,30);
        b1.setBounds(190,400,100,30);
        l.setBounds(190,500,80,50);

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
                for(int i=2;i<=v;i++)
                {
                    for(int j=2;j<=v;j++)
                    {
                    if(i>j)
                    {
                        if(i%j==0)
                        {
                            f=1;
                        }
                    }
                    }
                if(f==0)
                {
                    System.out.print(i+" ");
                    
                    a+=i+",";
                    
                }
                f=0;     

                }
                System.out.print(a);
                t2.setText(a);
            }
            if(e.getSource()==b1)
            {
                t1.setText("");
                t2.setText("");
            }
        }

        public static void main(String args[])
        {
            new prime();
        }
        
}

