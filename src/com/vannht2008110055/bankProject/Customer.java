package com.vannht2008110055.bankProject;
import java.util.Scanner;

public class Customer {
    
        String[] TenKhachHang = new String[100] ;
        String[] DiaChiKhachHang = new String[100] ;
        Customer(){
    
        }
        void getName(){
            Scanner input = new Scanner(System.in);
            System.out.print("Nhập tên khách hàng : ");
            TenKhachHang[1] = input.nextLine();
        }
        void getAddress(){
            Scanner input = new Scanner(System.in);
            System.out.print("Nhập địa chỉ khách hàng : ");
            DiaChiKhachHang[1] = input.nextLine();
        }
        void printInformation(){
            System.out.println("Tên khách hàng : " + TenKhachHang[1]);
            System.out.println("Địa Chỉ : " + DiaChiKhachHang[1]);
        }

}

  