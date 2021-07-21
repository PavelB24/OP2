package Animals;

import java.io.IOException;

public class Dog extends Animal {
    private static int counter;
    public Dog(int age, String name) {
        super(age, name);
        counter++;
    }

    @Override
    public void swim(int meters) {

            if (meters <= 10) {
                System.out.println("Собака "+getName() + " проплыла " + meters + " метров");
            } else {
                try{
                throw new IOException();}
                catch (IOException e){
                    System.out.println("Собака не может столько проплыть!");
                }

            }

        }

        public String getName(){
        return name;
        }
    public int getCounter(){
        return counter;
    }


    @Override
    public void run(int meters) {
        if (meters <= 500) {
            System.out.println("Собака " +this.name + " пробежала " + meters + " метров");
        } else {
            try{
                throw new IOException();}
            catch (IOException e){
                System.out.println("Собака не может столько пробежать!");
            }

        }

    }

    }
