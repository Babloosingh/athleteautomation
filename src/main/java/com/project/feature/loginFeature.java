package com.project.feature;

import com.project.Step.loginStep;

import io.qameta.allure.Step;

public class loginFeature extends loginStep {

	@Step("Go to login pages")
	public void goToLoginPages() {

		ClickonSignWithGoogleAccount();
		ClickonTermPrivacyContinue();
		ClickonContiue();
		ClickonuUseAnotherAccount();
		EnterEmaiidValide();
		ClickonNextButton();
		EnterPasswordValide();
		ClickonNextButtonwithPassword();
		ClickonDoneButton();
	}

}

