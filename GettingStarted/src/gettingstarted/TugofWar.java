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
        
        int redCount=0;
        int greenCount = 0;
        boolean greenPlayer = false;
        boolean redPlayer = false;
        
        while(redCount < 10 && greenCount < 10)
        {
        	if (redButton.getState() && !redPlayer)
        	{
        		redLED.setState(true);
        		redCount++;
        		
        	}
        	else if (!redButton.getState())
        	{
        		redLED.setState(false);
        	}
        	
        	if (greenButton.getState() && !greenPlayer)
        	{
        		greenLED.setState(true);
        		greenCount++;
        		
        	}
        	else if (!greenButton.getState())
        	{
        		greenLED.setState(false);
        	}
        		
        }
    }
}

