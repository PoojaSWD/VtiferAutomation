package vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class leads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.id("appnavigator")).click();
		 WebElement ele = driver.findElement(By.xpath("//span[text()=' MARKETING']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//span[text()=' Leads']")).click();
		
		driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")).click();
		driver.findElement(By.id("s2id_autogen1")).click();
		WebElement Fname = driver.findElement(By.id("s2id_autogen2_search"));
		Fname.sendKeys("Mrs.");
		Fname.sendKeys(Keys.ENTER);
		driver.findElement(By.id("Leads_editView_fieldName_firstname")).sendKeys("Anvi");
		driver.findElement(By.id("Leads_editView_fieldName_lastname")).sendKeys("Dusane");
		driver.findElement(By.id("Leads_editView_fieldName_phone")).sendKeys("02162250250");
		driver.findElement(By.id("Leads_editView_fieldName_company")).sendKeys("Anvi Food company");
		driver.findElement(By.id("Leads_editView_fieldName_mobile")).sendKeys("9921352186");
		driver.findElement(By.id("Leads_editView_fieldName_designation")).sendKeys("CEO");
		driver.findElement(By.id("Leads_editView_fieldName_fax")).sendKeys("92586523");
		
		driver.findElement(By.id("select2-chosen-4")).click();
		WebElement LeadSource = driver.findElement(By.id("s2id_autogen4_search"));
		LeadSource.click();
		LeadSource.sendKeys("Partner");
		LeadSource.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("Leads_editView_fieldName_email")).sendKeys("Anvis@gmail.com");
		driver.findElement(By.id("select2-chosen-6")).click();
		WebElement industry = driver.findElement(By.id("s2id_autogen6_search"));
		industry.sendKeys("Food & Beverage");
		industry.sendKeys(Keys.ENTER);
		driver.findElement(By.id("Leads_editView_fieldName_website")).sendKeys("www.anvisfoods.com");
		driver.findElement(By.id("Leads_editView_fieldName_annualrevenue")).sendKeys("400000");
		driver.findElement(By.id("select2-chosen-8")).click();
		 WebElement LStatus = driver.findElement(By.id("s2id_autogen8_search"));
		 LStatus.sendKeys("Cold");
		 LStatus.sendKeys(Keys.ENTER);
		 driver.findElement(By.id("Leads_editView_fieldName_noofemployees")).sendKeys("12");
		driver.findElement(By.id("select2-chosen-10")).click();
		WebElement Rating  = driver.findElement(By.id("s2id_autogen10_search"));
		Rating.sendKeys("Active");
		Rating.sendKeys(Keys.ENTER);
		driver.findElement(By.id("Leads_editView_fieldName_secondaryemail")).sendKeys("AnvisFodds@gmail.com");
		
		driver.findElement(By.id("select2-chosen-12")).click();
		WebElement AssignedTo  = driver.findElement(By.id("s2id_autogen12_search"));
		AssignedTo.sendKeys("Marketing Group");
		AssignedTo.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("Leads_editView_fieldName_emailoptout")).click();
		driver.findElement(By.xpath("//textarea[@id='Leads_editView_fieldName_lane']")).sendKeys("KarveNagar");
		
		driver.findElement(By.id("Leads_editView_fieldName_pobox")).sendKeys("Karvenagar");
		driver.findElement(By.id("Leads_editView_fieldName_code")).sendKeys("411057");
		
		driver.findElement(By.id("Leads_editView_fieldName_city")).sendKeys("Pune");
		driver.findElement(By.id("Leads_editView_fieldName_country")).sendKeys("India");
		driver.findElement(By.id("Leads_editView_fieldName_state")).sendKeys("Maharashtra");
		driver.findElement(By.id("Leads_editView_fieldName_description")).sendKeys("Leads takes decision for company's Future");
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		
		
		
		
	}

}
