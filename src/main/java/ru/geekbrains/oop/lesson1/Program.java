package ru.geekbrains.oop.lesson1;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Product  product1 = new Product("Brand #1", "Name #1", 350);
        System.out.println(product1.displayInfo());

        product1.setPrice(-1400);
        product1.setName("~");
        System.out.println(product1.displayInfo());



        BottleOfWater bottleOfWater1 = new BottleOfWater("Brand #2", "Name #2", 210, 0.5);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfWater2 = new BottleOfWater("Brand #2", "Name #2", 210, 0.5);
        System.out.println(bottleOfWater2.displayInfo());

        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Brand #3", "Name #3", 310, 0.5, 10);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfMilk2 = new BottleOfMilk("Brand #3", "Name #3", 310, 0.5, 10);
        System.out.println(bottleOfMilk2.displayInfo());

        Chocolate chocolate1 = new Chocolate("Brand #4", "Name #4", 310, 500, 70);;
        System.out.println(chocolate1.displayInfo());

        Product chocolate2 = new Chocolate("Brand #4", "Name #4", 310, 500, 60);
        System.out.println(chocolate2.displayInfo());

        ArrayList<Product> list = new ArrayList<>();
        list.add(bottleOfMilk1);
        list.add(bottleOfWater1);
        list.add(bottleOfMilk2);
        list.add(bottleOfWater2);
        list.add(chocolate1);
        list.add(chocolate2);
        list.add(new Chocolate("Brand #5", "Name #5", 310, 400, 80));

        VendingMachine vendingMachine = new VendingMachine(list);
        Chocolate chocolateRes =  vendingMachine.getChocolate("Name #2", 400);
        if (chocolateRes != null){
            System.out.println("Вы купили: ");
            System.out.println(chocolateRes.displayInfo());
        }
        else {
            System.out.println("Такой шоколадки нет в автомате.");
        }



    }

}
