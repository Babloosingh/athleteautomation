package com.project.Step;

import com.project.capabilitySetup.capabilitySetup;
import com.project.po.loginPo;

import io.qameta.allure.Step;

public class loginStep extends capabilitySetup {
	@Step(" click on Google Sign")
	public static void ClickonSignWithGoogleAccount() {
		click("xpath", loginPo.SINGIN_WITHGOOGLE_ACCOUNT);

	}

	@Step("click on Term Privacy Continue")
	public static void ClickonTermPrivacyContinue() {
		click("xpath", loginPo.CONTINUE_BUTTON);

	}

	@Step("click on Google Sign")
	public static void ClickonContiue() {
		click("xpath", loginPo.CONTINUE_INSING);

	}

	@Step("Use another Account")
	public static void ClickonuUseAnotherAccount() {
		click("id", loginPo.USEANOTHER_ACCOUNT);

	}

	@Step("Enete email id valide")
	public static void EnterEmaiidValide() {

		enterText("id", loginPo.ENTEREMAIL_ID, "athleteqapitol@gmail.com");
	}

	@Step("Click on next Button")
	public static void ClickonNextButton() {
		click("xpath", loginPo.NEXT_BUTTON);

	}

	@Step("Enete password id valide")
	public static void EnterPasswordValide() {

		enterText("xpath", loginPo.ENTERYOUR_PASSWORD, "q@pitol2019");
	}

	@Step("Click on Next Button")
	public static void ClickonNextButtonwithPassword() {
		click("xpath", loginPo.NEXT_BUTTON_WITHPASSWOERD);
		try {
			Thread.sleep(40000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Step("Click on Done")
	public static void ClickonDoneButton() {
		click("xpath", loginPo.DON_TAPONBUTTON);
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

