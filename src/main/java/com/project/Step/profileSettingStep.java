package com.project.Step;

import com.project.capabilitySetup.capabilitySetup;
import com.project.po.profileMenuPo;

import io.qameta.allure.Step;

public class profileSettingStep extends capabilitySetup {

	@Step("click on Q button")
	public static void ClickOnQbuton() {
		click("xpath", profileMenuPo.Q_BUTTON);

	}

	@Step("ClickOnWhatAbout")
	public static void ClickOnWhatAbout() {
		click("accessibility id", profileMenuPo.WHATTHISAPPISABOUT);

	}

	@Step("ClickOnCrossutton")
	public static void ClickOnCrossutton() {
		click("accessibility id", profileMenuPo.CROSS_BUTTON);

	}

	@Step("ClickOnSettingandPermitions")
	public static void ClickOnSettingandPermitions() {
		click("accessibility id", profileMenuPo.SETTING_PERMISSIONS);

	}

	@Step("ClickOnRequestForcloseAccount")
	public static void ClickOnRequestForcloseAccount() {
		click("xpath", profileMenuPo.REQUESTTOCLOSEACCOUNT);

	}

	@Step("ClickOnRequestForcloseBackButton")
	public static void ClickOnRequestForcloseBackButton() {
		click("accessibility id", profileMenuPo.BACK_BUTTON_CLOSEACCOUNT);

	}

	@Step("ClickOnRequestForcloseBackButton")
	public static void ClickOnSettingBackButton() {
		click("accessibility id", profileMenuPo.SETTINGBACK_BUTTON);

	}

	@Step("ClickOnblockUser")
	public static void ClickOnblockUser() {
		click("accessibility id", profileMenuPo.BLOCKEDUSER);

	}

	@Step("ClickBackButonblockUse")
	public static void ClickBackButonblockUser() {
		click("accessibility id", profileMenuPo.BACKBUTTON_BLOCKEDUSER);

	}

	@Step("ClickBPrivacy")
	public static void ClickBPrivacy() {
		click("accessibility id", profileMenuPo.PRIVACY_POLICY);

	}

	@Step("ClickBackButtonBPrivacy")
	public static void ClickBackButtonBPrivacy() {
		click("accessibility id", profileMenuPo.BACK_PRIVACY_POLICY);

	}

	@Step("ClickTermsConditions")
	public static void ClickTermsConditions() {
		click("accessibility id", profileMenuPo.TERMSANDCONDITIONS);

	}

	@Step("ClickTermsConditions")
	public static void ClickBackButtonTermsConditions() {
		click("accessibility id", profileMenuPo.BACK_TERMSANDCONDITIONS);

	}

}
