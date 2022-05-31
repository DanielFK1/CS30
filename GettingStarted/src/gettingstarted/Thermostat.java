package gettingstarted;

import com.phidget22.*;

public class Thermostat {
	public static void main(String[] args) throws Exception
	 {
		DigitalInput redButton = new DigitalInput();
		DigitalOutput redLED = new DigitalOutput();
		DigitalInput greenButton = new DigitalInput();
		DigitalOutput greenLED = new DigitalOutput();
	    TemperatureSensor temperatureSensor = new TemperatureSensor();
	    
	    temperatureSensor.setHubPort(3);
		redButton.setHubPort(5);
		redButton.setIsHubPortDevice(true);
    	redLED.setHubPort(1);
    	redLED.setIsHubPortDevice(true);
    	greenButton.setHubPort(0);
    	greenButton.setIsHubPortDevice(true);
    	greenLED.setHubPort(2);
    	greenLED.setIsHubPortDevice(true);

    	redButton.open(1000);
    	redLED.open(1000);
    	greenButton.open(1000);
    	greenLED.open(1000);
	    temperatureSensor.open(1000);
	    
	    int Temp = 21;
	    
	    while(true)
	    {
	        if (redButton.getState())
	        {
	        	Temp--; 	
	        }
	        	
	        if (greenButton.getState())
	        {
	        	Temp++; 
	        }
	        
	        if(Temp < 19 || Temp > 23)
	        {
	        	redLED.setState(true);
	        	greenLED.setState(false);
	        }
	        else if(Temp > 19 && Temp < 23)
	        {
	        	greenLED.setState(true);
	        	redLED.setState(false);
	        }
	        
	        System.out.println("Temperature: " + Temp + "°C" );
	        Thread.sleep(10000);
	    }
    	
	 }

}
