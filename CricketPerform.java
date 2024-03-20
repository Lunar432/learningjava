package learningjava;

import java.util.Scanner;

public class CricketPerform {
    public static int MaxCheck(int[] run, int count) {
        int maxRun = 0;
        for (int i = 0; i < count; i++) {
            if (run[i] > maxRun) {
                maxRun = run[i];
            }
        }
        return maxRun;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] runs = new int[11];
        int[] vPoor = new int[11];
        int[] avg = new int[11];
        int[] vGood = new int[11];
        for (int i = 0; i < runs.length; i++) {
            runs[i] = inp.nextInt();
        }
        int vPoorCount = 0, avgCount = 0, vGoodCount = 0;

        for (int i = 0; i < runs.length; i++) {
            if (runs[i] >= 0 && runs[i] <= 30) {
                vPoor[i] = runs[i];
                vPoorCount++;
            } else if (runs[i] >= 31 && runs[i] <= 70) {
                avg[i] = runs[i];
                avgCount++;
            } else if (runs[i] >= 71) {
                vGood[i] = runs[i];
                vGoodCount++;
            }
        }
        int maxvP = MaxCheck(vPoor, vPoorCount);
        int maxavg = MaxCheck(avg,avgCount);
        int maxvG = MaxCheck(vGood, vGoodCount);

        System.out.println("Very Poor Performance: ");
        System.out.println("Total: "+vPoorCount+"  Max Runs: "+maxvP);
        System.out.println();

        System.out.println("Average Performance: ");
        System.out.println("Total: "+avgCount+"  Max Runs:"+maxavg);
        System.out.println();

        System.out.println("Very Good Performance: ");
        System.out.println("Total: "+vGoodCount+"  Max Runs: "+maxvG);
        System.out.println();
        inp.close();

    }

}
