package org.example;

public class FabricMachine {
    protected String name;
    protected String model;
    protected double grandeCoffeeContainer;
    protected int grandeCoffeContainer;
    protected int usedCoffeeTank;
    public FabricMachine(){
    }
    public FabricMachine(String name, String model, double grandeCoffeeContainer, int grandeCoffeContainer, int usedCoffeeTank){
     this.name=name;
     this.model=model;
     this.grandeCoffeeContainer= grandeCoffeeContainer;
     this.grandeCoffeContainer=grandeCoffeContainer;
     this.usedCoffeeTank=usedCoffeeTank;
    }
    private boolean testModel(){
        if((this.model.contains("300")) || (this.model.contains("900")) || (this.model.contains("1350"))){
            return true;
        }else{
            return false;
        }
    }
}
