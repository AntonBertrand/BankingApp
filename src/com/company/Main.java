package com.company;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank("Lloyds TSB");
		bank.addBranch("Wembley");

		bank.addCustomer("Wembley", "Alfie", 50.05);
		bank.addCustomer("Wembley", "Abdi", 175.34);
		bank.addCustomer("Wembley", "Louie", 220.12);

		bank.addBranch("Kent");
		bank.addCustomer("Kent", "Bob", 150.54);

		bank.addCustomerTransaction("Wembley", "Alfie", 44.22);
		bank.addCustomerTransaction("Wembley", "Alfie", 12.44);
		bank.addCustomerTransaction("Wembley", "Abdi", 1.65);


		bank.listCustomers("Wembley", true);
		bank.listCustomers("Kent", true);


	}
}
