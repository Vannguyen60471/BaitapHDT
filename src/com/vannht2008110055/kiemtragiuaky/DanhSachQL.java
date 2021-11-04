/*
* ngày tạo: Nov 04, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.kiemtragiuaky;

import java.util.ArrayList;

public class DanhSachQL {
    ArrayList<String> danhSach = new ArrayList<>();
    public void them(String nguoi){
        this.danhSach.add(nguoi);
    }
    public void inDanhSach(){
        System.out.println(danhSach);
    }
}
