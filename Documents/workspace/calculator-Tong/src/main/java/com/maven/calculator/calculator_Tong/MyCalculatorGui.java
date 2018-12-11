package com.maven.calculator.calculator_Tong;


	import java.awt.Color;
	import java.awt.EventQueue;
	import java.awt.Font;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.GroupLayout;
	import javax.swing.GroupLayout.Alignment;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JTextField;

	public class MyCalculatorGui {
	    static StringBuffer myinput =new StringBuffer(); 
		public JFrame frame;
		static final JTextField textField = new JTextField();
		//

		/**
		 * 
		 * 
		 * Launch the application.
		 */
		
	public	CalculatorBasicOperations basicOps = new CalculatorBasicOperations(); 
	public 	CalculatorAdvancedOperations advOps = new CalculatorAdvancedOperations();
	private JButton button;
		
	public static	void display(String s){
			textField.setText("");                      
			textField.setText(s);
			
		}
		
		
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						MyCalculatorGui window = new MyCalculatorGui();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the application.
		 */
		public MyCalculatorGui() {
			initialize();
			basicOps.a = 0.0;
			basicOps.b = 0.0;
			basicOps.basicOperationMode=0;
			advOps.a = 0.0;
			this.textField.setText("(Release Version1.0)  press the button,please!");
			
			} // Construction method

		/**
		 * Initialize the contents of the frame. xxxx
		 */
		private void initialize() {
			frame = new JFrame();
			frame.setAlwaysOnTop(true);
			frame.getContentPane().setBackground(Color.BLACK);
			frame.getContentPane().setEnabled(false);
			frame.setBounds(100, 100, 450, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JButton button_1 = new JButton("+");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(myinput.length()!=0)
					{
					basicOps.a =Double.parseDouble(myinput.toString());
					} else {basicOps.a=0;}
					myinput.setLength(0);
					basicOps.basicOperationMode=1;//1,2,3,4 equal to  +, -, x, / 0 equal NULL
					
					
				}
			});
			button_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
			
			JButton btnX_3 = new JButton("X^3");
			btnX_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					advOps.OpMode= 8;//5,6,7,8,9,10 equal to  sinx, cos, x2, x3, abs(x),1/x 0 e
					if(myinput.length()>0){
						advOps.a = Double.parseDouble(myinput.toString());}
						else{advOps.a =0;}
				;
					myinput.setLength(0);
					
					double result= advOps.advFunc();
					display(Double.toString(result));
				}
			});
			
			JButton button_10 = new JButton("1");
			button_10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					myinput.append("1");
					display(myinput.toString());
				}
			});
			
			JButton button_11 = new JButton("2");
			button_11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					myinput.append("2");
					display(myinput.toString());
				}
			});
			
			JButton button_12 = new JButton("3");
			button_12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					myinput.append("3");
					display(myinput.toString());
				}
			});
			
			JButton btnX_1 = new JButton("|x|");
			btnX_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					advOps.OpMode= 9;//5,6,7,8,9,10 equal to  sinx, cos, x2, x3, abs(x),1/x 0 e
					
					if(myinput.length()>0){
						advOps.a = Double.parseDouble(myinput.toString());}
						else{advOps.a =0;}
					
					myinput.setLength(0);
					
					double result= advOps.advFunc();
					display(Double.toString(result));
				}
			});
			btnX_1.setFont(new Font("GB18030 Bitmap", Font.PLAIN, 13));
			btnX_1.setForeground(Color.DARK_GRAY);
			btnX_1.setBackground(Color.GRAY);
			
			JButton button_2 = new JButton("0");
			button_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					 myinput.append("0");
					 display(myinput.toString());
					 
					String cut0= myinput.toString();
					cut0=cut0.replaceFirst("^0*", "");
					if(cut0.length()== 0)
					{myinput.setLength(0);display("0");}
					
					
					
				}
			});
			
			JButton button_3 = new JButton(".");
			button_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					myinput.append(".");
					display(myinput.toString());
				}
			});
			
			button = new JButton("=");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(0!=basicOps.basicOperationMode)
					{
						if(0!=myinput.length()){
							basicOps.b =Double.parseDouble(myinput.toString());
							myinput.setLength(0);}
						else {basicOps.b=0;}
						double result= basicOps.basicFunc();
					//	advOps.a= result;
						display(Double.toString(result));
					if((4==basicOps.basicOperationMode) & (0==basicOps.b) )  
					{display("could not divided by 0! ERROR");}
					
					basicOps.a=0;
					basicOps.b=0;
					basicOps.basicOperationMode=0;}
					
					
				//MyCalculatorGui.display("123");        
					
				}
			});
			
			JButton btnX_2 = new JButton("x^2");
			btnX_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					advOps.OpMode= 7;//5,6,7,8,9,10 equal to  sinx, cos, x2, x3, abs(x),1/x 0 e
					if(myinput.length()>0){
					advOps.a = Double.parseDouble(myinput.toString());}
					else{advOps.a =0;}
					myinput.setLength(0);
					
					double result= advOps.advFunc();
					display(Double.toString(result));
				}
			});
			
			JButton button_7 = new JButton("4");
			button_7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					myinput.append("4");
					display(myinput.toString());
				}
			});
			
			JButton button_8 = new JButton("5");
			button_8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					myinput.append("5");
					display(myinput.toString());
				}
			});
			
			JButton button_13 = new JButton("6");
			button_13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					myinput.append("6");
					display(myinput.toString());
				}
			});
			
			JButton button_14 = new JButton("-");
			button_14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(myinput.length()!=0)
					{basicOps.a =Double.parseDouble(myinput.toString());}
					else{basicOps.a =0;}
					myinput.setLength(0);
					basicOps.basicOperationMode=2;//1,2,3,4 equal to  +, -, 
				}
			});
			button_14.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
			
			JButton btnx = new JButton("1/x");
			btnx.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					advOps.OpMode= 10;//5,6,7,8,9,10 equal to  sinx, cos, x2, x3, abs(x),1/x 0 e
					if(myinput.length()>0){
					advOps.a = Double.parseDouble(myinput.toString());
					double result= advOps.advFunc();
					display(Double.toString(result));}
					else {display("could not divided by 0! ERROR");}
					myinput.setLength(0);
					
					
					
				
				
				
					
					
				}
			});
			
			JButton button_16 = new JButton("7");
			button_16.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					myinput.append("7");
					display(myinput.toString());
				}
			});
			
			JButton button_17 = new JButton("8");
			button_17.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					myinput.append("8");
					display(myinput.toString());
				}
			});
			
			JButton button_18 = new JButton("9");
			button_18.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					myinput.append("9");
					display(myinput.toString());
				}
			});
			
			JButton btnX = new JButton("X");
			btnX.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(myinput.length()>0)
					{basicOps.a =Double.parseDouble(myinput.toString());}
					else {basicOps.a =0;}
					myinput.setLength(0);
					basicOps.basicOperationMode=3;//1,2,3,4 equal to  +, -, 
				}
			});
			
			JButton btnAc = new JButton("AC");
			btnAc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					myinput.setLength(0);
					basicOps.a=0;
					basicOps.b=0;
					basicOps.basicOperationMode=0;
					display(myinput.toString());
				}
			});
			
			JButton btnSinX = new JButton("sin x");
			btnSinX.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					advOps.OpMode= 5;//5,6,7,8,9,10 equal to  sinx, cos, x2, x3, abs(x),1/x 0 e
					if(myinput.length()>0){
					advOps.a = Double.parseDouble(myinput.toString());}
					else advOps.a =0;
					myinput.setLength(0);
					
					double result= advOps.advFunc();
					display(Double.toString(result));
				}
			});
			
			JButton btnCosX = new JButton("cos x");
			btnCosX.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					advOps.OpMode= 6;//5,6,7,8,9,10 equal to  sinx, cos, x2, x3, abs(x),1/x 0 e
					if(myinput.length()>0){
					advOps.a = Double.parseDouble(myinput.toString());}
					else {advOps.a=0;}
					
					myinput.setLength(0);
					
					double result= advOps.advFunc();
					display(Double.toString(result));
					
					
				}
			});
			
			JButton button_24 = new JButton("/");
			button_24.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(myinput.length()>0)
					{basicOps.a =Double.parseDouble(myinput.toString());}
					else {basicOps.a=0;}
					myinput.setLength(0);
					basicOps.basicOperationMode=4;//1,2,3,4 equal to  +, -, 
				}
			});
			textField.setBackground(Color.LIGHT_GRAY);
			textField.setColumns(20);
			GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
			groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addGap(12)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
						.addGap(15))
					.addGroup(groupLayout.createSequentialGroup()
						.addGap(11)
						.addComponent(btnAc, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
						.addGap(22)
						.addComponent(btnSinX)
						.addGap(12)
						.addComponent(btnCosX, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
						.addGap(12)
						.addComponent(button_24))
					.addGroup(groupLayout.createSequentialGroup()
						.addGap(12)
						.addComponent(btnx)
						.addGap(12)
						.addComponent(button_16)
						.addGap(12)
						.addComponent(button_17)
						.addGap(12)
						.addComponent(button_18)
						.addGap(12)
						.addComponent(btnX))
					.addGroup(groupLayout.createSequentialGroup()
						.addGap(12)
						.addComponent(btnX_2)
						.addGap(12)
						.addComponent(button_7)
						.addGap(12)
						.addComponent(button_8)
						.addGap(12)
						.addComponent(button_13)
						.addGap(12)
						.addComponent(button_14))
					.addGroup(groupLayout.createSequentialGroup()
						.addGap(12)
						.addComponent(btnX_3)
						.addGap(12)
						.addComponent(button_10)
						.addGap(12)
						.addComponent(button_11)
						.addGap(12)
						.addComponent(button_12)
						.addGap(12)
						.addComponent(button_1))
					.addGroup(groupLayout.createSequentialGroup()
						.addGap(12)
						.addComponent(btnX_1)
						.addGap(12)
						.addComponent(button_2)
						.addGap(12)
						.addComponent(button_3)
						.addGap(21)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
			);
			groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addGap(6)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addGap(1)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(1)
								.addComponent(btnAc))
							.addComponent(btnSinX)
							.addComponent(btnCosX)
							.addComponent(button_24))
						.addGap(7)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(btnx)
							.addComponent(button_16)
							.addComponent(button_17)
							.addComponent(button_18)
							.addComponent(btnX))
						.addGap(12)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(btnX_2)
							.addComponent(button_7)
							.addComponent(button_8)
							.addComponent(button_13)
							.addComponent(button_14, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addGap(15)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(btnX_3)
							.addComponent(button_10)
							.addComponent(button_11)
							.addComponent(button_12)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addGap(17)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(btnX_1)
							.addComponent(button_2)
							.addComponent(button_3)
							.addComponent(button)))
			);
			frame.getContentPane().setLayout(groupLayout);
		}
	}



