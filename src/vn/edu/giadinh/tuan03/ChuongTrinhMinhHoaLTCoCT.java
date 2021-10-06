/*
* ngày tạo: Sep 30, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package vn.edu.giadinh.tuan03;
import java.util.Scanner;

public class ChuongTrinhMinhHoaLTCoCT {
    public static void main(String[] args) {
        int luaChon = 0;
        /*Scanner sc = new Scanner(System.in);
        luaChon = sc.nextInt();*/
        do
        {
            System.out.println("__________Menu__________");
            System.out.println("1.Gửi tiền");
            System.out.println("2.Rút tiền");
            System.out.println("3.Thoát");
            System.out.println("Mời bạn chọn các option trên!");
            
            Scanner sc = new Scanner(System.in);
            luaChon = sc.nextInt();
            switch(luaChon)
            {
                case 1:rutTien();;break;
                case 2:guiTien();;break;
                case 3:  ;;break;
            }
        }
        while(luaChon != 0);
    }
        static void rutTien(){ 
            int soDu = 2300;
            int soTien = 100;

            soDu = soTien - 50;
                System.out.println("AccountNumber = "+ soTien);
                System.out.println("AccountBalance = "+ soDu);
        }

        public static void Show(int soDu, int soTien){
            System.out.println("Số dư"+soDu);
            System.out.println("Số tiền"+soTien);

        }


        static void guiTien(){
            int soDu = 2300;
            int soTien = 100;

        soDu = soTien + 50;
            System.out.println("AccountNumber = "+ soTien);
            System.out.println("AccountBalance = "+ soDu);
        }

        


        
}





       










