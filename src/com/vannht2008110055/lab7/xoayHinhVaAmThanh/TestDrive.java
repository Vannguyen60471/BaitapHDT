/*
* ngày tạo: Oct 26, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.lab7.xoayHinhVaAmThanh;
import java.util.Scanner;

public class TestDrive {
    public static void main(String[] args) {
        int luaChon;
        do{
        System.out.print("Xoay các hình : \n1.Vuông\n2.Tròn\n3.Tam Giác\nVà phát ra âm thanh\n4.Amueba\nNhập lựa chọn : ");
        Scanner output = new Scanner(System.in);
        luaChon = output.nextInt();
        System.out.println("================================================");
        switch (luaChon) {
            case 1:
                Square hinh1 = new Square();
                hinh1.getClass();
                System.out.println("================================================");   
                break;
            case 2:
                Circle hinh2 = new Circle();
                hinh2.getClass();
                System.out.println("================================================");
                break;
            case 3:
                Triangle hinh3 = new Triangle();
                hinh3.getClass();
                System.out.println("================================================");
                break;
            case 4:
                Amoeba hinh4 = new Amoeba();
                hinh4.getClass();
                System.out.println("================================================");
                break;
            default:
                break;
        }
    }while(luaChon <= 4);
    }
    }
    

