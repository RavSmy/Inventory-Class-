import java.io.*;
import java.util.*;

public class Inventory{ 

	private ArrayList<Product> inventory = new ArrayList<Product>();

	public void addProduct(Product item) {
		inventory.add(item);
	}
	
	public void printInventory(){
		if(inventory.size() == 0){ System.out.println("Empty Inventory"); return;}
		for(int i = 0 ; i<inventory.size() ; i++)
			System.out.println(inventory.get(i));
		
	}

}//class outer
