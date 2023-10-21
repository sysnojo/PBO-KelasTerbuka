class MyClass {
    int x = 5;
    int y = 3;
}

public class ClassAttributes {
    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        MyClass myObj1 = new MyClass();
        MyClass myObj2 = new MyClass();
        myObj.x = 40;
        myObj2.x = 25;
        myObj1.x = 2522;
        System.out.println(myObj.x);
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}
