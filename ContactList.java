package c3PO;

import java.util.ArrayList;

public class ContactList {
//Arraylist with elements that can be ordered in any manner.
//element has: name, number, description, address
//Only thing required to make a new contact entry is a name.
	
	public static class Contact{
		String name = null;
		String num = null;
		String address = null;
		String desc = null;
		public Contact(String n, String nu, String add, String d){
			if(!n.equals(null)) {
				name = n;
				num = nu;
				address = add;
				desc = d;	
			}
		}
		
		public void setName(String n) {
			name = n;
		}
		public void setNum(String n) {
			num = n;
		}
		public void setAdd(String a) {
			address = a;
		}
		public void setDesc(String d) {
			desc = d;
		}
		public String getName() {
			return name;
		}
		public String getNum() {
			return num;
		}
		public String getAdd() {
			return address;
		}
		public String getDesc() {
			return desc;
		}	
	}
	
	public ArrayList<Contact> c = new ArrayList<>();
	
	public void add(String name, String num, String add, String desc) {
		
	}
	
	public void delete() {
		
	}
	
	public void sort() {
		
	}
	
	public void edit() {
		
	}
	
	
}
