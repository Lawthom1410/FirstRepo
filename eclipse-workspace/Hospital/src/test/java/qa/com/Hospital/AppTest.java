package qa.com.Hospital;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Before;

import static org.hamcrest.CoreMatchers.*;


public class AppTest {
	
	private Hospital testHospital = new Hospital();
	private Patient testPatient = new Patient();
	private Doctor testDocC = new Doctor("Consultant");
	private Doctor testDocJ = new Doctor("Junior");
	private Team testTeam = new Team(testDocC, testDocJ);
	private Ward testWard = new Ward();
	
	@Test 
	public void testAdmitPatient() {
		testHospital.admitPatient(testPatient, testTeam, testWard);		
		assertEquals(1, testHospital.getPatients().size());
	}
	
	@Test
	public void testAddDoctorToTeam() {
		testTeam.addToTeam(testDocJ);		
		assertEquals(3, testTeam.getDoctors().size());
	}
	
	@Test
	public void firstDoctorInTeamIsConsultant() {
		String actual;
		try {
			Team testTeam2 = new Team(testDocJ, testDocJ);
			actual = "Team Created";
		} catch (IllegalArgumentException iae) {
			actual = iae.getMessage();
		} 
		assertEquals("Team needs a consultant", actual);	
	}
	
	@Test
	public void noMoreThanFourDocsInTeam() {
		testTeam.addToTeam(testDocC);
		testTeam.addToTeam(testDocC);
		testTeam.addToTeam(testDocJ);
		
		assertEquals(4, testTeam.getDoctors().size());
	}
	
	@Test
	public void testRemoveDoctorFromTeam() {
		testTeam.addToTeam(testDocC);
		testTeam.addToTeam(testDocJ);
		
		testTeam.removeFromTeam(testDocC);
		
		assertEquals(3, testTeam.getDoctors().size());
	}
	
	@Test
	public void preventRemovalOfAllConsultants() {
		testTeam.addToTeam(testDocC);
		testTeam.addToTeam(testDocJ);
		
		testTeam.removeFromTeam(testDocC);
		testTeam.removeFromTeam(testDocC);
		
		assertEquals(3, testTeam.getDoctors().size());
	}
	
	@Test
	public void noLessThanTwoDoctorsInTeam() {
		testTeam.removeFromTeam(testDocJ);
		
		assertEquals(2, testTeam.getDoctors().size());
	}
	
	@Test
	public void autoUniqueIds() {
		Patient testP2 = new Patient();
		Patient testP3 = new Patient();
		
		testHospital.admitPatient(testPatient, testTeam, testWard);
		testHospital.admitPatient(testP2, testTeam, testWard);
		testHospital.admitPatient(testP3, testTeam, testWard);
		Map<Integer, Patient> patients = testHospital.getPatients();
						
		assertEquals(3, patients.size());
	}
	
	@Test
	public void assignTeamToPatientOnAdmittance() {
		testHospital.admitPatient(testPatient, testTeam, testWard);
		
		assertNotNull(testPatient.getTeam());
	}
	
	@Test
	public void assignPatientToTeamOnAdmittance() {
		testHospital.admitPatient(testPatient, testTeam, testWard);
		
		assertNotNull(testTeam.getPatient());		
	}
	
	@Test
	public void testConsultantGradeThreeOnly() {
		testDocJ.setSeniority("Consultant");
		
		assertEquals("Junior", testDocJ.getSeniority());
	}
	
	
}
