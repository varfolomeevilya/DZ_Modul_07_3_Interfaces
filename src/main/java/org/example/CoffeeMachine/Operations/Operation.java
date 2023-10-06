package org.example.CoffeeMachine.Operations;

import org.example.CoffeeMachine.CappuccinoMachine;
import org.example.CoffeeMachine.CompactMachine;
import org.example.CoffeeMachine.FabricMachine;
import org.example.CoffeeMachine.Views.Menu;

public class Operation {
   public Operation(){
   }
   public Menu menu(CappuccinoMachine cappuccinoMachine){
      Menu menu = new Menu();
      menu.setCoffeeMachine( cappuccinoMachine);
      return menu;
   }
   public Menu menu(CompactMachine compactMachine){
      Menu menu= new Menu(compactMachine);
      menu.setCoffeeMachine(compactMachine);
      return menu;
   }
   public Menu menu(FabricMachine fabricMachine){
      Menu menu = new Menu();
      menu.setCoffeeMachine(fabricMachine);
      return menu;
   }
}
