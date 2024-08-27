import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class calculator implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bde,bc,bdo,beq,badd,bsub,bmul,bdiv;
    JFrame frm;
    int operator=0;
    int result;
    String va;
    int variable;
    JTextField t;
    calculator()
    {
        frm = new JFrame("Calculator");
        frm.setBackground(Color.yellow);
        t = new JTextField(20);
        t.setBorder(BorderFactory.createLineBorder(Color.red));
        frm.setSize(700,700);
        frm.setLayout(null);
        b0=new JButton("0");
        b0.setBorder(BorderFactory.createLineBorder(Color.green));
        b0.setForeground(Color.red);
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        badd=new JButton("+");
        bsub=new JButton("-");
        bmul=new JButton("X");
        bdiv=new JButton("/");
        bdo=new JButton(".");
        bde=new JButton("Delete");
        bc=new JButton("Clear");
        beq=new JButton("=");

        t.setBounds(100,100,360,80);
        b0.setBounds(200,400,50,50);
        b1.setBounds(100,200,50,50);
        b2.setBounds(200,200,50,50);
        b3.setBounds(300,200,50,50);
        b4.setBounds(400,200,50,50);
        b5.setBounds(100,300,50,50);
        b6.setBounds(200,300,50,50);
        b7.setBounds(300,300,50,50);
        b8.setBounds(400,300,50,50);
        b9.setBounds(100,400,50,50);
        bdo.setBounds(300,400,50,50);
        beq.setBounds(400,400,50,50);
        badd.setBounds(100,500,50,50);
        bsub.setBounds(200,500,50,50);
        bmul.setBounds(300,500,50,50);
        bdiv.setBounds(400,500,50,50);
        bde.setBounds(100,600,100,50);
        bc.setBounds(300,600,100,50);

        frm.add(t);
        frm.add(b1);
        frm.add(b2);
        frm.add(b3);
        frm.add(b4);
        frm.add(b5);
        frm.add(b6);
        frm.add(b7);
        frm.add(b8);
        frm.add(b9);
        frm.add(b0);
        frm.add(bdo);
        frm.add(beq);
        frm.add(badd);
        frm.add(bsub);
        frm.add(bmul);
        frm.add(bdiv);
        frm.add(bde);
        frm.add(bc);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bdo.addActionListener(this);
        beq.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bde.addActionListener(this);
        bc.addActionListener(this);

        
        frm.setResizable(false);
        frm.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            t.setText(t.getText().concat("1"));
        }
        if(e.getSource()==b2)
        {
            t.setText(t.getText().concat("2"));
        }
        if(e.getSource()==b3)
        {
            t.setText(t.getText().concat("3"));
        }
        if(e.getSource()==b4)
        {
            t.setText(t.getText().concat("4"));
        }
        if(e.getSource()==b5)
        {
            t.setText(t.getText().concat("5"));
        }
        if(e.getSource()==b6)
        {
            t.setText(t.getText().concat("6"));
        }
        if(e.getSource()==b7)
        {
            t.setText(t.getText().concat("7"));
        }
        if(e.getSource()==b8)
        {
            t.setText(t.getText().concat("8"));
        }
        if(e.getSource()==b9)
        {
            t.setText(t.getText().concat("9"));
        }
        if(e.getSource()==b0)
        {
            t.setText(t.getText().concat("0"));
        }
        if(e.getSource()==bdo)
        {
            t.setText(t.getText().concat("."));
        }
        if(e.getSource()==badd)
        {
            variable=Integer.parseInt(t.getText());
            operator = 1;
            t.setText("");
        }
        if(e.getSource()==bsub)
        {
            variable=Integer.parseInt(t.getText());
            operator = 2;
            t.setText("");
        }
        if(e.getSource()==bmul)
        {
            variable=Integer.parseInt(t.getText());
            operator = 3;
            t.setText("");
        }
        if(e.getSource()==bdiv)
        {
            variable=Integer.parseInt(t.getText());
            operator = 4;
            t.setText("");
        }
        if(e.getSource()==beq)
        {
            switch(operator)
            {
                case 1 : result=variable+(Integer.parseInt(t.getText()));
                         t.setText("");
                         break;
                case 2 : result=variable-(Integer.parseInt(t.getText()));
                         t.setText("");
                         break;
                case 3 : result=variable*(Integer.parseInt(t.getText()));
                         t.setText("");
                         break;
                case 4 : result=variable/(Integer.parseInt(t.getText()));
                         t.setText("");
                         break;

            }
            t.setText(""+result);
        }
        if(e.getSource()==bde)
        {
            va=t.getText();
            t.setText("");
            for(int i=0;i<(va.length()-1);i++)
            {
                t.setText(t.getText()+va.charAt(i));
            }
        }
        if(e.getSource()==bc)
        {
            t.setText("");
        }

    }

    public static void main(String args[])
    {
        SwingUtilities.invokeLater(new Runnable(){
        public void run()
        {
            new calculator();
        }
        
    });
    
}
}
