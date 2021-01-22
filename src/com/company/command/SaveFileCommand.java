package com.company.command;

import com.company.stones.Necklace;

import java.io.FileNotFoundException;

public class SaveFileCommand  implements Command {

        Necklace necklace;

        public SaveFileCommand(Necklace necklace){
            this.necklace=necklace;
        }

    public void execute(){
        necklace.SaveFile();
    }
}
