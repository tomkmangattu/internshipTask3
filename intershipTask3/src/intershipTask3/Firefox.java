package intershipTask3;

import java.util.ArrayList;

public class Firefox extends Browser implements MultipleAccountContainers{
	
	private ArrayList<String> containers;

	Firefox() {
		super("Firefox");
		containers = new ArrayList<>();
	}
	
	@Override
	void whoAmI() {
		System.out.println("I am Firefox");
	}

	@Override
	public void addContainer(String container) {
		containers.add(container);
	}
	
	String[] viewAllContainers() {
		return  containers.toArray(new String[0]);
	}

	@Override
	public void leaveContainer(String container) {
		containers.remove(container);		
	}
}
