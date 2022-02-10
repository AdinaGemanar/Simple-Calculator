
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	 double first;
	 double second;
	 String operations;
	 double result;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calculator() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();          //initializez text fieldul
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(0, 0, 386, 52);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn1 = new JButton("7");
		btn1.addActionListener(new ActionListener() {   //click pe buton
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+ btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setBounds(0, 52, 80, 70);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("8");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+ btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setBounds(102, 52, 80, 70);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("9");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+ btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setBounds(206, 52, 80, 70);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("+");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operations="+";
			}
		});
		btn4.setBounds(306, 52, 80, 70);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("4");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+ btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setBounds(0, 147, 80, 70);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("5");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+ btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setBounds(102, 147, 80, 70);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("6");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+ btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setBounds(206, 147, 80, 70);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("-");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operations="-";
			}
		});
		btn8.setBounds(306, 147, 80, 70);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("1");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+ btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setBounds(0, 238, 80, 70);
		frame.getContentPane().add(btn9);
		
		JButton btn10 = new JButton("2");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+ btn10.getText();
				textField.setText(EnterNumber);
			}
		});
		btn10.setBounds(102, 238, 80, 70);
		frame.getContentPane().add(btn10);
		
		JButton btn11 = new JButton("3");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+ btn11.getText();
				textField.setText(EnterNumber);
			}
		});
		btn11.setBounds(206, 238, 80, 70);
		frame.getContentPane().add(btn11);
		
		JButton btn12 = new JButton("/");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operations="/";
			}
		});
		btn12.setBounds(306, 238, 80, 70);
		frame.getContentPane().add(btn12);
		
		JButton btn13 = new JButton("=");
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operations=="+")
				{
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					}
				else if(operations == "-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations == "*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations == "/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				
			}
		});
		btn13.setBounds(0, 336, 80, 70);
		frame.getContentPane().add(btn13);
		
		JButton btn14 = new JButton("0");
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+ btn14.getText();
				textField.setText(EnterNumber);
			}
		});
		btn14.setBounds(102, 336, 80, 70);
		frame.getContentPane().add(btn14);
		
		JButton btn15 = new JButton("*");
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operations="*";
			}
		});
		btn15.setBounds(206, 336, 80, 70);
		frame.getContentPane().add(btn15);
		
		JButton btn16 = new JButton("C");
		
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		
		btn16.setBounds(306, 336, 80, 70);
		frame.getContentPane().add(btn16);
	}
}
