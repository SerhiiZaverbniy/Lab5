package com.company.command;

import com.company.stones.Necklace;

public class AddNewCommand implements Command {

    Necklace necklace;

    public AddNewCommand(Necklace necklace){
        this.necklace=necklace;
    }

    public void execute(){
        necklace.AddNew();
    }

}
