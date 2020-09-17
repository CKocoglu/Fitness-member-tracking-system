

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import SubClasses.Employees;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;

public class addNewEmployee {

	private JFrame addNewEmployeeFrame;
	private JTextField txtName;
	private JTextField txtSurname;
	private JTextField txtPhoneNumber;
	private JRadioButton rbtnGenderFemale;
	private JRadioButton rbtnGenderMale;
	private JTextField txtIdNumber;
	private JLabel lblNewLabel_1;
	private JTextField txtAddress;
	private JLabel lblNewLabel_2;
	private JTextField txtSalary;
	private JLabel lblNewLabel_3;
	private JTextField txtInsurance;
	private JLabel lblNewLabel_4;
	private JTextField txtEmail;

	Employees employee = new Employees();
	private JPasswordField passwordField;
	private JTextField txtWorkingHour;

	public JFrame getAddNewEmployee() {
		return addNewEmployeeFrame;
	}

	public void setAddNewEmployee(JFrame addNewEmployee) {
		this.addNewEmployeeFrame = addNewEmployee;
	}

	public Employees getEmployee() {
		return employee;
	}

	public void setEmployee(Employees employee) {
		this.employee = employee;
	}

	public JFrame getFrame() {
		return addNewEmployeeFrame;
	}

	public void setFrame(JFrame frame) {
		this.addNewEmployeeFrame = frame;
	}

	public void txtFree() {
		txtName.setText("");
		txtSurname.setText("");
		txtIdNumber.setText("");
		txtPhoneNumber.setText("");
		txtAddress.setText("");
		txtEmail.setText("");
		txtInsurance.setText("");
		txtSalary.setText("");
		txtWorkingHour.setText("");
		passwordField.setText("");
	}

