package Oops;

public class getterANDsetters {
    static void main(String[] args) {
        Penn p1 = new Penn();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println("The tip is: " + p1.getTip());

    }
}
class Penn{
   private String color;
   private int tip;

    String getColor(){
//      return color = Newcolor; type
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int tip){
        this.tip=tip;
    }

}