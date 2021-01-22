package com.company.command;

import com.company.stones.Necklace;

public class FindHardnessCommand implements Command {

    Necklace necklace;

    public FindHardnessCommand(Necklace necklace){
        this.necklace=necklace;
    }

    public void execute(){
        necklace.FindHardness();
    }

}