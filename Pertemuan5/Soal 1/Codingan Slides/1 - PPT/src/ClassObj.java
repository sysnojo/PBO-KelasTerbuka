class MyClass {
    int x = 5;
}

public class ClassObj {
    public static void main(String[] args) throws Exception {
        MyClass myObj = new MyClass();
        MyClass myObj1 = new MyClass();
        MyClass myObj2 = new MyClass();
        System.out.println(myObj.x);
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}
