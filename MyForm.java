import javax.swing.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.*;
import java.awt.event.*;

class MyForm extends JFrame implements ActionListener
{
	JLabel l1, l2, l3, l4 ,l5;
	JTextField t1, t2,t3;
	JButton b1, b2, b3 ,b4, b5;
	//Color c1; 
	MyForm()
	{
		setSize(500,500);
		setLocation(110,40);
		setTitle("My Calculator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		l1 = new JLabel("Calculator");
		l2 = new JLabel("First Number");
		l3 = new JLabel("Second Number");
		l4 = new JLabel("Result");
		l5 = new JLabel("*****");

		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField();
		
		b1 = new JButton("sum");
		b2 = new JButton("sub");
		b3 = new JButton("mul");
		b4 = new JButton("div");
		b5 = new JButton("mod");

		l1.setBounds(200,75,100,25);
		l2.setBounds(50,115,100,25);
		l3.setBounds(50,145,110,25);
		l4.setBounds(50,175,80,25);
		l5.setBounds(348,175,100,25);
		
		Font f = new Font("Arial", Font.BOLD, 16);
		l1.setFont(f);
		Font f1 = new Font ("Bobcat",Font.PLAIN, 14);
		l2.setFont(f1);
		l3.setFont(f1);
		l4.setFont(f1);
		
		b1.setFont(f1);
		b2.setFont(f1);
		b3.setFont(f1);
		b4.setFont(f1);
		b5.setFont(f1);
		
		b1.setBackground(Color.ORANGE);
		b2.setBackground(Color.ORANGE);
		b3.setBackground(Color.ORANGE);
		b4.setBackground(Color.ORANGE);
		b5.setBackground(Color.ORANGE);

		t1.setBackground(Color.PINK);
		t2.setBackground(Color.PINK);
		

		l1.setForeground(Color.RED);		
		t1.setBounds(320,115,100,25);
		t2.setBounds(320,145,100,25);
		
		
		b1.setBounds(50,300,70,30);
		b2.setBounds(125,300,70,30);
		b3.setBounds(200,300,70,30);
		b4.setBounds(275,300,70,30);
		b5.setBounds(350,300,70,30);
		

		
		setLayout(null);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);

		add(t1);
		add(t2);
		add(t3);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		
		setVisible(true);
	}
		public void actionPerformed(ActionEvent e)
		{
			int x, y, z;
			try
			{
				x = Integer.parseInt(t1.getText());
				y = Integer.parseInt(t2.getText());
			
				if(e.getSource() == b1)
				{
					z = x+y;
					l5.setText(z+"");
				}
			
				else if(e.getSource() == b2)
				{
					z = x-y;
					l5.setText(z+"");
				}
				else if(e.getSource() == b3)
				{
					z = x*y;
					l5.setText(z+"");
				}
				else if(e.getSource() == b4)
				{
					float r = x/y;
					l5.setText(r+"");
				}
				else if(e.getSource() == b5)
				{
					z = x%y;
					l5.setText(z+"");
				}
			}
			catch(Exception e1)
			{
				JOptionPane.showMessageDialog(this,"Please insert Numerical value");
				t1.requestFocus();
			}
		}

		public static void main(String args[])
		{
			MyForm obj = new MyForm();
		}
}