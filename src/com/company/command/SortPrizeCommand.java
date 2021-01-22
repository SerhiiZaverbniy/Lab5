package com.company.command;

import com.company.stones.Necklace;

public class SortPrizeCommand implements Command {

    Necklace necklace;

    public SortPrizeCommand(Necklace necklace){
        this.necklace=necklace;
    }

    public void execute(){
        necklace.SortPrize();
    }

}