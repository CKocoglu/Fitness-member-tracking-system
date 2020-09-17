
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import SubClasses.Employees;
import SubClasses.ExpensesAndRevenues;
import SubClasses.MemberShipClass;
import SubClasses.Members;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MenuPage {

	private JFrame MenuPageFrame;
	private JRadioButton rbtnAddMember;
	private JRadioButton rbtnDisplayAllM;
	private JRadioButton rbtnSearch;
	private JRadioButton rbtnExit;
	private addNewMember admember;
	private PrintScreen ps;
	private TableApp table;
	private addNewEmployee ademployee;
	private ExpensesAndRenevuesSwing exp;
	private MemberShipsOperations membership;

	public static Members members = new Members();
	public static Employees employees = new Employees();
	public static ExpensesAndRevenues expenses = new ExpensesAndRevenues();
	public static MemberShipClass memberships = new MemberShipClass();
	private JLabel lblNewLabel;
	private JRadioButton rdbtnAddNewEmployee;
	private JRadioButton rdbtnDisplayEmployee;
	private JRadioButton rdbtnSearchEmployee;
	static boolean addMemberControl = true;
	static boolean addEmployeeControl = true;
	private JRadioButton rdbtnMemberships;

	public MenuPage() {

		MenuPageFrame = new JFrame();
		MenuPageFrame.setSize(727, 365);
		MenuPageFrame.setLocationRelativeTo(null);
		MenuPageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MenuPageFrame.getContentPane().setLayout(null);

		JLabel lblMenu = new JLabel("MEMBER MENU");
		lblMenu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenu.setBounds(60, 22, 115, 14);
		MenuPageFrame.getContentPane().add(lblMenu);

		rbtnAddMember = new JRadioButton("Add new member");
		rbtnAddMember.setBounds(16, 51, 193, 23);
		rbtnAddMember.setSelected(true);
		MenuPageFrame.getContentPane().add(rbtnAddMember);

		rbtnDisplayAllM = new JRadioButton("Display all member with their member Ids");
		rbtnDisplayAllM.setBounds(16, 77, 248, 23);
		MenuPageFrame.getContentPane().add(rbtnDisplayAllM);

		rbtnSearch = new JRadioButton("Search and delete member");
		rbtnSearch.setBounds(16, 103, 205, 23);
		MenuPageFrame.getContentPane().add(rbtnSearch);

		rbtnExit = new JRadioButton("Exit");
		rbtnExit.setBounds(16, 160, 166, 23);
		MenuPageFrame.getContentPane().add(rbtnExit);

		lblNewLabel = new JLabel("EMPLOYEE MENU");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(284, 22, 115, 14);
		MenuPageFrame.getContentPane().add(lblNewLabel);

		rdbtnAddNewEmployee = new JRadioButton("Add new employee");
		rdbtnAddNewEmployee.setBounds(268, 51, 211, 23);
		MenuPageFrame.getContentPane().add(rdbtnAddNewEmployee);

		rdbtnDisplayEmployee = new JRadioButton("Display all employees");
		rdbtnDisplayEmployee.setBounds(268, 77, 193, 23);
		MenuPageFrame.getContentPane().add(rdbtnDisplayEmployee);

		rdbtnSearchEmployee = new JRadioButton("Search and delete employee");
		rdbtnSearchEmployee.setBounds(268, 103, 225, 23);
		MenuPageFrame.getContentPane().add(rdbtnSearchEmployee);

		JRadioButton rbtnTableApp = new JRadioButton("Display all member with table");
		rbtnTableApp.setBounds(16, 133, 205, 23);
		MenuPageFrame.getContentPane().add(rbtnTableApp);

		JRadioButton rdbtnDisplayWithTable = new JRadioButton("Display all employees with table");
		rdbtnDisplayWithTable.setBounds(268, 129, 243, 23);
		MenuPageFrame.getContentPane().add(rdbtnDisplayWithTable);

		JRadioButton rdbtnExpensesAndRenevues = new JRadioButton("Expenses and renevues");
		rdbtnExpensesAndRenevues.setBounds(500, 51, 193, 23);
		MenuPageFrame.getContentPane().add(rdbtnExpensesAndRenevues);

		rdbtnMemberships = new JRadioButton("MemberShip operations");
		rdbtnMemberships.setBounds(500, 77, 193, 23);
		MenuPageFrame.getContentPane().add(rdbtnMemberships);

		ButtonGroup btnG = new ButtonGroup();
		btnG.add(rbtnAddMember);
		btnG.add(rbtnDisplayAllM);
		btnG.add(rbtnSearch);
		btnG.add(rbtnExit);
		btnG.add(rbtnTableApp);
		btnG.add(rdbtnAddNewEmployee);
		btnG.add(rdbtnDisplayEmployee);
		btnG.add(rdbtnSearchEmployee);
		btnG.add(rdbtnExpensesAndRenevues);
		btnG.add(rdbtnMemberships);
		btnG.add(rdbtnDisplayWithTable);

		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rbtnAddMember.isSelected()) {
					admember = new addNewMember(MenuPageFrame);
					admember.getFrame().setVisible(true);
					MenuPageFrame.setVisible(false);
				} else if (rbtnDisplayAllM.isSelected()) {
					ps = new PrintScreen(MenuPageFrame, 1);
					ps.getFrame().setVisible(true);
					MenuPageFrame.setVisible(false);

				} else if (rbtnSearch.isSelected()) {
					ps = new PrintScreen(MenuPageFrame, 2);
					ps.getFrame().setVisible(true);
					MenuPageFrame.setVisible(false);
				} else if (rbtnTableApp.isSelected()) {
					table = new TableApp(MenuPageFrame, 1);
					table.getTableFrame().setVisible(true);
					MenuPageFrame.setVisible(false);
				} else if (rdbtnAddNewEmployee.isSelected()) {
					ademployee = new addNewEmployee(MenuPageFrame);
					ademployee.getFrame().setVisible(true);
					MenuPageFrame.setVisible(false);

				} else if (rdbtnDisplayEmployee.isSelected()) {
					ps = new PrintScreen(MenuPageFrame, 3);
					ps.getFrame().setVisible(true);
					MenuPageFrame.setVisible(false);
				} else if (rdbtnSearchEmployee.isSelected()) {
					ps = new PrintScreen(MenuPageFrame, 4);
					ps.getFrame().setVisible(true);
					MenuPageFrame.setVisible(false);
				} else if (rdbtnDisplayWithTable.isSelected()) {
					table = new TableApp(MenuPageFrame, 2);
					table.getTableFrame().setVisible(true);
					MenuPageFrame.setVisible(false);
				} else if (rdbtnExpensesAndRenevues.isSelected()) {
					exp = new ExpensesAndRenevuesSwing(MenuPageFrame);
					exp.getExpensesFrame().setVisible(true);
					MenuPageFrame.setVisible(false);

				} else if (rdbtnMemberships.isSelected()) {
					membership = new MemberShipsOperations(MenuPageFrame);
					membership.getMemberShipsFrame().setVisible(true);
					MenuPageFrame.setVisible(false);

				} else {
					System.exit(0);
				}

			}
		});
		btnOk.setBounds(294, 223, 89, 23);
		MenuPageFrame.getContentPane().add(btnOk);

		JLabel lblGymMenu = new JLabel("GYM MENU");
		lblGymMenu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGymMenu.setBounds(535, 22, 104, 14);
		MenuPageFrame.getContentPane().add(lblGymMenu);

	}

	public JFrame getFrame() {
		return MenuPageFrame;
	}

	public void setFrame(JFrame frame) {
		this.MenuPageFrame = frame;
	}

	public static boolean isAddMemberControl() {
		return addMemberControl;
	}

	public static void setAddMemberControl(boolean addMemberControl) {
		MenuPage.addMemberControl = addMemberControl;
	}

	public static boolean isAddEmployeeControl() {
		return addEmployeeControl;
	}

	public static void setAddEmployeeControl(boolean addEmployeeControl) {
		MenuPage.addEmployeeControl = addEmployeeControl;
	}
}
