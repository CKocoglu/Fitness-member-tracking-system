

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import SubClasses.Members;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Font;
import javax.swing.JTextArea;

public class addNewMember {

	private JFrame frmAddNewMember;
	private JTextField txtName;
	private JTextField txtSurname;
	private JTextField txtPhoneNumber;
	private JRadioButton rbtnGenderFemale;
	private JRadioButton rbtnGenderMale;
	private JTextField txtIdNumber;
	private JTextField txtPeriod;
	private JLabel lblNewLabel_1;
	private JTextField txtAddress;
	private JLabel lblNewLabel_2;
	private JTextField txtMemberShipID;
	private JLabel lblNewLabel_3;
	private JTextField txtDebt;
	private JLabel lblNewLabel_4;
	private JTextField txtEmail;

	Members member = new Members();

	public Members getMember() {
		return member;
	}

	public void setMember(Members member) {
		this.member = member;
	}

	public JFrame getFrame() {
		return frmAddNewMember;
	}

	public void setFrame(JFrame frame) {
		this.frmAddNewMember = frame;
	}

	public void txtFree() {
		txtName.setText("");
		txtSurname.setText("");
		txtIdNumber.setText("");
		txtPhoneNumber.setText("");
		txtPeriod.setText("");
		txtAddress.setText("");
		txtEmail.setText("");
		txtDebt.setText("");
		txtMemberShipID.setText("");
	}

