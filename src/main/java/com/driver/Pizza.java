package com.driver;

public class Pizza {
    private boolean deluxe=false;

    public void setDeluxe(boolean deluxe) {
        this.deluxe = deluxe;
    }

    private int extracheese=0;
    private int extratopping=0;
    private boolean paperbag=false;

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true){
            price=300;
        }
        else{
            price=400;
        }
    }
    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(deluxe==true){
            return;
        }
        // your code goes here
        price+=80;
        extracheese++;
    }

    public void addExtraToppings(){
        // your code goes here
        extratopping++;
        if(deluxe==true){
            return;
        }
        if(isVeg==true){
            price+=70;
        }
        else{
            price+=120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        paperbag=true;
    }

    public String getBill(){
        // your code goes here
        if(isVeg==true) {
            bill="Base Price Of The Pizza: 300\n";
        }
        else{
            bill="Base Price Of The Pizza: 400\n";
        }

        if(deluxe==true){
            extracheese=1;
            extratopping=1;
        }
        bill+="Extra Cheese Added: "+extracheese*80+"\n";

        if(isVeg==true){
            bill+="Extra Toppings Added: "+extratopping*70+"\n";
        }
        else{
            bill+="Extra Toppings Added: "+extratopping*120+"\n";
        }
        if(paperbag==true){
            bill+="Paperbag Added: 20\n";
            price+=20;
        }
        bill+="Total Price: "+getPrice()+"\n";
        return this.bill;
    }
}
