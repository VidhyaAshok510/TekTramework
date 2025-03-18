package contactTest;

import org.testng.annotations.Test;

public class CreateContactTest {
	
	@Test
	public void createTest(){
		System.out.println("Created contact");
		
		String BROWSER= System.getProperty("browser");
		String URL= System.getProperty("url");
		String USERNAME= System.getProperty("un");
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
	}
	@Test
	public void modifyTest(){
		System.out.println("Modified contact");
		
	}

}
