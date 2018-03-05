package designPattern.composite;

public class CompositeTest {

	public static void main(String[] args) {
		
		Component hdd = new Leaf(200, "HDD");
		Component mouse = new Leaf(30, "Mouse");
		Component monitor = new Leaf(200, "Monitor");
		Component ram = new Leaf(80, "RAM");
		Component cpu = new Leaf(300, "CPU");
		
		Composite ph = new Composite("Peri");
		Composite cabinet = new Composite("Cabinet");
		Composite mb = new Composite("MB");
		Composite computer = new Composite("Computer");
		
		mb.addComponent(cpu);
		mb.addComponent(ram);
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		cabinet.addComponent(hdd);
		cabinet.addComponent(mb);
		
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		computer.showPrice();
	}
}
