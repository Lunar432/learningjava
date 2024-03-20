package learningjava;

public class CricketRun {

    public static void processCricketData(String[] plNames,int[][] runs){
        String format[] = {"ODI","Test","T20"};
        String playerN[] = new String[plNames.length];
        for(int i=0;i<format.length;i++){
            int maxRuns = 0;
            playerN[i] = "";
            for(int j=0;j<plNames.length;j++){
                if(runs[j][i]>maxRuns){
                    maxRuns = runs[j][i];
                    playerN[i] = plNames[j];
                }
            }
        }
        System.out.println("Overall Performance");
        for(int i=0;i<format.length;i++){
            System.out.println(format[i]+"-  Highest: "+playerN[i]);
        }

    }
    public static void main(String[] args) {
        String playerNames[] = {"Mashrafi","Sakib","Mushfiq","Riyad","Rayan"};
        int runs[][] = {{20,15,8},
                        {10,19,12},
                        {15,14,4},
                        {9,8,20},
                        {14,20,14}};
        processCricketData(playerNames,runs);                
        
    }
    
}
