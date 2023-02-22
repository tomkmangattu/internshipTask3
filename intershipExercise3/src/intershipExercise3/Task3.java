package intershipExercise3;


public class Task3 {
	public static void main(String[] args) {
		Browser browser = new Browser();
		browser.setNumberOfTabs(5);
		
		int tabsNumber = browser.getNumberOftabs();
		
		System.out.println(tabsNumber);
		
		Integer tabsNo = browser.getNumberoftabsOpened();
		System.out.println(tabsNo);
		
		System.out.println(tabsNo instanceof Integer);
		
	}
}
