package learningjava;
import java.lang.Math;
public class HA2_prob5 {
    //grading multiple choice test
    public static void main(String[] args) {
        //initialize and declare key answers count and index arrays
        int key[] = {'D','B','D','C','C','D','A','E','A','D'};
        char[][] answers = new char[8][10];
        int[] correctCount = new int[8];
        int[] stdIndex = new int[8];
        //print student answers
        System.out.println("Student answers are: ");
        for(int i=0;i<answers.length;i++){
            for(int j=0;j<answers[i].length;j++){
                //generate random characters for student answers and print them
                answers[i][j] = (char)('A'+ Math.random() * ('E'-'A'+1));
                System.out.print(answers[i][j]+"  ");
            }
                System.out.println();
        }
        //loop runs to count correct answers of students
        for(int i=0;i<answers.length;i++){
            for(int j=0;j<answers[i].length;j++){
                if(key[i] ==answers[i][j]){
                    //count increments for match of answers
                    correctCount[i]++;
                    stdIndex[i]= i;
                }
            }
        }
        //sort score from highest to lowest in array
        for(int i=0;i<(correctCount.length-1);i++){
            for(int j=0;j<(correctCount.length-i-1);j++)
            if(correctCount[j+1]>correctCount[j]){
                //swapped scores
                int tempCount = correctCount[j];
                correctCount[j] = correctCount[j+1];
                correctCount[j+1] = tempCount;
                //swapped student index accordingly
                int tempInd = stdIndex[j];
                stdIndex[j] = stdIndex[j+1];
                stdIndex[j+1] = tempInd;
            }
        }
        System.out.println();
        //print result of students from highest to lowest
        System.out.println("Student test scores from highest to lowest are: ");
        for(int i=0;i<correctCount.length;i++){
            //scores with student index is printed
            System.out.println("Student "+stdIndex[i]+" scores "+correctCount[i]);
        }

    }

}
