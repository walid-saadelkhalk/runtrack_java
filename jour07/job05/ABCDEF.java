package jour07.job05;

public class ABCDEF {
    public static void main(String[] args) {
        // Affectations initiales
        A a = new A();   // Correct
        B b = new B();   // Correct
        C c = new C();   // Correct
        D d = new D();   // Correct
        E e = new E();   // Correct
        F f = new F();   // Correct

        // Affectations additionnelles
        a = b;           // Correct
        // b = a;        // Incorrect : `a` est de type A et ne peut pas être assigné à une variable de type B.
        a = (A) b;       // Correct
        a = null;        // Correct
        // null = a;     // Incorrect : `null` ne peut pas être assigné à une variable.
        a = d;           // Correct
        // b = d;        // Incorrect : `d` est de type D et ne peut pas être assigné à une variable de type B.
        d = e;           // Correct
        d = e;           // Correct (répétition de la ligne précédente)

        // Remplissage d'un tableau
        A[] as = new A[10];
        as[0] = new A();
        as[1] = new B();
        as[2] = new D(2);
        as[3] = new C();
        as[4] = new E();
        as[5] = new D(4);
        as[6] = new B();

        // À vous d'ajouter le code de ces deux méthodes:
        rechercher(as);
        additionner(as);
    }

    public static class A {
        public A() {}
    }

    public static class B extends A {
        public B() {
            super();
        }
    }

    public static class C extends B {
        public C() {
            super();
        }
    }

    public static class D extends A {
        protected int d = 1;
        
        public D(int x) {
            super();
            d = x;
        }

        public D() {}
    }

    public static class E extends D {
        public E() {
            super();
        }
    }

    public static class F extends D {
        public F() {
            super();
        }
    }

    private static void rechercher(A[] as) {
        int count = 0;
        for (A a : as) {
            if (a instanceof B) {
                count++;
            }
        }
        System.out.println("Il y a " + count + " instances de la classe B");
    }

    private static void additionner(A[] as) {
        int sum = 0;
        for (A a : as) {
            if (a instanceof D) {
                D d = (D) a;
                sum += d.d;
            }
        }
        System.out.println("Somme des variables d : " + sum);
    }
}
