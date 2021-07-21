package ru.gb;

import Animals.Dog;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
	Dog dog=new Dog(5, "Flopa");
        System.out.println("Сколько проплывёт собака?");
    dog.swim(sc.nextInt());
        System.out.println("Сколько должна пробежать собака " +dog.getName()+ " ?");
        dog.run(sc.nextInt());
    }
}
