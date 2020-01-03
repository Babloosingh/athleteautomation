package com.project.Step;

import com.project.capabilitySetup.capabilitySetup;
import com.project.po.loginPo;

import io.qameta.allure.Step;

public class copItStep extends capabilitySetup {

	@Step(" click on cop it")
	public static void ClickonCoIt() {
		click("xpath", loginPo.SINGIN_WITHGOOGLE_ACCOUNT);

	}

	@Step(" click on cop it")
	public static void EnterText() {
		click("xpath", loginPo.SINGIN_WITHGOOGLE_ACCOUNT);

	}

}
