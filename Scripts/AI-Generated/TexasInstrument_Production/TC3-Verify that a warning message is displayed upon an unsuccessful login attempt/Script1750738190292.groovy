import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.TexasInstrument_Production.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /as/* with params (client id, nonce, redirect uri, response mode, response type, scope, state)"

TrueTestScripts.navigate("/as/${as_id}", ["client_id": as_client_id, "nonce": as_nonce, "redirect_uri": as_redirect_uri, "response_mode": as_response_mode, "response_type": as_response_type, "scope": as_scope, "state": as_state])

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Click on button logIn -> Navigate to page '/as/*/resume/as/authorization.ping'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/as/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/TexasInstrument_Production/Page_as/button_logIn'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on button logIn - Navigate to page asresumeasauthorizationping.png')

"Step 4: Click on div errorMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/as/.*/resume/as/authorization.ping?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/TexasInstrument_Production/Page_as_resume_as_authorization_ping/div_errorMessage'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on div errorMessage.png')

"Step 5: Click on button next -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/as/.*/resume/as/authorization.ping?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/TexasInstrument_Production/Page_as_resume_as_authorization_ping/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on button next - Navigate to page .png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify that a warning message is displayed upon an unsuccessful login attempt_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}