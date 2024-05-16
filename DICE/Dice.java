package DICE;

public class Dice {
    private int die1, die2;

    public Dice(){
        die1 = 3;
        die2 = 5;
    }

    public void roll(){
        die1 = 2;
        die2 = 3;
    }

    public int getTotal(){
        return die1 + die2;
    }
}
