package learningjava;
import java.lang.Math;
public class matrix9 {
    //grading multiple choice test and show highest score
    public static void main(String[] args) {
        char answers[][] = new char[8][10];
        char keys[] = {'D','B','D','C','C','D','A','E','A','D'};
        for(int i = 0; i < answers.length; i++){
            for(int j = 0; j < answers[i].length; j++){
                answers[i][j] = (char)('A'+ Math.random() *('E'-'A'+1));
            }
        }
        for(int i = 0; i < answers.length; i++){
            for(int j = 0; j < answers[i].length; j++){
                System.out.print(answers[i][j]+" ");
            }
            System.out.println();
        }
        int[] score = new int[answers.length];
        for(int i = 0; i < answers.length; i++){
            for(int j = 0; j < answers[i].length; j++){
               if(keys[j] == answers[i][j]){
                score[i]++;
               }
            }
        }
        int highScore = score[0];
        int studInd = 0;
        for(int i = 0; i < score.length; i++){
            if(score[i]>highScore){
                highScore = score[i];
                studInd = i;
            }
        }
        System.out.println("Highest Score is "+highScore+" by Student "+studInd);
    }
    
}
