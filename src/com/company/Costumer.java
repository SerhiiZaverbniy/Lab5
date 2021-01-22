package com.company;

import com.company.command.Command;

public class Costumer {
    Command addnew;
    Command delete;
    Command sumprize;
    Command sumweight;
    Command sortprize;
    Command sortweight;
    Command sortclarits;
    Command sorthardness;
    Command findclarits;
    Command findhardness;
    Command writeln;
    Command savefile;

    public Costumer(Command addnew,Command delete,Command sumprize,Command sumweight, Command sortprize,Command sortweight,Command sortclarits,Command sorthardness,Command findclarits,Command findhardness,Command writeln,Command savefile){
        this.addnew=addnew;
        this.delete=delete;
        this.sumprize=sumprize;
        this.sumweight=sumweight;
        this.sortprize=sortprize;
        this.sortweight=sortweight;
        this.sortclarits=sortclarits;
        this.sorthardness=sorthardness;
        this.findclarits=findclarits;
        this.findhardness=findhardness;
        this.writeln=writeln;
        this.savefile=savefile;
    }

    public void addnewRecord(){
        addnew.execute();
    }

    public void deleteRecord(){
        delete.execute();
    }

    public void sumprizeRecord(){
        sumprize.execute();
    }

    public void sumweightRecord(){
        sumweight.execute();
    }

    public void sortprizeRecord(){
        sortprize.execute();
    }

    public void sortweightRecord(){
        sortweight.execute();
    }

    public void sortclaritsRecord(){
        sortclarits.execute();
    }

    public void sorthardnessRecord(){
        sorthardness.execute();
    }

    public void findclaritsRecord(){
        findclarits.execute();
    }

    public void findhardnessRecord(){
        findhardness.execute();
    }

    public void writelnRecord(){
        writeln.execute();
    }

    public void savefileRecord(){
        savefile.execute();
    }
}
