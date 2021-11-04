/*
* ngày tạo: Nov 04, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.kiemtragiuaky;

public class DanhSachTestDrive {
    public static void main(String[] args) {
        DanhSachQuanLy ds = new DanhSachQuanLy();
        HocVien sv = new HocVien();
        sv.setDiemMonhoc1(5);
        sv.setDiemMonhoc2(6);
        sv.setHoTen("Nguyễn Văn A");
        sv.setDiaChi("1 Nguyễn Văn Mại , p4 , Q.Tân Bình");
        sv.setSoLuongHv(20);
        ds.them(sv);
        NhanVien nv = new NhanVien();
        nv.setHeSoluong(5);
        nv.setHoTen("Nguyễn Văn B");
        nv.setDiaChi("2 Nguyễn Văn Mại , p4 , Q.Tân Bình");
        ds.them(nv);
        KhachHang kh = new KhachHang();
        kh.setTenCongty("ABC");
        kh.setTriGiaDonHang(500000);
        kh.setHoTen("Nguyễn Văn C");
        kh.setDiaChi("3 Nguyễn Văn Mại , p4 , Q.Tân Bình");
        ds.them(kh);
        ds.inDanhSach();



    }

    }
    

