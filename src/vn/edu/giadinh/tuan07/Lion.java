/*
* ngày tạo: Oct 21, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package vn.edu.giadinh.tuan07;

public class Lion {
    private String picture;
    private String food;
    private String boundaries;
    private int hunger;
    private int location;

    protected void makeNoise(){
        System.out.println("gruh gruh gruh");
    }
    protected void eat(){
        System.out.println("nhăm nhăm nhăm");

    }
    protected void sleep(){
        System.out.println("khò khò khò");
    }
    protected void roam(){
        System.out.println("Chạy!!!");
    }
    
}
