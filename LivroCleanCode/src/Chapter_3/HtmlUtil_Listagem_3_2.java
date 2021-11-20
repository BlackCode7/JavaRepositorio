package Chapter_3;

public class HtmlUtil_Listagem_3_2 {
	public static String renderPageWithSetupsAndTearDowns(
			PageData pageData, boolean isSuite
		) throws Exception{
		boolean isTestPage = pageData.hasAttribute("Test");
		if (isTestPage) {
			WikiPage testPage = pageData.getWikiPage();
			StringBuffer newPageContent = new StringBuffer();
			includeSetupPages(testPage, newPageContent, isSuite);
			newpageContent.append(pageData.getContent());
			includeTearDownPages(testPage, newPageContent, isSuite);
			pagedata.setContent(newPageContent.toString());
		}
		return pageData.getHtml();
	}
}
