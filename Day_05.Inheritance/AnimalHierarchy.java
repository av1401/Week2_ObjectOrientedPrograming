// Super class Animal
class Animal{
    String name;
    int age;

    //Animal constructor
    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    // method for make sound
    void makeSound(){
        System.out.println(name + " makes a sound.");
    }
}

// class dog inherits from Animal
class Dog extends  Animal{
    Dog(String name, int age){
        super(name,age);                    //calls constructor of parent class
    }

    // Override makeSound for dog sound
    @Override
    void makeSound(){
        System.out.println(name + " Barks.");
    }
}

// class Cat inherits from Animal
class Cat extends  Animal{
    Cat(String name, int age){
        super(name,age);                   //calls constructor of parent class
    }

    // Override makeSound for cat sound
    @Override
    void makeSound(){
        System.out.println(name + " Meows.");
    }
}

// class Bird inherits from Animal
class Bird extends  Animal{
    Bird(String name, int age){
        super(name,age);                   //calls constructor of parent class
    }

    // Override makeSound for Bird sound
    @Override
    void makeSound(){
        System.out.println(name + " Chirups.");
    }
}

public class AnimalHierarchy {

    public static void main(String[] args) {

        // Making object of Animal class
        Animal animal = new Animal("Mammals" , 20);
        animal.makeSound();

        // Making object of Dog class
        Dog bunny = new Dog("Bunny", 10);
        bunny.makeSound();

        // Making object of Cat class
        Cat tom =  new Cat("tom", 4);
        tom.makeSound();

        // Making object of Bird class
        Bird mitthu = new Bird("Miththu" , 2);
        mitthu.makeSound();
    }

}
