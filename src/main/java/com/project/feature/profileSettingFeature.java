package com.project.feature;

import com.project.Step.profileSettingStep;

import io.qameta.allure.Step;

public class profileSettingFeature extends profileSettingStep {

	@Step("Click step by step")
	public static void gotoProfilesetting() {

		ClickOnQbuton();
		ClickOnWhatAbout();
		ClickOnCrossutton();
		ClickOnSettingandPermitions();
		ClickOnRequestForcloseAccount();
		ClickOnRequestForcloseBackButton();
		ClickOnSettingBackButton();
		ClickOnblockUser();
		ClickBackButonblockUser();
		ClickBPrivacy();
		ClickBackButtonBPrivacy();
		ClickTermsConditions();
		ClickBackButtonTermsConditions();
	}

}
