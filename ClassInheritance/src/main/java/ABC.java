public class ABC {
    public static void main(String[] args){
        System.out.println("part 1"); //part 1
        A a = new A();
        B b = new B();
        C c = new C();

        a.a();
        b.b();
        c.c();

        System.out.println("part 2"); //part 2
        C2 c2 = new C2();

        c2.a();
        c2.b2();
        c2.c2();

    }
    public static class A {
        public void a(){
            System.out.println("A");
        }
    }
    public static class B {
        public void b(){
            System.out.println("B");
        }
    }
    public static class C {
        public void c(){
            System.out.println("C");
        }
    }

    public static class B2 extends A{
        public void b2(){
            System.out.println("B");
        }
    }

    public static class C2 extends B2{
        public void c2(){
            System.out.println("C");
        }
    }

}
