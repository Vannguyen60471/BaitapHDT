/*
* ngày tạo: Oct 21, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package vn.edu.giadinh.tuan07;

public class TestShape {
    public static void main(String[] args) {
        Amoeba amoeba = new Amoeba("file hình amoeba", 5,10);

        amoeba.rotate();
        amoeba.playSound();
    }
}
