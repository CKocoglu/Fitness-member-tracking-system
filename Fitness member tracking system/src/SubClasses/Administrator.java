package SubClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Administrator extends Persons {
	private String adminUserName;
	private int adminPassword;
	private int permission;
	private String campaignName;
	private double campaignPrice;
	
	public Administrator() {
		
	}
	public Administrator(String name, String surname,String gender, String phone, int idNumber, String address, String email
			) {
		super(name, surname, gender,phone, idNumber, address, email);
		this.adminUserName = "admin";
		this.adminPassword = 1234;
		this.permission=1;
	}
	public Administrator(String name, String surname,String gender, String phone, int idNumber, String address, String email,
			String adminUserName, int adminPassword) {
		super(name, surname, gender,phone, idNumber, address, email);
		this.adminUserName = adminUserName;
		this.adminPassword = adminPassword;
	}
	public Administrator(String campaignName,double campaignPrice) {
		this.campaignName=campaignName;
		this.campaignPrice=campaignPrice;
	}
	Scanner scan=new Scanner (System.in);
	List<Administrator>campaignList=new ArrayList<Administrator>();

	public boolean addNewCampaign(String campaignName,double campaignPrice) {
		Administrator newCampaign= new Administrator(campaignName,campaignPrice);
		campaignList.add(newCampaign);
		return true;
	}
	public boolean updateCampaign(String CampaignName) {
		for(Administrator c: campaignList) {
			if(c.getCampaignName().equals(CampaignName))
			{
				System.out.println("Insert Campaign name:");this.setCampaignName(scan.next());
				System.out.println("Insert Campaign price:");this.setCampaignPrice(scan.nextDouble());
			}
		}
		
		return true;
	}
	public void showCampaigns() {
		for(Administrator a : campaignList) {
				System.out.println("\n-----Campaigns-----\nCampaigns Name:"+a.getCampaignName()+
						"\nCampaigns price:"+a.getCampaignPrice());
			}
		
	}
	
	
	
	@Override
	public String toString() {
		return "Administrator [adminUserName=" + adminUserName + ", adminPassword=" + adminPassword + "]";
	}
	

	

	
	
	public double getCampaignPrice() {
		return campaignPrice;
	}
	public void setCampaignPrice(double campaignPrice) {
		this.campaignPrice = campaignPrice;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public String getAdminUserName() {
		return adminUserName;
	}


	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}


	public int getAdminPassword() {
		return adminPassword;
	}


	public void setAdminPassword(int adminPassword) {
		this.adminPassword = adminPassword;
	}
	public int getPermission() {
		return permission;
	}
	public void setPermission(int permission) {
		this.permission = permission;
	}
	


	
	
	
	

	
	
}
