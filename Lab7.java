import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.util.Scanner;

import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.Label;
import java.awt.Button;
import java.awt.TextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

public class Lab7 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab7 frame = new Lab7();
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
	public Lab7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 423);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Load File");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Close");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Result = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
				if (Result == JOptionPane.YES_NO_OPTION) {
				System.exit(0);
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		Label label = new Label("Course Evaluation Form");
		label.setAlignment(Label.CENTER);
		label.setBounds(121, 10, 151, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("Name");
		label_1.setBounds(10, 38, 151, 22);
		contentPane.add(label_1);
		
		Label label_1_1 = new Label("Matric no.");
		label_1_1.setBounds(10, 68, 151, 22);
		contentPane.add(label_1_1);
		
		Label label_1_2 = new Label("Course Code");
		label_1_2.setBounds(10, 96, 151, 22);
		contentPane.add(label_1_2);
		
		Label label_1_3 = new Label("Rating");
		label_1_3.setBounds(10, 124, 151, 22);
		contentPane.add(label_1_3);
		
		Label label_1_4 = new Label("Outcome");
		label_1_4.setBounds(10, 152, 151, 22);
		contentPane.add(label_1_4);
		
		textField = new JTextField();
		textField.setBounds(167, 42, 277, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(167, 66, 277, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"[Select]", "KK14203", "KT14203"}));
		comboBox.setBounds(167, 96, 184, 22);
		contentPane.add(comboBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("1");
		rdbtnNewRadioButton.setBounds(163, 124, 38, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("2");
		rdbtnNewRadioButton_1.setBounds(203, 124, 38, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("3");
		rdbtnNewRadioButton_2.setBounds(243, 124, 38, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("4");
		rdbtnNewRadioButton_3.setBounds(283, 123, 38, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("5");
		rdbtnNewRadioButton_4.setBounds(323, 124, 38, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Basic Knowledge");
		chckbxNewCheckBox.setBounds(167, 152, 124, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Advanced Knowledge");
		chckbxNewCheckBox_1.setBounds(293, 151, 145, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		Button button = new Button("Submit");
		button.setBounds(10, 180, 70, 22);
		contentPane.add(button);
		
		
		Button button_1 = new Button("Clear");
		button_1.setBounds(91, 180, 70, 22);
		contentPane.add(button_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 208, 434, 143);
		contentPane.add(textArea);
		
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileInputStream fis = null;
				File input_file = new File("myfile.txt");
				try {
					fis = new FileInputStream(input_file);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				byte[] ba = null;
				try {
					ba = fis.readAllBytes();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String dispText = new String(ba, StandardCharsets.UTF_8);
				textArea.setText(dispText);
			}
		});
		
		ButtonGroup rating = new ButtonGroup();
		rating.add(rdbtnNewRadioButton);
		rating.add(rdbtnNewRadioButton_1);
		rating.add(rdbtnNewRadioButton_2);
		rating.add(rdbtnNewRadioButton_3);
		rating.add(rdbtnNewRadioButton_4);
		
		ButtonGroup outcome = new ButtonGroup();
		outcome.add(chckbxNewCheckBox);
		outcome.add(chckbxNewCheckBox_1);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FileOutputStream fos = null;
				File file = new File("myfile.txt");
				try {
					fos = new FileOutputStream(file);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String name = textField.getText();
				String matric = textField_1.getText();
				String course = (String) comboBox.getSelectedItem();
				char rating = '0';
				String outcome = "null";
				
				if(rdbtnNewRadioButton.isSelected()==true)
					rating = '1';
				else if(rdbtnNewRadioButton_1.isSelected()==true)
					rating = '2';
				else if(rdbtnNewRadioButton_2.isSelected()==true)
					rating = '3';
				else if(rdbtnNewRadioButton_3.isSelected()==true)
					rating = '4';
				else if(rdbtnNewRadioButton_4.isSelected()==true)
					rating = '5';
										
				if(chckbxNewCheckBox.isSelected()==true)
					outcome = chckbxNewCheckBox.getText();
				else if(chckbxNewCheckBox_1.isSelected()==true)
					outcome = chckbxNewCheckBox_1.getText();
				
				if(textField.getText().isEmpty()||(textField_1.getText().isEmpty())||(comboBox.getSelectedItem().equals("[Select]"))||((rdbtnNewRadioButton.isSelected())&&(rdbtnNewRadioButton_1.isSelected())&&(rdbtnNewRadioButton_2.isSelected())&&(rdbtnNewRadioButton_3.isSelected())&&(rdbtnNewRadioButton_4.isSelected()))||((chckbxNewCheckBox.isSelected())&&(chckbxNewCheckBox_1.isSelected())))
					JOptionPane.showMessageDialog(null, "Data Missing");
				else {
					JOptionPane.showMessageDialog(null, "Data Submitted");
					String cof = "Name" + "\t: " + name + "\nMatric No." + "\t: " + matric + "\nCourse Code" + "\t: " + course + "\nRating" + "\t: " + rating + "\nOutcome" + "\t: " + outcome;
					byte[] b = cof.getBytes();
					try {
						fos.write(b);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					textArea.setText(cof);
				}
			}
		});
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				comboBox.setSelectedItem("[Select]");
				rating.clearSelection();
				outcome.clearSelection();
			}
		});
	}
			
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
