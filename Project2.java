import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.awt.event.ActionEvent;

public class Project2 extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textIdCard;
	private JTextField textAddress;
	private JTextField textAge;
	private JTextField textEntDate;
	private JTextField textAppDate;
	private JTextField textPetName;
	private JTextField textPetType;
	private JTextField textPetAge;
	private JTextField textSpcFeatures;
	private JTextField textDisease;
	private JTextField textDiagnose;
	private JTextField textMedicine;
	private JTextField textPrescription;
	private JTextField textCost;
	private final ButtonGroup ComeGroup = new ButtonGroup();
	private final ButtonGroup WardGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project2 frame = new Project2();
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
	public Project2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 773, 492);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmLoad = new JMenuItem("Load File");
		mnFile.add(mntmLoad);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 313, 737, 107);
		contentPane.add(textArea);
		
		JLabel lblHeader = new JLabel("Pet Treatment Registration System");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setBounds(172, 11, 413, 14);
		contentPane.add(lblHeader);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(251, 36, 2, 189);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(504, 36, 2, 189);
		contentPane.add(separator_1);
		
		JLabel lblLabel1 = new JLabel("Owner's Name & Date");
		lblLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLabel1.setBounds(10, 36, 231, 14);
		contentPane.add(lblLabel1);
		
		JLabel lblLabel2 = new JLabel("Owner's Pet Details");
		lblLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		lblLabel2.setBounds(263, 36, 231, 14);
		contentPane.add(lblLabel2);
		
		JLabel lblLabel3 = new JLabel("Disease & Prescription");
		lblLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		lblLabel3.setBounds(516, 36, 231, 14);
		contentPane.add(lblLabel3);
		
		JLabel lblName = new JLabel("Full name");
		lblName.setBounds(10, 61, 135, 14);
		contentPane.add(lblName);
		
		JLabel lblIdentityCard = new JLabel("Identity Card");
		lblIdentityCard.setBounds(10, 86, 135, 14);
		contentPane.add(lblIdentityCard);
		
		JLabel lblNewLabel_1 = new JLabel("Address");
		lblNewLabel_1.setBounds(10, 111, 135, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(10, 136, 135, 14);
		contentPane.add(lblAge);
		
		JLabel lblEntDate = new JLabel("Date of Entry");
		lblEntDate.setBounds(10, 161, 135, 14);
		contentPane.add(lblEntDate);
		
		JLabel lblAppDate = new JLabel("Appointment Date");
		lblAppDate.setBounds(10, 186, 135, 14);
		contentPane.add(lblAppDate);
		
		JLabel lblPetName = new JLabel("Name");
		lblPetName.setBounds(273, 61, 125, 14);
		contentPane.add(lblPetName);
		
		JLabel lblPetType = new JLabel("Pet Type");
		lblPetType.setBounds(273, 86, 125, 14);
		contentPane.add(lblPetType);
		
		JLabel lblPetAge = new JLabel("Age");
		lblPetAge.setBounds(273, 111, 125, 14);
		contentPane.add(lblPetAge);
		
		JLabel lblSpcFeature = new JLabel("Special features (if any)");
		lblSpcFeature.setBounds(273, 136, 221, 14);
		contentPane.add(lblSpcFeature);
		
		JLabel lblCome = new JLabel("Does the pet have come here before?");
		lblCome.setBounds(273, 186, 221, 14);
		contentPane.add(lblCome);
		
		JCheckBox chckbxComeYes = new JCheckBox("Yes");
		ComeGroup.add(chckbxComeYes);
		chckbxComeYes.setBounds(273, 202, 97, 23);
		contentPane.add(chckbxComeYes);
		
		JCheckBox chckbxComeNo = new JCheckBox("No");
		ComeGroup.add(chckbxComeNo);
		chckbxComeNo.setBounds(372, 202, 97, 23);
		contentPane.add(chckbxComeNo);
		
		JLabel lblDiseaseName = new JLabel("Disease");
		lblDiseaseName.setBounds(516, 61, 135, 14);
		contentPane.add(lblDiseaseName);
		
		JLabel lblDiagDate = new JLabel("Last diagnose");
		lblDiagDate.setBounds(516, 86, 135, 14);
		contentPane.add(lblDiagDate);
		
		JLabel lblMedicineName = new JLabel("Medicine");
		lblMedicineName.setBounds(516, 111, 135, 14);
		contentPane.add(lblMedicineName);
		
		JLabel lblPrscription = new JLabel("Medicine prescription");
		lblPrscription.setBounds(516, 136, 231, 14);
		contentPane.add(lblPrscription);
		
		textName = new JTextField();
		textName.setBounds(155, 58, 86, 20);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textIdCard = new JTextField();
		textIdCard.setBounds(155, 83, 86, 20);
		contentPane.add(textIdCard);
		textIdCard.setColumns(10);
		
		textAddress = new JTextField();
		textAddress.setBounds(155, 108, 86, 20);
		contentPane.add(textAddress);
		textAddress.setColumns(10);
		
		textAge = new JTextField();
		textAge.setBounds(155, 133, 86, 20);
		contentPane.add(textAge);
		textAge.setColumns(10);
		
		textEntDate = new JTextField();
		textEntDate.setBounds(155, 158, 86, 20);
		contentPane.add(textEntDate);
		textEntDate.setColumns(10);
		
		textAppDate = new JTextField();
		textAppDate.setBounds(155, 183, 86, 20);
		contentPane.add(textAppDate);
		textAppDate.setColumns(10);
		
		textPetName = new JTextField();
		textPetName.setBounds(408, 58, 86, 20);
		contentPane.add(textPetName);
		textPetName.setColumns(10);
		
		textPetType = new JTextField();
		textPetType.setBounds(408, 83, 86, 20);
		contentPane.add(textPetType);
		textPetType.setColumns(10);
		
		textPetAge = new JTextField();
		textPetAge.setBounds(408, 108, 86, 20);
		contentPane.add(textPetAge);
		textPetAge.setColumns(10);
		
		textSpcFeatures = new JTextField();
		textSpcFeatures.setBounds(273, 158, 221, 20);
		contentPane.add(textSpcFeatures);
		textSpcFeatures.setColumns(10);
		
		textDisease = new JTextField();
		textDisease.setBounds(661, 58, 86, 20);
		contentPane.add(textDisease);
		textDisease.setColumns(10);
		
		textDiagnose = new JTextField();
		textDiagnose.setBounds(661, 83, 86, 20);
		contentPane.add(textDiagnose);
		textDiagnose.setColumns(10);
		
		textMedicine = new JTextField();
		textMedicine.setBounds(661, 108, 86, 20);
		contentPane.add(textMedicine);
		textMedicine.setColumns(10);
		
		textPrescription = new JTextField();
		textPrescription.setBounds(516, 158, 231, 20);
		contentPane.add(textPrescription);
		textPrescription.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Ward & Treatment Price", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(4, 233, 508, 69);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblWard = new JLabel("Does the pet needed to be warded?");
		lblWard.setBounds(6, 19, 243, 14);
		panel.add(lblWard);
		
		JCheckBox chckbxWardYes = new JCheckBox("Yes");
		WardGroup.add(chckbxWardYes);
		chckbxWardYes.setBounds(6, 40, 97, 23);
		panel.add(chckbxWardYes);
		
		JCheckBox chckbxWardNo = new JCheckBox("No");
		WardGroup.add(chckbxWardNo);
		chckbxWardNo.setBounds(105, 40, 97, 23);
		panel.add(chckbxWardNo);
		
		JLabel lblCost = new JLabel("Treatment cost");
		lblCost.setBounds(247, 19, 251, 14);
		panel.add(lblCost);
		
		textCost = new JTextField();
		textCost.setBounds(313, 41, 103, 20);
		panel.add(textCost);
		textCost.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("RM");
		lblNewLabel.setBounds(257, 44, 46, 14);
		panel.add(lblNewLabel);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String register;
				
				String name = textName.getText();
				String idCard = textIdCard.getText();
				String address = textAddress.getText();
				String age = textAge.getText();
				String entDate = textEntDate.getText();
				String appDate = textAppDate.getText();
				
				String petName = textPetName.getText();
				String petType = textPetType.getText();
				String petAge = textPetAge.getText();
				String spcFeatures = textSpcFeatures.getText();
				if(textSpcFeatures.getText().isEmpty())
					spcFeatures = "none";
				String come;
				if(chckbxComeYes.isSelected()==true)
					come = "Yes";
				else
					come = "No";
				
				String disease = textDisease.getText();
				String diagnose = textDiagnose.getText();
				String medicine = textMedicine.getText();
				String prescription = textPrescription.getText();
				
				String ward;
				if(chckbxWardYes.isSelected()==true)
					ward = "The pet needs to be warded.";
				else
					ward = "The pet does not need to be warded.";
				String cost = textCost.getText();
				
				register = ("Owner's Details" + "\nFull Name: " + name + "\nIdentity Card: " + idCard + "\nAddress: " + address + "\nAge: " + age + "\nDate of Entry: " + entDate + "\nDate of Appointment: " + appDate +
							"\n\nOwner's Pet Details" + "\nPet name: " + petName + "\nType of pet: " + petType + "\nPet Age: " + petAge + "\nPet special features: " + spcFeatures + "\nDoes the pet come here before: " + come +
							"\n\nDisease & Prescription" + "\nDisease: " + disease + "\nDiagnose Date: " + diagnose + "\nMedicine: " + medicine + "\nMedicine Prescription: " + prescription +
							"\n\n" + ward + "\nThe cost of the pet overall treatment: RM" + cost);
				
				textArea.setText(register);
				
				FileOutputStream fos = null;
				File file = new File("myfile.txt");
				try {
					fos = new FileOutputStream(file);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				byte[] b = register.getBytes();
				try {
					fos.write(b);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Database has been registered.");
			}
		});
		btnRegister.setBounds(516, 245, 89, 23);
		contentPane.add(btnRegister);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textName.setText(null);
				textIdCard.setText(null);
				textAddress.setText(null);
				textAge.setText(null);
				textEntDate.setText(null);
				textAppDate.setText(null);
				textPetName.setText(null);
				textPetType.setText(null);
				textPetAge.setText(null);
				textSpcFeatures.setText(null);
				textSpcFeatures.setText(null);
				ComeGroup.clearSelection();
				textDisease.setText(null);
				textDiagnose.setText(null);
				textMedicine.setText(null);
				textPrescription.setText(null);
				WardGroup.clearSelection();
				textCost.setText(null);
			}
		});
		btnClear.setBounds(516, 279, 89, 23);
		contentPane.add(btnClear);
		
		mntmLoad.addActionListener(new ActionListener() {
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
	}
}