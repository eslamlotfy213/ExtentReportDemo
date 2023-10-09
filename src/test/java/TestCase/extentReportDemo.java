package TestCase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class extentReportDemo {

    ExtentReports extent;
     @BeforeTest
     public  void cofing(){
      String path = System.getProperty("user.dir")+"\\reports\\index.html";
         ExtentSparkReporter reporter = new ExtentSparkReporter(path);
         reporter.config().setReportName("Web automation");
         reporter.config().setDocumentTitle("Test Result");

          extent = new ExtentReports();
         extent.attachReporter(reporter);
         extent.setSystemInfo("tester","eslam");

     }


    @Test
    public  void  initialDemo(){
      ExtentTest test =  extent.createTest("initial Test");
      System.setProperty("webdriver.chrome.driver", "D:/chromedriver107.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://rahulshettyacademy.com");
      driver.getTitle();
      driver.close();
      test.fail("NNNN");

      extent.flush();
  }


}
