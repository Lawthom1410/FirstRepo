package qa.com.Hospital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hospital {
	
	private Map<Integer, Patient> patients = new HashMap<>();
	private List<Team> teams = new ArrayList<>();
	private List<Ward> wards = new ArrayList<>();
	
	public void admitPatient(Patient patient, Team team, Ward ward) {
		this.patients.put(patient.getId(), patient);
		team.setPatient(patient);
		
		if(!teams.contains(team)) {
			this.teams.add(team);
		}
		patient.setTeam(team);
		
		if(!wards.contains(ward)) {
			this.wards.add(ward);
		}
		patient.setWard(ward);
		
		
	}
	
//	public void dischargePatient(Patient patient) {
//		this.patients.remove(patient);
//	}

	public Map<Integer, Patient> getPatients() {
		return patients;
	}
	
	public void addTeam(Team team) {
		this.teams.add(team);
	}
	public void removeTeam(Team team) {
		this.teams.remove(team);
	}
	
	
	

}
