package com.company.command;

import com.company.stones.Necklace;

public class SortWeightCommand implements Command {

    Necklace necklace;

    public SortWeightCommand(Necklace necklace){
        this.necklace=necklace;
    }

    public void execute(){
        necklace.SortWeight();
    }

}