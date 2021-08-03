package ru.gb;

import Animals.Cat;
import Animals.Dog;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
	Dog dog=new Dog(5, "Вася");
	Cat cat = new Cat(3, "Флоппа");
        System.out.println("Сколько проплывёт собака?");
    dog.swim(sc.nextInt());
        System.out.println("Сколько должна пробежать собака " +dog.getName()+ " ?");
        dog.run(sc.nextInt());
        System.out.println("Сколько должна пробежать кошка " +cat.getName()+ " ?");
        cat.run(sc.nextInt());
        System.out.println("Сколько проплывёт кошка?");
        cat.swim(sc.nextInt());
        System.out.println("Всего: "+ dog.getCounter()+ " собак и " + cat.getCounter() + " котов");
    }
}
