class A {
    int a = 10;

    void display() {
        System.out.println("a = " + a);
    }
}

class B extends A {
    int b = 20;

    void display() {
        System.out.println("b = " + b);
    }
}

class C extends B {
    int c = 30;

    void display() {
        System.out.println("c = " + c);
    }
}

class multilevel_inheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
        System.out.println("c = " + obj.c);
    }
}
