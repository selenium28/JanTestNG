package para;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	// Data Provider returns 2-dimensional Object array.
	
	@DataProvider
	public Object[][] testData(){
		
		Object[][] data = new Object[2][3];
		
		data[0][0] = "DEV";
		data[0][1] = 100;
		data[0][2] = 200;
		
		data[1][0] = "Rushi";
		data[1][1] = 151;
		data[1][2] = 432;
		
		return data;
		
	}
	
	@Test(dataProvider = "testData")
	public void dataRead(String a, int b, int d) {
		System.out.println("A"+" "+a+ " B" +" "+b);
	}

}
