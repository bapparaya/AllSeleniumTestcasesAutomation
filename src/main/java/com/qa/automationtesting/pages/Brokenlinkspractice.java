package com.qa.automationtesting.pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.automationpractice.base.BaseClass;

public class Brokenlinkspractice extends BaseClass {

public String urls ;
@FindBy(tagName="a")
List<WebElement> links;

public Brokenlinkspractice() {
	super();
	PageFactory.initElements(driver, this);
}


public URL verifyBrokenLinks() throws IOException {
	int response = 0;
	try {
	for(WebElement link:links) {
		urls = link.getAttribute("href");
		//System.out.println(urls);
		if (urls == null || urls.isEmpty()) {
            System.out.println("Skipping empty or null href.");
            continue;
        }

        // Fix: Avoid malformed URLs by ensuring the string is a valid URL
        if (!urls.startsWith("http") && !urls.startsWith("https")) {
            System.out.println("Skipping invalid URL: " + urls);
            continue;
        }
		URL url = new URL(urls);
		HttpURLConnection htp =  (HttpURLConnection)url.openConnection();
		htp.setRequestMethod("HEAD");
		 response = htp.getResponseCode();
		 if(response>=400) {
			 System.out.println("broken links are"+url);
			 return url;
		 }else {
			 System.out.println("these are valid urls"+ url);
		 }
	}
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
	
}


}
