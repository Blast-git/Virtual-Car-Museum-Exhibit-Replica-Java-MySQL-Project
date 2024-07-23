package MuseumExhibit;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Visit extends JFrame implements ActionListener{
	JPanel p1;
	JLabel l1,l2,l3,l4,l5,l6;
	JButton b1;
	Visit()
	{
		this.setSize(1280,780);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Vehicle Exhibit");
		
		p1=new JPanel();
		p1.setSize(1280,780);
		p1.setLayout(null);
		
		l1=new JLabel("HOURS");
		l1.setFont(new Font("SansSerif", Font.BOLD, 80));
		l1.setBounds(40, 200, 640, 195);
		p1.add(l1);
		
		l2=new JLabel("Open 7 Days a week");
		l2.setFont(new Font("SansSerif", Font.BOLD, 20));
		l2.setBounds(40, 250, 640, 195);
		p1.add(l2);
		
		l3=new JLabel("10:00 AM - 5:00 PM | Admissions Closes at 4:30 PM");
		l3.setFont(new Font("SansSerif", Font.ITALIC, 20));
		l3.setBounds(40, 300, 640, 195);
		p1.add(l3);
		
		l4=new JLabel("6060 Wilshire Blvd");
		l4.setFont(new Font("SansSerif", Font.BOLD, 20));
		l4.setBounds(40, 450, 640, 195);
		p1.add(l4);
		
		l5=new JLabel("Los Angeles, CA 90036");
		l5.setFont(new Font("SansSerif", Font.BOLD, 20));
		l5.setBounds(40, 475, 640, 195);
		p1.add(l5);
		
		l6=new JLabel("United States");
		l6.setFont(new Font("SansSerif", Font.BOLD, 20));
		l6.setBounds(40, 500, 640, 195);
		p1.add(l6);
		
		b1=new JButton("GET TICKETS");
		b1.setBackground(new Color(0xBC001A));
		b1.setBounds(40, 620, 195, 50);
		b1.setFocusable(false);
		b1.setForeground(Color.white);
		b1.setFont(new Font("SansSerif", Font.BOLD, 20));
		b1.addActionListener(this);
		p1.add(b1);
		
		
		this.add(p1);
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

