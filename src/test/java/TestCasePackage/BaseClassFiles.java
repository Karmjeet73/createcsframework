package TestCasePackage;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import Utilities.ReadConfigurationFiles;
import freemarker.log.Logger;


public class BaseClassFiles {
public static WebDriver driver;
public static org.apache.logging.log4j.Logger log2;
ReadConfigurationFiles rb=new ReadConfigurationFiles();
String bro=rb.getBrowser();
String url=rb.getUrl();
@BeforeClass
void browserLaunch() {
	switch(bro) {
	case "chrome":
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	break;
	case "edge":
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		break;
	case "firefox":
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		break;
	default:
		driver=null;
		break;}
		log2 = LogManager.getLogger("PracticeFrameWork");
	}
}

