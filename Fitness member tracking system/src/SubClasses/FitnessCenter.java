package SubClasses;


public class FitnessCenter {
	private String fitnessCenterName;

	public FitnessCenter(String fitnessCenterName) {
		super();
		this.fitnessCenterName = fitnessCenterName;
	}

	public String getFitnessCenterName() {
		return fitnessCenterName;
	}

	public void setFitnessCenterName(String fitnessCenterName) {
		this.fitnessCenterName = fitnessCenterName;
	}

	@Override
	public String toString() {
		return "FitnessCenter [fitnessCenterName=" + fitnessCenterName + "]";
	}
	
	
}
