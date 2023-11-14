package fiche1;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5,3);
        Rectangle rectangle2 = new Rectangle(10,6);
        Rectangle rectangle3 = new Rectangle(8,2);

        System.out.println(rectangle1.getAire());
        System.out.println(rectangle2.getPerimetre());
        System.out.println(rectangle3.toString());
    }
}
