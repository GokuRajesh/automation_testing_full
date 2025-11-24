package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	@Before
	public void f() {
		System.out.println("browser opened");
	}
	//before every scenario
	@After
	public void then() {
		System.out.println("browser closed");
	}
	//after every scenario
	
}
