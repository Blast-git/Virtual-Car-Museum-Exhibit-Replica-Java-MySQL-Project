package MuseumExhibit;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Exhibits extends JFrame implements ActionListener{
	JPanel p1;
	JLabel l1,l2,l3,l4,l5,l6;
	JButton b1;
	ImageIcon icon1,icon2,icon3;
	Exhibits(){
	this.setSize(1280,780);
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("Current Exhibits");
	
	p1=new JPanel();
	p1.setSize(1280,780);
	p1.setBackground(new Color(0x1C1C1C));
	p1.setLayout(null);
	this.add(p1);
	
	l1=new JLabel("Current Exhibits");
	l1.setFont(new Font("SansSerif", Font.BOLD, 50));
	l1.setForeground(Color.white);
	l1.setBounds(40, 5, 640, 100);
	p1.add(l1);
	
	l2=new JLabel("Eyes on the Road:Art of the Automotive Landscape");
	l2.setFont(new Font("SansSerif", Font.BOLD, 30));
	l2.setForeground(Color.white);
	l2.setBounds(40, 160, 780, 100);
	p1.add(l2);
	
	l3=new JLabel("The Cars of Film and Television");
	l3.setFont(new Font("SansSerif", Font.BOLD, 30));
	l3.setForeground(Color.white);
	l3.setBounds(40, 290, 780, 100);
	p1.add(l3);
	
	l3=new JLabel("Splendor and Speed: Treasures of the Petersen");
	l3.setFont(new Font("SansSerif", Font.BOLD, 30));
	l3.setForeground(Color.white);
	l3.setBounds(40, 420, 780, 100);
	p1.add(l3);
	
	l4=new JLabel("Mar. 30, 2024 - Nov. 2024");
	l4.setFont(new Font("SansSerif", Font.BOLD, 20));
	l4.setForeground(Color.white);
	l4.setBounds(40, 190, 780, 100);
	p1.add(l4);
	
	l6=new JLabel("May 2023 - October 6, 2024");
	l6.setFont(new Font("SansSerif", Font.BOLD, 20));
	l6.setForeground(Color.white);
	l6.setBounds(40, 320, 780, 100);
	p1.add(l6);
	
	l6=new JLabel("Constant Rotating Exhibition");
	l6.setFont(new Font("SansSerif", Font.BOLD, 20));
	l6.setForeground(Color.white);
	l6.setBounds(40, 450, 780, 100);
	p1.add(l6);
	
	b1=new JButton("GET TICKETS");
	b1.setBackground(new Color(0xBC001A));
	b1.setBounds(550, 520, 195, 50);
	b1.setFocusable(false);
	b1.setForeground(Color.white);
	b1.setFont(new Font("SansSerif", Font.BOLD, 20));
	b1.addActionListener(this);
	p1.add(b1);
	
	ImageIcon imageIcon = new  ImageIcon("D:/image3.jpg"); 
    JLabel imageLabel = new JLabel(imageIcon);
    imageLabel.setBounds(0, 0,1280,780); 
    p1.add(imageLabel);
    
	this.setVisible(true);
	
	
}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			this.setVisible(false);
			Tickets t=new Tickets();
			
		}
		
	}
}
