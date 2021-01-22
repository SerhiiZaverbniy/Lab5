package com.company.command;

import com.company.stones.Necklace;

public class SortHardnessCommand implements Command {

    Necklace necklace;

    public SortHardnessCommand(Necklace necklace){
        this.necklace=necklace;
    }

    public void execute(){
        necklace.SortHardness();
    }

}