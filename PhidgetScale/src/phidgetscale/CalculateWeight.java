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
	        System.out.println("Calculating Offset");
	        double offsetValue = scale.getVoltageRatio();
	        
	        //Use your Phidgets
	        while(true)
	        {
	            //Calculate Weight (kg)
	            double weight = 4700 * (scale.getVoltageRatio() - offsetValue) *2.205;
	            
	            //Display Weight
	            System.out.println(String.format("%.3f lbs", weight));      
	            
	            Thread.sleep(250);
	        }
	    }    
}
	  
