
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class MemberShipsOperations {

	private JFrame MemberShipsFrame;
	private JTextField txtMemberShipID;
	private JTextField txtMemberShipType;

	private String tempUpdateID;

	JButton btnUpdate;
	JButton btnDelete;
	JButton btnSearch;
	JButton btnBackToMenu;
	JButton btnCalculate;

	public JFrame getMemberShipsFrame() {
		return MemberShipsFrame;
	}

	public void setMemberShipsFrame(JFrame memberShipsFrame) {
		MemberShipsFrame = memberShipsFrame;
	}

	public MemberShipsOperations(JFrame superF) {
		MemberShipsFrame = new JFrame();
		MemberShipsFrame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				superF.setVisible(true);
				btnUpdate.setVisible(false);
				try {
					this.finalize();
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		MemberShipsFrame = new JFrame();
		MemberShipsFrame.setSize(622, 477);
		MemberShipsFrame.setLocationRelativeTo(null);
		MemberShipsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MemberShipsFrame.getContentPane().setLayout(null);

		JLabel lblElectric = new JLabel("MemberShip ID:");
		lblElectric.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblElectric.setBounds(26, 33, 127, 24);
		MemberShipsFrame.getContentPane().add(lblElectric);

		JLabel lblWaterBill = new JLabel("MemberShip Type:");
		lblWaterBill.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWaterBill.setBounds(26, 68, 127, 24);
		MemberShipsFrame.getContentPane().add(lblWaterBill);

		txtMemberShipID = new JTextField();
		txtMemberShipID.setBounds(180, 37, 111, 20);
		MemberShipsFrame.getContentPane().add(txtMemberShipID);
		txtMemberShipID.setColumns(10);

		txtMemberShipType = new JTextField();
		txtMemberShipType.setColumns(10);
		txtMemberShipType.setBounds(180, 72, 111, 20);
		MemberShipsFrame.getContentPane().add(txtMemberShipType);

		JTextArea textAreaMembership = new JTextArea();
		textAreaMembership.setBounds(10, 164, 586, 263);
		MemberShipsFrame.getContentPane().add(textAreaMembership);

		btnCalculate = new JButton("Add Membership");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtMemberShipID.getText().matches("([0-9]*){1,20}")) {
					JOptionPane.showMessageDialog(MemberShipsFrame, "MemberShip ID  value must be numeric!");
				} else {
					MenuPage.memberships.addMemberShip(Integer.parseInt(txtMemberShipID.getText()),
							txtMemberShipType.getText());

					textAreaMembership.setText(MenuPage.memberships.toString());

				}

			}
		});
		btnCalculate.setBounds(312, 36, 136, 23);
		MemberShipsFrame.getContentPane().add(btnCalculate);

		btnBackToMenu = new JButton("Back To Menu");
		btnBackToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPage mp = new MenuPage();
				mp.getFrame().setVisible(true);
				MemberShipsFrame.setVisible(false);
			}
		});
		btnBackToMenu.setBounds(470, 71, 126, 23);
		MemberShipsFrame.getContentPane().add(btnBackToMenu);

		btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnUpdate.setVisible(true);

				if (!txtMemberShipID.getText().matches("([0-9]*){1,20}")) {
					JOptionPane.showMessageDialog(MemberShipsFrame, "MemberShip ID  value must be numeric!");
				} else {
					tempUpdateID = txtMemberShipID.getText();
					textAreaMembership.setText(
							MenuPage.memberships.searchMemberShip(Integer.parseInt(txtMemberShipID.getText())));
					txtMemberShipID.setText("");
					txtMemberShipType.setText("");
				}

			}
		});
		btnSearch.setBounds(312, 72, 136, 22);
		MemberShipsFrame.getContentPane().add(btnSearch);

		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtMemberShipID.getText().matches("([0-9]*){1,20}")) {
					JOptionPane.showMessageDialog(MemberShipsFrame, "MemberShip ID  value must be numeric!");
				} else {

					MenuPage.memberships.deleteMemberShip(Integer.parseInt(txtMemberShipID.getText()));

				}

			}
		});
		btnDelete.setBounds(470, 36, 126, 23);
		MemberShipsFrame.getContentPane().add(btnDelete);

		btnUpdate = new JButton("Update");
		btnUpdate.setVisible(false);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtMemberShipID.getText().matches("([0-9]*){1,20}")) {
					JOptionPane.showMessageDialog(MemberShipsFrame, "MemberShip ID  value must be numeric!");
				} else {

					textAreaMembership.setText(MenuPage.memberships.updateMemberShip(Integer.parseInt(tempUpdateID),
							Integer.parseInt(txtMemberShipID.getText()), txtMemberShipType.getText()));

				}
			}
		});
		btnUpdate.setBounds(312, 106, 136, 24);
		MemberShipsFrame.getContentPane().add(btnUpdate);

	}
}
