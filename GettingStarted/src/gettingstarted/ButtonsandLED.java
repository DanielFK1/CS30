package gettingstarted;
//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class ButtonsandLED {

	    //Handle Exceptions | Exceptions will happen in your code from time to time. These are caused by unexpected things happening. Make sure you’ve added "throws Exception" to your main method.
	    public static void main(String[] args) throws Exception{

	        //Create | Create objects for your buttons and LEDs.
	        DigitalInput redButton = new DigitalInput();
	        DigitalOutput redLED = new DigitalOutput();
	        DigitalInput greenButton = new DigitalInput();
	        DigitalOutput greenLED = new DigitalOutput();
	        
	        //Address | Address your four objects which lets your program know where to find them.
	        redButton.setHubPort(5);
	        redButton.setIsHubPortDevice(true);
	        redLED.setHubPort(2);
	        redLED.setIsHubPortDevice(true);
	        greenButton.setHubPort(0);
	        greenButton.setIsHubPortDevice(true);
	        greenLED.setHubPort(1);
	        greenLED.setIsHubPortDevice(true);

	        //Open | Connect your program to your physical devices.
	        redButton.open(1000);
	        redLED.open(1000);
	        greenButton.open(1000);
	        greenLED.open(1000);

	        	
	        int redcount = 0;
	        int greencount = 0;
	        //Use your Phidgets | This code will turn on the LED when the matching button is pressed and turns off the LED when the matching button is released. The sleep function slows down the loop so the button state is only checked every 150ms.
	        while(true){
	        	
	        	Boolean redButtonState = false;
	            if( redButton.getState() && !redButtonState)
	            {
	            	redcount += 1;
	            	System.out.println("Red Button has been pressed " + redcount);
	                redLED.setState(false);
	                Thread.sleep(300);
	            } 
	            else if(!redButton.getState())
	            {
	                redLED.setState(true);
	            }
	            
	            Boolean greenButtonState = false;
	            if(greenButton.getState() && !greenButtonState)
	            {
	            	greencount += 1;
	            	System.out.println("Green Button has been pressed " + greencount);
	                greenLED.setState(false);
	                Thread.sleep(400);
	            } 
	            else if(!greenButton.getState()) 
	            {
	                greenLED.setState(true);
	            }
	            

	        }
	    }
	}
	  

