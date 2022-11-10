public class Main {
    public static void main(String[] args){
        // задание 1
        System.out.println( " Задание 1 ");
        for (int i= 1; i<= 10; i ++ ) {
            System.out.println(i);

        }
        // задание 2
        System.out.println( " Задание 2 ");
        for (int i= 10; i>= 1; i -- ) {
            System.out.println(i);
        }
        // задание 3
        System.out.println( " Задание 3 ");
        for (int a = 0; a<= 17; a =a+2 ) {
            System.out.println(a);
        }
        // задание 4
        System.out.println( " Задание 4 ");
        for (int c= 10; c>= -10; c-- ) {
            System.out.println(c);
        }
        // задание 2-1
        System.out.println( " Задание 2-1 ");
        for (int b= 1904; b<= 2096; b = b+4 ) {
            System.out.println(b + " год является високосным ");
        }
        // задание 2-2
        System.out.println( " Задание 2-2 ");
        for (int d= 7; d<= 98; d = d+7 ) {
            System.out.println(d);
        }
        // задание 2-1
        System.out.println( " Задание 2-1 ");
        for (int b= 1904; b<= 2096; b = b+4 ) {
            System.out.println(b + " год является високосным ");
        }
        // задание 2-3
        System.out.println( " Задание 2-3 ");
        for (int d= 1; d<= 512; d = d*2 ) {
            System.out.println(d);
        }

        // задание 3-1
        System.out.println( " Задание 3-1 ");

        int accumulation = 29000;
        int total=0;
        for (int d= 1; d<= 12; d++) {
            total = total + accumulation;
            System.out.println(" Месяц " + d + ", сумма накоплений равна " + total + " рублей");
        }
        // задание 3-2
        System.out.println( " Задание 3-2 ");
         accumulation = 29000;
         total =0;
        for (int d= 1; d<= 12; d++) {
            total = total + total / 100;
            total = total + accumulation;
            System.out.println(" Месяц " + d + ", сумма накоплений равна " + total + " рублей");
        }


    }
}