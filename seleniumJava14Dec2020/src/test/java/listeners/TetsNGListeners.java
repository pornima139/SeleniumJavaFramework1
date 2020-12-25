package listeners;
import org.testng.ITestContext ;	
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TetsNGListeners implements ITestListener{
			
    public void onFinish(ITestContext context) {					
        // TODO Auto-generated method stub				
    	 System.out.println("****tests completed******"+context.getName());		
    }		

    public void onStart(ITestContext context) {					
        // TODO Auto-generated method stub				
        		
    }		

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {					
        // TODO Auto-generated method stub				
        		
    }		

    public void onTestFailure(ITestResult result) {					
        // TODO Auto-generated method stub				
    	 System.out.println("****test failed******"+result.getName());		
    }		

    public void onTestSkipped(ITestResult result) {					
        // TODO Auto-generated method stub				
    	 System.out.println("****test skipped******"+result.getName());		
    }		

    public void onTestStart(ITestResult result) {					
        // TODO Auto-generated method stub				
        System.out.println("****test Started******"+result.getName());		
    }		

    public void onTestSuccess(ITestResult result) {					
        // TODO Auto-generated method stub				
    	 System.out.println("****test successful******"+result.getName());		
    }		
}
