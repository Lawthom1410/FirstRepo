package qa.com.MorseCode;


public class App 
{
    public static void main( String[] args )
    {
    	String myMorse = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";
    	
    	Translator myText = new Translator();
    	
    	System.out.println(myText.getText(myMorse)); 
    	
    	System.out.println(myText.getMorse("hello daily programmer good luck on the challenges today"));
    	
    }


}
