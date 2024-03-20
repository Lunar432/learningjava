package learningjava;

public class Studentmarks {

    public static void processExamData(String[] stName,int[][] sc){
        String test[] = {"Quiz","Mid1","Mid2","Final","Prject"};
        String[] stdName = new String[stName.length];
        for(int i=0;i< test.length;i++){
            int maxScore = 0;
            stdName[i] = "";
            for(int j=0;j<stName.length;j++){
                if(sc[j][i]>maxScore){
                    maxScore = sc[j][i];
                    stdName[i] = stName[j];
                }
            }
        }
        System.out.println("Final Exam Result");
        for(int i=0;i<test.length;i++){
            System.out.println(test[i]+"-  Highest: "+stdName[i]);
        }
    }
    public static void main(String[] args) {
        String studentNames[] = {"Dave","Sakib","Eva","Mira","Rayan"};
        int scores[][] = {{20,15,8,14,12},
                          {10,19,12,5,14},
                          {15,14,4,12,12},
                          {9,8,20,6,14},
                          {14,20,14,20,15}};

        processExamData(studentNames,scores);         

    }
    
}
