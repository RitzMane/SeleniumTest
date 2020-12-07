package com.orangehrmlive;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupTest {
	
   @BeforeGroups(groups="admin")
   public void beforeAdminGroup()
   {
 	  System.out.println("Executin Admin Module");
   }
   
  @Test(groups="admin")
  public void adminmodule1()
  {
	  System.out.println("Admin Test1");
  }
  @Test(groups="admin")
  public void adminmodule2()
  {
	  System.out.println("Admin Test2");
  }
  
  @BeforeGroups(groups="leave")
  public void beforeLeaveGroup()
  {
	  System.out.println("Executin leave Module");
  }
  @Test(groups="leave")
  public void leavemodule1()
  {
	  System.out.println("leave Test1");
  }
  @Test(groups="leave")
  public void leavemodule2()
  {
	  System.out.println("leave Test2");
  }
}
