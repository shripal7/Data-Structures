package designPattern.composite;

public class Leaf implements Component{

	String name;
	int price;
	
	public Leaf(int price, String name)
	{
		super();
		this.price = price;
		this.name = name;
	}
	
	@Override
	public void showPrice() {
		System.out.println("name:"+ name + "price:"+ price);
	}

}
