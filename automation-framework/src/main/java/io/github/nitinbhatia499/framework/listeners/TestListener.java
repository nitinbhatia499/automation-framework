package io.github.nitinbhatia499.framework.listeners;

import io.github.nitinbhatia499.framework.logger.LoggerUtil;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        LoggerUtil.error("Test failed: " + result.getName(), result.getThrowable());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        LoggerUtil.info("Test passed: " + result.getName());
    }
}
