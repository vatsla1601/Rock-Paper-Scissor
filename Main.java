package com.company;
import java.util.Scanner;
import java.util.Random;

class firstJavaProgram {
    public static void main(String[]args){
        Random rand = new Random();
        Scanner user_input = new Scanner(System.in);
        int level = 0, pcScore = 0, uScore = 0;
        while(level < 3) {
            System.out.println("(1)Rock\t  (2)Paper\t(3)Scissor");
            System.out.print("Enter your Choice :");
            int uc = user_input.nextByte();
            int cc = rand.nextInt(3)+1;
            System.out.println("You chose "+ uc);
            System.out.println("Computer chose "+ cc);
            if (gameres(uc, cc) == 2){
                pcScore++;
                System.out.println("Computer got it");
            }else if (gameres(uc, cc) == 1){
                uScore++;
                System.out.println("You got it");
            }else if(gameres(uc, cc) == 3){
                System.out.println("This game is draw");
            }
            else{
                System.out.println("Something went wrong.");
                return;
            }
            level++;
        }
        if (pcScore > uScore){
            System.out.println("Computer Win!");
        }else if(pcScore == uScore){
            System.out.println("The Game is Draw");
        }
        else {
            System.out.println("You Win!");
        }


    }

    public static int gameres(int uc, int cc){
        if (uc == 1 && cc == 2){
            return 2;
        }else if (uc == 2 && cc == 1){
            return 1;
        }else if (uc == 3 && cc == 1){
            return 2;
        }else if (uc == 1 && cc == 3){
            return 1;
        }else if (uc == 2 && cc == 3){
            return 2;
        }else if (uc == 3 && cc == 2){
            return 1;
        }else if(uc == cc){
            return 3;
        }
        else{
            return -1;
        }

    }
}
