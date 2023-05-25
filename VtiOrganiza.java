package vtiger;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VtiOrganiza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.id("appnavigator")).click();
		 WebElement ele = driver.findElement(By.xpath("//span[text()=' MARKETING']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("(//span[text()=' Organizations'])[1]")).click();
		//Add organization
		driver.findElement(By.id("Accounts_listView_basicAction_LBL_ADD_RECORD")).click();
		
		//Organization Details
		
		driver.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("Tecosa Cafe");
		driver.findElement(By.id("Accounts_editView_fieldName_website")).sendKeys("TecosaCafe.com");
		driver.findElement(By.id("Accounts_editView_fieldName_phone")).sendKeys("9154824424");
		driver.findElement(By.id("Accounts_editView_fieldName_tickersymbol")).sendKeys("@#");
		driver.findElement(By.id("Accounts_editView_fieldName_fax")).sendKeys("022-52745");
		
		driver.findElement(By.id("Accounts_editView_fieldName_account_id_create")).click();
		driver.findElement(By.xpath("(//input[@id='Accounts_editView_fieldName_accountname'])[2]")).sendKeys("AnvisFoods");
		driver.findElement(By.id("Accounts_editView_fieldName_website")).sendKeys("www.Anvisfood.com");
		driver.findElement(By.id("Accounts_editView_fieldName_phone")).sendKeys("9176465353");
		
		driver.findElement(By.id("select2-chosen-12")).click();
		WebElement AssignedToChild = driver.findElement(By.id("s2id_autogen12_search"));
		AssignedToChild.sendKeys("Support Group");
		AssignedToChild.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//strong[text()='Save']")).click();
		
		driver.findElement(By.id("Accounts_editView_fieldName_otherphone")).sendKeys("9595303001");
		driver.findElement(By.id("Accounts_editView_fieldName_employees")).sendKeys("10");
		driver.findElement(By.id("Accounts_editView_fieldName_email1")).sendKeys("TecosaCafe@gmail.com");
		driver.findElement(By.id("Accounts_editView_fieldName_email2")).sendKeys("Tecosa123@gmail.com");
		driver.findElement(By.id("Accounts_editView_fieldName_ownership")).sendKeys("Anvik D");
		driver.findElement(By.id("select2-chosen-2")).click();
		WebElement Industry = driver.findElement(By.id("s2id_autogen2_search"));
		Industry.sendKeys("Food & Beverage");
		Industry.sendKeys(Keys.ENTER);
		driver.findElement(By.id("select2-chosen-4")).click();
		WebElement Rating = driver.findElement(By.id("s2id_autogen4_search"));
		Rating.sendKeys("Active");
		Rating.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("select2-chosen-6")).click();
		WebElement Type  = driver.findElement(By.id("s2id_autogen6_search"));
		Type.sendKeys("Partner");
		Type.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("Accounts_editView_fieldName_siccode")).sendKeys("123456789");
		driver.findElement(By.id("Accounts_editView_fieldName_annual_revenue")).sendKeys("200000");
		
		driver.findElement(By.id("select2-chosen-8")).click();
		WebElement AssignedTo = driver.findElement(By.id("s2id_autogen8_search"));
		AssignedTo.sendKeys("Marketing Group");
		AssignedTo.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("Accounts_editView_fieldName_emailoptout")).click();
		
		//driver.findElement(By.name("notify_owner")).click();
		//driver.findElement(By.xpath("//input[@name='notify_owner'][2]")).click();
		
		//Address details
		driver.findElement(By.xpath("//textarea[@name='bill_street']")).sendKeys("402,Deccan, Pune");
		driver.findElement(By.xpath("//textarea[@name='ship_street']")).sendKeys("404,VimanNagar, Pune");
		driver.findElement(By.xpath("//input[@name='bill_pobox']")).sendKeys("Deccan");
		driver.findElement(By.xpath("//input[@name='ship_pobox']")).sendKeys("VimanNagar");
		driver.findElement(By.id("Accounts_editView_fieldName_bill_city")).sendKeys("Pune");
	driver.findElement(By.id("Accounts_editView_fieldName_ship_city")).sendKeys("Pune");	
	driver.findElement(By.id("Accounts_editView_fieldName_bill_state")).sendKeys("Maharashtra");
		driver.findElement(By.id("Accounts_editView_fieldName_ship_state")).sendKeys("Maharashtra");
		driver.findElement(By.id("Accounts_editView_fieldName_bill_code")).sendKeys("401140");
		driver.findElement(By.id("Accounts_editView_fieldName_ship_code")).sendKeys("401234");
		driver.findElement(By.id("Accounts_editView_fieldName_bill_country")).sendKeys("India");
	driver.findElement(By.id("Accounts_editView_fieldName_ship_country")).sendKeys("India");
	driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Tecosa Cafre the Boho garden Cafe at VimanNager");		
	//save button
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		//signOut
//		driver.findElement(By.xpath("//span[@class='fa fa-user']")).click();
//		driver.findElement(By.partialLinkText("Sign Out")).click();
		
		
		
		
				
		
	}

}
