import java.io.*;
import java.util.*;

public class testManager{
	
	public static void main( String[] args )
    	{	
		Product item1 = new Product("Jacket", 20.00, 5);
		Product item2 = new Product("BMW", 45000.00, 100);

		Inventory myWishList = new Inventory();

		myWishList.printInventory();
		myWishList.addProduct(item1);
		myWishList.addProduct(item2);
		myWishList.printInventory();		
	}
	
}
