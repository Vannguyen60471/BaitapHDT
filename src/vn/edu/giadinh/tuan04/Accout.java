/*
* ngày tạo: Sep 30, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package vn.edu.giadinh.tuan04;

public class Accout {
   int accout_number;
   int accout_balance;
    


     void ShowData(){
        System.out.println("Accout number = " +accout_number);
        System.out.println("Accout balance = " +accout_balance);

    }
    void deposit(int ammount){
        accout_balance += ammount;


    }
    void whitdraw(int ammout){

        accout_balance -= ammout;
        }
      
        
    }
    
