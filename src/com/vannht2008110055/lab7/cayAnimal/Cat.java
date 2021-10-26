/*
* ngày tạo: Oct 26, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.lab7.cayAnimal;

public class Cat extends Pet {
    protected String food = " Pate "; 
    protected void eat(){
        System.out.println("Nhăm Nhăm : " + food);
    }
    protected void makeNoise(){
        System.out.println("Ngao Ngao Ngao....!!!");
    }
    
}
