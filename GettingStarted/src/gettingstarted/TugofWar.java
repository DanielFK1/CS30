package gettingstarted;

import com.phidget22.*;

public class TugofWar 
{
    public static void main(String[] args) throws Exception
    {

        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();
        
        redButton.setHubPort(5);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(2);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(0);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(1);
        greenLED.setIsHubPortDevice(true);

        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
        
        for(int i = 0; i < 10; i++)
        {
        	if (redButton.getState() == true)
        	{
        		System.out.println("Red Button has been pressed: " + redButton.getState());
        		Thread.sleep(1000);
        	}
        	if (greenButton.getState() == true)
        	{
        		System.out.println("Green Button State: " + greenButton.getState());
        		Thread.sleep(1000);
        	}
        }
    }
}
