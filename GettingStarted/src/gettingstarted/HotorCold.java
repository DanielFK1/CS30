package gettingstarted;
import com.phidget22.*;
public class HotorCold 
{
	public static void main(String[] args) throws Exception
	 {
	     TemperatureSensor temperatureSensor = new TemperatureSensor();
	     temperatureSensor.setHubPort(3);
	     DigitalOutput greenLED = new DigitalOutput();
	     greenLED.setHubPort(1);
	     greenLED.setIsHubPortDevice(true);
	     DigitalOutput redLED = new DigitalOutput();
	     redLED.setHubPort(2);
	     redLED.setIsHubPortDevice(true);
	     
	     temperatureSensor.open(1000);
	     redLED.open(1000);
	     greenLED.open(1000);
	     
	     while(true)
	     {
	    	 if (temperatureSensor.getTemperature() < 21 || temperatureSensor.getTemperature() > 24)
	    	 {
	    		 greenLED.setState(true);
	    		 int Temp = (int) temperatureSensor.getTemperature();
	    		 System.out.println("Temperature: " + Temp);
	    		 Thread.sleep(1000);
	    	 }
	    	 else
	    	 {
	    		 redLED.setState(true);
	    		 int Temp = (int) temperatureSensor.getTemperature();
	    		 System.out.println("Temperature: " + Temp + "°C");
	    		 Thread.sleep(1000);
	    	 }
	     }

	 }
}
