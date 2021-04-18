package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer("222-555-333", "Thomas", "Krohaven 8", "tt91@live.dk");
        Customer customer2 = new Customer("555-777-111", "Peter", "Amagervej 8", "pt91@live.dk");
        Customer customer3 = new Customer("888-666-444", "Hans", "Broagervej 8", "hs91@live.dk");
        Customer customer4 = new Customer("999-111-777", "Lars", "Langelandsvej 8", "ls91@live.dk");

        HashMap<String, Customer> customerList = new HashMap();

        customerList.put(customer1.getPhoneNumber(), customer1);
        customerList.put(customer2.getPhoneNumber(), customer2);
        customerList.put(customer3.getPhoneNumber(), customer3);
        customerList.put(customer4.getPhoneNumber(), customer4);
        customerList.put("111-222-333", customer1);

        System.out.println("Iterating through customer list:");
        for (String key : customerList.keySet()) {

            System.out.println("key: " + key + " value: " + customerList.get(key));

        }

        HashSet<Customer> customerList1 = new HashSet<>();

        customerList1.add(customer1);
        customerList1.add(customer2);
        customerList1.add(customer3);
        customerList1.add(customer4);
        customerList1.add(customer1);

        Iterator<Customer> iterator = customerList1.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
