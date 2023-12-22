/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class BankAccount{
    int accountNo;
    String holderName;
    double balance;
    public BankAccount(int accountNo,String holderName,double balance){
        this.accountNo=accountNo;
        this.holderName=holderName;
        this.balance=balance;
    }
    public void balanceChange(int amount){
         balance-=amount;
    }
    public String  toString(){
        return "AccountNo= "+accountNo+" Name= "+holderName+" balance= "+balance;
    }
}
public class JavaApplication22 {

    
    public static void main(String[] args) {
       BankAccount a1=new BankAccount(1,"müşteri1",100);
       BankAccount a2=new BankAccount(2,"müşteri2",500);
       BankAccount a3=new BankAccount(3,"müşteri3",850);
       BankAccount a4=new BankAccount(4,"müşteri4",1000);
       ArrayList<BankAccount> myAccounts = new ArrayList<>(Arrays.asList(a1,a2,a3,a4));
       BankAccount temp;
       Iterator iter = myAccounts.iterator();
       while(iter.hasNext()){
           temp=(BankAccount)iter.next();
           temp.balanceChange(500);
           System.out.println(temp.toString());
       }
       
    }
    
}
