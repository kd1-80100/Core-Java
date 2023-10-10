package com.invoice;

public class InvoiceTest {
	public static void main(String[] args) {
		Invoice invoice=new Invoice("Transformer","Used to transfer energy from one electric circuit to another",2,50000);
		double bill;
		bill=invoice.invoiceAmmount();
		System.out.println("Total bill of invoice:"+bill);
	}
}