	public addNewEmployee(JFrame superF) {
		addNewEmployeeFrame = new JFrame();
		addNewEmployeeFrame.setSize(727, 365);
		addNewEmployeeFrame.setLocationRelativeTo(null);
		addNewEmployeeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addNewEmployeeFrame.getContentPane().setLayout(null);
		addNewEmployeeFrame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				superF.setVisible(true);
				try {
					this.finalize();
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		addNewEmployeeFrame.setTitle("Add new member");
		addNewEmployeeFrame.setSize(650, 465);
		addNewEmployeeFrame.setLocationRelativeTo(null);
		addNewEmployeeFrame.getContentPane().setLayout(null);

		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblName.setBounds(33, 30, 89, 14);
		addNewEmployeeFrame.getContentPane().add(lblName);

		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSurname.setBounds(33, 55, 89, 14);
		addNewEmployeeFrame.getContentPane().add(lblSurname);

		JLabel lblNewLabel = new JLabel("Gender:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(33, 105, 89, 14);
		addNewEmployeeFrame.getContentPane().add(lblNewLabel);

		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPhone.setBounds(33, 130, 69, 14);
		addNewEmployeeFrame.getContentPane().add(lblPhone);

		txtName = new JTextField();
		txtName.setBounds(172, 27, 123, 20);
		addNewEmployeeFrame.getContentPane().add(txtName);
		txtName.setColumns(10);

		txtSurname = new JTextField();
		txtSurname.setBounds(172, 52, 123, 20);
		addNewEmployeeFrame.getContentPane().add(txtSurname);
		txtSurname.setColumns(10);

		rbtnGenderFemale = new JRadioButton("Female");
		rbtnGenderFemale.setBounds(172, 103, 72, 23);
		addNewEmployeeFrame.getContentPane().add(rbtnGenderFemale);

		rbtnGenderMale = new JRadioButton("Male");
		rbtnGenderMale.setBounds(246, 103, 109, 23);
		addNewEmployeeFrame.getContentPane().add(rbtnGenderMale);

		ButtonGroup btnG = new ButtonGroup();
		btnG.add(rbtnGenderFemale);
		btnG.add(rbtnGenderMale);

		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setBounds(172, 129, 123, 20);
		addNewEmployeeFrame.getContentPane().add(txtPhoneNumber);
		txtPhoneNumber.setColumns(10);
		JLabel lblMemberd = new JLabel("IdNumber:");
		lblMemberd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMemberd.setBounds(33, 80, 89, 14);
		addNewEmployeeFrame.getContentPane().add(lblMemberd);

		txtIdNumber = new JTextField();
		txtIdNumber.setBounds(172, 83, 123, 20);
		addNewEmployeeFrame.getContentPane().add(txtIdNumber);
		txtIdNumber.setColumns(10);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(33, 155, 89, 14);
		addNewEmployeeFrame.getContentPane().add(lblPassword);

		lblNewLabel_1 = new JLabel("Address:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(33, 180, 69, 14);
		addNewEmployeeFrame.getContentPane().add(lblNewLabel_1);

		txtAddress = new JTextField();
		txtAddress.setBounds(172, 179, 123, 20);
		addNewEmployeeFrame.getContentPane().add(txtAddress);
		txtAddress.setColumns(10);

		lblNewLabel_2 = new JLabel("Salary:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(33, 205, 109, 19);
		addNewEmployeeFrame.getContentPane().add(lblNewLabel_2);

		txtSalary = new JTextField();
		txtSalary.setBounds(172, 204, 123, 20);
		addNewEmployeeFrame.getContentPane().add(txtSalary);
		txtSalary.setColumns(10);

		lblNewLabel_3 = new JLabel("Insurance Cost:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(33, 236, 109, 14);
		addNewEmployeeFrame.getContentPane().add(lblNewLabel_3);

		txtInsurance = new JTextField();
		txtInsurance.setBounds(172, 235, 123, 20);
		addNewEmployeeFrame.getContentPane().add(txtInsurance);
		txtInsurance.setColumns(10);

		lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(33, 267, 69, 14);
		addNewEmployeeFrame.getContentPane().add(lblNewLabel_4);

		txtEmail = new JTextField();
		txtEmail.setBounds(172, 266, 123, 20);
		addNewEmployeeFrame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);

		JTextArea txtArea2 = new JTextArea();
		txtArea2.setBounds(325, 32, 299, 304);
		addNewEmployeeFrame.getContentPane().add(txtArea2);

		passwordField = new JPasswordField();
		passwordField.setBounds(172, 154, 123, 20);
		addNewEmployeeFrame.getContentPane().add(passwordField);

		JLabel lblWorkingHour = new JLabel("Working Hour");
		lblWorkingHour.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWorkingHour.setBounds(33, 301, 109, 20);
		addNewEmployeeFrame.getContentPane().add(lblWorkingHour);

		txtWorkingHour = new JTextField();
		txtWorkingHour.setBounds(172, 297, 123, 20);
		addNewEmployeeFrame.getContentPane().add(txtWorkingHour);
		txtWorkingHour.setColumns(10);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {

				if (!txtIdNumber.getText().matches("([0-9]*){1,20}")) {
					JOptionPane.showMessageDialog(addNewEmployeeFrame, "ID value must be numeric!");
				} else if (!passwordField.getText().matches("([0-9]*){1,20}")) {
					JOptionPane.showMessageDialog(addNewEmployeeFrame, "Password value must be numeric!");
				} else if (!txtSalary.getText().matches("([0-9]*){1,20}")
						&& !txtSalary.getText().matches("-?\\d+(.\\d+)?")) {
					JOptionPane.showMessageDialog(addNewEmployeeFrame, "Salary value must be numeric!");
				} else if (!txtInsurance.getText().matches("([0-9]*){1,20}")
						&& !txtInsurance.getText().matches("-?\\d+(.\\d+)?")) {
					JOptionPane.showMessageDialog(addNewEmployeeFrame, "Insurance value must be numeric!");
				} else {

					Employees newEmployee = new Employees(txtName.getText(), txtSurname.getText(),
							(rbtnGenderFemale.isSelected() ? "female" : "male"), txtPhoneNumber.getText(),
							Integer.parseInt(txtIdNumber.getText()), txtAddress.getText(), txtEmail.getText(),
							Integer.parseInt(passwordField.getText()), Double.parseDouble(txtSalary.getText()),
							Double.parseDouble(txtInsurance.getText()), Integer.parseInt(txtWorkingHour.getText()));

					boolean a = employee.addEmployee(newEmployee);
					txtFree();

					txtArea2.setText(MenuPage.employees.printAllEmployees());

					boolean retMessage = a;
					if (retMessage) {
						JOptionPane.showMessageDialog(addNewEmployeeFrame, "Succesfully Added.");
					} else {
						JOptionPane.showMessageDialog(addNewEmployeeFrame, "Error.");
					}

				}
			}
		});

		btnAdd.setBounds(65, 346, 89, 23);
		addNewEmployeeFrame.getContentPane().add(btnAdd);

		JButton btnBackFromAddMember = new JButton("Back To Menu");
		btnBackFromAddMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPage mp = new MenuPage();
				mp.getFrame().setVisible(true);
				addNewEmployeeFrame.setVisible(false);

			}
		});
		btnBackFromAddMember.setBounds(220, 346, 123, 23);
		addNewEmployeeFrame.getContentPane().add(btnBackFromAddMember);

	}
}
