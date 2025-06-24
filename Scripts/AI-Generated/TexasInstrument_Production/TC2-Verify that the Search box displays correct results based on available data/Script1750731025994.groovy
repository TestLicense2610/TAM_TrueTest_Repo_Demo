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

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on input searchQuery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/TexasInstrument_Production/Page_home/input_searchQuery'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on input searchQuery.png')

"Step 3: Enter input value in input searchQuery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/TexasInstrument_Production/Page_home/input_searchQuery'), input_searchQuery)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Enter input value in input searchQuery.png')

"Step 4: Click on button suggestedQuery -> Navigate to page '/sitesearch/en-us/docs/universalsearch.tsp'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/TexasInstrument_Production/Page_home/button_suggestedQuery'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on button suggestedQuery - Navigate to page sitesearchen-usdocsuniversalsearchtsp.png')

"Step 5: Click on link cc1200 -> Navigate to page '/product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/sitesearch/en-us/docs/universalsearch.tsp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/TexasInstrument_Production/Page_sitesearch_en_us_docs_universalsearch_tsp/link_cc1200'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on link cc1200 - Navigate to page product.png')

"Step 6: Click on header productTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/TexasInstrument_Production/Page_product/header_productTitle'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on header productTitle.png')

"Step 7: Click on header productDescription -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/TexasInstrument_Production/Page_product/header_productDescription'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on header productDescription - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify that the Search box displays correct results based on available data_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}