	public addNewMember(JFrame superF) {
		frmAddNewMember = new JFrame();
		frmAddNewMember.addWindowListener(new WindowAdapter() {
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

		frmAddNewMember.setTitle("Add new member");
		frmAddNewMember.setSize(650, 465);
		frmAddNewMember.setLocationRelativeTo(null);
		frmAddNewMember.getContentPane().setLayout(null);

		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblName.setBounds(33, 30, 89, 14);
		frmAddNewMember.getContentPane().add(lblName);

		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSurname.setBounds(33, 55, 89, 14);
		frmAddNewMember.getContentPane().add(lblSurname);

		JLabel lblNewLabel = new JLabel("Gender:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(33, 105, 89, 14);
		frmAddNewMember.getContentPane().add(lblNewLabel);

		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPhone.setBounds(33, 130, 69, 14);
		frmAddNewMember.getContentPane().add(lblPhone);

		txtName = new JTextField();
		txtName.setBounds(172, 27, 123, 20);
		frmAddNewMember.getContentPane().add(txtName);
		txtName.setColumns(10);

		txtSurname = new JTextField();
		txtSurname.setBounds(172, 52, 123, 20);
		frmAddNewMember.getContentPane().add(txtSurname);
		txtSurname.setColumns(10);

		rbtnGenderFemale = new JRadioButton("Female");
		rbtnGenderFemale.setBounds(172, 103, 72, 23);
		frmAddNewMember.getContentPane().add(rbtnGenderFemale);

		rbtnGenderMale = new JRadioButton("Male");
		rbtnGenderMale.setBounds(246, 103, 109, 23);
		frmAddNewMember.getContentPane().add(rbtnGenderMale);

		ButtonGroup btnG = new ButtonGroup();
		btnG.add(rbtnGenderFemale);
		btnG.add(rbtnGenderMale);

		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setBounds(172, 129, 123, 20);
		frmAddNewMember.getContentPane().add(txtPhoneNumber);
		txtPhoneNumber.setColumns(10);
		JLabel lblMemberd = new JLabel("IdNumber:");
		lblMemberd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMemberd.setBounds(33, 80, 89, 14);
		frmAddNewMember.getContentPane().add(lblMemberd);

		txtIdNumber = new JTextField();
		txtIdNumber.setBounds(172, 83, 123, 20);
		frmAddNewMember.getContentPane().add(txtIdNumber);
		txtIdNumber.setColumns(10);

		JLabel lblPeriod = new JLabel("Period:");
		lblPeriod.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPeriod.setBounds(33, 155, 89, 14);
		frmAddNewMember.getContentPane().add(lblPeriod);

		txtPeriod = new JTextField();
		txtPeriod.setBounds(172, 154, 123, 20);
		frmAddNewMember.getContentPane().add(txtPeriod);
		txtPeriod.setColumns(10);

		lblNewLabel_1 = new JLabel("Address:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(33, 180, 69, 14);
		frmAddNewMember.getContentPane().add(lblNewLabel_1);

		txtAddress = new JTextField();
		txtAddress.setBounds(172, 179, 123, 20);
		frmAddNewMember.getContentPane().add(txtAddress);
		txtAddress.setColumns(10);

		lblNewLabel_2 = new JLabel("MemberShipID:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(33, 205, 109, 14);
		frmAddNewMember.getContentPane().add(lblNewLabel_2);

		txtMemberShipID = new JTextField();
		txtMemberShipID.setBounds(172, 204, 123, 20);
		frmAddNewMember.getContentPane().add(txtMemberShipID);
		txtMemberShipID.setColumns(10);

		lblNewLabel_3 = new JLabel("Debt:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(33, 236, 89, 14);
		frmAddNewMember.getContentPane().add(lblNewLabel_3);

		txtDebt = new JTextField();
		txtDebt.setBounds(172, 235, 123, 20);
		frmAddNewMember.getContentPane().add(txtDebt);
		txtDebt.setColumns(10);

		lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(33, 267, 69, 14);
		frmAddNewMember.getContentPane().add(lblNewLabel_4);

		txtEmail = new JTextField();
		txtEmail.setBounds(172, 266, 123, 20);
		frmAddNewMember.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);

		JTextArea txtArea2 = new JTextArea();
		txtArea2.setBounds(325, 32, 299, 304);
		frmAddNewMember.getContentPane().add(txtArea2);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!txtIdNumber.getText().matches("([0-9]*){1,20}")) {
					JOptionPane.showMessageDialog(frmAddNewMember, "ID value must be numeric!");
				} else if (!txtMemberShipID.getText().matches("([0-9]*){1,20}")) {
					JOptionPane.showMessageDialog(frmAddNewMember, "MembershipID value must be numeric!");
				} else if (!txtPeriod.getText().matches("([0-9]*){1,20}")) {
					JOptionPane.showMessageDialog(frmAddNewMember, "Period value must be numeric!");
				} else if (!txtDebt.getText().matches("([0-9]*){1,20}")
						&& !txtDebt.getText().matches("-?\\d+(.\\d+)?")) {
					JOptionPane.showMessageDialog(frmAddNewMember, "Debt value must be numeric!");
				} else {

					Members newMember = new Members(txtName.getText(), txtSurname.getText(),
							Integer.parseInt(txtIdNumber.getText()),
							(rbtnGenderFemale.isSelected() ? "female" : "male"), txtPhoneNumber.getText(),
							Integer.parseInt(txtPeriod.getText()), txtAddress.getText(), txtEmail.getText(),
							Double.parseDouble(txtDebt.getText()), Integer.parseInt(txtMemberShipID.getText()));

					// member.memberRegistration(newMember);
					boolean a = member.memberRegistration(newMember);
					txtFree();

					txtArea2.setText(MenuPage.members.printAllMembers());

					boolean retMessage = a;
					if (retMessage) {
						JOptionPane.showMessageDialog(frmAddNewMember, "Succesfully Added.");
					} else {
						JOptionPane.showMessageDialog(frmAddNewMember, "Error.");
					}

				}
			}
		});

		btnAdd.setBounds(65, 346, 89, 23);
		frmAddNewMember.getContentPane().add(btnAdd);

		JButton btnBackFromAddMember = new JButton("Back To Menu");
		btnBackFromAddMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPage mp = new MenuPage();
				mp.getFrame().setVisible(true);
				frmAddNewMember.setVisible(false);

			}
		});
		btnBackFromAddMember.setBounds(220, 346, 123, 23);
		frmAddNewMember.getContentPane().add(btnBackFromAddMember);

	}
}
