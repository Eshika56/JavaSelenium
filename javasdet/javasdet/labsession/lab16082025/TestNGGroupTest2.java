package com.wiprojuly.testng;

import org.testng.annotations.Test;

public class TestNGGroupTest2 {
	@Test(groups = { "Sanity" })
    public void createUser() {
        System.out.println("Create User executed - Sanity");
    }

    @Test(groups = { "Regression" })
    public void updateUser() {
        System.out.println("Update User executed - Regression");
    }

    @Test(groups = { "Sanity", "Regression" })
    public void deleteUser() {
        System.out.println("Delete User executed - Sanity & Regression");
    }

    @Test(groups = { "Smoke" })
    public void viewUser() {
        System.out.println("View User executed - Smoke");
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
      <include name="Sanity"/>
      <include name="Smoke"/>
      <exclude name="Regression"/>
    </run>
  </groups>
        <classes>
            <class name="com.wiprojuly.testng.TestNGGroupTest2"/>
        </classes>
    </test>
</suite>
**/
