package qa.com.Hospital;

public class Doctor {
	
	public Doctor(String seniority) {
		super();
		
		this.seniority = seniority;
	}
	
	private int grade;
	private String seniority;
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public String getSeniority() {
		return seniority;
	}
	public void setSeniority(String seniority) {
		if (seniority.equals("Consultant")) {
			if (grade >= 3) {
				this.seniority = seniority;
			} else {
//				System.out.println("Consultants need to acheve Grade 3");
			}
		} else {
			this.seniority = seniority;
		}
		
	}
	
	

}
