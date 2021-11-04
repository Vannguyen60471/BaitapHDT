/*
* ngày tạo: Nov 04, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.kiemtragiuaky;

public class HocVien extends Nguoi {
    private float diemMonHoc1;
    private float diemMonHoc2;
    private float diemTB;
    private static int soluongHV;


    public void setDiemMonhoc1(float diemMonhoc1) {
        this.diemMonHoc1 = diemMonhoc1;
    }

    public float getDiemMonhoc1() {
        return diemMonHoc1;
    }

    public void setDiemMonhoc2(float diemMonhoc2) {
        this.diemMonHoc2 = diemMonhoc2;
    }
    public float getDiemMonhoc2() {
        return diemMonHoc2;
    }

    public static void setSoLuongHv(int soLuongHv) {
        HocVien.soluongHV = soLuongHv;
    }
    public static int getSoLuongHv() {
        return soluongHV;
    }

    protected float diemTB()
    {
        System.out.println("ĐIỂM TB : "+(diemMonHoc1+diemMonHoc2)/2);
        return diemTB;
    }
    protected void xuat(){
        System.out.println("THÔNG TIN HỌC VIÊN");
        System.out.println("Số lượng Học Viên : "+soluongHV);
        System.out.println("Điểm môn 1 : "+diemMonHoc1);
        System.out.println("Điểm môn 2 : "+diemMonHoc2);
        System.out.println("Điểm TB    : "+(diemMonHoc1+diemMonHoc2)/2);
    }
}
