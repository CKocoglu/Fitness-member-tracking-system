package SubClasses;


public class Persons {
	private String name, surname;
	private String gender;
	private String phone;
	private int idNumber;
	private String address;
	private String email;

	public Persons(String name, String surname, String gender, String phone, int idNumber, String address,
			String email) {
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.phone = phone;
		this.idNumber = idNumber;
		this.address = address;
		this.email = email;
	}

	public Persons() {

	}

	public Persons(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "name=" + name + ", surname=" + surname + ",gender: " + gender + ", phone=" + phone + ", idNumber="
				+ idNumber + ", address=" + address + ", email=" + email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
