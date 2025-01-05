package day1;

public class InvoiceCoffee {
    private String coffeeName;
    private double price;
    private int quantity;

    InvoiceCoffee(String name, double price, int quantity) {
        this.coffeeName = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double sumPrice() {
        return this.price * this.quantity;
    }

    public boolean kiemTraKhoiLuongLonHon(double kl) {
        return this.price > kl;
    }

    public boolean kiemTraTongTienLonHon500k() {
        return this.sumPrice() >= 500000;
    }

    public double giamGia(double x) {
        if (this.sumPrice() >= 500000) {
            return (x / 100) * this.sumPrice();
        } else {
            return 0;
        }
    }

    public double giaSauKhiGiam(double x){
        return this.sumPrice() - this.giamGia(x);
    }

}
