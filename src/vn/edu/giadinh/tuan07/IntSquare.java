/*
* ngày tạo: Oct 21, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package vn.edu.giadinh.tuan07;

public class IntSquare {
    private int intValue;

    public IntSquare(){}
    public IntSquare (int i){
        intValue = i;
    }
    private int calculateSquare(){
        return intValue * intValue;
    }
    public int getSquare(){
        return calculateSquare();
    }
    
}
