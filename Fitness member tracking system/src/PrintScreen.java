
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

import SubClasses.Employees;
import SubClasses.Members;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class PrintScreen {

	private JFrame PrintScreenFrame;
	private JTextField txtIDNumber;
	Members member = new Members();
	Employees employee = new Employees();

	public JFrame getFrame() {
		return PrintScreenFrame;
	}

	public void setFrame(JFrame frame) {
		this.PrintScreenFrame = frame;
	}

	public PrintScreen(JFrame superF, int type) {

		PrintScreenFrame = new JFrame();
		PrintScreenFrame.setSize(714, 519);
		PrintScreenFrame.setLocationRelativeTo(null);
		PrintScreenFrame.getContentPane().setLayout(null);

		PrintScreenFrame.addWindowListener(new WindowAdapter() {
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

		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 55, 681, 416);

		PrintScreenFrame.getContentPane().add(textArea);

		JPanel panel = new JPanel();
		panel.setBounds(36, 6, 636, 45);

		PrintScreenFrame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblMemberId = new JLabel("ID Number:");
		lblMemberId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMemberId.setBounds(10, 9, 106, 14);
		panel.add(lblMemberId);

		txtIDNumber = new JTextField();
		txtIDNumber.setBounds(107, 8, 86, 20);
		txtIDNumber.setColumns(10);
		panel.add(txtIDNumber);

		JButton btnMemberSearch = new JButton("Search");

		btnMemberSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (type == 2) {
					textArea.setText(member.searchMember(Integer.parseInt(txtIDNumber.getText())));
				} else if (type == 4) {
					textArea.setText(employee.searchEmployee(Integer.parseInt(txtIDNumber.getText())));
				}
			}
		});
		btnMemberSearch.setBounds(218, 7, 76, 23);
		panel.add(btnMemberSearch);

		JButton btnDelete = new JButton("Delete Member");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(PrintScreenFrame,
						"Are you sure you want to delete this member?", "An Inane Question", JOptionPane.YES_NO_OPTION);
				if (answer == 0) {
					MenuPage.members.deleteMember(Integer.parseInt(txtIDNumber.getText()));
					textArea.setText(member.searchMember(Integer.parseInt(txtIDNumber.getText())) + " Member Deleted.");
				}
			}
		});
		btnDelete.setBounds(314, 7, 135, 23);
		panel.add(btnDelete);

		JButton btnDeleteEmp = new JButton("Delete Employee");
		btnDeleteEmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(PrintScreenFrame,
						"Are you sure you want to delete this member?", "An Inane Question", JOptionPane.YES_NO_OPTION);
				if (answer == 0) { // 0 means yes.
					// textArea.setText(MenuPage.employees.deleteEmployee(Integer.parseInt(txtIDNumber.getText())));
					MenuPage.employees.deleteEmployee(Integer.parseInt(txtIDNumber.getText()));

				}

			}
		});
		btnDeleteEmp.setBounds(314, 7, 135, 23);
		panel.add(btnDeleteEmp);

		JButton btnBack = new JButton("Back To Menu");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPage mp = new MenuPage();
				mp.getFrame().setVisible(true);
				PrintScreenFrame.setVisible(false);
			}
		});
		btnBack.setBounds(475, 7, 125, 23);
		panel.add(btnBack);
		/*
		 * JButton btnEmployeeSearch = new JButton("Search");
		 * btnEmployeeSearch.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { if (type == 2) {
		 * textArea.setText(member.searchMember(Integer.parseInt(txtIDNumber.getText()))
		 * ); }else if(type==4) {
		 * textArea.setText(employee.searchEmployee(Integer.parseInt(txtIDNumber.getText
		 * ()))); }
		 * 
		 * } }); btnEmployeeSearch.setBounds(313, 7, 76, 23);
		 * panel.add(btnEmployeeSearch);
		 */
		panel.setVisible(false);

		if (type == 1) {
			panel.setVisible(true);
			btnMemberSearch.setVisible(false);
			btnDelete.setVisible(false);
			btnDeleteEmp.setVisible(false);
			txtIDNumber.setVisible(false);
			lblMemberId.setVisible(false);
			
			textArea.setText(MenuPage.members.printAllMembers());

		}

		else if (type == 2) {
			btnDeleteEmp.setVisible(false);
			// btnEmployeeSearch.setVisible(false);
			btnMemberSearch.setVisible(true);
			btnDelete.setVisible(true);
			lblMemberId.setText("Member ID");
			panel.setVisible(true);
		}

		else if (type == 3) {
			panel.setVisible(true);
			btnMemberSearch.setVisible(false);
			btnDelete.setVisible(false);
			btnDeleteEmp.setVisible(false);
			txtIDNumber.setVisible(false);
			lblMemberId.setVisible(false);
			textArea.setText(MenuPage.employees.printAllEmployees());

		} else if (type == 4) {
			// btnMemberSearch.setVisible(false);
			// btnEmployeeSearch.setVisible(true);
			btnDeleteEmp.setVisible(true);
			btnDelete.setVisible(false);
			lblMemberId.setText("Employee ID");
			panel.setVisible(true);
		}

		else {
			panel.setVisible(true);

		}

	}
}
