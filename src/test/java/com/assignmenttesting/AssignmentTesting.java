//package com.assignmenttesting;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//public class AssignmentTesting {
//	public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
// try {
//             driver.get("http://127.0.0.1:5500/signin.html"); 
//             driver.manage().window().maximize();
//
//            WebElement nameInput = driver.findElement(By.cssSelector("#name"));
//            WebElement radioMale = driver.findElement(By.cssSelector("#gender-male"));
//            WebElement radioFemale = driver.findElement(By.cssSelector("#gender-female"));
//            WebElement roleDropdown = driver.findElement(By.cssSelector("#role"));
//            WebElement submitButton = driver.findElement(By.cssSelector("#submit-btn"));
//
//            nameInput.sendKeys("vaishnavi"); 
//            radioMale.click(); 
//            Select selectRole = new Select(roleDropdown);
//            selectRole.selectByValue("tester"); 
//            Thread.sleep(1000); 
//            submitButton.click(); 
//
//            System.out.println("Form submitted successfully!");
//        } catch (Exception e) {
//            e.printStackTrace(); 
//        } finally {
//            
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            driver.quit();
//        }
//    }
//}
