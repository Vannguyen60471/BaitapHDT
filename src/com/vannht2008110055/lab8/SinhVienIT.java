/*
* ngày tạo: Nov 03, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.lab8;

public class SinhVienIT extends SinhVienGD{
    private Double diemJava ;
    private Double diemCss ; 
    private Double diemHtml ;
    SinhVienIT(String hoTen , String nganh ,Double diem , Double diemJava , Double diemCss , Double diemHtml){
        super(hoTen, nganh, diem);
      this.diemJava = diemJava ;
      this.diemCss = diemCss ;
      this.diemHtml = diemHtml ;
    }
 

	public Double getDiem() {
        return super.getDiem();
    }
    protected void xuatdiemnganh(){

        System.out.println("Điểm Java : "+diemJava);
        System.out.println("Điểm Css  : "+diemCss);
        System.out.println("Điểm Html : "+diemHtml);
    }
}
