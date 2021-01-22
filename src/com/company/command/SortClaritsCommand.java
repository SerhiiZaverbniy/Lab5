package com.company.command;

import com.company.stones.Necklace;

public class SortClaritsCommand implements Command {

    Necklace necklace;

    public SortClaritsCommand(Necklace necklace){
        this.necklace=necklace;
    }

    public void execute(){
        necklace.SortClarits();
    }

}