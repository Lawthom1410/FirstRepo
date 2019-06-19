package ExRes;

public class ExamResultsApp {

	public static void main(String[] args) {
		
		float physics = 150;	
		float chemistry = 100;
		float biology = 80;
		float total = physics + chemistry + biology;
		float percentage = (total/450)*100;
		
		float physicsPerc = (physics/150)*100;
		float chemistryPerc = (chemistry/150)*100;
		float biologyPerc = (biology/150)*100;
		
		float[] percList = {physicsPerc, chemistryPerc, biologyPerc};
				
		ExamResults res = new ExamResults();
		res.displayRes(percList, physics, chemistry, biology, total);
		res.displayPerc(percentage);
		
		res.failCheck(percList, percentage);
	}

}
