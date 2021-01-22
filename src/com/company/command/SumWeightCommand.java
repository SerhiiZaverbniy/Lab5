package com.company.command;

import com.company.stones.Necklace;

public class SumWeightCommand implements Command {

    Necklace necklace;

    public SumWeightCommand(Necklace necklace){
        this.necklace=necklace;
    }

    public void execute(){
        necklace.SumWeight();
    }

}