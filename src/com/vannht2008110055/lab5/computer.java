/*
* ngày tạo: Oct 12, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.lab5;

public class computer {
    String hangSanXuat,heDieuHanh,CPU;
        long gia;
        int namSanXuat,ram,namBaoHanh;
        computer(String hSX , String hDH ,String chip ,int nSX,int r ,int nBH, long g){
            hangSanXuat = hSX;
            heDieuHanh = hDH;
            CPU = chip;
            namSanXuat = nSX;
            ram = r;
            namBaoHanh = nBH;
            gia = g ;
        }
        void inThongTinMayTinh(){
            System.out.println("Hãng sản xuất : " + hangSanXuat);
            System.out.println("Năm sản xuất : " + namSanXuat);
            System.out.println("Hệ điều hành : " + heDieuHanh);
            System.out.println("Ram : " + ram + " GB");
            System.out.println("CPU : " + CPU);
            System.out.println("Giá : " + gia);
            System.out.println("Năm bảo hành : " + namBaoHanh);
        }

    
}
