package phidgetscale;
import com.phidget22.*;

public class CalculateWeight 
{
	    public static void main(String[] args) throws Exception
	    {

	        //Create
	        VoltageRatioInput scale = new VoltageRatioInput();
	        scale.setHubPort(0);
	        
	        //Open
	        scale.open(1000);
	        
	        //Use your Offset Value
	        double offsetValue = 0;
	        int i;
	        
	        System.out.println("Calculating Offset");
	        for(i = 0 ;i <= 64 ;i++)
	        	{
	        		offsetValue += scale.getVoltageRatio();
	        		Thread.sleep(200);
	        	}
	        
	        offsetValue = offsetValue/i;
	        //Use your Phidgets
	        while(true)
	        {
	            //Calculate Weight (kg)
	            double weight = 4700 * (scale.getVoltageRatio() - offsetValue);
	            
	            //Display Weight
	            System.out.println(String.format("%.3f kg", weight));      
	            
	            Thread.sleep(1000);
	        }
	    }    
}
	  
