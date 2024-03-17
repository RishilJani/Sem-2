/*mouseClicked(), mousePressed(), mouseReleased(), mouseMoved(), mouseDragged() methods. Also create 
KeyListener interface which inherits EventListener along with keyPressed(), keyReleased() methods. WAP to create 
EventDemo class which implements MouseListener */
interface EventListener {
    public void performEvent();
}

interface MouseListener extends EventListener {
    public void mouseClicked();

    public void mousePressed();

    public void mouseReleased();

    public void mouseMoved();

    public void mouseDragged();
}

interface KeyListener extends EventListener {
    public void keyPressed();

    public void keyReleased();
}

class EventDemo implements KeyListener, MouseListener {
    public void mouseClicked() {
        System.out.println("Mouse Clicked");
    }

    public void mousePressed() {
        System.out.println("Mouse Pressed");
    }

    public void mouseReleased() {
        System.out.println("Mouse Released");
    }

    public void mouseMoved() {
        System.out.println("Mouse Moved");
    }

    public void mouseDragged() {
        System.out.println("Mouse Dragged");
    }

    public void keyPressed() {
        System.out.println("Key Pressed");
    }

    public void keyReleased() {
        System.out.println("Key Released");
    }

    public void performEvent() {
        System.out.println("Event performed");
    }
}

public class J0704EventDemo {
    public static void main(String[] args) {
        EventDemo e1 = new EventDemo();
        e1.performEvent();

        e1.mouseClicked();
        e1.mousePressed();
        e1.mouseDragged();
        e1.mouseReleased();
        e1.mouseMoved();

        e1.keyPressed();
        e1.keyReleased();
    }
}
