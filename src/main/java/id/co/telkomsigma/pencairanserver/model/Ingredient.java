/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.telkomsigma.pencairanserver.model;

/**
 *
 * @author anggi
 */
public class Ingredient {
    public String name;
    public int amount;

    public Ingredient(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public Ingredient() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
