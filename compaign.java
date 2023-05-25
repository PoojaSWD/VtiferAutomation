package vtiger;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class compaign {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.xpath("//span[text()=' Campaigns']")).click();
		
		
		driver.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD")).click();
		
		driver.findElement(By.id("Campaigns_editView_fieldName_campaignname")).sendKeys("Blood donation");
		driver.findElement(By.xpath("//span[@id='select2-chosen-2']")).click();
		 WebElement assigne = driver.findElement(By.id("s2id_autogen2_search"));
		 assigne.sendKeys("Support Group");
		 assigne.sendKeys(Keys.ENTER);
		 driver.findElement(By.xpath("//span[@id='select2-chosen-4']")).click();
		 WebElement cstatus = driver.findElement(By.id("s2id_autogen4_search"));
		 cstatus.sendKeys("Active");
		 cstatus.sendKeys(Keys.ENTER);
		 driver.findElement(By.xpath("//span[@id='select2-chosen-6']")).click();
		 WebElement ctype = driver.findElement(By.id("s2id_autogen6_search"));
		 ctype.sendKeys("Partners");
		 ctype.sendKeys(Keys.ENTER);
		 driver.findElement(By.id("Campaigns_editView_fieldName_product_id_create")).click();
//		 String Parent_id = driver.getWindowHandle();
//	     System.out.println(Parent_id);
//		 Set<String> Child_id = driver.getWindowHandles();
//		 for (String a : Child_id) {
////	             it will print IDs of both window
//            System.out.println(a);
//		 }
//		 driver.switchTo().window(Parent_id);
		 driver.findElement(By.id("Products_editView_fieldName_productname")).sendKeys("Kesar Coffe");
		 driver.findElement(By.id("Products-editview-fieldname-unit_price")).sendKeys("30");
		 driver.findElement(By.id("tax1_check")).click();
		 driver.findElement(By.id("tax2_check")).click();
		 driver.findElement(By.id("tax3_check")).click();
		 driver.findElement(By.id("Products_editView_fieldName_qtyinstock")).sendKeys("100");
		 Thread.sleep(2000);
		 driver.findElement(By.id("select2-chosen-93")).click();
		 
		 WebElement Handler = driver.findElement(By.id("s2id_autogen93_search"));
		 Handler.sendKeys("Marketing Group");
		 Handler.sendKeys(Keys.ENTER);
		 driver.findElement(By.xpath("//strong[text()='Save']")).click();
		 
//		 
//	     Set<String> Child_id = driver.getWindowHandles();
//	     for (String a : Child_id) {
//	            // it will print IDs of both window
//	            System.out.println(a);
//	 
//	            // condition to change the focus of selenium
//	            if (Parent_id.equals(a)) {
//	           }
//	            ele { // to change focus on new window
//	                driver.switchTo().window(a);
//	     driver.findElement(By.id("Products_editView_fieldName_productname")).sendKeys("Kesar coffe");           
//	            }
//	     }

//		 for(String winHandle: driver.getWindowHandles())
//		 {
//			 driver.switchTo().window(winHandle);
//		 }
//		 driver.findElement(By.id("QuickCreate"));
		 
//		 driver.findElement(By.id("Products-editview-fieldname-unit_price")).sendKeys("30");
		 
		 
		 //assigne.sendKeys("Team Selling");
//		WebElement Assignto = driver.findElement(By.id("select2-chosen-2"));
//		Select s = new Select(Assignto);
//		s.selectByVisibleText("Marketing Group");
		//driver.findElement(By.id("Campaigns_editView_fieldName_closingdate")).click();
		 
		 driver.findElement(By.id("Campaigns_editView_fieldName_targetaudience")).sendKeys("Youth");
		 WebElement date = driver.findElement(By.id("Campaigns_editView_fieldName_closingdate"));
		 date.click();
		 date.sendKeys("25-05-2023");
		 date.sendKeys(Keys.ENTER);
		 driver.findElement(By.id("Campaigns_editView_fieldName_sponsor")).sendKeys("Anvi Food Pvt.Ltd");
		 driver.findElement(By.id("Campaigns_editView_fieldName_targetsize")).sendKeys("100000");
		 driver.findElement(By.id("Campaigns_editView_fieldName_numsent")).sendKeys("70");
		 driver.findElement(By.id("Campaigns_editView_fieldName_budgetcost")).sendKeys("300000");
		 driver.findElement(By.id("Campaigns_editView_fieldName_actualcost")).sendKeys("500000");
		 driver.findElement(By.id("select2-chosen-8")).click();
		 WebElement ExpeResponse = driver.findElement(By.id("s2id_autogen8_search"));
		 ExpeResponse.click();
		 ExpeResponse.sendKeys("Good");
		 ExpeResponse.sendKeys(Keys.ENTER);
		 driver.findElement(By.id("Campaigns_editView_fieldName_expectedrevenue")).sendKeys("200000");
		 driver.findElement(By.id("Campaigns_editView_fieldName_expectedsalescount")).sendKeys("10000");
		 driver.findElement(By.id("Campaigns_editView_fieldName_actualsalescount")).sendKeys("90000");
		 driver.findElement(By.id("Campaigns_editView_fieldName_expectedresponsecount")).sendKeys("80000");
		 driver.findElement(By.id("Campaigns_editView_fieldName_actualresponsecount")).sendKeys("60000");
		 driver.findElement(By.id("Campaigns_editView_fieldName_expectedroi")).sendKeys("50000");
		 driver.findElement(By.id("Campaigns_editView_fieldName_actualroi")).sendKeys("30000");
		 driver.findElement(By.xpath("//textarea[@id='Campaigns_editView_fieldName_description']")).sendKeys("Campaign begins now");
		 driver.findElement(By.xpath("//button[text()='Save']")).click();
		 
		 

	} 
}	


