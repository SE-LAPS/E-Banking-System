/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

/**
 *
 * @author acer
 */
public class Customer {
    String cnic,name;
    double balance;
    int pin;
    String accountNo;
    String card;
    
    public Customer(){
        
    }
    
    public Customer(String cnic, String name, double balance, int pin, String accountNo, String card){
        this.cnic = cnic;
        this.name = name;
        this.balance = balance;
        this.pin = pin;
        this.accountNo = accountNo;
        this.card = card;
        
    }
    
    public boolean withdraw(double amount)
    {
        if(this.balance-amount>=0)
        {
            this.balance-=amount;
            return true;
        }
        
        return false;
    }
    
    
    public void deposit(double amount)
    {

        this.balance+=amount;
    }
    
    public String getCnic(){
        return cnic;
    }
    
    public String getName(){
        return name;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public int getpin(){
        return pin;  
    }
    
    public String getAccountNo(){
        return accountNo;
    }
    
    public String getCard(){
        return card;
    }

    public String toString(){
        return cnic+";"+name+";"+ balance+";"+pin+ ";" + accountNo + ";"+card ;
    }
}

