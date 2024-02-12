/*The Transport interface declares a deliver () method. The abstract class Animal is the super class of the Tiger, Camel, Deer and Donkey classes. The Transport interface is implemented by the Camel and Donkey classes. Write a test program that initialize an array of four Animal objects. If the object implements the Transport interface, the deliver () method is invoked. 

*/

interface Transport{ 
    public void deliver();
}
abstract class Animal{
    abstract public void printClass();
}

class Tiger extends Animal{ 
    @Override
    public void printClass() {
        System.out.println(getClass());
    }
}
class Camel extends Animal implements Transport{ 
    @Override
    public void printClass() {
        System.out.println(getClass());
        deliver();
    }
    public void deliver(){
        System.out.println("deliver method invoked by Camel");
    }
}
class Deer extends Animal{ 
    @Override
    public void printClass() {
        System.out.println(getClass());
    }
}
class Donkey extends Animal implements Transport{ 
    @Override
    public void printClass() {
        System.out.println(getClass());
        deliver();
    }
    public void deliver(){
        System.out.println("deliver method invoked by Donkey");
    }
}


public class J0703Transport {
    public static void main(String[] args) {
        Animal a1[] = new Animal[4];

        a1[0] = new Tiger();
        a1[1] = new Camel();
        a1[2] = new Deer();
        a1[3] = new Donkey();
        for (int i = 0; i < a1.length; i++) {
            a1[i].printClass();
        }
        

    }
}
