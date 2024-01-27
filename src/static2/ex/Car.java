package static2.ex;

/*
차량 구입, 이름: K3
차량 구입, 이름: G80
차량 구입, 이름: Model Y
구매한 차량 수: 3
*/
public class Car {
    private static int totalCars;
    private String name;

    public Car(String name) {
        System.out.println("차량 구입, 이름:" + name);
        this.name = name;
        totalCars++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + totalCars);
    }
}
