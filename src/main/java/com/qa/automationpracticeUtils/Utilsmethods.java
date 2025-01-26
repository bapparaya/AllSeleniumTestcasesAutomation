package com.qa.automationpracticeUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.automationpractice.base.BaseClass;
import com.qa.automationtesting.pages.AutomationTestingPracticepage;

public class Utilsmethods extends BaseClass {

	//AutomationTestingPracticepage ap;
	
public static void scrollPageTillEmement(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", element);
}

public static void futurDateSelect(String expectedMonth, String expectedYear, String expecteddate  ) {
	AutomationTestingPracticepage ap = new AutomationTestingPracticepage();
	while(true) {
		String current_momnth = ap.month.getText();
		String current_year = ap.year.getText();
		if(current_momnth.equals(expectedMonth) && current_year.equals(expectedYear)) {
			System.out.println(current_momnth+" " +current_year);
			for(WebElement day:ap.selectdays) {
				if(day.getText().equals(expecteddate)){
					day.click();
					break;
				}
			}
			break;
		}
		else {
			ap.nextbtn.click();
		}
		
		
	}
}

public static void selectFromDropDown(WebElement element, String value) {
	Select sl = new Select(element);
	sl.selectByVisibleText(value);
}


}
