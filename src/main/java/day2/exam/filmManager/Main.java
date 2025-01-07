package day2.exam.filmManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Genre theloai1 = new Genre();
        theloai1.setName("Tinh cam");
        Film phim1 = new Film("Cậu đến từ đâu", 2000, "Khánh đẹp trai", theloai1);
        Genre theloai2 = new Genre();
        theloai1.setName("Tinh cam 1");
        Film phim2 = new Film("Cậu đến từ đâu 2", 2000, "Khánh đẹp trai", theloai1);
        Genre theloai3 = new Genre();
        theloai1.setName("Tinh cam 2");
        Film phim3 = new Film("Cậu đến từ đâu 3", 2000, "Khánh đẹp trai", theloai1);


        ArrayList<Film> list1 = new ArrayList<>();
        list1.add(phim1);
        list1.add(phim2);
        list1.add(phim3);

        System.out.println("Danh sách phim:");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(i + ": " + list1.get(i) + "\n");
        }
        for(Film film : list1) {
            
        }
        System.out.println("Chọn phim muốn xoá :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x >= 0 && x < list1.size()) {
            System.out.println("Đã xoá phim ở phần tử " + list1.get(x) + "\n");
            list1.remove(x);
            System.out.println("Danh sách phim:");
            for (int i = 0; i < list1.size(); i++) {
                System.out.println(i + ": " + list1.get(i) + "\n");
            }
        } else {
            System.out.println("Phim không hợp lệ !");
        }

    }
}
