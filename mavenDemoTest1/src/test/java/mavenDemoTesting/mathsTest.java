package mavenDemoTesting;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.*;

public class mathsTest {
	
	 @Test
	  public void add() {
		  int a=10;
		  int b=20;
		  int c;
		  
		  c=a+b;
		  
		  Assert.assertEquals(c, 30);
		  
	  }
	 
	 @Test
	  public void sub() {
		  int a=20;
		  int b=10;
		  int c;
		  
		  c=a-b;
		  
		  Assert.assertEquals(c, 10);
		  
	  }
	 
	 @Test
	  public void mul() {
		  int a=20;
		  int b=10;
		  int c;
		  
		  c=a*b;
		  
		  Assert.assertEquals(c, 200);
		  
	  }

	 
	 @Test
	  public void div() {
		  int a=20;
		  int b=10;
		  int c;
		  
		  c=a/b;
		  
		  Assert.assertEquals(c, 2);
		  
	  }

}
