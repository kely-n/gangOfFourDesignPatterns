package stateDesignPattern_ATMCashDispenser.states;

import stateDesignPattern_ATMCashDispenser.State;

public class CashState_100 implements State {
    @Override
    public void dispense(float amount) {

        int numberOfNotes = (int) (amount/100);

        for(int i = 1; i<=numberOfNotes; i++){
            System.out.println(i+ " Dispensing 100 shillings note");
        }
    }
}
