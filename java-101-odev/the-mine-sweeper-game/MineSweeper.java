package com.huseyinuslu.java101;


import java.util.*;


public class MineSweeper {

    private  int stepNumber = 0;
    private  int mineNumbers;
    private  String[][] ARENA;
    private  String[][] HISTORY;
    private int dif;

    public MineSweeper(){
        Scanner input = new Scanner(System.in);
        System.out.println("Zorluk seviyesi seçiniz(0-5) :");

        dif = input.nextInt();
        ARENA = new String[dif + 3][dif + 3];
        HISTORY = new String[ARENA.length][ARENA.length];
        mineNumbers = (dif * 2) + 1;
        setUpMap();
        cleanHistory();

    }

    private void setUpMap(){
        while (mineNumbers > 0){
            int y = new Random().nextInt(ARENA.length);
            int x = new Random().nextInt(ARENA.length);
            while(ARENA[y][x] == "*"){
                y = new Random().nextInt(ARENA.length);
                x = new Random().nextInt(ARENA.length);
            }
            ARENA[y][x] = "*";
            mineNumbers--;
        }
        mineNumbers = dif + 1;

        for(int i = 0,y = 0;i< ARENA.length;i++){
            while(y < ARENA.length){
                ARENA[i][y] = ARENA[i][y] == "*" ? "*" : ".";
                y++;
            }
            y=0;
        }
    }

    private void cleanHistory(){
        for(int i = 0,y = 0;i< HISTORY.length;i++){
            while(y<HISTORY.length){
                HISTORY[i][y] = "-";
                y++;
            }
            y=0;
        }
    }

    public void run(){
        printCurrentMap();
        System.out.print("y: ");
        Scanner input = new Scanner(System.in);
        int y = input.nextInt()
                ,x = 0;
        System.out.print("x: ");
        x = input.nextInt();
        while(!correcterLoop(y,x)){
            System.out.print("y: ");
            y = input.nextInt();
            System.out.print("x: ");
            x = input.nextInt();
        }
        stepDown(y,x);
        if(isGameOver(y,x)){
            //finish. show map
        }else{
            do{
                printCurrentMap();
                System.out.print("y: ");
                y = new Scanner(System.in).nextInt();
                System.out.print("x: ");
                x = new Scanner(System.in).nextInt();
                while(!correcterLoop(y,x)){
                    System.out.print("y: ");
                    y = input.nextInt();
                    System.out.print("x: ");
                    x = input.nextInt();
                }
                stepDown(y,x);
            }while (!isGameOver(y,x) && stepNumber <= (ARENA.length * ARENA.length) - mineNumbers);
        }

    }

    private  boolean correcterLoop(int y,int x){
        if(y >= ARENA.length || x >= ARENA.length || y<0 && x<0){
            System.out.println("Yanlış parametre girdiniz. Tekrar deneyiniz.");
            return false;
        }else{
            System.out.println("" + x + " ve " + y + " kordinatı işaretlendi.");
            return true;
        }
    }

    private boolean isGameOver(int y,int x){
        if(ARENA[y][x] == "*"){
            printUnseenableMap();
            System.out.println("VE BOMBA PATLAR..");
            stepNumber = 0;
            setUpMap();
            cleanHistory();
            return true;
        }else if(stepNumber >= (ARENA.length * ARENA.length) - mineNumbers){
            printUnseenableMap();
            System.out.println("VE OYUNU KAZANDIN, BRAVOOO!!");
            setUpMap();
            cleanHistory();
            stepNumber = 0;
            return true;
        }
       return false;
    }

    private void printCurrentMap(){
        System.out.println("___________________");
        System.out.println("   0 1 2 3 4 5 6 7 ");
        for(int i = 0,y = 0;i<HISTORY.length;i++){
            System.out.print(" " + i + " ");
            while (y< HISTORY.length){
                System.out.print("" + HISTORY[i][y] + " ");
                y++;
            }
            y=0;
            System.out.print("\n");
        }
    }

