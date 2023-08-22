import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame 
{
   Container c;
   JLabel labName;
   JTextField txtField;
   JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;    
   JButton addBtn, sudelBtntn, divBtn, mulBtn, clrBtn, eqBtn,dotBtn,perBtn,delBtn;
   JPanel Panel;
   double num1,num2,res;
   String op,ans;

   Calculator() 
   {		
	c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);

        labName = new JLabel("Calculator");
        labName.setOpaque(true);
	JPanel aPanel = new JPanel();
	txtField = new JTextField(30);

	Font f = new Font("Arial", Font.BOLD, 20);
        Font fa = new Font("Arial", Font.BOLD + Font.ITALIC,40);
        
        txtField.setFont(f);
        labName.setFont(fa);
        labName.setBounds(200,30,200,40);
        labName.setForeground(Color.BLACK);

        txtField.setBounds(50, 90, 500, 50);
	c.add(txtField);

	JPanel Panel = new JPanel();

	btn1 = new JButton("1");
	btn2 = new JButton("2");
	btn3 = new JButton("3");
	btn4 = new JButton("4");
	addBtn = new JButton("+");
	btn5 = new JButton("5");
	btn6 = new JButton("6");
	btn7 = new JButton("7");
	sudelBtntn = new JButton("−");
	btn8 = new JButton("8");
	btn9 = new JButton("9");
	btn0 = new JButton("0");
	mulBtn = new JButton("×");
	divBtn = new JButton("÷");
	clrBtn = new JButton("Clr");
	eqBtn = new JButton("=");
	dotBtn = new JButton(".");
	perBtn = new JButton("%");
	delBtn = new JButton("Del");

        btn1.setFont(f);
	btn2.setFont(f);
	btn3.setFont(f);
	btn4.setFont(f);
	addBtn.setFont(f);
	btn5.setFont(f);
	btn6.setFont(f);
	btn7.setFont(f);
	sudelBtntn.setFont(f);
	btn8.setFont(f);
	btn9.setFont(f);
	btn0.setFont(f);
	mulBtn.setFont(f);
	divBtn.setFont(f);
	clrBtn.setFont(f);
	eqBtn.setFont(f);
	dotBtn.setFont(f);
	perBtn.setFont(f);
	delBtn.setFont(f);

	Panel.setLayout(new GridLayout(5, 4));
	Panel.add(btn1);
	Panel.add(btn2);
	Panel.add(btn3);
	Panel.add(addBtn);
	Panel.add(btn4);
	Panel.add(btn5);
	Panel.add(btn6);
	Panel.add(sudelBtntn);
	Panel.add(btn7);
	Panel.add(btn8);
	Panel.add(btn9);
	Panel.add(mulBtn);
	Panel.add(dotBtn);
	Panel.add(btn0);
        Panel.add(delBtn);
	Panel.add(divBtn);
	Panel.add(perBtn);
	Panel.add(clrBtn);
	Panel.add(eqBtn);
		
	Panel.setBounds(50, 150, 500, 300);

	c.add(Panel);
        c.add(labName);

        btn1.addActionListener(new ActionListener() 
	{
          public void actionPerformed(ActionEvent ae)
	  {
            txtField.setText(txtField.getText() + "1");
           }
        });

        btn2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae) 
            {
                txtField.setText(txtField.getText() + "2");
            }
        });

        btn3.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
               txtField.setText(txtField.getText() + "3");
            }
        });

        btn4.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
               txtField.setText(txtField.getText() + "4");
            }
        });

        btn5.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae)
            {
                txtField.setText(txtField.getText() + "5");
            }
        });

        btn6.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
               txtField.setText(txtField.getText() + "6");
            }
        });

        btn7.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
               txtField.setText(txtField.getText() + "7");
            }
        });

        btn8.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                txtField.setText(txtField.getText() + "8");
            }
        });

        btn9.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                txtField.setText(txtField.getText() + "9");
            }
        });

        btn0.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae) 
            {
                txtField.setText(txtField.getText() + "0");
            }
        });

	 clrBtn.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent ae) 
            {
                txtField.setText("");
            }
        });
	
	 addBtn.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent ae) 
            {
		try
                {
		num1 = Double.parseDouble(txtField.getText());
		txtField.setText("");
		op = "+";
		}
                 catch(Exception e)
                 {
		   JOptionPane.showMessageDialog(c,"Sorry, Invalid Input");
		 }
            }
        });
	
	 sudelBtntn.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent ae) 
            {
                try
                {
		num1 = Double.parseDouble(txtField.getText());
		txtField.setText("");
		op = "-";
		}
                catch(Exception e)
                {
			JOptionPane.showMessageDialog(c,"Sorry, Invalid Input");
		}
            }
        });

	 mulBtn.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent ae) 
            {
                try
                {
		num1 = Double.parseDouble(txtField.getText());
		txtField.setText("");
		op = "*";
		}
                catch(Exception e)
                {
			JOptionPane.showMessageDialog(c,"Sorry, Invalid Input");
		}
            }
        });

	 divBtn.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent ae) 
            {
		try
                {
		num1 = Double.parseDouble(txtField.getText());
		txtField.setText("");
		op = "÷";
		}
                catch(Exception e)
                {
			JOptionPane.showMessageDialog(c,"Sorry, Invalid Input");
		}
            }
        });

	 dotBtn.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent ae) 
            {
                txtField.setText(txtField.getText() + ".");
            }
        });

	 perBtn.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent ae) 
            {
               try
               {
		num1 = Double.parseDouble(txtField.getText());
		txtField.setText("");
		op = "%";
		}
                catch(Exception e)
                {
			JOptionPane.showMessageDialog(c,"Sorry, Invalid Input");
		} 
            }
        });

	 eqBtn.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent ae) 
            {   
		try
                {
		String ans;
		num2 = Double.parseDouble(txtField.getText());
		if(op == "+")
		{
			res = num1 + num2;
			ans = String.format("%.2f" , res);
			txtField.setText(ans);
		}
		else if(op == "-")
		{
			res = num1 - num2;
			ans = String.format("%.2f" , res);
			txtField.setText(ans);
		}
		else if(op == "*")
		{
			res = num1*num2;
			ans = String.format("%.2f" , res);
			txtField.setText(ans);
		}
		else if(op == "÷")
		{
			res = num1/num2;
			ans = String.format("%.2f" , res);
			txtField.setText(ans);
		}
		else
		{
			res = num1%num2;
			ans = String.format("%.2f" , res);
			txtField.setText(ans);
		}

		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(c,"Sorry, Invalid Input");
			txtField.setText("");
			txtField.requestFocus();
		}
            }
        });
	
	 delBtn.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent ae) 
            {


        	String currentText = txtField.getText();   
        	  if (!currentText.isEmpty()) 
                  {
            	     int length = currentText.length();
            	     String updatedText = "";

            	  if (length > 1) 
                  {
                     String lastChar = currentText.substring(length - 1);
                     String num2LastChar = currentText.substring(length - 2, length - 1);

                  if (lastChar.matches("[+\\-*/%]") && num2LastChar.matches("[+\\-*/%]")) 
                  {
                    updatedText = currentText.substring(0, length - 2);
                  } 
                   else 
                  {
                    updatedText = currentText.substring(0, length - 1);
                  }
                 } 
                  else {
                updatedText = "";
               }

            txtField.setText(updatedText);
        }
            }
        });
	
	setTitle("Calculator by Ninad");
        setSize(600,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	}
}

class P2 {
	public static void main(String args[]) 
        {
		Calculator c1 = new Calculator();
	}
}
