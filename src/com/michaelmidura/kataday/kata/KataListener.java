package com.michaelmidura.kataday.kata;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class KataListener extends RunListener {

    @Override
    public void testAssumptionFailure(Failure failure) {
        System.out.println("Failure: " + failure.getDescription().getMethodName());
    }

    @Override
    public void testFailure(Failure failure) throws Exception {
        System.out.println("Failure: " + failure.getDescription().getMethodName());
    }

    @Override
    public void testFinished(Description description) throws Exception {
        System.out.println("Success: " + description.getMethodName());
    }

    @Override
    public void testIgnored(Description description) throws Exception {
        System.out.println("Ignored: " + description.getMethodName());
    }

    @Override
    public void testRunStarted(Description description) throws Exception {
        System.out.println("Test: " + description.getClassName());
    }

    @Override
    public void testStarted(Description description) throws Exception {
        System.out.println("Attempting: " + description.getMethodName());
    }




}
