package day1;

public class OOP {
    public static void main(String[] args) {
        MyDate md = new MyDate(25,2,1004);
        md.PrintDate();
        md.printDay();
        md.printMonth();
        md.printYear();

        InvoiceCoffee iv = new InvoiceCoffee("Cà phê 1", 500001,2);
        System.out.println("Sum Price is Coffee Invoice:" + iv.sumPrice());
        System.out.println("Kiem tra so luong lon hon 1 kg"+ iv.kiemTraKhoiLuongLonHon(1));
        System.out.println("Kiem tra tong tien lon hon 500k"+ iv.kiemTraTongTienLonHon500k());
        System.out.println("Giam gia hd:" + iv.giamGia(10));
        System.out.println("Gia sau khi giam:" + iv.giaSauKhiGiam(10));
    }
}
