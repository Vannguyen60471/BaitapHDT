/*
* ngày tạo: Oct 12, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.lab5;
import java.util.Scanner;
public class Employee {
    String tenNhanVien;
    float luong;
    String boPhanLamViec;
    String ngaySinh;
    Scanner input = new Scanner(System.in);
    void nhanVien(){

    }
    void nhapThongTinNhanVien(){
        System.out.print("Nhập tên nhân viên : ");
        tenNhanVien = input.nextLine();
        System.out.print("Nhập ngày sinh của nhân viên : ");
        ngaySinh = input.nextLine();
        System.out.print("Nhập bộ phận làm việc của nhân viên : ");
        boPhanLamViec = input.nextLine();       
        System.out.print("Nhập lương nhân viên : ");
        luong = input.nextFloat();
    }
    void xuatThongTinNhanVien(){
        System.out.println("Tên nhân viên : " + tenNhanVien);
        System.out.println("Ngày sinh của nhân viên : " + ngaySinh);
        System.out.println("Bộ phận làm việc của nhân viên : " + boPhanLamViec);
        System.out.println("Lương nhân viên : " + luong);
    }
    
}
