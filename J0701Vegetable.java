/*The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato. Write a java program that 
demonstrates how to establish this class hierarchy. Declare one instance variable of type String that indicates the color of a vegetable. Crete and display instances of these objects. Override the toString() method of object to return a string with the name of vegetable and its color.
 */
abstract class vegetable{
    String color;
    @Override
    abstract public String toString();
}
class Potato extends vegetable{
    Potato(){
        this.color = "yellow";
    }

    @Override
    public String toString(){
        return getClass() + " color = "+ color;
    }
}
class Brinjal extends vegetable{
    Brinjal(){
        this.color = "Green";
    }

    @Override
    public String toString(){
        return getClass() + " color = "+ color;
    }
}
class Tomato extends vegetable{
    Tomato(){
        this.color = "Red";
    }

    @Override
    public String toString(){
        return getClass() + " color = "+ color;
    }
}
public class J0701Vegetable {
    public static void main(String[] args) {
        Potato p1 = new Potato();
        Brinjal b1 = new Brinjal();
        Tomato t1 = new Tomato();
        
        System.out.println(p1.toString());
        System.out.println(b1.toString());
        System.out.println(t1.toString());
    }
    
}
