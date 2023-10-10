/*
 Create a class called Invoice that a hardware store might use to represent an invoice for an item
sold at the store. An Invoice should include four pieces of information as fields—a part number
(type String), a part description (type String), a quantity of the item being purchased (type int) and a
price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method for each instance variable.
calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
amount as a double value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.
 */
package com.invoice;

public class Invoice {
	String partNum;
	String partDesc;
	int itemPurchased;
	double price;

	public Invoice() {
		this.partNum = " ";
		this.partDesc = " ";
		this.itemPurchased = 0;
		this.price = 0;
	}

	public Invoice(String partNum, String partDesc, int itemPurchased, double price) {
		super();
		if (itemPurchased<0) {
			this.itemPurchased=0;
		}
		if (price<0) {
			this.price=0;
		}
		this.partNum = partNum;
		this.partDesc = partDesc;
		this.itemPurchased = itemPurchased;
		this.price = price;
	}

	public String getPartNum() {
		return partNum;
	}

	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}

	public String getPartDesc() {
		return partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	public int getItemPurchased() {
		return itemPurchased;
	}

	public void setItemPurchased(int itemPurchased) {
		this.itemPurchased = itemPurchased;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double invoiceAmmount() {
		this.price = this.itemPurchased * this.price;
		return this.price;
	}
}