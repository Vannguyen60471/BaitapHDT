/*
* ngày tạo: Oct 21, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package vn.edu.giadinh.tuan07;

public class Animal {

    protected String sound;
    protected String food;

    protected void makeNoise(){

        System.out.println("phát ra tiếng kêu " +sound);
    }
    protected void eat(){
        System.out.println("rột rột");
    }
}
