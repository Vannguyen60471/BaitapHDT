/*
* ngày tạo: Sep 30, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package vn.edu.giadinh.tuan04;

public class AccoutTestDrive {
    public static void main(String[] args) {
        Accout accout;
        
        
        accout = new Accout();
        accout.Show_Balance();
        accout.deposit(200);
        accout.ShowData();
        accout.withdraw(110);
        accout.ShowData();
    }
    
}
