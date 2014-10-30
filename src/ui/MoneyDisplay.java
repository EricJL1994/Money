package ui;

import model.Money;

public class MoneyDisplay {

    public void display(Money money) {
        System.out.println("Valor: " + money.getAmount() + money.getCurrency().getSimbol());
    }
    
}
