package org.example.CoffeeMachine;

import org.example.CoffeeMachine.Operations.Operation;
import org.example.CoffeeMachine.Views.Menu;
import org.example.CoffeeMachine.Views.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Operation operation = new Operation();
        CappuccinoMachine cappuccinoMachine = new CappuccinoMachine(1000, 1000, 1000);
        CompactMachine compactMachine = new CompactMachine( 1000, 1000, 1000, 1000);
        FabricMachine fabricMachine = new FabricMachine(1000, 1000, 1000, 1000,1000);
        Menu menu = new Menu(cappuccinoMachine);
        Menu menu1= new Menu(compactMachine);
        Menu menu2 = new Menu(fabricMachine);
        view.start(menu);
        view.start(menu1);
        view.start(menu2);
    }
}