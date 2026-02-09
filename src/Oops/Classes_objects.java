package Oops;

public class Classes_objects {

    static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "blue";
        System.out.println(p1.color);
        System.out.println(p1.color = "orange");

    }
}
class  Pen{
    String color;
    int tip;

    void setTip(int newTip){
        tip = newTip;
    }
    void setColor(String newColor){
        color = newColor;
    }
}