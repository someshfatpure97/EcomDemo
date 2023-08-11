package day1;


import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver; import org.openqa.selenium.chrome.ChromeDriver;


import org.seleniumhq.jetty9.util.Scanner;


import org.testng.annotations.Test;


public class ecommerse {


@Test


public void f() throws Exception {


WebDriver driver;


//open chrome driver


System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\ChromeDriver115\\ChromeDriver115\\chromedriver.exe");


WebDriver driver = new ChromeDriver();


driver.get("https://www.flipcart.com");


//maximize window


driver.manage().window().maximize();


//click on login button


driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a")).click();


//enter username


driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("73877444282");


//cilck on request otp button


driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();


// enter the otp


Scanner scanner new Scanner(System.in);


System.out.print("Enter OTP: ");


int otp - scanner.nextInt(); I


System.out.println("Entered OTP: - + otp);


scanner.close();




//click on verify button


driver.findElement(By.id("/html/body/div[2]/div/div/div/div/div[2]/div/div/form/div")).sendKeys("434523");


//click on search for product mobile


driver.findElement(By.xpath("//*@id=\"container\"1/div/div[11/div[11/div[ 21/div/21/form/div/div/inout")).sendKeys("mobile");






//print all products on first page


List<WebElement> products driver.findElements (By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/div/div/div/a/div[2]/div[1]/div[1]"));


// click on product


driver.findElement(By.xpath("//*[@id="container"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).click();


// add product to cart


driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();


//remove product from cart 


driver.findelement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/div[3]/div[2]/div[2]")).click(); 


//select logout option from username dropdown


driver.findelement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a/div[2]/div[2]/div[3]/div")).click(); }
