package MuseumExhibit;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class LandingPage extends JFrame implements ActionListener
{
	JPanel p1,p2;
	JLabel l1,l2;
	JMenuBar mb1;
	JMenu m1,m2,m3,m4;
	JMenuItem mi1,mi2,mi3;
	JButton b1;
		LandingPage()
		{
			
			this.setSize(1280,780);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setTitle("Vehicle Exhibit");
			
			p1=new JPanel();
			p1.setSize(1280,780);
			p1.setBackground(new Color(0x1C1C1C));
			p1.setLayout(null);
			
			this.add(p1);
			
			p2=new JPanel();
			p2.setBounds(512, 0, 768, 50);
			p2.setBackground(new Color(0xE0E0E0));
			p2.setLayout(new GridLayout());

	        p1.add(p2);
			
	        Font font1 = new Font("SansSerif", Font.BOLD, 20);
	        
	        mb1=new JMenuBar();
	        mb1.setBackground(new Color(0x000000));
			p2.add(mb1);
			
			m1=new JMenu("VISIT   ");
			m1.setForeground(Color.white);
			m1.setFont(font1);
			mb1.add(m1);
			
			m2=new JMenu("EXHIBIT   ");
			m2.setForeground(Color.white);
			m2.setFont(font1);
			mb1.add(m2);
			
			m3=new JMenu("VEHICLES   ");
			m3.setForeground(Color.white);
			m3.setFont(font1);
			mb1.add(m3);
			
			m4=new JMenu("FAQ");
			m4.setForeground(Color.white);
			m4.setFont(font1);
			mb1.add(m4);
			
			b1=new JButton("GET TICKETS");
			b1.setBackground(new Color(0xBC001A));
			b1.setFocusable(false);
			b1.setForeground(Color.white);
			b1.setFont(font1);
			b1.addActionListener(this);
			p2.add(b1);
			
			mi1=new JMenuItem("Plan your visit");
			mi1.setBackground(new Color(0x1C1C1C));
			mi1.setForeground(Color.white);
			mi1.addActionListener(this);
			mi1.setFont(font1);
			
			
			mi3=new JMenuItem("Current Exhibits");
			mi3.setBackground(new Color(0x1C1C1C));
			mi3.setForeground(Color.white);
			mi3.addActionListener(this);
			mi3.setFont(font1);
			
			l1=new JLabel("We Are Porsche");
			l1.setFont(new Font("SansSerif", Font.BOLD, 80));
			l1.setForeground(Color.white);
			l1.setBounds(40, 450, 640, 195);
			p1.add(l1);
			
			l2=new JLabel("Celebrating 75 Years of Porsche");
			l2.setFont(new Font("SansSerif", Font.BOLD, 30));
			l2.setForeground(Color.white);
			l2.setBounds(40, 550, 640, 195);
			p1.add(l2);
			
			ImageIcon imageIcon = new  ImageIcon("D:/image2.jpg"); 
		    JLabel imageLabel = new JLabel(imageIcon);
		    imageLabel.setBounds(0, 0,1280,780); 
		    p1.add(imageLabel);
			
			m1.add(mi1);
			m2.add(mi3);
			
			this.setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b1)
			{
				this.setVisible(false);
				Tickets t=new Tickets();
				
			}
			if(e.getSource()==mi3)
			{
				this.setVisible(false);
				Exhibits ex=new Exhibits();
				
			}
			if(e.getSource()==mi1)
			{
				this.setVisible(false);
				Visit v=new Visit();
				
			}
			
		}
}
;