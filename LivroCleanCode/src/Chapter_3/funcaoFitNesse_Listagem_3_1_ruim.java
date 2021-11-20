package Chapter_3;

public class funcaoFitNesse_Listagem_3_1_ruim {
	
	private static final String PageCrawlerImpl = null;
	private static final String SuiteResponder = null;
	private static final String PathParser = null;

	public static String testableHtml(PageData pageData, boolean includeSuiteSetup) throws Exception{
		WikiPage wikiPage = pageData.WikiPage();
		StringBuffer buffer = new StringBuffer();
		if (pageData.hasAttribute("Test")) {
			if (includeSuiteSetup) {
				Object wikipage;
				WikiPage suiteSetup = PageCrawlerImpl.getInheritedPage(
						SuiteResponder.SUITE_SETUP_NAME, wikipage);
				if(suiteSetup != null){
					WikiPage pagePath = suiteSetup.getPageCrawler().getFullPath(suiteSetup);
					Object pagepath;
					String pagePathName = PathParser.render(pagepath);
					buffer.append("!include -setup .")
						  .append(pagePathName)
						  .append("\n");
				}
			}
			
			WikiPage = setup = PageCrawlerImpl.getInheritedPage("SetUp", wikiPage);
			if(setup != null) {
				WikiPagePath setupPath = wikiPage.getPageCrawler().getFullPath(setup);
				String setupPathName = PathParser.render(setupPath);
				buffer.append("!include -setup .")
				  	  .append(setupPathName)
				  	  .append("\n");
			};
			
			if (suiteTeardown != null) {
				WikiPagePath pagePath = suiteTeardown.getPageCrawler().getFullPath (suiteTeardown);
				String pagePathName = PathParser.render(pagePath);
				buffer.append("!include -teardown .")
					  .append(pagePathName)
					  .append("\n");
				}			
		}
		
		pageData.setContent(buffer.toString());
		return pageData.getHtml();
		
	};

}
