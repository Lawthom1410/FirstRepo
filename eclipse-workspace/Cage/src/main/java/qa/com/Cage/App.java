package qa.com.Cage;

public class App 
{
    public static void main( String[] args )
    {
    	        
    	Cage<Elephant> elephantCage = new Cage<>();
    	
    	elephantCage.setAnimal(new Elephant());    	
    	
    	elephantCage.getAnimal().walk();
    	
    }
}
