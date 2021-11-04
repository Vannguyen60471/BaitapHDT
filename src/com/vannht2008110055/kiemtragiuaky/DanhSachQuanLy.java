package com.vannht2008110055.kiemtragiuaky;

import java.util.ArrayList;

public class DanhSachQuanLy {

    ArrayList<String> danhSach = new ArrayList<>();
    public void them(String nv){
        this.danhSach.add(nv);
    }
    public void inDanhSach(){
        System.out.println(danhSach);
    }
    public void them(HocVien sv) {
    }
    public void them(KhachHang kh) {
    }
    public void them(NhanVien nv) {
    }
    
}
