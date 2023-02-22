package intershipExercise3;

public class Browser {
	private int numberOfTabsOpened;
	private Integer numberOfTabs;
	
	void setNumberOfTabs(int numberOfTabsOpened) {
		this.numberOfTabsOpened = numberOfTabsOpened;
		numberOfTabs = numberOfTabsOpened;
	}
	
	// auto boxing int to Integer
	Integer getNumberoftabsOpened() {
		return numberOfTabsOpened;
	}
	
	// unboxing Integer to int
	int getNumberOftabs() {
		return numberOfTabs;
	}
}
