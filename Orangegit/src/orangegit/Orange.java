package orangegit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
public class Orange{
	@Test
public void LoadPage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\K\\Downloads\\chromedriver_win32\\chromedriver.exe");
//System.setProperty(webdriver.chrome.driver,"C:\\Users\\K\\Downloads\\chromedriver_win32\\chromedriver.exe");

WebDriver driver= new ChromeDriver();
driver.get("http://localhost/orangehrm/orangehrm-5.5/web/index.php/auth/login");
//driver.get("http://localhost/orangehrm/orangehrm-5.5/web/index.php/pim/viewEmployeeListL");
Thread.sleep(2000);
driver.manage().window().maximize();

driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("admin");

driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("Pass@12345");

driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();

new

WebDriverWait(driver,50).until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Add Employee")))).click();

driver.findElement(By.name("firstName")).sendKeys("Joby");
driver.findElement(By.name("middleName")).sendKeys("K");
driver.findElement(By.name("lastName")).sendKeys("Bijoy");
Thread.sleep(2000);

driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();

driver.close();
}

}


