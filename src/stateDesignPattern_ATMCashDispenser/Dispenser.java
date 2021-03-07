package stateDesignPattern_ATMCashDispenser;

import stateDesignPattern_ATMCashDispenser.states.*;

import java.util.InputMismatchException;

/* this is the context class */

public class Dispenser
{
    private State state;

    public Dispenser() {
    }

    /**
        * Set the current state.
        * Normally only called by classes implementing the State interface.
        * @param newState the new state of this context
     */
    public void setState(State newState) {
        this.state = newState;
    }

    public void dispense(float amount, int noteState){
        /* setting state of note to withdraw */
        switch (noteState){
            case 1000:
                this.setState(new CashState_1000());
                break;
            case 500:
                this.setState(new CashState_500());
                break;
            case 200:
                this.setState(new CashState_200());
                break;
            case 100:
                this.setState(new CashState_100());
                break;
            case 50:
                this.setState(new CashState_50());
                break;
            default:
                System.out.println("check that you have correct input");
                throw new InputMismatchException();
        }

        this.state.dispense(amount);
    }
}
