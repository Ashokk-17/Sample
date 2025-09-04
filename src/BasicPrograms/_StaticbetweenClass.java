package BasicPrograms;

    class subclass {

        static int x = 10;

        static int add() {
            int a = 10;
            int b = 20;
            int c = a + b;
            return c;
        }
    }
    class _StaticbetweenClass {

        public static void main(String[] args) {
            System.out.println(subclass.x);
            System.out.println(subclass.add());
        }
    }

