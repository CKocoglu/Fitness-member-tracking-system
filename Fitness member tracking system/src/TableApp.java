
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.*;

import SubClasses.Employees;
import SubClasses.Members;

public class TableApp {

	private JFrame TableFrame;
	private JScrollPane pane;

	private JTable jTable1;
	private JTableHeader header;

	private JButton btnAdd;
	private JButton btnDelete;
	private JButton btnUpdate;
	private JButton btnRefresh;
	private JButton btnBack;

	private JTextField txtId;
	private JTextField txtName;
	private JTextField txtSurname;
	private JTextField txtGender;

	private DefaultTableModel model;
	private JTextField txtPhone;
	private JTextField txtAdress;
	private JTextField txtEmail;
	private JTextField txtDebt;
	private JTextField txtSalary;
	private JTextField txtWorkingHour;

	private JPanel panel;

	private JTextField txtPeriod;
	private JLabel lblGender;
	private List<String[]> mem_data;
	private List<String[]> emp_data;
	private JLabel lblinsurance;
	private JTextField txtInsurance;

	public TableApp() {

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableApp window = new TableApp();
					window.TableFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JFrame getTableFrame() {
		return TableFrame;
	}

	public void setTableFrame(JFrame tableFrame) {
		TableFrame = tableFrame;
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public TableApp(JFrame superF, int Type) {
		TableFrame = new JFrame();
		TableFrame.addWindowListener(new WindowAdapter() {
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

		TableFrame = new JFrame("List Members.");

		txtId = new JTextField();
		txtId.setBounds(135, 33, 182, 20);
		txtId.setColumns(10);
		TableFrame.getContentPane().add(txtId);

		JLabel lblId = new JLabel("Id:");
		lblId.setBounds(56, 36, 46, 14);
		TableFrame.getContentPane().add(lblId);

		txtName = new JTextField();
		txtName.setBounds(135, 64, 182, 20);
		txtName.setColumns(10);
		TableFrame.getContentPane().add(txtName);

		JLabel lblFirstName = new JLabel("Name:");
		lblFirstName.setBounds(56, 67, 69, 14);
		TableFrame.getContentPane().add(lblFirstName);

		txtSurname = new JTextField();
		txtSurname.setBounds(135, 95, 182, 20);
		txtSurname.setColumns(10);
		TableFrame.getContentPane().add(txtSurname);

		JLabel lblLastName = new JLabel("Surname:");
		lblLastName.setBounds(56, 98, 69, 14);
		TableFrame.getContentPane().add(lblLastName);

		txtGender = new JTextField();
		txtGender.setBounds(135, 126, 182, 20);
		txtGender.setColumns(10);
		TableFrame.getContentPane().add(txtGender);

		lblGender = new JLabel("Gender:");
		lblGender.setBounds(56, 129, 46, 14);
		TableFrame.getContentPane().add(lblGender);

		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(56, 160, 69, 14);
		TableFrame.getContentPane().add(lblPhone);

		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(135, 157, 182, 20);
		TableFrame.getContentPane().add(txtPhone);

		JLabel lblPeriod = new JLabel("Period:");
		lblPeriod.setBounds(56, 253, 69, 14);
		TableFrame.getContentPane().add(lblPeriod);

		txtPeriod = new JTextField();
		txtPeriod.setBounds(135, 250, 182, 20);
		TableFrame.getContentPane().add(txtPeriod);
		txtPeriod.setColumns(10);

		JLabel lblAdress = new JLabel("Address:");
		TableFrame.getContentPane().add(lblAdress);
		lblAdress.setBounds(56, 222, 69, 14);

		txtAdress = new JTextField();
		TableFrame.getContentPane().add(txtAdress);
		txtAdress.setColumns(10);
		txtAdress.setBounds(135, 219, 182, 20);

		JLabel lblEmail = new JLabel("Email:");
		TableFrame.getContentPane().add(lblEmail);
		lblEmail.setBounds(56, 191, 69, 14);

		txtEmail = new JTextField();
		TableFrame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		txtEmail.setBounds(135, 188, 182, 20);

		JLabel lblDebt = new JLabel("Debt:");
		lblDebt.setBounds(56, 284, 69, 14);
		TableFrame.getContentPane().add(lblDebt);

		txtDebt = new JTextField();
		TableFrame.getContentPane().add(txtDebt);
		txtDebt.setColumns(10);
		txtDebt.setBounds(135, 281, 182, 20);

		lblinsurance = new JLabel("Insurance");
		lblinsurance.setBounds(56, 253, 69, 14);
		TableFrame.getContentPane().add(lblinsurance);

		txtInsurance = new JTextField();
		txtInsurance.setColumns(10);
		txtInsurance.setBounds(135, 250, 182, 20);
		TableFrame.getContentPane().add(txtInsurance);

		JLabel lblSalary = new JLabel("Salary:");
		lblSalary.setBounds(56, 284, 69, 14);
		TableFrame.getContentPane().add(lblSalary);

		txtSalary = new JTextField();
		TableFrame.getContentPane().add(txtSalary);
		txtSalary.setColumns(10);
		txtSalary.setBounds(135, 281, 182, 20);

		JLabel lblWorkingHour = new JLabel("WorkingHour:");
		lblWorkingHour.setBounds(56, 318, 69, 14);
		TableFrame.getContentPane().add(lblWorkingHour);

		txtWorkingHour = new JTextField();
		TableFrame.getContentPane().add(txtWorkingHour);
		txtWorkingHour.setColumns(10);
		txtWorkingHour.setBounds(135, 312, 182, 20);

		btnAdd = new JButton("Add");

		if (Type == 1) { // members
			lblSalary.setVisible(false);
			txtSalary.setVisible(false);
			lblWorkingHour.setVisible(false);
			txtWorkingHour.setVisible(false);
			lblinsurance.setVisible(false);
			txtInsurance.setVisible(false);
			lblDebt.setVisible(true);
			txtDebt.setVisible(true);
			lblPeriod.setVisible(true);
			txtPeriod.setVisible(true);
		} else if (Type == 2) { // Employees
			lblDebt.setVisible(false);
			txtDebt.setVisible(false);
			lblPeriod.setVisible(false);
			txtPeriod.setVisible(false);
			lblSalary.setVisible(true);
			txtSalary.setVisible(true);
			lblWorkingHour.setVisible(true);
			txtWorkingHour.setVisible(true);
			lblinsurance.setVisible(true);
			txtInsurance.setVisible(true);
		}

		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {// type okey.

				if (!txtId.getText().matches("([0-9]*){1,20}")) {
					JOptionPane.showMessageDialog(TableFrame, "Id value must be numeric!");

				} /*
					 * else if (txtId.getText().matches("([0-9]*){1,20}")){ for (Members m :
					 * MenuPage.members.getMemberList()) { if (m.getIdNumber() ==
					 * Integer.parseInt(txtId.getText())) {
					 * JOptionPane.showMessageDialog(TableFrame, "Id value must be unique!");
					 * //break; } //break; }
					 * 
					 * } //Burasý olunca ekleme yapmýyor.
					 */

				if (Type == 1) {
					if (!txtId.getText().matches("([0-9]*){1,20}")) {
						JOptionPane.showMessageDialog(TableFrame, "ID value must be numeric!");

					} else if (!txtPeriod.getText().matches("([0-9]*){1,20}")) {
						JOptionPane.showMessageDialog(TableFrame, "Period value must be numeric!");
					} else if (!txtDebt.getText().matches("([0-9]*){1,20}")
							&& !txtDebt.getText().matches("-?\\d+(.\\d+)?")) {
						JOptionPane.showMessageDialog(TableFrame, "Debt value must be numeric!");
					} else {
						if (!txtId.getText().equals("") && !txtName.getText().equals("")
								&& !txtSurname.getText().equals("") && !txtGender.getText().equals("")
								&& !txtPhone.getText().equals("") && !txtPeriod.getText().equals("")
								&& !txtAdress.getText().equals("") && !txtEmail.getText().equals("")
								&& !txtDebt.getText().equals("")) {
							model.addRow(new Object[] { txtId.getText(), txtName.getText(), txtSurname.getText(),
									txtGender.getText(), txtPhone.getText(), txtPeriod.getText(), txtAdress.getText(),
									txtEmail.getText(), txtDebt.getText() });

							Members newMem = new Members(txtName.getText(), txtSurname.getText(),
									Integer.parseInt(txtId.getText()), txtGender.getText(), txtPhone.getText(),
									Integer.parseInt(txtPeriod.getText()), txtAdress.getText(), txtEmail.getText(),
									Double.parseDouble(txtDebt.getText()), 2);
							MenuPage.members.getMemberList().add(newMem);
							JOptionPane.showMessageDialog(TableFrame, "Member Successfully added!");
						} else {
							JOptionPane.showMessageDialog(TableFrame, "All texts must be filled!");
						}
					}
				}

				else if (Type == 2) { // Employee
					if (!txtId.getText().matches("([0-9]*){1,20}")) {
						JOptionPane.showMessageDialog(TableFrame, "ID value must be numeric!");
					} else if (!txtSalary.getText().matches("([0-9]*){1,20}")
							&& !txtSalary.getText().matches("-?\\d+(.\\d+)?")) {
						JOptionPane.showMessageDialog(TableFrame, "Salary value must be numeric!");
					} else if (!txtInsurance.getText().matches("([0-9]*){1,20}")
							&& !txtInsurance.getText().matches("-?\\d+(.\\d+)?")) {
						JOptionPane.showMessageDialog(TableFrame, "Insurance value must be numeric!");
					} else {
						if (!txtId.getText().equals("") && !txtName.getText().equals("")
								&& !txtSurname.getText().equals("") && !txtGender.getText().equals("")
								&& !txtPhone.getText().equals("") && !txtInsurance.getText().equals("")
								&& !txtAdress.getText().equals("") && !txtEmail.getText().equals("")
								&& !txtSalary.getText().equals("") && !txtWorkingHour.getText().equals("")) {
							model.addRow(new Object[] { txtId.getText(), txtName.getText(), txtSurname.getText(),
									txtGender.getText(), txtPhone.getText(), txtAdress.getText(), txtEmail.getText(),
									txtInsurance.getText(), txtSalary.getText(), txtWorkingHour.getText() });

							Employees newEmp = new Employees(txtName.getText(), txtSurname.getText(),
									txtGender.getText(), txtPhone.getText(), Integer.parseInt(txtId.getText()),
									txtAdress.getText(), txtEmail.getText(), 1234,
									Double.parseDouble(txtSalary.getText()), Double.parseDouble(txtInsurance.getText()),
									Integer.parseInt(txtWorkingHour.getText()));
							MenuPage.employees.getEmployeeList().add(newEmp);
							JOptionPane.showMessageDialog(TableFrame, "Employee Successfully added!");
						} else {
							JOptionPane.showMessageDialog(TableFrame, "All texts must be filled!");
						}
					}

					txtId.setText("");
					txtName.setText("");
					txtSurname.setText("");
					txtGender.setText("");
					txtPhone.setText("");
					txtPeriod.setText("");
					txtAdress.setText("");
					txtEmail.setText("");
					txtDebt.setText("");
					txtInsurance.setText("");
					txtSalary.setText("");
					txtWorkingHour.setText("");

				}
			}
		});

		btnAdd.setBackground(Color.GREEN);
		btnAdd.setBounds(327, 33, 130, 31);
		TableFrame.getContentPane().add(btnAdd);

		btnDelete = new JButton("Delete selected");
		btnDelete.addActionListener(new ActionListener() {// type okey
			public void actionPerformed(ActionEvent arg0) {

				int selectedRow = jTable1.getSelectedRow();

				int answer = JOptionPane.showConfirmDialog(TableFrame, "Are you sure you want to delete this instance?",
						"An Inane Question", JOptionPane.YES_NO_OPTION);
				if (Type == 1) {
					if (selectedRow >= 0 && answer == 0) {
						model.removeRow(selectedRow);
						MenuPage.members.deleteMember(Integer.parseInt(txtId.getText()));
						txtId.setText("");
						txtName.setText("");
						txtSurname.setText("");
						txtGender.setText("");
						txtPhone.setText("");
						txtPeriod.setText("");
						txtAdress.setText("");
						txtEmail.setText("");
						txtDebt.setText("");

					}
				} else if (Type == 2) {
					if (selectedRow >= 0 && answer == 0) {
						model.removeRow(selectedRow);
						MenuPage.employees.deleteEmployee(Integer.parseInt(txtId.getText()));
						txtId.setText("");
						txtName.setText("");
						txtSurname.setText("");
						txtGender.setText("");
						txtPhone.setText("");
						txtAdress.setText("");
						txtEmail.setText("");
						txtInsurance.setText("");
						txtSalary.setText("");
						txtWorkingHour.setText("");
					}
				}
			}
		});

		btnDelete.setBackground(Color.ORANGE);
		btnDelete.setBounds(327, 74, 130, 31);
		TableFrame.getContentPane().add(btnDelete);

		btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() { // type okey
			public void actionPerformed(ActionEvent e) {
				if (Type == 1) {
					int update_row = jTable1.getSelectedRow();
					if (update_row != -1) {
						model.setValueAt(txtId.getText(), update_row, 0);
						model.setValueAt(txtName.getText(), update_row, 1);
						model.setValueAt(txtSurname.getText(), update_row, 2);
						model.setValueAt(txtGender.getText(), update_row, 3);
						model.setValueAt(txtPhone.getText(), update_row, 4);
						model.setValueAt(txtPeriod.getText(), update_row, 5);
						model.setValueAt(txtAdress.getText(), update_row, 6);
						model.setValueAt(txtEmail.getText(), update_row, 7);
						model.setValueAt(txtDebt.getText(), update_row, 8);

						MenuPage.members.updateMember(Integer.parseInt(txtId.getText()), txtName.getText(),
								txtSurname.getText(), txtGender.getText(), txtPhone.getText(),
								Integer.parseInt(txtPeriod.getText()), txtAdress.getText(), txtEmail.getText(),
								Integer.parseInt(txtDebt.getText()));

						update_row = -1;
					}
				} else if (Type == 2) {
					int update_row = jTable1.getSelectedRow();
					if (update_row != -1) {
						model.setValueAt(txtId.getText(), update_row, 0);
						model.setValueAt(txtName.getText(), update_row, 1);
						model.setValueAt(txtSurname.getText(), update_row, 2);
						model.setValueAt(txtGender.getText(), update_row, 3);
						model.setValueAt(txtPhone.getText(), update_row, 4);
						model.setValueAt(txtAdress.getText(), update_row, 5);
						model.setValueAt(txtEmail.getText(), update_row, 6);
						model.setValueAt(txtInsurance.getText(), update_row, 7);
						model.setValueAt(txtSalary.getText(), update_row, 8);
						model.setValueAt(txtWorkingHour.getText(), update_row, 9);

						MenuPage.employees.updateEmployee(Integer.parseInt(txtId.getText()), txtName.getText(),
								txtSurname.getText(), txtGender.getText(), txtPhone.getText(), txtAdress.getText(),
								txtEmail.getText(), Double.parseDouble(txtInsurance.getText()),
								Double.parseDouble(txtSalary.getText()), Integer.parseInt(txtWorkingHour.getText()));

						update_row = -1;
					}
				}

			}
		});

		btnUpdate.setBounds(327, 115, 130, 31);
		TableFrame.getContentPane().add(btnUpdate);

		btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtId.setText("");
				txtName.setText("");
				txtSurname.setText("");
				txtGender.setText("");
				txtPhone.setText("");
				txtPeriod.setText("");
				txtAdress.setText("");
				txtEmail.setText("");
				txtDebt.setText("");
				txtInsurance.setText("");
				txtSalary.setText("");
				txtWorkingHour.setText("");
			}
		});
		btnRefresh.setBounds(327, 156, 130, 31);
		TableFrame.getContentPane().add(btnRefresh);

		btnBack = new JButton("Back to Menu");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPage mp = new MenuPage();
				mp.getFrame().setVisible(true);
				TableFrame.setVisible(false);

			}
		});
		btnBack.setBounds(327, 238, 130, 31);
		TableFrame.getContentPane().add(btnBack);
		panel = new JPanel();

		Members m1 = new Members("Osman", "Doðan", 1, "Erkek", "535 465 6566", 90, "Istanbul", "osman@gmail", 0, 3);
		Members m2 = new Members("Cihat", "Koçoðlu", 2, "Erkek", "554 891 5729", 90, "Ankara", "ck@gmail", 22.2, 2);
		Members m3 = new Members("Emir", "Koçoðlu", 3, "Erkek", "554 123 456", 30, "Istanbul", "emir@gmail", 15, 1);
		Members m4 = new Members("Yusuf", "Koçoðlu", 4, "Erkek", "554 234 126", 60, "Istanbul", "yusuf@gmail", 222, 2);
		Members m5 = new Members("Fatih", "Koçoðlu", 5, "Erkek", "554 673 646", 360, "Istanbul", "fatih@gmail", 333, 2);
		Members m6 = new Members("Zeynep", "Koçoðlu", 6, "Kadýn", "554 521 236", 30, "Istanbul", "zeynep@gmail", 0, 2);
		if (MenuPage.addMemberControl) { // Bu kontroller olmassa her tableye girildiðinde tekrar tekrar ekliyor.
			MenuPage.members.getMemberList().add(m1);
			MenuPage.members.getMemberList().add(m2);
			MenuPage.members.getMemberList().add(m3);
			MenuPage.members.getMemberList().add(m4);
			MenuPage.members.getMemberList().add(m5);
			MenuPage.members.getMemberList().add(m6);
			MenuPage.addMemberControl = false;
		}

		String mem_col[] = { "Id", "Name", "Surname", "Gender", "Phone", "Period", "Address", "Email", "Debt" };
		mem_data = new ArrayList<String[]>();
		for (int i = 0; i < MenuPage.members.getMemberList().size(); i++) {
			String name = MenuPage.members.getMemberList().get(i).getName();
			String surname = MenuPage.members.getMemberList().get(i).getSurname();
			String ID = String.valueOf(MenuPage.members.getMemberList().get(i).getIdNumber());
			String gender = MenuPage.members.getMemberList().get(i).getGender();
			String phone = MenuPage.members.getMemberList().get(i).getPhone();
			String period = String.valueOf(MenuPage.members.getMemberList().get(i).getMembershipPeriod());
			String address = MenuPage.members.getMemberList().get(i).getAddress();
			String email = MenuPage.members.getMemberList().get(i).getEmail();
			String debt = String.valueOf(MenuPage.members.getMemberList().get(i).getDebt());

			mem_data.add(new String[] { ID, name, surname, gender, phone, period, address, email, debt });
		}
		Employees e1 = new Employees("Davut", "Taþkýn", "Erkek", "535 878 774", 10, "Istanbul", "dt@gmail.com", 1234,
				5000, 300, 8);
		Employees e2 = new Employees("Halil", "Yýlmaz", "Erkek", "535 234 221", 11, "Istanbul", "halil@gmail.com", 1234,
				3000, 300, 8);
		Employees e3 = new Employees("Arif", "Taþkýn", "Erkek", "535 123 741", 12, "Istanbul", "Arif@gmail.com", 1234,
				3000, 300, 8);
		Employees e4 = new Employees("Fatih", "Koçoðlu", "Erkek", "535 111 232", 13, "Istanbul", "Fatih@gmail.com",
				1234, 5000, 300, 8);
		Employees e5 = new Employees("Yusuf", "Koçoðlu", "Erkek", "535 125 282", 14, "Istanbul", "Yusuf@gmail.com",
				1234, 5000, 300, 8);
		String emp_col[] = { "Id", "Name", "Surname", "Gender", "Phone", "Address", "Email", "Insurance", "Salary",
				"WorkingHour" };
		if (MenuPage.addEmployeeControl) { // Bu kontroller olmassa her tableye girildiðinde tekrar tekrar ekliyor.
			MenuPage.employees.getEmployeeList().add(e1);
			MenuPage.employees.getEmployeeList().add(e2);
			MenuPage.employees.getEmployeeList().add(e3);
			MenuPage.employees.getEmployeeList().add(e4);
			MenuPage.employees.getEmployeeList().add(e5);
			MenuPage.addEmployeeControl = false;
		}

		emp_data = new ArrayList<String[]>();
		for (int i = 0; i < MenuPage.employees.getEmployeeList().size(); i++) {
			String name = MenuPage.employees.getEmployeeList().get(i).getName();
			String surname = MenuPage.employees.getEmployeeList().get(i).getSurname();
			String ID = String.valueOf(MenuPage.employees.getEmployeeList().get(i).getIdNumber());
			String gender = MenuPage.employees.getEmployeeList().get(i).getGender();
			String phone = MenuPage.employees.getEmployeeList().get(i).getPhone();
			String insurance = String.valueOf(MenuPage.employees.getEmployeeList().get(i).getInsuranceCost());
			String address = MenuPage.employees.getEmployeeList().get(i).getAddress();
			String email = MenuPage.employees.getEmployeeList().get(i).getEmail();
			String salary = String.valueOf(MenuPage.employees.getEmployeeList().get(i).getSalary());
			String workinghour = String.valueOf(MenuPage.employees.getEmployeeList().get(i).getWorkingHour());

			emp_data.add(
					new String[] { ID, name, surname, gender, phone, address, email, insurance, salary, workinghour });
		}

		if (Type == 1) {
			model = new DefaultTableModel(mem_col, 0);
			for (String[] row : mem_data) {
				model.addRow(row);
			}
		} else if (Type == 2) {
			model = new DefaultTableModel(emp_col, 0);
			for (String[] row : emp_data) {
				model.addRow(row);
			}
		}

		jTable1 = new JTable();
		jTable1.addMouseListener(new MouseAdapter() { // type okey.
			@Override
			public void mouseClicked(MouseEvent evt) {
				if (Type == 1) {
					int update_row = jTable1.rowAtPoint(evt.getPoint());

					txtId.setText(model.getValueAt(update_row, 0).toString());
					txtName.setText(model.getValueAt(update_row, 1).toString());
					txtSurname.setText(model.getValueAt(update_row, 2).toString());
					txtGender.setText(model.getValueAt(update_row, 3).toString());
					txtPhone.setText(model.getValueAt(update_row, 4).toString());
					txtPeriod.setText(model.getValueAt(update_row, 5).toString());
					txtAdress.setText(model.getValueAt(update_row, 6).toString());
					txtEmail.setText(model.getValueAt(update_row, 7).toString());
					txtDebt.setText(model.getValueAt(update_row, 8).toString());
				} else if (Type == 2) {
					int update_row = jTable1.rowAtPoint(evt.getPoint());

					txtId.setText(model.getValueAt(update_row, 0).toString());
					txtName.setText(model.getValueAt(update_row, 1).toString());
					txtSurname.setText(model.getValueAt(update_row, 2).toString());
					txtGender.setText(model.getValueAt(update_row, 3).toString());
					txtPhone.setText(model.getValueAt(update_row, 4).toString());
					txtAdress.setText(model.getValueAt(update_row, 5).toString());
					txtEmail.setText(model.getValueAt(update_row, 6).toString());
					txtInsurance.setText(model.getValueAt(update_row, 7).toString());
					txtSalary.setText(model.getValueAt(update_row, 8).toString());
					txtWorkingHour.setText(model.getValueAt(update_row, 9).toString());

				}

			}
		});

		jTable1.addKeyListener(new KeyListener() { // type okey.
			@Override
			public void keyPressed(KeyEvent e) {

				int keyboard_row = jTable1.getSelectedRow();

				if (Type == 1) {

					if (e.getKeyCode() == 38) {
						if (keyboard_row > 0) {
							keyboard_row--;

							txtId.setText(model.getValueAt(keyboard_row, 0).toString());
							txtName.setText(model.getValueAt(keyboard_row, 1).toString());
							txtSurname.setText(model.getValueAt(keyboard_row, 2).toString());
							txtGender.setText(model.getValueAt(keyboard_row, 3).toString());
							txtPhone.setText(model.getValueAt(keyboard_row, 4).toString());
							txtPeriod.setText(model.getValueAt(keyboard_row, 5).toString());
							txtAdress.setText(model.getValueAt(keyboard_row, 6).toString());
							txtEmail.setText(model.getValueAt(keyboard_row, 7).toString());
							txtDebt.setText(model.getValueAt(keyboard_row, 8).toString());
						}
					} else if (e.getKeyCode() == 40) {
						if (keyboard_row < model.getRowCount()) {
							keyboard_row++;

							txtId.setText(model.getValueAt(keyboard_row, 0).toString());
							txtName.setText(model.getValueAt(keyboard_row, 1).toString());
							txtSurname.setText(model.getValueAt(keyboard_row, 2).toString());
							txtGender.setText(model.getValueAt(keyboard_row, 3).toString());
							txtPhone.setText(model.getValueAt(keyboard_row, 4).toString());
							txtPeriod.setText(model.getValueAt(keyboard_row, 5).toString());
							txtAdress.setText(model.getValueAt(keyboard_row, 6).toString());
							txtEmail.setText(model.getValueAt(keyboard_row, 7).toString());
							txtDebt.setText(model.getValueAt(keyboard_row, 8).toString());

						}
					}
				} else if (Type == 2) {
					if (e.getKeyCode() == 38) {
						if (keyboard_row > 0) {
							keyboard_row--;

							txtId.setText(model.getValueAt(keyboard_row, 0).toString());
							txtName.setText(model.getValueAt(keyboard_row, 1).toString());
							txtSurname.setText(model.getValueAt(keyboard_row, 2).toString());
							txtGender.setText(model.getValueAt(keyboard_row, 3).toString());
							txtPhone.setText(model.getValueAt(keyboard_row, 4).toString());
							txtAdress.setText(model.getValueAt(keyboard_row, 5).toString());
							txtEmail.setText(model.getValueAt(keyboard_row, 6).toString());
							txtInsurance.setText(model.getValueAt(keyboard_row, 7).toString());
							txtSalary.setText(model.getValueAt(keyboard_row, 8).toString());
							txtWorkingHour.setText(model.getValueAt(keyboard_row, 9).toString());

							txtDebt.setText(model.getValueAt(keyboard_row, 8).toString());
						}
					} else if (e.getKeyCode() == 40) {
						if (keyboard_row < model.getRowCount()) {
							keyboard_row++;

							txtId.setText(model.getValueAt(keyboard_row, 0).toString());
							txtName.setText(model.getValueAt(keyboard_row, 1).toString());
							txtSurname.setText(model.getValueAt(keyboard_row, 2).toString());
							txtGender.setText(model.getValueAt(keyboard_row, 3).toString());
							txtPhone.setText(model.getValueAt(keyboard_row, 4).toString());
							txtAdress.setText(model.getValueAt(keyboard_row, 5).toString());
							txtEmail.setText(model.getValueAt(keyboard_row, 6).toString());
							txtInsurance.setText(model.getValueAt(keyboard_row, 7).toString());
							txtSalary.setText(model.getValueAt(keyboard_row, 8).toString());
							txtWorkingHour.setText(model.getValueAt(keyboard_row, 9).toString());
						}
					}
				}

			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

		});

		if (Type == 1) {
			jTable1.setModel(new DefaultTableModel(new Object[][] {},
					new String[] { "Id", "Name", "Surname", "Gender", "Phone", "Period", "Address", "Email", "Debt" }));
		}
		if (Type == 2) {
			jTable1.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Id", "Name", "Surname", "Gender",
					"Phone", "Address", "Email", "Insurance", "Salary", "WorkingHour" }));
		}

		jTable1.setModel(model); // without this table doesn't show members and employees.
		header = jTable1.getTableHeader();
		header.setBackground(Color.yellow);
		panel.setLayout(null);

		pane = new JScrollPane(jTable1);
		pane.setBounds(24, 355, 689, 361);
		jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		panel.add(pane);
		TableFrame.getContentPane().add(panel);

		TableFrame.setSize(750, 750);
		TableFrame.setLocationRelativeTo(null);
		TableFrame.setUndecorated(true);
		TableFrame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
		TableFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TableFrame.setVisible(true);

	}
}
