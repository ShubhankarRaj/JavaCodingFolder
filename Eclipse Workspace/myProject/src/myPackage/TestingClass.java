package myPackage;

public class TestingClass {

    public void testingThis() 
    {
        // You can access the stuff below by 
        // using this (although this is not mandatory)

        System.out.println(this.raj);
        System.out.println(this.myStringMethod());

        // Will print out:
        // 100
        // Hello World
    }

    int raj = 1000;
    String myStringMethod() 
    {
        return "Hello Raj";
    }

    public static void main(String[] args){
    	System.out.println("Testing Class");
    	TestingClass ob = new TestingClass();
    	ob.testingThis();

    }
}


