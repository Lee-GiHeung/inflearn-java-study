package extends1.super1;

public class Child extends Parent{

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this.value = " + this.value); // this(자신) 생략가능
        System.out.println("super.value = " + super.value); // super(내 부모)

        this.hello(); // this 생략
        super.hello();
    }
}
