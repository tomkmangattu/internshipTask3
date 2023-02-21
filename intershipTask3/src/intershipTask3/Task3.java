package intershipTask3;

import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		Browser chrome = new GoogleChrome();
		Browser firefox = new Firefox();
		chrome.whoAmI();
		firefox.whoAmI();
		
		GoogleChrome googleChrome = new GoogleChrome();
		
		googleChrome.setPermission(true);
		googleChrome.showPermissions();
		googleChrome.setPermission(true, true);
		googleChrome.showPermissions();
		googleChrome.setPermission(true, true, true);
		googleChrome.showPermissions();
		
		googleChrome.setVersionNumber("1.2");
		googleChrome.setVersionNumber("1.2");
		
		Browser tabOne = new GoogleChrome();
		Browser tabTwo = new Firefox();
		Browser tabThree = new Firefox();
		Browser tabFour = new GoogleChrome();
		Browser tabFive = new GoogleChrome();
		Browser[] allBrowsers = {tabOne, tabTwo, tabThree, tabFour, tabFive};
		
		int googleChromeCount = 0;
		for(int idx = 0; idx < allBrowsers.length; idx++) {
			if(allBrowsers[idx] instanceof GoogleChrome) {
				googleChromeCount ++;
			}
		}
		System.out.println("There are " + googleChromeCount + " tabs of Google chrome");
		
		Browser browser = new Firefox();
		((Firefox) browser).addContainer("facebookContainer");
		((Firefox) browser).addContainer("Mails");
		((Firefox) browser).addContainer("PrivateBrowsing");
		
		String[] containers = ((Firefox) browser).viewAllContainers();
		System.out.println(Arrays.toString(containers));
		
		((Firefox) browser).leaveContainer("PrivateBrowsing");
		
		containers = ((Firefox) browser).viewAllContainers();
		System.out.println(Arrays.toString(containers));
	}
}
