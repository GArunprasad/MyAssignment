package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open browser
		ChromeDriver driver = new ChromeDriver();
		//load url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//maximize browser
		driver.manage().window().maximize();
		//to get title
		String title = driver.getTitle();
		System.out.println(title);
		//get url
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement crmlink = driver.findElement(By.linkText("CRM/SFA"));
		crmlink.click();
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();
		WebElement findleads = driver.findElement(By.linkText("Create Lead"));
		findleads.click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CAPG");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arun");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(dropdown);
		dd.selectByVisibleText("Cold Call");
		WebElement dropdown2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd2 = new Select(dropdown2);
		dd2.selectByValue("IND_AEROSPACE");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("arun@testleaf.com");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateopt = new Select(state);
		stateopt.selectByVisibleText("Alabama");
		WebElement createlead = driver.findElement(By.className("smallSubmit"));
		createlead.click();
		String title2 = driver.getTitle();
		System.out.println(title2);
	}

}
