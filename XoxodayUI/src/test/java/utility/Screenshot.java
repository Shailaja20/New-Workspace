package utility;

import java.io.File;
import org.apache.maven.surefire.shade.org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public WebDriver driver;
	
	public Screenshot(WebDriver driver) throws Exception
	{
		this.driver = driver;
	}
	
	public void screenshot() throws Exception
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("D:/NewWorkSpace/XoxodayUI/Screenshot/" +System.currentTimeMillis()+ ".png"));
	}
}
