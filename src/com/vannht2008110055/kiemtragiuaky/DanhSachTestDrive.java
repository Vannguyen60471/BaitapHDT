/*
* ngày tạo: Nov 04, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.kiemtragiuaky;

public class DanhSachTestDrive {
    public static void main(String[] args) {
        DanhSachQuanLy ds = new DanhSachQuanLy();
        HocVien sv = new HocVien();
        sv.setDiemMonHoc1(5);
        sv.setDiemMonHoc2(6);
        sv.setHoTen("Nguyễn Văn Sơn");
        sv.setDiaChi("30 Đào Duy Anh");
        sv.setSoLuongHV(20);
        ds.them(sv);
        NhanVien nv = new NhanVien();
        nv.setHeSoLuong(5);
        nv.setHoTen("Ngyễn Hoàng Trọng Văn");
        nv.setDiaChi("29 Đào Duy Anh");
        ds.them(nv);
        KhachHang kh = new KhachHang();
        kh.setTenCongTy("ABC");
        kh.setTriGiaDonHang(500000);
        kh.setHoTen("Nguyễn Văn C");
        kh.setDiaChi("27 Đào Duy Anh");
        ds.them(kh);
        ds.inDanhSach();



    }
    
}
