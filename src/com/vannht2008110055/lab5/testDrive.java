/*
* ngày tạo: Oct 12, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.lab5;

public class TestDrive {
    public static void main(String[] args) {
        book sach = new book();
        sach.nhapThongTinSach();
        sach.nhapThongTinSach();
        System.out.println("==========================================================");
        nhanVien nhanVien1 = new nhanVien();
        nhanVien1.nhapThongTinNhanVien();
        nhanVien1.nhapThongTinNhanVien();
        System.out.println("==========================================================");
        Car xeMoi = new Car();
        xeMoi.inThongTinXe();
        System.out.println("==========================================================");
        computer mayTinhMoi = new computer("ACER", "Window","i5-10300H",2020,8,2021,19500000);
        mayTinhMoi.inThongTinMayTinh();
        System.out.println("==========================================================");
        Account taiKhoanMoi = new Account("Van", 121212, 50000);
        taiKhoanMoi.deposite(200000);
        taiKhoanMoi.Withdraw(20000);
        taiKhoanMoi.Show_Balance();
        System.out.println("==========================================================");
        Cow boCon = new Cow(2, 15);
        boCon.keu();
        boCon.an();
        System.out.println("==========================================================");
    }
    
}
