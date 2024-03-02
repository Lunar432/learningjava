package learningjava;
import java.lang.Math;
public class matrix10 {
    //grading multiple choice test showing students in increasing order of their score
    public static void main(String[] args) {
        char keys[] = {'D','B','D','C','C','D','A','E','A','D'};
        char[][] answers = new char[8][10];
        System.out.println("Student answers are: ");
        System.out.println();
        for(int i = 0; i < answers.length; i++){
            for(int j = 0; j < answers[i].length; j++){
                answers[i][j] = (char)('A'+(Math.random()*('E'-'A'+1)));   
                System.out.print(answers[i][j]+" ");      
            }
            System.out.println();
        }
        int[] score = new int[answers.length];
        int[] stdInd = new int[answers.length];
        for(int i = 0; i < answers.length; i++){
            for(int j = 0; j < answers[i].length; j++){
                //stores original student index in array
                stdInd[i] = i;
                //increments score if answer matches
                if(keys[j] == answers[i][j]){
                    score[i]++;
                }
            }
        }
        //sorting scores and student index in increasing order
        for(int i = 0; i < (score.length-1); i++){
            for(int j = 0; j < (score.length-1-i); j++){
                //checks if next value is smaller and swaps
                if(score[j+1]<score[j]){
                    //swapping of scores
                    int tempSc = score[j];
                    score[j] = score[j+1];
                    score[j+1] = tempSc;
                    //swapping of student index
                    int tempStd = stdInd[j];
                    stdInd[j] = stdInd[j+1];
                    stdInd[j+1] = tempStd;
                }
            }
        }
        System.out.println("Student scores are: ");
        System.out.println();
        for(int i = 0; i < score.length; i++){
        System.out.println("Student "+stdInd[i]+" scored "+score[i]);
        }
    }
    
}
