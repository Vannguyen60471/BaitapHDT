/*
* ngày tạo: Nov 04, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.kiemtragiuaky;

public class TestDrive {
    public static void main(String[] args) {
        HocVien sv = new HocVien();
        sv.setDiemMonhoc1(5);
        sv.setDiemMonhoc2(6);
        System.out.println(sv);
        System.out.println("");
        NhanVien nv = new NhanVien();
        nv.setHeSoluong(5);
        System.out.println(nv);
        System.out.println("");
        KhachHang kh = new KhachHang();
        kh.setTenCongty("MT");
        kh.setTriGiaDonHang(20000000);
        System.out.println(kh);
        System.out.println("");
    }

    }
    

