package com.driver;

public class Pizza {
    private boolean isextracheese;
    private boolean isextratopping;
    private boolean ispaperbag;
    private int cheese;
    private int topping;
    private boolean isbill;
    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isextracheese=false;
        this.isextratopping=false;
        this.ispaperbag=false;
        this.isbill=false;
        this.bill="";
        // your code goes here
        if(isVeg==true){
            this.price=300;
            this.topping=70;
        }
        else{
            this.price=400;
            this.topping=120;
        }
        this.cheese=80;
        this.bill+="Base Price Of The Pizza: "+this.price+"\n";
    }

    public void addExtraCheese(){
        if(!isextracheese){
            this.price+=cheese;
            isextracheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isextratopping){
            this.price+=topping;
            isextratopping=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!ispaperbag){
            this.price+=20;
            ispaperbag=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isextracheese){
            this.bill+="Extra Cheese Added: "+this.cheese+"\n";
        }
        if(isextratopping){
            this.bill+="Extra Toppings Added: "+this.topping+"\n";
        }
        if(ispaperbag){
            this.bill+="Paperbag Added: "+20+"\n";
        }
        this.bill+="Total Price: "+this.price+"\n";
        this.isbill=true;
        return this.bill;
    }
}
