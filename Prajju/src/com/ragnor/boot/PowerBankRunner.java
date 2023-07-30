package com.ragnor.boot;
import com.ragnor.app.PowerBank;

public class PowerBankRunner {
public static void main(String[] args) {
System.out.println("Invoking main in PowerBankRunner");
PowerBank powerbank=new PowerBank();
powerbank.recharge();
powerbank.store();

}
}

