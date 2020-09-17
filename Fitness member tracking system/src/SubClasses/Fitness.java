package SubClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fitness {
	private int fitnessId;
	private String fitnessName;
	
	public Fitness() {
		
	}
	public Fitness(int fitnessId, String fitnessName) {
		super();
		this.fitnessId = fitnessId;
		this.fitnessName = fitnessName;
	}
	
	List<Fitness>fitnessList=new ArrayList<Fitness>();
	Scanner scan=new Scanner(System.in);
	public boolean addFitness(int fitnessId, String fitnessName) {
		Fitness f1=new Fitness(fitnessId, fitnessName);
		fitnessList.add(f1);
		System.out.println("\nFitness added.");
		return true;
	}
	public boolean updateFitness(int fitnessId) {
		for(Fitness f : fitnessList){
			{
				if(f.getFitnessId()==fitnessId) 
				{
					System.out.println("Inster fitness name");
					f.setFitnessName(scan.nextLine().isEmpty() ? f.getFitnessName() : scan.next());
					System.out.println("\nFitness updated.");
				}
				
			}
			
		}
		return true;
	}
	
	public boolean deleteFitness(int fitnessId) {
		for(Fitness f : fitnessList){
			{
				if(f.getFitnessId()==fitnessId) 
				{
					fitnessList.remove(f);
					System.out.println("\nFitness deleted.");
				}
			}
		}
		return true;
	}
	
	public void searchFitness(int fitnessId) {
		for(Fitness f : fitnessList){
			{
				if(f.getFitnessId()==fitnessId) 
				{
					System.out.println("\n-----The Fitness you have searched-----\nFitness ID:"+f.getFitnessId()+
							"\nFitness Name:"+f.getFitnessName());
				}
			}
		}
	}
	
	@Override
	public String toString() {
		int i=1;
		String str="";
		
		for( Fitness f: fitnessList) {
			
				str+= "\n----------------"+i+".Fitness----------------\nFitness name:"+f.fitnessName+
						"\nFitness ID: "+f.fitnessId;
				i++;
			
			
		}
		return str;
	}
	
	
	
	public List<Fitness> getFitnessList() {
		return fitnessList;
	}

	public void setFitnessList(List<Fitness> fitnessList) {
		this.fitnessList = fitnessList;
	}

	public int getFitnessId() {
		return fitnessId;
	}
	public void setFitnessId(int fitnessId) {
		this.fitnessId = fitnessId;
	}
	public String getFitnessName() {
		return fitnessName;
	}
	public void setFitnessName(String fitnessName) {
		this.fitnessName = fitnessName;
	}
	
	
	
}
