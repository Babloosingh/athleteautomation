package com.project.Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.project.feature.loginFeature;

public class loginTest extends loginFeature {

	@Test(description = "Go to login Pages with valid email and password")
	public void goTologinPageswithValide() {
		goToLoginPages();

	
	}

}
