/*
  write a programe to determine highest player scores
 */

import java.util.Scanner;

public class highest_scores {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String player[] = {"Ako", "Atem", "Yinka","Benson", "Suh", "Amanda"};
        int score[] = {1200, 30,44,59, 112, 200};
        int highestScore = -1;
        String palyerName = "";
        int i;

        int size = score.length;
        for(i = 0; i < size; i++){
            if (score[i] > highestScore){
                highestScore = score[i];
                palyerName = player[i];
            }
        }System.out.printf("The player: %s, has the highest score: %d\n",palyerName,highestScore);
    }
}