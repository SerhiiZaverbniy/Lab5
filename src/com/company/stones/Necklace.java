package com.company.stones;

import com.company.stones.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Necklace {
    Stone[]list=new Stone[40];
    double sumprize, sumweight;
    int n;

    public Necklace(){
        sumprize=0;
        sumweight=0;
        n=0;
    }

    public void AddNew() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Додати елемент");
        System.out.println("Для вибору потрібного вам камінця введіть його назву англійською");
        System.out.println("'amber' - бурштин");
        System.out.println("'amethyst' - аметист");
        System.out.println("'aquamarine' - аквамарин");
        System.out.println("'aventure' - авантюрин");
        System.out.println("'diamond' - алмаз");
        System.out.println("'emerald' - смарагд");
        System.out.println("'garnet' - гранат");
        System.out.println("'ruby' - рубін");
        System.out.println("'sapphire' - сапфір");
        System.out.println("'spinel' - шпінель");
        String command = reader.nextLine();
        System.out.println("Введіть вагу камінця в каратах");
        double weight = reader.nextDouble();
        Add(command,weight);
        System.out.println("Елемент успішно додано");
    }

    public void Add(String command,double weight){
        if (command.equals("amber")) {
            list[n] = new Amber();
        } else if (command.equals("amethyst")) {
            list[n] = new Amethyst();
        } else if (command.equals("aquamarine")) {
            list[n] = new Aquamarine();
        } else if (command.equals("aventure")) {
            list[n] = new Aventure();
        } else if (command.equals("diamond")) {
            list[n] = new Diamond();
        } else if (command.equals("emerald")) {
            list[n] = new Emerald();
        } else if (command.equals("garnet")) {
            list[n] = new Garnet();
        } else if (command.equals("ruby")) {
            list[n] = new Ruby();
        } else if (command.equals("sapphire")) {
            list[n] = new Sapphire();
        } else
            list[n] = new Spinel();
        list[n].SetWeight(weight);
        list[n].AllInfo();
        n++;
    }

    public void Delete(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Видалити елемент");
        System.out.println("Введіть номер елемента який потрібно видалити");
        System.out.println("У вашому намисті " +n+" елементів");
        int m=reader.nextInt();
        m--;
        for(int i=0;i<n;i++)
            if(i>m)list[i-1]=list[i];
            n--;
    }

    public void SumPrize(){
        sumprize=0;
        for(int i=0;i<n;i++)
            sumprize+=list[i].prize;
        System.out.println("Сума ціни всіх елементів рівна "+sumprize);
    }

    public double SumP() {
        return sumprize;
    }

    public double SumW() {
        return sumweight;
    }

    public void SumWeight(){
        sumweight=0;
        for(int i=0;i<n;i++)
            sumweight+=list[i].weight;
        System.out.println("Сума ваги всіх елементів рівна "+sumweight);
    }

    public void SortPrize(){
        System.out.println("Сортування за ціною");
            boolean sorted = false;
            Stone temp=new Stone();
        System.out.println("Введіть '+' для сортування за зростанням");
        System.out.println("Введіть '-' для сортування за спаданням");
        Scanner reader = new Scanner(System.in);
        String command = reader.nextLine();
        if (command.equals("+")) {
            while(!sorted) {
                sorted = true;
                for (int i = 0; i < n - 1; i++) {
                    if (list[i].prize > list[i+1].prize) {
                        temp = list[i];
                        list[i] = list[i+1];
                        list[i+1] = temp;
                        sorted = false;
                    }
                }
            }
        }
        else {
            while(!sorted) {
                sorted = true;
                for (int i = 0; i < n - 1; i++) {
                    if (list[i].prize < list[i+1].prize) {
                        temp = list[i];
                        list[i] = list[i+1];
                        list[i+1] = temp;
                        sorted = false;
                    }
                }
            }
        }
        Writeln();

    }

    public void SortWeight() {
        System.out.println("Сортування за вагою");
        boolean sorted = false;
        Stone temp = new Stone();
        System.out.println("Введіть '+' для сортування за зростанням");
        System.out.println("Введіть '-' для сортування за спаданням");
        Scanner reader = new Scanner(System.in);
        String command = reader.nextLine();
        if (command.equals("+")) {
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < n - 1; i++) {
                    if (list[i].weight > list[i + 1].weight) {
                        temp = list[i];
                        list[i] = list[i + 1];
                        list[i + 1] = temp;
                        sorted = false;
                    }
                }
            }
        } else {
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < n - 1; i++) {
                    if (list[i].weight < list[i + 1].weight) {
                        temp = list[i];
                        list[i] = list[i + 1];
                        list[i + 1] = temp;
                        sorted = false;
                    }
                }
            }
        }
        Writeln();
    }

    public void SortClarits(){
        System.out.println("Сортування за прозорістю");
        boolean sorted = false;
        Stone temp = new Stone();
        System.out.println("Введіть '+' для сортування за зростанням");
        System.out.println("Введіть '-' для сортування за спаданням");
        Scanner reader = new Scanner(System.in);
        String command = reader.nextLine();
        if (command.equals("+")) {
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < n - 1; i++) {
                    if (list[i].clarity > list[i + 1].clarity) {
                        temp = list[i];
                        list[i] = list[i + 1];
                        list[i + 1] = temp;
                        sorted = false;
                    }
                }
            }
        } else {
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < n - 1; i++) {
                    if (list[i].clarity < list[i + 1].clarity) {
                        temp = list[i];
                        list[i] = list[i + 1];
                        list[i + 1] = temp;
                        sorted = false;
                    }
                }
            }
        }
        Writeln();
    }

    public void SortHardness(){
        System.out.println("Сортування за твердістю");
        boolean sorted = false;
        Stone temp = new Stone();
        System.out.println("Введіть '+' для сортування за зростанням");
        System.out.println("Введіть '-' для сортування за спаданням");
        Scanner reader = new Scanner(System.in);
        String command = reader.nextLine();
        if (command.equals("+")) {
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < n - 1; i++) {
                    if (list[i].hardless > list[i + 1].hardless) {
                        temp = list[i];
                        list[i] = list[i + 1];
                        list[i + 1] = temp;
                        sorted = false;
                    }
                }
            }
        } else {
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < n - 1; i++) {
                    if (list[i].hardless < list[i + 1].hardless) {
                        temp = list[i];
                        list[i] = list[i + 1];
                        list[i + 1] = temp;
                        sorted = false;
                    }
                }
            }
        }
        Writeln();
    }

    public void FindHardness(){
        System.out.println("Введіть діапазон твердості. Мінімальне 1, максимальне 10");
        Scanner reader = new Scanner(System.in);
        double min=reader.nextDouble();
        double max=reader.nextDouble();
        for(int i=0;i<n;i++){
            if(list[i].hardless<max)
                if(list[i].hardless>min)
                    list[i].AllInfo();
        }
    }

    public void FindClarits(){
        System.out.println("Введіть діапазон твердості. Мінімальне 0, максимальне 1");
        Scanner reader = new Scanner(System.in);
        double min=reader.nextDouble();
        double max=reader.nextDouble();
        for(int i=0;i<n;i++){
            if(list[i].clarity<max)
                if(list[i].clarity>min)
                    list[i].AllInfo();
        }
    }

    public void Writeln(){
        System.out.println("Виведення результатів");
        for(int i=0;i<n;i++)
            list[i].Info();
    }

    public void SaveFile()
    {
        File file = new File("fileName.txt");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(int i=0;i<n;i++) {
            pw.println(list[i].name+" "+list[i].prize+" гривень "+list[i].weight+" карат");
        }
        SumPrize();
        pw.println("Загальна ціна намиста "+ sumprize +" гривень");
        SumWeight();
        pw.println("Загальна вага намиста "+ sumweight +" карат");
        pw.close();
    }
}
