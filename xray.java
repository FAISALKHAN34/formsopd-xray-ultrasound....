package hms;




import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
public class xray extends JFrame implements ActionListener
{
	//JFrame frame;
	
	JComboBox xray1;
//	JComboBox dates;
//	JComboBox years;
//	
	JCheckBox box;
	
	JRadioButton male;
	JRadioButton female;
	
	ButtonGroup bg;
	
	
	JTextField t1;
	JTextField t2;
	JTextField t3;
	JTextField t4;
	JTextField t5;
	JTextField t6;
	JTextField t7;
	JTextField t8;
	JTextField t9;
	
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l5;
	JLabel l6;
	JLabel l7;
	JLabel l8;
	JLabel l9;
	JLabel l10;
	JLabel cashier;
	JLabel xray;
	JLabel shift;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	
	JButton opd;
	JButton ultrasound;
	JButton lab;
	JLabel panel;
	
	
	
	xray()
	{
		
		String[] date = {"(1) 500",
				"(2) 700",
				"(3) 700",
				"(4) 700",
				"(5) 700",
				"(6) 700",
				"(7) 500"};
		String[] xrays = {"(1) XRAY CHEST AP VIEW / 500Fees",
					"(2) XRAY HAND AP LATERIAL VIEW / 700Fees",
					"(3) XRAY WRIST AP LATERIAL VIEW / 700Fees",
					"(4) XRAY SKULL AP LATERIAL VIEW / 700Fees",
					"(5) XRAY LEG AP LATERIAL VIEW / 700Fees",
					"(6) XRAY KNEE AP LATERIAL VIEW / 700Fees",
					"(7) XRAY SHOULDER AP VIEW / 500Fees"};
		String[] year = {"1970","1971","1972","1973","1974","1975","1976","1977","1978","1979","1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021"};
		
		xray1 = new JComboBox(xrays);
 		xray1.setPreferredSize(new Dimension(90,20));
		xray1.addActionListener(this);
		xray1.setEditable(true);
		xray1.setBounds(120, 380, 120, 20);
		
//		dates = new JComboBox(date);
//		dates.setPreferredSize(new Dimension(90,20));
//		dates.addActionListener(this);
//		dates.setBounds(560, 400, 150, 30);
//		
//		years = new JComboBox(year);
//		years.setPreferredSize(new Dimension(90,20));
//		years.addActionListener(this);
//		years.setBounds(450, 425, 60, 30);
//		
		l1 = new JLabel();
		l2 = new JLabel();
		l3 = new JLabel();
		l4 = new JLabel();
		l5 = new JLabel();
		l6 = new JLabel();
		l7 = new JLabel();
		l10 = new JLabel();
		
		t8 = new JTextField();
		
		
		
		
		
		l1.setText("X-Ray");
		l1.setFont(new Font("MV Boli",Font.BOLD,40));
		l1.setBounds(150, 50, 600, 50);
		
		l2.setText("Patient Name");
		l2.setFont(new Font("Consolas",Font.BOLD,15));
		l2.setBounds(0, 150, 150, 50);
			
		l3.setText("Father Name");
		l3.setFont(new Font("Consolas",Font.BOLD,15));
		l3.setBounds(0, 190, 150, 50);
		
		l4.setText("Phone");
		l4.setFont(new Font("Consolas",Font.BOLD,15));
		l4.setBounds(0, 330, 150, 50);
		
		l5.setText("Gender");
		l5.setFont(new Font("Consolas",Font.BOLD,15));
		l5.setBounds(0, 230, 150, 50);
		
//		shift.setText("Shift");
//		shift.setFont(new Font("Consolas",Font.BOLD,20));
//		shift.setBounds(600, 300, 200, 50);
		
		male = new JRadioButton();
		male.setText("Male");		
		male.setFont(new Font("Arial",Font.BOLD,15));
		male.setBounds(120, 270, 80, 20);
		male.addActionListener(this);
		
		female = new JRadioButton();
		female.setText("Female");		
		female.setFont(new Font("Arial",Font.BOLD,15));
		female.setBounds(200, 270, 100, 20);
		female.addActionListener(this);
		
		
		l6.setText("Age");
		l6.setFont(new Font("Consolas",Font.BOLD,15));
		l6.setBounds(0, 290, 150, 50);
		
		l7.setText("District");
		l7.setFont(new Font("Consolas",Font.BOLD,20));
		l7.setBounds(600, 250, 200, 50);
		
		l10 = new JLabel();
		l10.setText("Cashier");
		l10.setFont(new Font("Consolas",Font.BOLD,20));
		l10.setBounds(600, 300, 200, 50);
//		
		xray = new JLabel();
		xray.setText("RadioLogy");
		xray.setFont(new Font("Consolas",Font.BOLD,15));
		xray.setBounds(0, 370, 100, 50);
		
		t1 = new JTextField();
		t1.setBounds(120, 163, 150, 20);
		t1.setFont(new Font("Consolas",Font.BOLD,15));
		
		t2 = new JTextField();
		t2.setBounds(120, 200, 150, 20);
		t2.setFont(new Font("Consolas",Font.BOLD,15));
		
		t3 = new JTextField();
		t3.setBounds(120, 340, 150, 20);
		t3.setFont(new Font("Consolas",Font.BOLD,15));
		
		t4 = new JTextField();
		t4.setBounds(120, 240, 150, 20);
		t4.setFont(new Font("Consolas",Font.BOLD,15));

//t4.addActionListener(this);
		
		
		t5 = new JTextField();
		t5.setBounds(120, 300, 150, 20);
		t5.setFont(new Font("Consolas",Font.BOLD,15));

		t6 = new JTextField();
		t6.setBounds(780, 310, 250, 35);
		t6.setFont(new Font("Consolas",Font.BOLD,25));

		cashier = new JLabel();
		cashier.setText("FaisalKhan");
		cashier.setBounds(780, 300, 250, 35);
		cashier.setFont(new Font("Consolas",Font.BOLD,25));
//
//		t8 = new JTextField();
//		t8.setBounds(780, 300, 250, 35);
//		t8.setFont(new Font("Consolas",Font.BOLD,25));
		
		t9 = new JTextField();
		t9.setBounds(270, 350, 400, 30);
		t9.setFont(new Font("Consolas",Font.BOLD,15));
		
		box = new JCheckBox("By Selection, I Agree To Terms And Condition");
		box.setBounds(100, 450, 500, 50);
		box.setFont(new Font("Consolas",Font.BOLD,15));
		box.setFocusable(false);
		
		b1 = new JButton("Submit");
		b1.setBounds(0, 450, 80, 20);
		b1.setFocusable(false);
		b1.addActionListener(this);
		b2 = new JButton("Show");
		b2.setBounds(100, 450, 80, 20);
		b2.setFocusable(false);
		b2.addActionListener(this);
		
		b3 = new JButton("New");
		b3.setBounds(200, 450, 80, 20);
		b3.setFocusable(false);
		b3.addActionListener(this);
				
		opd = new JButton("OPD");
		opd.setBounds(400, 50, 100, 50);
		opd.setFocusable(false);
		opd.addActionListener(this);
		
		ultrasound = new JButton("UltraSound");
		ultrasound.setBounds(600, 50, 100, 50);
		ultrasound.setFocusable(false);
		ultrasound.addActionListener(this);
		
		lab = new JButton("Labortory");
		lab.setBounds(800, 50, 100, 50);
		lab.setFocusable(false);
		lab.addActionListener(this);

		
//		b4 = new JButton("Load Image");
//		b4.setBounds(800, 530, 100, 30);
//		b4.setFocusable(false);
//		b4.addActionListener(this);
		
		
		ImageIcon icon = new ImageIcon("icon.png");	
		
		panel = new JLabel();
		panel.setOpaque(true);
		panel.setBounds(100, 520, 1100, 90);
		panel.setBackground(Color.white);
		
		this.setIconImage(icon.getImage());
		
		ImageIcon icon2 = new ImageIcon("icon2.png");
		l8 = new JLabel();
		l8.setIcon(icon2);
		l8.setBounds(650, 150,500,300);
		l8.setEnabled(false);
		
		bg = new ButtonGroup();
		bg.add(male);
		bg.add(female);
		
		this.add(l1);
		this.add(l2);
		this.add(l3);
		this.add(l4);
		this.add(l5);
		this.add(l6);
		//this.add(l7);
		//this.add(cashier);
		//this.add(shift);
		//this.add(l10);
		this.add(xray);
		this.add(t1);
		this.add(t2);
		this.add(t3);
		this.add(t4);
		this.add(t5);
		//this.add(t6);
		//this.add(t8);
	//	this.add(t9);
		//this.add(box);		
		this.add(b1);
		this.add(b2);
		this.add(b3);
		//this.add(opd);
		//this.add(ultrasound);
		//this.add(lab);
//		this.add(b4);
		this.add(l8);
		this.add(male);
		this.add(female);
		//this.add(panel);
		//this.add(dates);
		this.add(xray1);
		//this.add(years);
		this.setSize(350,600);
		this.setTitle("Student Registration Form");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(true);
		this.setLayout(null);
		this.setVisible(true);	
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
//		if(e.getSource()==opd)
//		{
//			this.dispose();
//			opd opd = new opd();
//		}
//		if(e.getSource()==ultrasound)
//		{
//			this.dispose();
//			ultrasound us = new ultrasound();
//		}
//		if(e.getSource()==lab)
//		{
//			this.dispose();
//			lab lab = new lab();
//		}
		if(e.getSource()==xray1)
		{
			t9.setText(xray1.getSelectedItem()+"");
			//t9 is committed
		}
	
		if(e.getSource()==male)
		{
			String genderm;
			genderm = male.getText();
			t4.setText(genderm);
		}
		else if(e.getSource()==female)
		{
			String genderf;
			genderf = female.getText();
			t4.setText(genderf);
		}
		
				if(e.getSource()==b1)
				{
					if(box.isSelected()==true)
					{
						JOptionPane.showMessageDialog(null,"Submit Successfully", "MessageDialogue", JOptionPane.INFORMATION_MESSAGE);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Accept Terms and Conditions","ERROR", JOptionPane.ERROR_MESSAGE);
					}
				
				}
				if(e.getSource()==b2)
				{
					
					String name,fname,phone,gender,department,rollno,campus,dob;
					name = t1.getText();
					fname = t2.getText();
					phone = t3.getText();
					gender = t4.getText();
					department = t5.getText();
					rollno = t6.getText();
					campus = t8.getText();
					dob = t9.getText();
					JOptionPane.showMessageDialog(null,
							"Student Name                "+name+
							"\n\nFather Name                  "+fname+
							"\n\nPhone                              "+phone+
							"\n\nGender 			                           "+gender+
							"\n\nDate Of Birth                  "+dob+
							"\n\nDepartment                    "+department+
							"\n\nRollno                               "+rollno+
							"\n\nCampus                           "+campus,
							"ShowDetail",JOptionPane.INFORMATION_MESSAGE);
			
					//rame.setVisible(true);
				}
				if(e.getSource()==b3)
				{
//				 t1.setText("");
//				 t2.setText("");
//				 t3.setText("");
//				 t4.setText("");
//				 t5.setText("");
//				 t6.setText("");
//				 t8.setText("");
//				 l8.setEnabled(false);
//				 b4.setEnabled(true);
				this.dispose();
				 xray xray = new xray();
			//t1.setText("");t1.setText("");t1.setText("");t1.setText("");t1.setText("");t1.setText("");t1.setText("");
				}
//				if(e.getSource()==b4)
//				{
//					l8.setEnabled(true);
//					b4.setEnabled(false);
//				}
	}
}
