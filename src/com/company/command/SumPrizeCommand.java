package com.company.command;

import com.company.stones.Necklace;

public class SumPrizeCommand implements Command {

    Necklace necklace;

    public SumPrizeCommand(Necklace necklace){
        this.necklace=necklace;
    }

    public void execute(){
        necklace.SumPrize();
    }

}