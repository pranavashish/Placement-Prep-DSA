public class Inheritance {


    public static void main(String[] args) {

        Human h1 = new Human();
        h1.name = "Ramesh";
        h1.race = "Hapshi";
        h1.walk();
        h1.breathe();
        h1.eat();

        System.out.println(h1.name);
        System.out.println(h1.race);
    }

}

class Animal{
    // property
    String name;

    // function
    void eat(){
        System.out.println("eating");
    }
    void breathe(){
        System.out.println("breathing");
    }
}

class Fish extends Animal{
       // function
    void swim(){
        System.out.println("swimming");
    }

}

class Bird extends Animal{
    // function
    void fly(){
        System.out.println("flying");
    }

}

class Mammal extends Animal{
    // function
    void walk(){
        System.out.println("walking");
    }

}

class Tuna extends Fish{
    // function
    int fins;

}

class Shark extends Fish{
    // function
    int fins;
}

class Peacock extends Bird{
    // function
    int wings;

}

class Dog extends Mammal{
    // function
    String breed;
}
class Cat extends Mammal{
    // function
    String color;
}
class Human extends Mammal{
    // function
    String race;
}