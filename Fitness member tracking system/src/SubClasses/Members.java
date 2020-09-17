package SubClasses;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Members extends Persons {
	private double debt;
	private Date regDate;
	private int membershipPeriod;
	private int memberShipid;
	private Date regEndDate;
	private boolean cash;
	private static int k = 0;

	private static List<Members> memberList = new ArrayList<Members>();
	Scanner scan = new Scanner(System.in);

	public Members() {

	}

	public Members(String name) {
		super(name);
	}

	public Members(String name, String surname, int idNumber, String gender, String phone, int membershipPeriod,
			String address, String email, double debt, int memberShipid) {
		super(name, surname, gender, phone, idNumber, address, email);
		this.membershipPeriod = membershipPeriod;
		this.memberShipid = memberShipid; // membershipID
		this.debt = debt;
		this.regDate = currentDate;
		// this.regEndDate = regEndDate;

	}

	Date currentDate = new Date();

	public boolean memberRegistration(Members newMember) {

		// Members newMem = new Members(name, surname,gender, phone,
		// idNumber,memberId+this.getK(), membershipPeriod, address, email, debt,
		// memberShipid);
		memberList.add(k, newMember);
		k++;
		System.out.println("added.");
		return true;
	}

	public String printAllMembers() {
		String str = "";
		int i = 1;
		for (Members m : getMemberList()) {
			str += i + ".Member:   " + "ID: " + m.getIdNumber() + "   Name: " + m.getName() + " " + m.getSurname()
					+ "\n";
			i++;

		}
		if (str.equals("")) {
			str = "Can't found.";
		}

		return str;
	}

	public boolean updateMemberForTest(int IdNumber) {

		for (Members m : memberList) {
			if (m.getIdNumber() == IdNumber) {
				System.out.println("\nPlease enter new informations.");
				System.out.println("\nName:");
				m.setName(scan.nextLine().isEmpty() ? this.getName() : scan.next());
				System.out.println("Surname:");
				m.setSurname((scan.nextLine().isEmpty()) ? this.getSurname() : scan.next());
				System.out.println("Phone:");
				m.setPhone((scan.nextLine().isEmpty()) ? this.getPhone() : scan.next());
				System.out.println("Id Number:");
				m.setIdNumber(scan.nextInt());
				System.out.println("Address:");
				m.setAddress((scan.nextLine().isEmpty()) ? this.getAddress() : scan.next());
				System.out.println("Email:");
				m.setEmail(scan.nextLine().isEmpty() ? this.getEmail() : scan.next());
				System.out.println("Debt:");
				m.setDebt(scan.nextDouble());
			}
		}
		System.out.println("Member updated.");
		return true;
	}

	public boolean updateMember(int IdNumber, String name, String surname, String gender, String phone, int period,
			String address, String email, double debt) {
		for (Members m : memberList) {
			if (m.getIdNumber() == IdNumber) {
				m.setIdNumber(IdNumber);
				m.setName(name);
				m.setSurname(surname);
				m.setGender(gender);
				m.setPhone(phone);
				m.setMembershipPeriod(period);
				m.setAddress(address);
				m.setEmail(email);
				m.setDebt(debt);
			}
		}
		System.out.println("Member updated.");
		return true;
	}

	public boolean deleteMember(int IdNumber) {

		for (Members m : memberList) {
			if (m.getIdNumber() == IdNumber) {
				memberList.remove(m);
				System.out.println("\nMember deleted.");

			}
		}

		return true;

	}

	public String searchMember(int IdNumber) {
		String strr = "";
		for (Members m : memberList) {
			if (m.getIdNumber() == IdNumber) {
				strr += ("\n-----The Employee you have searched-----\nName:" + m.getName() + "\nSurname:"
						+ m.getSurname() + "\nPhone:" + m.getPhone() + "\nId number:" + m.getIdNumber() + "\n Address:"
						+ m.getAddress());
				return strr;
			}
		}
		strr += "Can not found.";
		return strr;

	}

	public boolean membersPayment(int IdNumber, boolean cash) {
		double debt = this.getDebt();
		for (Members m : memberList) {
			if (m.getIdNumber() == IdNumber) {
				if (cash == true) {
					System.out.println("\nEnter received amount: ");
					double amount = scan.nextDouble();
					debt = m.getDebt() - amount;
					if (debt < 0) {
						System.out.println("More received. Please give " + (amount - m.getDebt()) + " back ");
					} else {
						debt = (double) ((int) (debt * 100)) / (100);
						m.setDebt(debt);
						System.out.println("\nLeft debt: " + m.getDebt());
					}

				} else {
					System.out.println("Enter card number.");
					int cardNum = scan.nextInt();
					if (cardNum != 0) {
						// Bank operations
					}

				}
			}
		}
		return true;
	}

	@Override
	public String toString() {
		return "Members [" + super.toString() + ", debt=" + debt + ", regDate=" + regDate + ", membershipPeriod="
				+ membershipPeriod + ", memberShipid=" + memberShipid + ", regEndDate=" + regEndDate + ", cash=" + cash
				+ "]";
	}

	public int getMemberShipid() {
		return memberShipid;
	}

	public void setMemberShipid(int id) {
		this.memberShipid = id;
	}

	public boolean isCash() {
		return cash;
	}

	public void setCash(boolean cash) {
		this.cash = cash;
	}

	public double getDebt() {
		return debt;
	}

	public void setDebt(float debt) {
		this.debt = debt;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getRegEndDate() {
		return regEndDate;
	}

	public void setRegEndDate(Date regEndDate) {
		this.regEndDate = regEndDate;
	}

	public int getMembershipPeriod() {
		return membershipPeriod;
	}

	public void setMembershipPeriod(int membershipPeriod) {
		this.membershipPeriod = membershipPeriod;
	}

	public void setDebt(double debt) {
		this.debt = debt;
	}

	public List<Members> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<Members> memberList) {
		Members.memberList = memberList;
	}

}
