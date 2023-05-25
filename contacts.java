package vtiger;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contacts {

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
		driver.findElement(By.xpath("//span[text()=' Contacts']")).click();
		driver.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")).click();
		
		driver.findElement(By.id("s2id_autogen1")).click();
		WebElement Fname = driver.findElement(By.id("s2id_autogen2_search"));
		Fname.sendKeys("Mrs.");
		Fname.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("Contacts_editView_fieldName_firstname")).sendKeys("Anvi");
		driver.findElement(By.id("Contacts_editView_fieldName_lastname")).sendKeys("Dusane");
		driver.findElement(By.id("Contacts_editView_fieldName_phone")).sendKeys("02162250250");
		
		driver.findElement(By.id("Contacts_editView_fieldName_account_id_create")).click();
		driver.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("Globalreal");
		driver.findElement(By.id("Accounts_editView_fieldName_website")).sendKeys("www.GlobalRealest.com");
		driver.findElement(By.id("Accounts_editView_fieldName_phone")).sendKeys("9921834556");
		
		
		driver.findElement(By.id("select2-chosen-23")).click();
		WebElement AssignOrga = driver.findElement(By.id("s2id_autogen23_search"));
		AssignOrga.sendKeys("Team Selling");
		AssignOrga.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//strong[text()='Save']")).click();
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		
		driver.findElement(By.id("Contacts_editView_fieldName_mobile")).sendKeys("9921352186");
		
		driver.findElement(By.id("select2-chosen-4")).click();
		WebElement LeadSource  = driver.findElement(By.id("s2id_autogen4_search"));
		LeadSource.sendKeys("Employee");
		LeadSource.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("Contacts_editView_fieldName_homephone")).sendKeys("216258023");
		driver.findElement(By.id("Contacts_editView_fieldName_title")).sendKeys("Food");
		
		driver.findElement(By.id("Contacts_editView_fieldName_otherphone")).sendKeys("9145652532");
		driver.findElement(By.id("Contacts_editView_fieldName_department")).sendKeys("FoodTechnology");
		driver.findElement(By.id("Contacts_editView_fieldName_fax")).sendKeys("9921352186");
		driver.findElement(By.id("Contacts_editView_fieldName_email")).sendKeys("Anvi@gmail.com");
		 WebElement DOB = driver.findElement(By.id("Contacts_editView_fieldName_birthday"));
		DOB.click();
		DOB.sendKeys("13-09-1995");
		DOB.sendKeys(Keys.ENTER);

		driver.findElement(By.id("Contacts_editView_fieldName_assistant")).sendKeys("Abhir");
		
		driver.findElement(By.id("Contacts_editView_fieldName_contact_id_create")).click();
		driver.findElement(By.id("select2-chosen-12")).click();
		WebElement Fnamec = driver.findElement(By.id("s2id_autogen12_search"));
		Fnamec.sendKeys("Mr.");
		Fnamec.sendKeys(Keys.ENTER);
		driver.findElement(By.id("Contacts_editView_fieldName_firstname")).sendKeys("Ganesh");
		driver.findElement(By.id("Contacts_editView_fieldName_lastname")).sendKeys("Salunkhe");
		driver.findElement(By.id("Contacts_editView_fieldName_phone")).sendKeys("9921352186");
		WebElement OrgaName = driver.findElement(By.id("account_id_display"));
		  OrgaName.sendKeys("Tech Fortune");
		  OrgaName.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		driver.findElement(By.id("Contacts_editView_fieldName_email")).sendKeys("Ganesh@gmail.com");
		driver.findElement(By.id("select2-chosen-38")).click();
		WebElement QuickCont  = driver.findElement(By.id("s2id_autogen38_search"));
		QuickCont.sendKeys("Support Group");
		QuickCont.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//strong[text()='Save']")).click();
		
		
		driver.findElement(By.id("Contacts_editView_fieldName_assistantphone")).sendKeys("9145652532");
		driver.findElement(By.id("Contacts_editView_fieldName_secondaryemail")).sendKeys("Anvifood1@gmail.com");
		driver.findElement(By.id("Contacts_editView_fieldName_emailoptout")).click();
		//driver.findElement(By.id("Contacts_editView_fieldName_donotcall")).click();
		driver.findElement(By.id("Contacts_editView_fieldName_reference")).click();
		
		driver.findElement(By.id("select2-chosen-6")).click();
		WebElement AssignedToContact  = driver.findElement(By.id("s2id_autogen6_search"));
		AssignedToContact.sendKeys("Team Selling");
		AssignedToContact.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("Contacts_editView_fieldName_notify_owner")).click();
		driver.findElement(By.id("Contacts_editView_fieldName_portal")).click();
		
		 WebElement SupportSDate  = driver.findElement(By.id("Contacts_editView_fieldName_support_start_date"));
		 SupportSDate.click();
		 SupportSDate.sendKeys("24-05-2023");
		 SupportSDate.sendKeys(Keys.ENTER);
			
			 WebElement SupportEDate = driver.findElement(By.id("Contacts_editView_fieldName_support_end_date"));
			 SupportEDate.click();
			 SupportEDate.sendKeys("31-05-2024");
			 SupportEDate.sendKeys(Keys.ENTER);
			 
			 
			 driver.findElement(By.name("mailingstreet")).sendKeys("Sanghvi");
				driver.findElement(By.name("otherstreet")).sendKeys("Pimple Gurav");
				driver.findElement(By.id("Contacts_editView_fieldName_mailingpobox")).sendKeys("Sanghvi");
				driver.findElement(By.id("Contacts_editView_fieldName_otherpobox")).sendKeys("Pimple Guravx");
				driver.findElement(By.id("Contacts_editView_fieldName_mailingcity")).sendKeys("Pune");
				driver.findElement(By.id("Contacts_editView_fieldName_othercity")).sendKeys("Pune");
				driver.findElement(By.id("Contacts_editView_fieldName_mailingstate")).sendKeys("Maharashtra");
				driver.findElement(By.id("Contacts_editView_fieldName_otherstate")).sendKeys("Maharashtra");
				driver.findElement(By.id("Contacts_editView_fieldName_mailingzip")).sendKeys("411057");
				driver.findElement(By.id("Contacts_editView_fieldName_otherzip")).sendKeys("411062");
				driver.findElement(By.id("Contacts_editView_fieldName_mailingcountry")).sendKeys("India");
				driver.findElement(By.id("Contacts_editView_fieldName_othercountry")).sendKeys("India");
				driver.findElement(By.name("description")).sendKeys("A very reputed company");
				
		

	}

}
