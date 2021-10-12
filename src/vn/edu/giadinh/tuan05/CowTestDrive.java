/*
* ngày tạo: Oct 07, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package vn.edu.giadinh.tuan05;

public class CowTestDrive {
    public static void main(String[] args) {
        Cow cow;
        cow = new Cow();
        cow = new Cow(3.0);
        System.out.println("cân nặng "+ cow.weight);
    }
    
}
