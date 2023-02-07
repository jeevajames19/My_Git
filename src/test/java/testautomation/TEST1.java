package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import practiceSC.utils;

public class TEST1 {
	WebDriver driver;


	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\R.Jeeva Pandian\\Downloads\\chromedriver.exe");
		driver= new ChromeDriver();
		//adding task
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfb%20sign%20up%7C&placement=&creative=589460569891&keyword=fb%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-294779041346%26loc_physical_ms%3D1007810%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQiAzeSdBhC4ARIsACj36uEF2R_1rlyWziKVoEgdide0WzQLzaQOBcmXtZuWmV3VLxSgIhrwP_MaAqQdEALw_wcB");

	}

	@Test (priority=1)
	public void bio() throws InterruptedException
	{

		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input")).sendKeys("jeeva");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input")).sendKeys("james");

	}


@AfterTest
	public void shutdown()
	{
		driver.close();

	}
}


