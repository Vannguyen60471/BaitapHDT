/*
* ngày tạo: Nov 03, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.lab8;

public class SinhVienKT extends SinhVienGD {
    private Double diemToan ;
    private Double diemSales ; 
   
    SinhVienKT(String hoTen , String nganh ,Double diem , Double diemToan , Double diemSales ){
        super(hoTen, nganh, diem);
     this.diemToan = diemToan;
     this.diemSales = diemSales;
      
    }
 

	public Double getDiem() {
        return super.getDiem();
    }
    protected void xuatdiemnganh(){

        System.out.println("Điểm Toán : "+diemToan);
        System.out.println("Điểm Sales     : "+diemSales);
    
    }
    
}
