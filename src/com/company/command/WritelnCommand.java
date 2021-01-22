package com.company.command;

import com.company.stones.Necklace;

public class WritelnCommand implements Command {

    Necklace necklace;

    public WritelnCommand(Necklace necklace){
        this.necklace=necklace;
    }

    public void execute(){
        necklace.Writeln();
    }

}