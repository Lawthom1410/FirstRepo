package qa.com.Hospital;

import java.util.ArrayList;
import java.util.List;

public class Team {
	
	private List<Doctor> doctors = new ArrayList<>();
	private Patient patient;
	
	public Team(Doctor doc1, Doctor doc2) {
		
		if(doc1.getSeniority() != "Consultant" && doc2.getSeniority() != "Consultant") {
			throw new IllegalArgumentException("Team needs a consultant");
		}
		
		this.doctors.add(doc1);	
		this.doctors.add(doc2);
	}	
	
	public void addToTeam(Doctor doctor) {
		if (doctors.size() < 4) {
			this.doctors.add(doctor);		
		} else {
//			System.out.println("Team must have no more than 4 doctors");
		}
	}
	
	public void removeFromTeam(Doctor doctor) {
		if (doctors.size() > 2) {
			if (doctor.getSeniority() == "Consultant") {
				int consCount = 0;
				for (Doctor i : doctors) {
					String seniorityI = i.getSeniority();
					if (seniorityI == "Consultant") {
						consCount++;
					}
				}
				if (consCount > 1) {
					this.doctors.remove(doctor);
				} else {
//					System.out.println("Team must have a consultant");
				}
			} else {
				this.doctors.remove(doctor);			
			}
		} else {
//			System.out.println("Team must have at least 2 doctors");
		}
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	

}
