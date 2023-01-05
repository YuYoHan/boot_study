interface MyInterface {
    default void method01() {
        System.out.println("method01() in Myinterface");
    }
    default void method02() {
        System.out.println("method02() in Myinterface");
    }
    static void staticMehod() {
        System.out.println("staticMehod() in Myinterface");
    }
}

interface Myinterface2{
    default void method01() {
        System.out.println("method01() in Myinterface2");
    }
    static void staticMehod() {
        System.out.println("staticMehod() in Myinterface2");
    }
}

class Parent {
    public void method01() {
        System.out.println("method02() in Parent");
    }
}

// 상속은 하나만 가능하지만 interface 상속은 여러개가 가능하다.
class Child3 extends Parent implements MyInterface, Myinterface2 {
    public void method01() {
        System.out.println("method01() in Child3");
    }
}


public class Test03 {
    public static void main(String[] args) {
        Child3 c = new Child3();
        c.method01();
        c.method02();
        // static 메소드를 사용하려면 클래스 or 인터페이스 이름까지 같이 사용해야 사용할 수 있다.
        MyInterface.staticMehod();
        Myinterface2.staticMehod();
    }
}
