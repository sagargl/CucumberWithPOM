package AppHooksWithExtendsTestBase;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.base.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
public class AmazonHooks1 extends TestBase
{

	 @Before(order=1)
		public void launchBrowser()
		{
			TestBase.initialization();
			System.out.println("Berofe");
		}
	@After
	public void tearDown(Scenario scenario) throws IOException
	{
		System.out.println("dddd");
		if(scenario.isFailed())
		{
			 File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			    FileUtils.copyFile(screenshotFile, new File(System.getProperty("user.dir")+"/Screenshots/"+System.currentTimeMillis() +".png"));
			    System.out.println("Failedtestcases");
		}
	}
}
