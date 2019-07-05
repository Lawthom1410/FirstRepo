package qa.com.Hospital;

import java.util.List;

public class Patient {
	
	private static int idCount = 0;
	private int id;
	private Ward ward;
	private List<String> treatmentPlan;
	private Team team;
	
	public Patient() {
		super();
		idCount++;
		setId(idCount);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Ward getWard() {
		return ward;
	}
	public void setWard(Ward ward) {
		this.ward = ward;
	}
	public List<String> getTreatmentPlan() {
		return treatmentPlan;
	}
	public void setTreatmentPlan(List<String> treatmentPlan) {
		this.treatmentPlan = treatmentPlan;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	
	
	

}
