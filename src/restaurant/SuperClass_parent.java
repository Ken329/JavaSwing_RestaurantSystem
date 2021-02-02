/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author ken_0
 */
public class SuperClass_parent {
    //meal
    public double burger;
    public double sandwich;
    public double fries;
    public double hotdog;
    public double spaghetti;
    
    //drink
    public double cola;
    public double coffee;
    public double sprite;
    public double lemon;
    public double orange;
    
    //cost
    public double meal_cost;
    public double drink_cost;
    public double costOfMd;
    
    public double allAmmount;
    
    public double getAmmount(){
        meal_cost = burger + sandwich + fries + hotdog + spaghetti;
        drink_cost = cola + coffee + sprite + lemon + orange;
        costOfMd = meal_cost + drink_cost;
        allAmmount = costOfMd;
        return allAmmount;
    }
    
    //===================================================================//
    //meal
    public double pburger = 2.50;
    public double psandwich = 5.00;
    public double pfries = 3.50;
    public double photdog = 3.50;
    public double pspaghetti = 6.00;
    
    //drink
    public double pcola = 2.00;
    public double pcoffee = 3.50;
    public double psprite = 2.00;
    public double plemon = 3.00;
    public double porange = 4.00;
    
    public double mytax = 0.90;
    
    public double findtax(double ammount){
        double FindTax = ammount - (ammount * mytax);
        return FindTax;
    }
            
}
