package intershipTask3;

import java.util.ArrayList;

public class Browser {
	private String name;
	private ArrayList<String> urls;
	
	Browser(String name){
		this.name = name;
		urls = new ArrayList<>();
	}
	
	void addUrl(String url) {
		urls.add(url);
	}
	
	void whoAmI() {
		System.out.println("I am a browser");
	}
}
