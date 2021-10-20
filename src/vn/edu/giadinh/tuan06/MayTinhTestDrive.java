/*
* ngày tạo: Oct 14, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package vn.edu.giadinh.tuan06;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        
    
    MayTinh maytinh = new MayTinh();
    int t1 = maytinh.tong(5, 7);
    int t2 = maytinh.tong(5, 7, 9);
    System.out.println("T1"+t1);
    System.out.println("T2: "+t2);
}
}