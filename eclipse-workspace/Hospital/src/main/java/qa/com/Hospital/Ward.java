package qa.com.Hospital;

import java.util.ArrayList;
import java.util.List;

public class Ward {
	
	Hospital hospital;
	List<Patient> patientsOnWard = new ArrayList<>();
	int capacity;
	public Hospital getHospital() {
		return hospital;
	}
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	
	public List<Patient> getPatientsOnWard() {
		return patientsOnWard;
	}
	public void addPatient(Patient patient) {
		this.patientsOnWard.add(patient);
	}
	public void removePatient(Patient patient) {
		this.patientsOnWard.remove(patient);
	}
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	

}
