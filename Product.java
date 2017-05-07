import java.io.*;
import java.util.*;

public class Product{
	
	private String name;
	private double price;
	private int quantity;

	//Constructor
	public Product(String name, double price, int quantity){
		setname(name);
		setprice(price);
		setquantity(quantity);		
	}

	//Accessors
	public String getname(){return name;}
	public double getprice(){return price;}
	public int getquantity(){return quantity;}


	//Mutator
	public void setname(String name){this.name = name;}
	public void setprice(double price){this.price = (price>0 ? price : 0);}
	public void setquantity(int quantity){this.quantity = (quantity>0 ? quantity : 0);}

	//ToString
	public String toString(){return name + "  $" + price + "  Q:" + quantity;}


}
