package com.company.command;

import com.company.stones.Necklace;

public class DeleteCommand implements Command {

    Necklace necklace;

    public DeleteCommand(Necklace necklace){
        this.necklace=necklace;
    }

    public void execute(){
        necklace.Delete();
    }

}