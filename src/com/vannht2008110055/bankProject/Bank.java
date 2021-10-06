/*
* ngày tạo: Oct 06, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.bankProject;



public class Bank {
    public static void main(String[] args) {
        Account account = new Account(23032002, 2002);
        account.Withdraw(2002);
        account.deposite(23032002);
        account.Show_Balance();
        System.out.println("<==============================================>");
        Customer account1 = new Customer();
        account1.getName();
        account1.getClass();
        account1.printInformation();
        System.out.println("<==============================================>");
        Emloyee account2 = new Emloyee();
        account2.getName();
        account2.getSalary();
        account2.printInfomationEmployee();
        System.out.println("<==============================================>");
    }
    }
    

