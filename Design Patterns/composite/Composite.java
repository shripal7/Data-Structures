package designPattern.composite;

import java.awt.List;
import java.util.ArrayList;



public class Composite implements Component{

	String name;
	java.util.List<Component> components = new ArrayList<>();
	
	public Composite(String name)
	{
		this.name = name;
	}
	
	@Override
	public void showPrice() {
		
		System.out.println("Component: "+name);
		for(Component c: components)
		{
			c.showPrice();
		}
	}
	
	public void addComponent(Component com) {
		
		components.add(com);
	}

}
