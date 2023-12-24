package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width= 5;
        rectangle.height = 8;

        int area = rectangle.calculateArea();
        System.out.println("원의 넓이: " + area);

        int perimeter = rectangle.caculatePerimeter();
        System.out.println("원의 둘레: " + perimeter);

        boolean isSquare = rectangle.isSquare();
        System.out.println("정사각형 일치 여부: " + isSquare);
    }
}
