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
        		System.out.println("Red player has pressed " + redCount + " times");
        		
        	}
        	else if (!redButton.getState())
        	{
        		redLED.setState(false);
        	}
        	
        	if (greenButton.getState() && !greenPlayer)
        	{
        		greenLED.setState(true);
        		greenCount++;
        		System.out.println("Green player has pressed " + greenCount + " times");
        		
        	}
        	else if (!greenButton.getState())
        	{
        		greenLED.setState(false);
        	}
        	
        	greenPlayer = greenButton.getState();
        	redPlayer = redButton.getState();
        	Thread.sleep(10);
        }
        
        //Flash all the lights
        if(redCount == 10)
        {
            greenLED.setState(true);
            Thread.sleep(100);
            greenLED.setState(false);
            Thread.sleep(100);
        	for(int i=0 ;i<5 ;i++)
        	{
                redLED.setState(true);
                Thread.sleep(100);
                redLED.setState(false);
                Thread.sleep(100);
        	}
        }
        	
        if(greenCount == 10)
        {
           redLED.setState(true);
           Thread.sleep(100);
           redLED.setState(false);
           Thread.sleep(100);
           
           for(int i=0 ;i<5 ;i++)
            {
               greenLED.setState(true);
               Thread.sleep(100);
               greenLED.setState(false);
               Thread.sleep(100);
            }
        }
    }
}

