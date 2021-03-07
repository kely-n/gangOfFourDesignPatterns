package stateDesignPattern_ATMCashDispenser;

import stateDesignPattern_ATMCashDispenser.states.*;

import java.util.Scanner;

public class ATMDispenser {

    public static void main(String ... args){
        Dispenser dispenser = new Dispenser();
        Scanner sc = new Scanner(System.in);

        System.out.println("How much would you like to withdraw?");
        float amount = sc.nextFloat();

        System.out.println("would you like 1000, 500, 200, 100 or 50 notes? please select one");
        int noteState = sc.nextInt();

        dispenser.dispense(amount, noteState);

        while(((int) amount % noteState) > 50 ){
            amount = amount%noteState;
            System.out.println("you have a ksh"+amount+"balance: ");
            System.out.println("choose next note to continue dispensing: ");
            noteState = sc.nextInt();
            dispenser.dispense(amount, noteState);
        }

    }
}
