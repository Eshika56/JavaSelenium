package com.wiprojuly.testng;

import org.testng.annotations.Test;

public class TestNGGroupTest1 {
	@Test(groups = { "Smoke" })
    public void loginTest() {
        System.out.println("Login test executed - Smoke");
    }

    @Test(groups = { "Regression" })
    public void paymentTest() {
        System.out.println("Payment test executed - Regression");
    }

    @Test(groups = { "Smoke", "Regression" })
    public void logoutTest() {
        System.out.println("Logout test executed - Smoke & Regression");
    }

}

/*
 * <!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name="Functional" verbose="1">
<parameter name="browser"  value="chrome"/>
<parameter name="platform"  value="windows"/>
    <test name="Functional testcases">
    <groups>
    <run>
      <include name="Smoke"/>
    </run>
  </groups>
        <classes>
            <class name="com.wiprojuly.testng.TestNGGroupTest1"/>
        </classes>
    </test>
</suite>
**/
