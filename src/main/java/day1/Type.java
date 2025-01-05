package day1;

public class Type {
    public static void main(String[] args) {
        String nameBook = "Java Learning";
        int yearEx = 2024;
        double priceBook = 8.50d;
        boolean flagBook = true;
        char SKU = 'M';
        System.out.printf("Name: %s\n", nameBook);
        System.out.printf("Year: %d\n", yearEx);
        System.out.printf("Price: %.2f\n", priceBook);
        System.out.printf("ISBN: %s\n", SKU);
        System.out.println(flagBook);


//        Final
        final String a = "Nguyen Van A";
//        Error when run , because this is constant , value is not editing;
//        a = "Nguyen Van B";

//        Ép kiểu dữ liệu
//        Ép kểu ngầm đinh
        int a2 = 100;
        int b = 2;
        System.out.println("a: " + a2);
        System.out.println("b: " + b);
        float c = a2;
        float d = b;
        System.out.println("c: " + c);
        System.out.println("d: " + d);

//        Ép kiểu tường minh
        float e = 3.5f;
        float f = 9.5f;

        int g = (int) e;
        int h = (int) f;
        System.out.println("g: " + g);
        System.out.println("h: " + h);

//      Ep kieu du lieu nguyen thuy sang kieu du lieu doi tuong
        int x = new Integer(32);
        System.out.println("x: " + x);

    }
}
