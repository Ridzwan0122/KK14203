import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lab6 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup sizeSelect = new ButtonGroup();
	double total = 0.0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab6 frame = new Lab6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Lab6() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("Cake Order System");
		lblHeader.setBounds(5, 5, 424, 14);
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblHeader);
		
		JLabel lblSizeLabel = new JLabel("Select a size:");
		lblSizeLabel.setBounds(15, 30, 63, 14);
		contentPane.add(lblSizeLabel);
		
		JRadioButton rdbtnSmall = new JRadioButton("Small (RM45.00)");
		sizeSelect.add(rdbtnSmall);
		rdbtnSmall.setBounds(6, 51, 130, 23);
		contentPane.add(rdbtnSmall);
		
		JRadioButton rdbtnMedium = new JRadioButton("Medium (RM65.00)");
		sizeSelect.add(rdbtnMedium);
		rdbtnMedium.setBounds(138, 51, 130, 23);
		contentPane.add(rdbtnMedium);
		
		JRadioButton rdbtnLarge = new JRadioButton("Large (RM80.00)");
		sizeSelect.add(rdbtnLarge);
		rdbtnLarge.setBounds(270, 51, 130, 23);
		contentPane.add(rdbtnLarge);
		
		JLabel lblToppingLabel = new JLabel("Select Topping(s):");
		lblToppingLabel.setBounds(15, 106, 87, 14);
		contentPane.add(lblToppingLabel);
		
		JToggleButton btnChocolate = new JToggleButton("Chocolate");
		btnChocolate.setBounds(15, 131, 130, 23);
		contentPane.add(btnChocolate);
		
		JToggleButton btnCherries = new JToggleButton("Cherries");
		btnCherries.setBounds(155, 131, 130, 23);
		contentPane.add(btnCherries);
		
		JToggleButton btnBlackForest = new JToggleButton("Black Forest");
		btnBlackForest.setBounds(295, 131, 130, 23);
		contentPane.add(btnBlackForest);
		
		JButton btnOrder = new JButton("Order");
		btnOrder.setBounds(15, 192, 89, 23);
		contentPane.add(btnOrder);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(15, 226, 414, 186);
		contentPane.add(textArea);
		
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Order Submitted");
				
				String cakeSize = "null";
				if(rdbtnSmall.isSelected()==true) {
					total = 45.0;
					cakeSize = "Small";
				}
				else if(rdbtnMedium.isSelected()==true) {
					total = 65.0;
					cakeSize = "Medium";
				}
				else if(rdbtnLarge.isSelected()==true) {
					total = 80.0;
					cakeSize = "Large";
				}
				
				int i = 0;
				String[] topping = new String[3];
				if(btnChocolate.isEnabled()==true) {
					total = total + 10;
					topping[i] = "Chocolate";
					i++;
				}
				if(btnCherries.isEnabled()==true) {
					total = total + 10;
					topping[i] = "Cherries";
					i++;	
				}
				if(btnBlackForest.isEnabled()==true) {
					total = total + 10;
					topping[i] = "Black Forest";
					i++;
				}
					
				String toppingSelected = "null";
				for (i=0; i < topping.length; i++) {
					toppingSelected = "" + i + ") " + topping[i] + " ";
				}
				textArea.setText("Cake Order Details" + "\nSize" + "\t: " + cakeSize + "\nToppings" + "\t: " + toppingSelected + "\nPrice" + "\t: RM" + total);
				
				sizeSelect.clearSelection();
				btnChocolate.setSelected(false);
				btnCherries.setSelected(false);
				btnBlackForest.setSelected(false);
			}
		});
	}
}
