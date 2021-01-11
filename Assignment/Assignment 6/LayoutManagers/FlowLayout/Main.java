import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Main{
	JButton add,sub,mul,div;
	JTextField num1,num2,result;
	JLabel num1_lbl,num2_lbl,result_lbl;
	JFrame frame;
	Main(){
		frame = new JFrame("Calculator");

		num1_lbl = new JLabel("Number 1: ");
		num2_lbl = new JLabel("Number 2: ");
		result_lbl = new JLabel("Result: ");

		num1 = new JTextField();
		num2 = new JTextField();
		result = new JTextField();

		num1.setColumns(5);
		num2.setColumns(5);
		result.setColumns(5);

		add = new JButton("+");
		sub = new JButton("-");
		mul = new JButton("x");
		div = new JButton("/");

		frame.add(num1_lbl);
		frame.add(num1);

		frame.add(num2_lbl);
		frame.add(num2);

		frame.add(result_lbl);
		frame.add(result);

		frame.add(add);
		frame.add(sub);
		frame.add(mul);
		frame.add(div);

		// frame.add(panel1);
		frame.setSize(648,81);
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());
		
		add.addActionListener(new Listener(this));
		sub.addActionListener(new Listener(this));
		mul.addActionListener(new Listener(this));
		div.addActionListener(new Listener(this));
	}
	public static void main(String[] args){
		new Main();
	}
}

class Listener implements ActionListener{
	Main ui;
	Listener(Main ui){
		this.ui = ui;
	}
	public void actionPerformed(ActionEvent e){
		try{
			if(e.getSource() == ui.add){
				ui.result.setText(""+(Integer.parseInt(ui.num1.getText())+Integer.parseInt(ui.num2.getText())));
			}else if(e.getSource() == ui.sub){
				ui.result.setText(""+(Integer.parseInt(ui.num1.getText())-Integer.parseInt(ui.num2.getText())));
			}else if(e.getSource() == ui.mul){
				ui.result.setText(""+(Integer.parseInt(ui.num1.getText())*Integer.parseInt(ui.num2.getText())));
			}else if(e.getSource() == ui.div){
				try{
					ui.result.setText(""+(Integer.parseInt(ui.num1.getText())/(double)Integer.parseInt(ui.num2.getText())));
				}catch(ArithmeticException exc){
					ui.result.setText(exc.getMessage());
				}
			}
		}catch(NumberFormatException exc){
			ui.result.setText(exc.getMessage());
		}
	}
}