

package io.github.nitinbhatia.framework.tests;

import io.github.nitinbhatia.framework.base.BaseTest;
import io.github.nitinbhatia.framework.logger.LoggerUtil;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SampleUnitTest extends BaseTest {

  
	 @Test
	    public void verifyGoogleTitle() {
	        LoggerUtil.info("Verifying Google title...");
	        Assert.assertTrue(driver.getTitle().contains("Google"), "Title does not contain Google");
	        LoggerUtil.info("Google title verified successfully.");
	    }
	 
	 

}
