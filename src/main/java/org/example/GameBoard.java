package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class GameBoard {

    private ArrayList<String> c1;
    private ArrayList<String> c2;
    private ArrayList<String> c3;
    private ArrayList<String> c4;
    private ArrayList<String> c5;
    private ArrayList<String> c6;
    private ArrayList<String> c7;

    public GameBoard(){
        c1 = new ArrayList<>(Arrays.asList(" ", " ", " ", " ", " ", " "));
        c2 = new ArrayList<>(Arrays.asList(" ", " ", " ", " ", " ", " "));
        c3 = new ArrayList<>(Arrays.asList(" ", " ", " ", " ", " ", " "));
        c4 = new ArrayList<>(Arrays.asList(" ", " ", " ", " ", " ", " "));
        c5 = new ArrayList<>(Arrays.asList(" ", " ", " ", " ", " ", " "));
        c6 = new ArrayList<>(Arrays.asList(" ", " ", " ", " ", " ", " "));
        c7 = new ArrayList<>(Arrays.asList(" ", " ", " ", " ", " ", " "));
    }

    public void printTheGameboard(){
        System.out.println("  |1|   |2|   |3|   |4|   |5|   |6|   |7|");
        System.out.println("+ --- + --- + --- + --- + --- + --- + --- +");
        for (int i = 0; i < 6; i++){
            System.out.println("|  " + c1.get(i) + "  |  " + c2.get(i) + "  |  "+ c3.get(i) + "  |  " + c4.get(i) + "  |  "+ c5.get(i) + "  |  " + c6.get(i) + "  |  " + c7.get(i)+ "  |");
            System.out.println("+ --- + --- + --- + --- + --- + --- + --- +");
        }
    }

    public void addABrick(int column, String playerBrick){
        switch (column){
            case 1:
                c1 = nextFreeSpace(playerBrick, c1);
                break;
            case 2:
                c2 = nextFreeSpace(playerBrick, c2);
                break;
            case 3:
                c3 = nextFreeSpace(playerBrick, c3);
                break;
            case 4:
                c4 = nextFreeSpace(playerBrick, c4);
                break;
            case 5:
                c5 = nextFreeSpace(playerBrick, c5);
                break;
            case 6:
                c6 = nextFreeSpace(playerBrick, c6);
                break;
            case 7:
                c7 = nextFreeSpace(playerBrick, c7);
                break;
            default:
                break;
        }
    }

    public ArrayList<String> nextFreeSpace(String XorO, ArrayList column){
        if (column.get(5).equals(" ")) {
            column.set(5, XorO);
        }
        else if (column.get(4).equals(" ")){
            column.set(4, XorO);
        }
        else if (column.get(3).equals(" ")){
            column.set(3, XorO);
        }
        else if (column.get(2).equals(" ")){
            column.set(2, XorO);
        }
        else if (column.get(1).equals(" ")){
            column.set(1, XorO);
        }
        else {
            column.set(0, XorO);
        }
        return column;
    }
}
