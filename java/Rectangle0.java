import java.util.Scanner;

public class Rectangle0 {
    private double length;
    private double width;

     public void setValues(double len, double wed){
         length = len;
         width = wed;
         Scanner keyboard = new Scanner(System.in);
     }
     public void display(){
         System.out.println("length"+length+"width"+width+"Arena"+length*width);

     }

    public void setLength() {
        System.out.println("Enter length");
        Scanner keyboard = new Scanner(System.in);
        length= keyboard.nextDouble();
    }

    public void setWidth() {
        System.out.println("Enter With");
        Scanner keyboard = new Scanner(System.in);
        width= keyboard.nextDouble();
    }

    public double getLength() {
    System.out.println("Length is: ");
        return length;
    }

    public double getWidth() {
    System.out.println("Width is: ");
        return width;
    }
    public double getArea() {
    System.out.println("Area is: ");
         return length*width;
    }

    public static void main(String[] args) {
        Rectangle0 regtan = new Rectangle0();
        regtan.setValues(10,50);
        regtan.display();
    }
}