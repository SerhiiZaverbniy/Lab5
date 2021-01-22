package com.company;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import com.company.command.*;
import com.company.stones.Necklace;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        Necklace necklace;
        necklace = new Necklace();
        boolean end=false;

        Scanner reader = new Scanner(System.in);

        Costumer costumer = new Costumer(
                new AddNewCommand(necklace),
                new DeleteCommand(necklace),
                new SumPrizeCommand(necklace),
                new SumWeightCommand(necklace),
                new SortPrizeCommand(necklace),
                new SortWeightCommand(necklace),
                new SortClaritsCommand(necklace),
                new SortHardnessCommand(necklace),
                new FindClaritsCommand(necklace),
                new FindHardnessCommand(necklace),
                new WritelnCommand(necklace),
                new SaveFileCommand(necklace)
        );
        while (end == false) {
            System.out.println("Меню\nДля активації дії вам потрібно ввести команду зліва");
            System.out.println("'/add' - додає камінець до вашого намиста");
            System.out.println("'/delete' - видаляє камінець з вашого намиста");
            System.out.println("'/prize' - виводить загальну ціну намиста");
            System.out.println("'/weight' - виводить загальну вагу намиста");
            System.out.println("'/sort' - сортує частинки намиста за певною ознакою");
            System.out.println("'/search' - шукає частинки намиста за певною ознакою");
            System.out.println("'/print' - виводить усі частинки намиста");
            System.out.println("'/save' - зберігає ваше намисто у файлі");
            System.out.println("'/end' - для завершення програми");
            String command = reader.nextLine();
            if (command.equals("/add")) {
                costumer.addnewRecord();
            } else if (command.equals("/delete")) {
                costumer.deleteRecord();
            } else if (command.equals("/prize")) {
                costumer.sumprizeRecord();
            } else if (command.equals("/weight")) {
                costumer.sumweightRecord();
            } else if (command.equals("/save")) {
                costumer.savefileRecord();
            } else if (command.equals("/sort")) {
                System.out.println("'/prize' - сортує за ціною");
                System.out.println("'/weight' - сортує за вагою");
                System.out.println("'/clarits' - сортує за прозорістю");
                System.out.println("'/hardness' - сортує за твердістю");
                command = reader.nextLine();
                if (command.equals("/prize")) {
                    costumer.sortprizeRecord();
                } else if (command.equals("/weight")) {
                    costumer.sortweightRecord();
                } else if (command.equals("/clarits")) {
                    costumer.sortclaritsRecord();
                } else costumer.sorthardnessRecord();
            } else
                if (command.equals("/search")) {
                    System.out.println("'/clarits' - шукає за коефіцієнтом прозорості");
                    System.out.println("'/hardness' - шукає за значенням твердості");
                command = reader.nextLine();
                if (command.equals("/clarits")) {
                    costumer.findclaritsRecord();
                } else
                    costumer.findhardnessRecord();
                } else if (command.equals("/end")) {
                end=true;
            } else costumer.writelnRecord();
            Stop();
        }
        System.out.println("Завершення програми");
    }
    public static void Stop(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Натисніть Enter щоб продовжити");
        String c=reader.nextLine();
    }
}
