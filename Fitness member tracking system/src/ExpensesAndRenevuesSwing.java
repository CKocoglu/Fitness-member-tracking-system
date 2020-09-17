
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

public class ExpensesAndRenevuesSwing {

	private JFrame ExpensesFrame;
	private JTextField txtElectric;
	private JTextField txtWater;
	private JTextField txtMaterial;
	private JTextField txtReneval;
	private JTextField txtTotal;

	
	

	public JFrame getExpensesFrame() {
		return ExpensesFrame;
	}

	public void setExpensesFrame(JFrame expensesFrame) {
		ExpensesFrame = expensesFrame;
	}
	public ExpensesAndRenevuesSwing(JFrame superF) {
		ExpensesFrame = new JFrame();
		ExpensesFrame.addWindowListener(new WindowAdapter() {
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
		
	
		ExpensesFrame = new JFrame();
		ExpensesFrame.setSize(565, 426);
		ExpensesFrame.setLocationRelativeTo(null);
		ExpensesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ExpensesFrame.getContentPane().setLayout(null);

		JLabel lblElectric = new JLabel("Electricity Bill:");
		lblElectric.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblElectric.setBounds(42, 33, 111, 24);
		ExpensesFrame.getContentPane().add(lblElectric);

		JLabel lblWaterBill = new JLabel("Water Bill:");
		lblWaterBill.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWaterBill.setBounds(42, 68, 111, 24);
		ExpensesFrame.getContentPane().add(lblWaterBill);

		JLabel lblMaterialExpenses = new JLabel("Material Expenses:");
		lblMaterialExpenses.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMaterialExpenses.setBounds(42, 103, 137, 24);
		ExpensesFrame.getContentPane().add(lblMaterialExpenses);

		JLabel lblRenevalExpenses = new JLabel("Reneval Expenses:");
		lblRenevalExpenses.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRenevalExpenses.setBounds(42, 138, 137, 24);
		ExpensesFrame.getContentPane().add(lblRenevalExpenses);

		txtElectric = new JTextField();
		txtElectric.setBounds(180, 37, 111, 20);
		ExpensesFrame.getContentPane().add(txtElectric);
		txtElectric.setColumns(10);

		txtWater = new JTextField();
		txtWater.setColumns(10);
		txtWater.setBounds(180, 72, 111, 20);
		ExpensesFrame.getContentPane().add(txtWater);

		txtMaterial = new JTextField();
		txtMaterial.setColumns(10);
		txtMaterial.setBounds(180, 107, 111, 20);
		ExpensesFrame.getContentPane().add(txtMaterial);

		txtReneval = new JTextField();
		txtReneval.setColumns(10);
		txtReneval.setBounds(180, 142, 111, 20);
		ExpensesFrame.getContentPane().add(txtReneval);

		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtElectric.getText().matches("([0-9]*){1,20}")
						&& !txtElectric.getText().matches("-?\\d+(.\\d+)?")) {
					JOptionPane.showMessageDialog(ExpensesFrame, "Electric Bill value must be numeric!");
				} else if (!txtMaterial.getText().matches("([0-9]*){1,20}")
						&& !txtMaterial.getText().matches("-?\\d+(.\\d+)?")) {
					JOptionPane.showMessageDialog(ExpensesFrame, "Material expenses value must be numeric!");
				} else if (!txtReneval.getText().matches("([0-9]*){1,20}")
						&& !txtReneval.getText().matches("-?\\d+(.\\d+)?")) {
					JOptionPane.showMessageDialog(ExpensesFrame, "Reneval expenses value must be numeric!");
				} else if (!txtWater.getText().matches("([0-9]*){1,20}")
						&& !txtWater.getText().matches("-?\\d+(.\\d+)?")) {
					JOptionPane.showMessageDialog(ExpensesFrame, "Water Bill value must be numeric!");
				} else {
					
					Double Expenses=Double.parseDouble(txtElectric.getText())
							+ Double.parseDouble(txtMaterial.getText()) + Double.parseDouble(txtWater.getText())
							+ Double.parseDouble(txtReneval.getText())
							+ MenuPage.expenses.calculateEmployeExpenses(MenuPage.employees.getEmployeeList());
					
					Double Revenues=MenuPage.expenses.calculateRevenue(MenuPage.members.getMemberList());
					txtTotal.setText(String.valueOf(Revenues-Expenses));
				}

			}
		});
		btnCalculate.setBounds(164, 233, 105, 23);
		ExpensesFrame.getContentPane().add(btnCalculate);

		JButton btnBackToMenu = new JButton("Back To Menu");
		btnBackToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPage mp = new MenuPage();
				mp.getFrame().setVisible(true);
				ExpensesFrame.setVisible(false);
			}
		});
		btnBackToMenu.setBounds(306, 233, 105, 23);
		ExpensesFrame.getContentPane().add(btnBackToMenu);

		JLabel lblTotal = new JLabel("Total Expenses:");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTotal.setBounds(42, 186, 137, 24);
		ExpensesFrame.getContentPane().add(lblTotal);

		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		txtTotal.setColumns(10);
		txtTotal.setBounds(180, 190, 111, 20);
		ExpensesFrame.getContentPane().add(txtTotal);
	}

	
	
}
