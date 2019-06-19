package ExRes;

import java.text.DecimalFormat;

public class ExamResults {
	
	public void displayRes (float[] percList, float physics, float chemistry, float biology, float total) {
		DecimalFormat df = new DecimalFormat("#.##");
		float physicsPerc = percList[0];
		float chemistryPerc = percList[1];
		float biologyPerc = percList[2];
		
		
		System.out.println("Physics: " + df.format(physics) + " (" + df.format(physicsPerc) + "%)");
		System.out.println("Chemistry: " + df.format(chemistry) + " (" + df.format(chemistryPerc) + "%)");
		System.out.println("Biology: " + df.format(biology) + " (" + df.format(biologyPerc) + "%)");
		System.out.println();
		System.out.println("Total: " + df.format(total));
		System.out.println();
	}
	
	public void displayPerc (float percentage) {
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Total : " + df.format(percentage) + "%");
	}
	
	public void failCheck (float[] resultList, float percentage) {
		
		float physicsPerc = resultList[0];
		float chemistryPerc = resultList[1];
		float biologyPerc = resultList[2];
		
		int failCount = 0;
		for (float i : resultList) {
			if (i < 60) {
				failCount ++;				
			}
		}
		
		
		if (percentage < 60) {
			System.out.println("Failed: Overall less than 60%");
		}
		else if (physicsPerc < 60 || chemistryPerc < 60 || biologyPerc < 60) {
			System.out.println("Failed: Individual test(s) less than 60%");
			System.out.println("Number of tests failed: " + failCount);
		}
		else {
			System.out.println("Passed");
		}
	}

}
