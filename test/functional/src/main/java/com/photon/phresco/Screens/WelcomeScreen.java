package com.photon.phresco.Screens;

import java.io.IOException;

import com.photon.phresco.selenium.report.Reporter;
import com.photon.phresco.uiconstants.PhrescoUiConstants;




public class WelcomeScreen extends PhotonAbstractScreen {
	PhrescoUiConstants phrsc = new PhrescoUiConstants();
	public WelcomeScreen(String host, int port, String browser, String url,
			String speed, String contextName) throws InterruptedException,
			IOException, Exception {
		super(host, port, browser, url, speed, contextName);
	}
    	public void nodejsNone() throws InterruptedException, IOException, Exception {
    		isTextPresent(phrsc.ELEMENT);
		
    	}
    	
    	
    	
    
    }
    


