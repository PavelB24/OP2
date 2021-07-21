package Animals;

import java.io.IOException;

public class Cat extends Animal {
    private static int counter;
    public Cat(int age, String name) {
        super(age, name);
        counter++;
    }

    @Override
    public void swim(int meters) {
        System.out.println("Кошки не умеют плавать, не мучайте животное :(");

    }

    public String getName(){
        return name;
    }
    public int getCounter(){
        return counter;
    }


    @Override
    public void run(int meters) {
        if (meters <= 200) {
            System.out.println("Кошка " +this.name + " пробежала " + meters + " метров");
        } else {
            try{
                throw new IOException();}
            catch (IOException e){
                System.out.println("Кошка не может столько пробежать!");
            }

        }

    }

}
