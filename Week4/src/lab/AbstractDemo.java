package lab;

public class AbstractDemo {
	public static void main(String[] args) {
		Item iceCream=new Vennila(new Nuts(new ButterScotch(new DryFruits())));
		System.out.println("The price is "+iceCream.cost());
	}
}

abstract class Item{
	public abstract int cost();
}

abstract class Cream extends Item{
	
}

class Vennila extends Cream{
	Item item;
	public Vennila() {
		
	}
	
	public Vennila(Item item) {
		this.item=item;
	}
	
	public int cost() {
		
		if(item==null) {
			return 10;
		}
		else {
			return 10+item.cost();
		}
	}
}

class ButterScotch extends Cream{
	Item item;
	public ButterScotch() {
		
	}
	
	public ButterScotch(Item item) {
		this.item=item;
	}
	
	public int cost() {
		if(item==null)
			return 15;
		else
			return 15+item.cost();
	}
}

abstract class Ingredient extends Item{
	
}

class Nuts extends Ingredient{
	Item item;
	public Nuts() {
		
	}
	
	public Nuts(Item item) {
		this.item=item;
	}
	
	public int cost() {
		if(item==null)
			return 5;
		else
			return 5+item.cost();
	}
}

class DryFruits extends Ingredient{
	Item item;
	public DryFruits() {
		
	}
	
	public DryFruits(Item item) {
		this.item=item;
	}
	
	public int cost() {
		if(item==null)
			return 10;
		else
			return 10+item.cost();
	}
}