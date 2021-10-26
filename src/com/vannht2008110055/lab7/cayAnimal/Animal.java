/*
* ngày tạo: Oct 26, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.lab7.cayAnimal;

public class Animal {
    protected String sound;
    protected String food;

    protected void makeNoise(){

        System.out.println("phát ra tiếng kêu " +sound);
    }
    protected void eat(){
        System.out.println("rột rột");
    }
    protected void roam(){
        System.out.println("chạy loanh quanh");
    }
    
}
