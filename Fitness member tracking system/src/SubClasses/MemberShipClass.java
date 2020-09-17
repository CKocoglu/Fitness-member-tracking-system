package SubClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberShipClass {
	private int memberShipId;
	private String memberShipType;

	public MemberShipClass(int memberShipId, String memberShipType) {
		this.memberShipId = memberShipId;
		this.memberShipType = memberShipType;
	}

	public MemberShipClass() {

	}

	Scanner scan = new Scanner(System.in);
	private static List<MemberShipClass> memberShipList = new ArrayList<MemberShipClass>();
	


	public boolean addMemberShip(int memberShipId, String memberShipType) {
		MemberShipClass m1 = new MemberShipClass(memberShipId, memberShipType);
		memberShipList.add(m1);
		System.out.println("\nMembership added.");
		return true;
	}

	public boolean updateMemberShipForTest(int memberShipId) { //swingsiz test

		for (MemberShipClass m1 : memberShipList) {
			if (m1.getMemberShipId() == memberShipId) {
				System.out.println("Insert membership type:");
				m1.setMemberShipType(scan.next().isEmpty() ? m1.getMemberShipType() : scan.next());
				System.out.println("Membership Updated.");
			}

		}

		return true;
	}
	
	public String updateMemberShip(int memberShipId,int newId,String newType) {
		String str="";
		for (MemberShipClass m : memberShipList) {
			if (m.getMemberShipId() == memberShipId) {
				m.setMemberShipId(newId);
				m.setMemberShipType(newType);
				str+="\n-----The membership you have updated-----\nMembership ID:" + m.getMemberShipId()
				+ "\nMembership Type:" + m.getMemberShipType();
			}

		}

		return str;
	}

	public boolean deleteMemberShip(int memberShipId) {
		for (MemberShipClass m1 : memberShipList) {
			if (m1.getMemberShipId() == memberShipId) {
				memberShipList.remove(m1);
				System.out.println("Membership deleted.");
			}

		}

		return true;
	}

	public String searchMemberShip(int memberShipId) {
		String str=" ";
		for (MemberShipClass m : memberShipList) {
			if (m.getMemberShipId() == memberShipId) {
				str+="\n-----The membership you have searched-----\nMembership ID:" + m.getMemberShipId()
						+ "\nMembership Type:" + m.getMemberShipType();
			}
			else {
				return "Can not found.";
			}
		}
		return str;
	}

	@Override
	public String toString() {
		int i = 1;
		String str = "";

		for (MemberShipClass m : memberShipList) {

			str += i + ".MemberShip:   Membership ID:" + m.getMemberShipId()
					+ "   Membership Type: " + m.getMemberShipType()+"\n";
			i++;

		}
		return str;
	}

	public int getMemberShipId() {
		return memberShipId;
	}

	public void setMemberShipId(int memberShipId) {
		this.memberShipId = memberShipId;
	}

	public String getMemberShipType() {
		return memberShipType;
	}

	public void setMemberShipType(String memberShipType) {
		this.memberShipType = memberShipType;
	}

	public static List<MemberShipClass> getMemberShipList() {
		return memberShipList;
	}

	public static void setMemberShipList(List<MemberShipClass> memberShipList) {
		MemberShipClass.memberShipList = memberShipList;
	}
	

}
