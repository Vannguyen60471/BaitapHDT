/*
* ngày tạo: Oct 26, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.lab7.cayAnimal;

public class Lion extends Wild {
    protected String food = " Thịt "; 
    protected void eat(){
        System.out.println("Nhăm Nhăm : " + food);
    }
    protected void makeNoise(){
        System.out.println("Gram Gram .......!!");
    }
    
}
