
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage {

	private JFrame frmLogIn;
	private JTextField txtUserName;
	private JPasswordField passwordField;
	private JButton btnLogIn;

	SystemLogin logId = new SystemLogin();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frmLogIn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//employenin delete butonu yok onu ayarla
	public LoginPage() {
		frmLogIn = new JFrame();
		frmLogIn.setTitle("Log in");
		frmLogIn.setSize(400, 273);
		frmLogIn.setLocationRelativeTo(null);
		frmLogIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogIn.getContentPane().setLayout(null);

		JLabel lblUserName = new JLabel("User Name: ");
		lblUserName.setBounds(55, 31, 78, 14);
		frmLogIn.getContentPane().add(lblUserName);

		txtUserName = new JTextField();
		txtUserName.setBounds(143, 28, 86, 20);
		txtUserName.setColumns(10);
		frmLogIn.getContentPane().add(txtUserName);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(55, 65, 78, 14);
		frmLogIn.getContentPane().add(lblPassword);

		passwordField = new JPasswordField();
		passwordField.setBounds(143, 59, 86, 20);
		frmLogIn.getContentPane().add(passwordField);

		btnLogIn = new JButton("Log in");
		btnLogIn.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				if (txtUserName.getText().equals(logId.getUsername())
						&& passwordField.getText().equals(logId.getPassword())) {
					MenuPage mp = new MenuPage();
					mp.getFrame().setVisible(true);
					frmLogIn.setVisible(false);
				} else {
					txtUserName.setText("");
					passwordField.setText("");
					JOptionPane.showMessageDialog(frmLogIn, "Wrong password or user name");

				}
			}
		});
		btnLogIn.setBounds(140, 105, 89, 23);
		frmLogIn.getContentPane().add(btnLogIn);

	}

}
