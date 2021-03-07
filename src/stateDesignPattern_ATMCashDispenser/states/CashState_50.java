package stateDesignPattern_ATMCashDispenser.states;

import stateDesignPattern_ATMCashDispenser.State;

public class CashState_50 implements State {
    @Override
    public void dispense(float amount) {

        int numberOfNotes = (int) (amount/50);

        for(int i = 1; i<=numberOfNotes; i++){
            System.out.println(i+ " Dispensing 50 shillings note");
        }
    }
}
