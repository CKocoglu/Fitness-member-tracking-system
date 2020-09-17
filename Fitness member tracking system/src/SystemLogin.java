



public class SystemLogin {
	private String username;
	private String password;
	public SystemLogin() {
		this.username = "admin";
		this.password = "1234";
	}

	public SystemLogin(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public SystemLogin(String password) {
		this.username = "admin";
		this.password = password;
	}

	public boolean Login(String username, String password) {

		if (this.username.equals(username) && this.password == password) {
			return true;
		} else {
			System.out.println("Wrong password. Try again.");
			return false;
		}

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
