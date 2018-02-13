package Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.ACONST_NULL;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import properties.SharedObjects;
import properties.Data;
import properties.TestURL;
import Page_Objects.AccountPage;
import Page_Objects.InventoryPage;
import Page_Objects.LoginPage;
import properties.Configuration;
public class Tests extends Configuration {

@Test()	
public static void cteateUnitOverAccount() throws InterruptedException{
	        GenerateAcountNumber();
	        DeleteFile();
			SharedObjects.login();
		    Thread.sleep(50000);
		    AccountPage.accountLink(driver,1).click();
			staticWait5();
			AccountPage.selectAccounts(driver, 1);
			AccountPage.createAccountButton(driver, 1).click();
			Thread.sleep(5000);
			staticWait10();
			AccountPage.userInfoFields(driver, 9).sendKeys(Data.FirstName);
			AccountPage.userInfoFields(driver, 12).clear();
			AccountPage.userInfoFields(driver, 12).sendKeys(""+GenerateAcountNumber());
			AccountPage.userInfoFields(driver, 15).sendKeys(Data.GuestName);
			AccountPage.userInfoFields(driver, 18).sendKeys(Data.PhoneNumber);
			AccountPage.userInfoFields(driver, 23).sendKeys(Data.Address);
			AccountPage.userInfoFields(driver, 31).sendKeys(Data.City);
			AccountPage.selectState(driver, 9);
			AccountPage.userInfoFields(driver, 32).sendKeys(Data.PostalCode);
			//billing info start here
			AccountPage.userInfoFields(driver, 33).sendKeys(Data.GuestName);
			AccountPage.userInfoFields(driver, 36).sendKeys(Data.PhoneNumber);
			AccountPage.userInfoFields(driver, 41).sendKeys(Data.Address);
			AccountPage.userInfoFields(driver, 48).sendKeys(Data.City);
			AccountPage.selectState(driver, 12);
			AccountPage.userInfoFields(driver, 49).sendKeys(Data.PostalCode);
			AccountPage.saveButton(driver, 5).click();
			Thread.sleep(1000);
			AccountPage.tabReservationAndFolio(driver, 29).click();
			AccountPage.saveButton(driver, 3).click();
			Thread.sleep(5000);
			// reservation fields start here
		//	AccountPage.GuestInfoLink(driver).click();
			AccountPage.ReservationDropdown(driver, 2,1);
			AccountPage.ReservationDropdown(driver, 4,1);
			AccountPage.ReservationsFields(driver, 9).sendKeys(Data.FirstName);
			AccountPage.ReservationsFields(driver, 10).sendKeys(Data.LastName);
			AccountPage.ReservationsFields(driver, 28).sendKeys(Data.EmailId);
			AccountPage.ReservationsFields(driver, 48).sendKeys(Data.EmailId);
			AccountPage.DialogButton(driver, 0,"...").click();
			 Thread.sleep(5000);
			for (int i = 0; i < Data.CheckIn.length(); i++) {
				char chr = Data.CheckIn.charAt(i);
				AccountPage.DatePicker(driver, 0).sendKeys(""+chr);	
				staticWait5();
			}
			AccountPage.AssignRoom(driver, 51).click();
			AccountPage.SearchButton(driver, 5,"Search").click();
			AccountPage.DialogDropdown(driver, 0, 1);
			AccountPage.DialogDropdown(driver, 1, 1);
			AccountPage.SelectRoomButton(driver, 20,"Select");
			Thread.sleep(2000);
			AccountPage.ContinueButton(driver, 1,"");
			Thread.sleep(5000);
			AccountPage.saveButton(driver, 1).click();
		    Thread.sleep(2000);
			AccountPage.AddFolioButton(driver, 0).click();
			Thread.sleep(2000);
			AccountPage.SelectFolioCategory(driver, 0, 1);
			Thread.sleep(2000);
	    	AccountPage.FolioAmountField(driver, 5).sendKeys(Data.Amount);
	    	Thread.sleep(2000);
	    	AccountPage.CommitButton(driver, 0).click();
	    	Thread.sleep(5000);
			AccountPage.saveButton(driver, 1).click();;
			Thread.sleep(5000);
			AccountPage.accountLink(driver,1).click();
			Thread.sleep(3000);
			AccountPage.AccountName(driver, 6, Data.AccountName).click();
			Thread.sleep(5000);
			AccountPage.FolioTab(driver, 2).click();
			Thread.sleep(9000);
			AccountPage.DistibuteButton(driver,1).click();
			Thread.sleep(5000);
			AccountPage.DistributeDetailsFields(driver, 67).clear();
			AccountPage.DistributeDetailsFields(driver, 67).sendKeys(Data.Amount);
			AccountPage.DistributeDetailsSelect(driver, 11,Data.AmountType);
			String current_balance = AccountPage.DialogDistributeDetailsAmount(driver, 21).getText();
			String current_payment = AccountPage.DialogDistributeDetailsAmount(driver, 22).getText();
			String ending_balance = AccountPage.DialogDistributeDetailsAmount(driver, 23).getText();
			AccountPage.DistributeDetailsAddButton(driver, 4).click();
			Thread.sleep(2000);
			AccountPage.ContinueButton(driver, 13).click();
			Thread.sleep(5000);
			String ending_balance_details = AccountPage.DistributeDetailsAmount(driver, 6).getText();
			assertTrue(ending_balance_details.contains(ending_balance));
			AccountPage.PrintButton(driver, 1).click();
			Thread.sleep(2000);
		    AccountPage.SelectPrintType(driver, 3,"Export Report To Excel");
			AccountPage.ExportButton(driver, 4).click();
			Thread.sleep(1000);
		    afterTest();
		    FileExist();
		}

@Test()	
public static void cteateTravelAgentAccount() throws InterruptedException{
	SharedObjects.login();
    Thread.sleep(10000);
    AccountPage.accountLink(driver,1).click();
	staticWait5();
	AccountPage.selectAccounts(driver, 2);
	AccountPage.createAccountButton(driver, 1).click();
	staticWait10();
	AccountPage.userInfoFields(driver, 9).sendKeys(Data.FirstName);
	AccountPage.userInfoFields(driver, 12).clear();
	AccountPage.userInfoFields(driver, 12).sendKeys(Data.AccountNumber);;
	AccountPage.userInfoFields(driver, 15).sendKeys(Data.GuestName);
	AccountPage.userInfoFields(driver, 18).sendKeys(Data.PhoneNumber);
	AccountPage.userInfoFields(driver, 23).sendKeys(Data.Address);
	AccountPage.userInfoFields(driver, 31).sendKeys(Data.City);
	AccountPage.selectState(driver, 9);
	AccountPage.userInfoFields(driver, 32).sendKeys(Data.PostalCode);
	//billing info start here
	AccountPage.userInfoFields(driver, 33).sendKeys(Data.GuestName);
	AccountPage.userInfoFields(driver, 36).sendKeys(Data.PhoneNumber);
	AccountPage.userInfoFields(driver, 41).sendKeys(Data.Address);
	AccountPage.userInfoFields(driver, 48).sendKeys(Data.City);
	AccountPage.selectState(driver, 12);
	AccountPage.userInfoFields(driver, 49).sendKeys(Data.PostalCode);
	AccountPage.saveButton(driver, 5).click();
	Thread.sleep(1000);
	AccountPage.tabReservationAndFolio(driver, 29).click();
	AccountPage.saveButton(driver, 3).click();
	Thread.sleep(5000);
	// reservation fields start here
//	AccountPage.GuestInfoLink(driver).click();
	AccountPage.ReservationDropdown(driver, 2,1);
	AccountPage.ReservationDropdown(driver, 4,1);
	AccountPage.ReservationsFields(driver, 9).sendKeys(Data.FirstName);
	AccountPage.ReservationsFields(driver, 10).sendKeys(Data.LastName);
	AccountPage.ReservationsFields(driver, 28).sendKeys(Data.EmailId);
	AccountPage.ReservationsFields(driver, 48).sendKeys(Data.EmailId);
	AccountPage.DialogButton(driver, 0,"...").click();
	 Thread.sleep(5000);
	for (int i = 0; i < Data.CheckIn.length(); i++) {
		char chr = Data.CheckIn.charAt(i);
		AccountPage.DatePicker(driver, 0).sendKeys(""+chr);	
		staticWait5();
	}
	AccountPage.AssignRoom(driver, 51).click();
	AccountPage.SearchButton(driver, 5,"Search").click();
	AccountPage.DialogDropdown(driver, 0, 1);
	AccountPage.DialogDropdown(driver, 1, 1);
	AccountPage.SelectRoomButton(driver, 20,"Select");
	 Thread.sleep(2000);
	AccountPage.ContinueButton(driver, 1,"");
	Thread.sleep(5000);
	AccountPage.saveButton(driver, 1).click();
	staticWait10();
	AccountPage.AddFolioButton(driver, 1).click();
	staticWait10();
	
		}


@Test()	
public static void cteateAndVerifyRules() throws InterruptedException{
	        SharedObjects.login();
	        Thread.sleep(10000);
	        InventoryPage.inventoryLink(driver,3).click();
			staticWait5();
			InventoryPage.ruleLink(driver, 3).click();
			staticWait10();
			InventoryPage.saveAndRuleButton(driver, 0).click();
			staticWait35();
			// rules details
			InventoryPage.ruleFields(driver, 0).sendKeys(Data.RuleName);
			InventoryPage.ruleFields(driver, 1).sendKeys(Data.RuleValue);
			InventoryPage.descriptionTextarea(driver).sendKeys(Data.RuleDescription);
			InventoryPage.saveAndRuleButton(driver, 3).click();
			
		//	afterTest();
		}

}
