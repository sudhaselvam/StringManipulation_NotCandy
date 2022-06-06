package stringnot;



import org.testng.Assert;
import org.testng.annotations.Test;

public class NotCandy {
  public String manipulation(String str) {
	  if(str.startsWith("not")) {
		  return str;
	  }
	  else {
		  return "not " +str;
	  }
  }
  
  @Test
  public void testcase() {
	  Assert.assertEquals(manipulation("candy"), "not candy");
  }
  @Test
  public void test1() {
	  Assert.assertEquals(manipulation("X"), "not X");
  }
  @Test
  public void test2() {
	  Assert.assertEquals(manipulation("not bad"),  "not bad");
  }
}
