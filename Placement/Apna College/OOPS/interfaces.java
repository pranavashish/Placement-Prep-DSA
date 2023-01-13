import org.w3c.dom.ls.LSOutput;
//
//public class interfaces {
//
//    public static void main(String[] args) {
//        Bear b1 = new Bear();
//        b1.eatsmeat();
//        b1.eatsplants();
//    }
//    interface herbivore{
//     void eatsplants();
//    }
//    interface carnivore{
//     void eatsmeat();
//    }
//    static class Bear implements herbivore,carnivore{
//
//        public void eatsplants(){
//            System.out.println("Eats plants");
//        }
//        public void eatsmeat(){
//            System.out.println("Eats meat");
//        }
//
//    }
//
//}
public class interfaces {

    public static void main(String[] args) {
        Bear b1 = new Bear();
        b1.eatsmeat();
        b1.eatsplants();
    }
}

interface herbivore{
    void eatsplants();
}

interface carnivore{
    void eatsmeat();
}

class Bear implements herbivore,carnivore{
    public void eatsplants(){
        System.out.println("Eats plants");
    }
    public void eatsmeat(){
        System.out.println("Eats meat");
    }
}