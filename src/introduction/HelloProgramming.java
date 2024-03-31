
package Introduction;

public  class HelloProgramming {
    public static void main(String[] args) {

        System.out.println("Main method : HelloProgramming ");
        A.main(null);
        B.main(null);
        C.main(null);

    }
}

class A{
    public static void main(String[] args) {
        System.out.println("Main method : Introduction.A");

    }
}

class B {
    public static void main(String[] args) {
        System.out.println("Main method : Introduction.B");
    }
}

class C {
    public static void main(String[] args) {
        System.out.println("Main method : Introduction.C");
    }
}