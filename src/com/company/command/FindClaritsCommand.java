package com.company.command;

import com.company.stones.Necklace;

public class FindClaritsCommand implements Command {

    Necklace necklace;

    public FindClaritsCommand(Necklace necklace){
        this.necklace=necklace;
    }

    public void execute(){
        necklace.FindClarits();
    }

}