import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class traffic extends JPanel implements ActionListener {
    JRadioButton red,green,yellow;
    Color stop,wait,go;
    traffic()
    {
        
        red = new JRadioButton("red");
        green = new JRadioButton("green");
        yellow = new JRadioButton("yellow");
        setSize(600,600);
        red.setBounds(300,100,50,50);
        green.setBounds(350,100,50,50);
        yellow.setBounds(400,100,50,50);

        ButtonGroup b = new ButtonGroup();
        b.add(red);
        b.add(green);
        b.add(yellow);

        red.setSelected(true);
        stop=Color.red;
        wait=Color.black;
        go=Color.black;

        add(red);
        add(green);
        add(yellow);

        red.addActionListener(this);
        green.addActionListener(this);
        yellow.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==red)
        {
            stop=Color.red;
            wait=Color.black;
            go=Color.black;
            repaint();
        }
        if(e.getSource()==yellow)
        {
            stop=Color.black;
            wait=Color.yellow;
            go=Color.black;
            repaint();
            
        }
        if(e.getSource()==green)
        {
            stop=Color.black;
            wait=Color.black;
            go=Color.green;
            repaint();
            
        }
        
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.setColor(Color.yellow);
        g.drawRect(10,30,500,500);
        g.fillRect(10,30,500,500);

        g.setColor(Color.black);
        g.drawRect(10,40,450,450);
        g.fillRect(10,40,450,450);

        g.setColor(Color.black);
        g.drawOval(50,50,50,50);
        g.setColor(stop);
        g.fillOval(50,50,50,50);
        
        g.setColor(Color.black);
        g.drawOval(50,100,50,50);
        g.setColor(wait);
        g.fillOval(50,100,50,50);

        g.setColor(Color.black);
        g.drawOval(50,150,50,50);
        g.setColor(go);
        g.fillOval(50,150,50,50);
    }

    public static void main(String [] args)
    {
        
        JFrame frm=new JFrame("Traffic Light");
        frm.setSize(700,700);
        frm.setLayout(null);
        frm.setVisible(true);
        frm.add(new traffic());
    }
}
