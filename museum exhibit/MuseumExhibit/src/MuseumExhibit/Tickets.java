package MuseumExhibit;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Tickets extends JFrame implements ActionListener {
	JPanel p1;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JButton b1,b2,b3;
		Tickets()
		{
			this.setSize(1280,780);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setTitle("Tickets");
			
			Font font1 = new Font("SansSerif", Font.BOLD, 20);
			
			p1=new JPanel();
			p1.setSize(1280,780);
			p1.setBackground(new Color(0x1C1C1C));
			p1.setLayout(null);
			this.add(p1);
			
			l1=new JLabel("Tickets");
			l1.setFont(new Font("SansSerif", Font.BOLD, 80));
			l1.setForeground(Color.white);
			l1.setBounds(40, 5, 640, 100);
			p1.add(l1);
			
			l2=new JLabel("Adult Ticket");
			l2.setFont(new Font("SansSerif", Font.BOLD, 50));
			l2.setForeground(Color.white);
			l2.setBounds(40, 100, 640, 195);
			p1.add(l2);
			
			l3=new JLabel("Child Ticket");
			l3.setFont(new Font("SansSerif", Font.BOLD, 50));
			l3.setForeground(Color.white);
			l3.setBounds(40, 250, 640, 195);
			p1.add(l3);
			
			l4=new JLabel("Youth Ticket");
			l4.setFont(new Font("SansSerif", Font.BOLD, 50));
			l4.setForeground(Color.white);
			l4.setBounds(40, 400, 640, 195);
			p1.add(l4);
			
			l5=new JLabel("$21");
			l5.setFont(new Font("SansSerif", Font.BOLD, 30));
			l5.setForeground(Color.white);
			l5.setBounds(500, 100, 640, 195);
			p1.add(l5);
			
			l6=new JLabel("$12");
			l6.setFont(new Font("SansSerif", Font.BOLD, 30));
			l6.setForeground(Color.white);
			l6.setBounds(500, 250, 640, 195);
			p1.add(l6);
			
			l7=new JLabel("$13");
			l7.setFont(new Font("SansSerif", Font.BOLD, 30));
			l7.setForeground(Color.white);
			l7.setBounds(500, 400, 640, 195);
			p1.add(l7);
			
			
			b1=new JButton("BUY");
			b1.setBounds(650, 175, 195, 50);
			b1.setBackground(new Color(0xBC001A));
			b1.setFocusable(false);
			b1.setForeground(Color.white);
			b1.setFont(font1);
			b1.addActionListener(this);
			p1.add(b1);
			
			b2=new JButton("BUY");
			b2.setBounds(650, 325, 195, 50);
			b2.setBackground(new Color(0xBC001A));
			b2.setFocusable(false);
			b2.setForeground(Color.white);
			b2.setFont(font1);
			b2.addActionListener(this);
			p1.add(b2);
			
			b3=new JButton("BUY");
			b3.setBounds(650, 475, 195, 50);
			b3.setBackground(new Color(0xBC001A));
			b3.setFocusable(false);
			b3.setForeground(Color.white);
			b3.setFont(font1);
			b3.addActionListener(this);
			p1.add(b3);
			
			
			this.setVisible(true);
			
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==b1)
			{
				this.setVisible(false);
				String s1="Adult ticket";
				String price1="$21";
				Purchase p1=new Purchase(s1,price1);
			}
			
			if(e.getSource()==b2)
			{
				this.setVisible(false);
				String s2="Child ticket";
				String price2="$12";
				Purchase p2=new Purchase(s2,price2);
			}
			
			if(e.getSource()==b3)
			{
				this.setVisible(false);
				String s3="Youth ticket";
				String price3="$13";
				Purchase p3=new Purchase(s3,price3);
			}
		}
}
