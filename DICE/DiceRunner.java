package DICE;

public class DiceRunner {
    private int die1, die2;

    public Dice(){
        die1 = 1;
        die2 = 1;
    }

    public void roll(){
        die1 = (int)(6*Math.random()) + 1;
        die2 = (int)(6*Math.random()) + 1;
    }

    
}
