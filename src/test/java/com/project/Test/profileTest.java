package com.project.Test;

import org.testng.annotations.Test;

import com.project.feature.profileSettingFeature;

public class profileTest extends profileSettingFeature {

	@Test(description = "Go to prifile Pages test")
	public static void goToSettingProfilecheck() {

		gotoProfilesetting();

	}

}
