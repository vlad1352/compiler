package Files;

public class Test {
    public static void main(String[] args) {
        Integer a = 5;
        Integer b = 10;
        Integer c = 0;
        if (a == b) {
            c = a + b;
            System.out.println(c);
        } else {
            Integer i = 4;
            System.out.println(i);
        }
        for (Integer q = 0; q < 200; q++) {
            a++;
            System.out.println(a);
            if (a == 100) {
                break;
            }
        }
    }
}
