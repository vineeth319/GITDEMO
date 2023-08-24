package vineeth;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {

	@Test(groups = "login", priority = 1)
	public void homeloanlogin() {
		System.out.println("homeloanlogin");
	}

	@Test(priority = 3)
	public void homeloanintrest() {
		System.out.println("homeloanintrest = 12%");
	}

	@Test(priority = 0, dependsOnMethods = "homeloanlogin")
	public void homeloanlogaout() {
		System.out.println("homeloanlogout");
	}
	@Test
	@Parameters({ "username", "password" })
	public void loginTest(String user, String pass) {
		System.out.println(user + " "+pass);
	}

//	@BeforeTest
//	public void before()
//	{
//		System.out.println("Before Test in Day1");
//	}
//	@BeforeMethod
//	public void beforeMethod()
//	{
//		System.out.println("Test Start Day1");
//	}
}
