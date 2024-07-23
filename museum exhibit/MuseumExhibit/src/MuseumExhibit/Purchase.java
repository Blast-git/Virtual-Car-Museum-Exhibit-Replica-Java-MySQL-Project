package MuseumExhibit;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.swing.*;

public class Purchase extends JFrame implements ActionListener {
	JLabel l1,l2,l3,l4;
	JTextField tf1,tf2; 
	JPanel p1;
	JButton b1;
	String s,price;
	Purchase(String s,String price)
	{
		this.s=s;
		this.price=price;
		this.setSize(400,780);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Your Cart");
		
		p1=new JPanel();
		p1.setSize(1280,780);
		p1.setLayout(null);
		
		this.add(p1);
		
		l1=new JLabel(s);
		l1.setBounds(20, 575, 300, 50);
		l1.setFont(new Font("SansSerif", Font.BOLD, 20));
		p1.add(l1);
		
		l1=new JLabel(price);
		l1.setBounds(330, 575, 100, 50);
		l1.setFont(new Font("SansSerif", Font.BOLD, 20));
		p1.add(l1);
		
		b1=new JButton("Purchase");
		b1.setBounds(50, 650, 300, 50);
		b1.setBackground(new Color(0xBC001A));
		b1.setFocusable(false);
		b1.setForeground(Color.white);
		b1.setFont(new Font("SansSerif", Font.BOLD, 20));
		b1.addActionListener(this);
		p1.add(b1);
		
		l3=new JLabel("Name");
		l3.setBounds(20, 20, 100, 50);
		l3.setFont(new Font("SansSerif", Font.BOLD, 20));
		p1.add(l3);

		l4=new JLabel("Gmail");
		l4.setBounds(20, 130, 100, 50);
		l4.setFont(new Font("SansSerif", Font.BOLD, 20));
		p1.add(l4);
		
		tf1=new JTextField();
		tf1.setBounds(20, 75, 300, 50);
		p1.add(tf1);
		
		tf2=new JTextField();
		tf2.setBounds(20, 185, 300, 50);
		p1.add(tf2);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			this.setVisible(false);
			try 
			{
				String name=tf1.getText();
				String gmail=tf2.getText();
				
				Connection con = null;
				
				String dbUrl="jdbc:mysql://localhost:3306/musuem";
				
				con=DriverManager.getConnection(dbUrl,"root","Sidsql005");
				
				Statement stmt = null;
				
				stmt = con.createStatement();
				
				String insertStr = "INSERT INTO  visitorinformation VALUES(?,?,?,?)";
				PreparedStatement pst1=con.prepareStatement(insertStr);
				pst1.setString(1,name);
				pst1.setString(2,gmail);
				pst1.setString(3,s);
				pst1.setString(4,price);
				pst1.executeUpdate();
				
				
				con.close();
			}
			catch(Exception z)
			{
				z.printStackTrace();
			}
		}
	}
}
