package com.company.stones;

public class Stone {
    protected double clarity,weight,prizeForCarat,prize,hardless;
    String name;
    public Stone(){
        clarity=0;
        weight=0;
        prizeForCarat=0;
        prize=0;
        hardless=0;
        name=" ";
    }

    public double Prize(double weight,double prizeForCarat){
        double prize = prizeForCarat*weight;
        return prize;
    }

    public void SetWeight(double weight){
        this.weight=weight;
        this.prize=Prize(this.weight,this.prizeForCarat);
    }

    public double SetW(double weight){
        this.weight=weight;
        this.prize=Prize(this.weight,this.prizeForCarat);
        return prize;
    }

    public void Info(){
       System.out.println(name + " вагою в "+ weight+" карати");
       System.out.println("Ціна камінця "+ prize);
    }

    public void AllInfo(){
        System.out.println(name + " вагою в "+ weight+" карати");
        System.out.println("Ціна камінця "+ prize);
        System.out.println("Параметр прозорості: "+ clarity);
        System.out.println("Твердість за шкалою Мооса: "+ hardless);
    }
}
