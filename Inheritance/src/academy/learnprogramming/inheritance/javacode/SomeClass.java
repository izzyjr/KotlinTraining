package academy.learnprogramming.inheritance.javacode;

public class SomeClass {

    private static int privateVar = 6;
    public static int x = 3;

    public static void main(String[] args) {
        new SomeOtherClass().someOtherMethod();
    }

    public static void accessPrivateVar() {
        System.out.println("I'm accessing privateVar: " + privateVar);
    }


}
