import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class stickman extends JPanel implements ActionListener
{
    JButton bu,bd,br;
    Color up,down,normal;
    stickman()
    {

        setBackground(Color.white);
        setSize(600,600);
        bu=new JButton("Up");
        bd=new JButton("Down");
        br=new JButton("Reset");

        bu.setBounds(100,50,60,40);
        bd.setBounds(150,50,60,40);
        br.setBounds(200,50,60,40);

        add(bu);
        add(bd);
        add(br);

        bu.addActionListener(this);
        bd.addActionListener(this);
        br.addActionListener(this);

        up=Color.white;
        down=Color.white;
        normal=Color.black;

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==br)
        {
            up=Color.white;
            down=Color.white;
            normal=Color.black;
            repaint();

        }

        if(e.getSource()==bu)
        {
            up=Color.black;
            down=Color.white;
            normal=Color.white;
            repaint();
        }

        if(e.getSource()==bd)
        {
            up=Color.white;
            down=Color.black;
            normal=Color.white;
            repaint();
        }

    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.setColor(Color.yellow);
        g.drawOval(150,200,100,100);
        g.fillOval(150,200,100,100);

        g.setColor(Color.black);
        g.drawOval(170,230,20,10);

        g.setColor(Color.black);
        g.drawOval(200,230,20,10);

        g.setColor(Color.black);
        g.drawLine(200,300,200,600);
        try{
        Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println("found exception");
        }
        g.setColor(up);
        g.drawLine(200,450,50,400);

        g.setColor(up);
        g.drawLine(200,450,350,400);

        g.setColor(down);
        g.drawLine(200,450,50,500);

        g.setColor(down);
        g.drawLine(200,450,350,500);

        g.setColor(normal);
        g.drawLine(200,450,50,450);

        g.setColor(normal);
        g.drawLine(200,450,350,450);

    }
    public static void main(String args[])
    {
        JFrame frm = new JFrame("Man");
        frm.setSize(800,800);
        frm.setLayout(null);
        frm.add(new stickman());
        frm.setVisible(true);

    }
}