    private void printUnseenableMap(){
        System.out.println("___________________");
        System.out.println("   0 1 2 3 4 5 6 7");
        for(int i = 0,y = 0;i<HISTORY.length;i++){
            System.out.print(" " + i + " ");
            while (y< HISTORY.length){
                System.out.print("" + ARENA[i][y] + " ");
                y++;
            }
            y=0;
            System.out.print("\n");
        }

    }
    private int isThereAnyMinesAround(int y,int x) {
        int amountMines = 0;

        if(x == 0){
            if(y == 0){
                //en sol üst
                amountMines = ARENA[0][1] == "*" ? amountMines + 1 : amountMines;
                amountMines = ARENA[1][0] == "*" ? amountMines + 1 : amountMines;
                amountMines = ARENA[1][1] == "*" ? amountMines + 1 : amountMines;

            }else if(y == ARENA.length - 1){
                //en sol alt
                amountMines = ARENA[ARENA.length - 2][0] == "*" ? amountMines + 1 : amountMines;
                amountMines = ARENA[ARENA.length - 2][1] == "*" ? amountMines + 1 : amountMines;
                amountMines = ARENA[ARENA.length - 1][1] == "*" ? amountMines + 1 : amountMines;
                //(ARENA.length - 2) - 0, (ARENA.length - 2) - 1, (ARENA.length - 1) - 1
            }else{
                //köşesiz en sol
                //x != -1 // y-1,0 ,y-1 - 1 , y - 1, y + 1
                amountMines = ARENA[y-1][x] == "*" ? amountMines + 1 : amountMines;
                amountMines = ARENA[y-1][x + 1] == "*" ? amountMines + 1 : amountMines;
                amountMines = ARENA[y][x + 1] == "*" ? amountMines + 1 : amountMines;
                amountMines = ARENA[y+1][x + 1] == "*" ? amountMines + 1 : amountMines;
                amountMines = ARENA[y+1][x] == "*" ? amountMines + 1 : amountMines;
            }
        }else if(x == ARENA.length - 1){
            if(y == 0){
                //en sağ üst
                amountMines = ARENA[0][ARENA.length - 2] == "*" ? amountMines + 1 : amountMines;
                amountMines = ARENA[1][ARENA.length - 1] == "*" ? amountMines + 1 : amountMines;
                amountMines = ARENA[1][ARENA.length - 2] == "*" ? amountMines + 1 : amountMines;
            }else if(y == ARENA.length - 1){
                //en sağ alt
                amountMines = ARENA[ARENA.length - 1][ARENA.length - 2] == "*" ? amountMines + 1 : amountMines;
                amountMines = ARENA[ARENA.length - 2][ARENA.length - 2] == "*" ? amountMines + 1 : amountMines;
                amountMines = ARENA[ARENA.length - 2][ARENA.length - 1] == "*" ? amountMines + 1 : amountMines;
            }else{
                //köşesiz sağ taraf
                amountMines = ARENA[y-1][ARENA.length - 1] == "*" ? amountMines + 1 : amountMines;
                amountMines = ARENA[y-1][ARENA.length - 2] == "*" ? amountMines + 1 : amountMines;
                amountMines = ARENA[y][ARENA.length - 2] == "*" ? amountMines + 1 : amountMines;
                amountMines = ARENA[y+1][ARENA.length - 2] == "*" ? amountMines + 1 : amountMines;
                amountMines = ARENA[y+1][ARENA.length - 1] == "*" ? amountMines + 1 : amountMines;
            }
        }else {
            if(y == 0){
                //köşesiz en üst
                amountMines = ARENA[0][x-1] == "*" ? amountMines + 1 : amountMines;
                amountMines = ARENA[1][x-1] == "*" ? amountMines + 1 : amountMines;
                amountMines = ARENA[1][x] == "*" ? amountMines + 1 : amountMines;
                amountMines = ARENA[1][x+1] == "*" ? amountMines + 1 : amountMines;
                amountMines = ARENA[0][x+1] == "*" ? amountMines + 1 : amountMines;

            }else if(y == ARENA.length - 1){
                //köşesiz en alt
                amountMines = ARENA[ARENA.length - 1][x-1] == "*" ? amountMines + 1 : amountMines;
                amountMines = ARENA[ARENA.length-2][x-1] == "*" ? amountMines + 1 : amountMines;
                amountMines = ARENA[ARENA.length-2][x] == "*" ? amountMines + 1 : amountMines;
                amountMines = ARENA[ARENA.length-2][x+1] == "*" ? amountMines + 1 : amountMines;
                amountMines = ARENA[ARENA.length - 1][x+1] == "*" ? amountMines + 1 : amountMines;
            }else{
                //tam aksiyon kısımlar
                for(int i = y - 1,j = x - 1;i<=y + 1;i++){
                    while(j<=x + 1){
                        if(i == y && j == x){ //here I'm
                            j++; // 1 , 2 , 3 || 0 1 2
                            continue;
                        }
                        amountMines = ARENA[i][j] == "*" ? amountMines + 1: amountMines;
                        j++;
                    }
                    j = x - 1;
                }
            }
        }
        return amountMines;
    }

    private void stepDown(int y,int x){
        int mines = isThereAnyMinesAround(y,x);
        if(mines == 0){
            HISTORY[y][x] = ARENA[y][x];
        }else{
            HISTORY[y][x] = String.valueOf(mines);
        }
        stepNumber++;
    }
}