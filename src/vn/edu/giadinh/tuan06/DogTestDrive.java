/*
* ngày tạo: Oct 14, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package vn.edu.giadinh.tuan06;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog();
        String type = "Chihuahua";
        dog.age = 1;
        dog.type= type;
        System.out.println("Loại: "+dog.type);
        System.out.println("Tuổi: "+dog.age);
        Dog dog1 = new Dog();
        System.out.println("Loại: "+dog1.type);
        System.out.println("Tuổi: "+dog.age);
        dog1.bark();
        dog1.bark();
    
}
}