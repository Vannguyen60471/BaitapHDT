/*
* ngày tạo: Sep 30, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package vn.edu.giadinh.tuan04;

public class AccoutTestDrive {
    public static void main(String[] args) {
        Accout accout;
        
        
        accout = new Accout(123, 200);
        accout.Show_Balance();
        accout.deposit(200);
        accout.showData();
        accout.withdraw(110);
        accout.ShowData();
    }
    
}
