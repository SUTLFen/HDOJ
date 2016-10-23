import java.util.Scanner;

/**
 * Created by Fairy_LFEn on 2016/6/22/0022.
 */



class HDOJ_1008 {
    public static void main(String[] strs){
        Scanner scanner = new Scanner(System.in);
        int lastFloor = 0;
        int totalTime = 0;
        while(true){
            int num = scanner.nextInt();
            if( num == 0) System.exit(0);

            for(int i = 0 ; i < num; i++){
                int curFloor = scanner.nextInt();

                int diff = curFloor - lastFloor;
                if(diff > 0){
                    totalTime += diff * 6 + 5;
                }
                else{
                    totalTime += Math.abs(diff) * 4 + 5;
                }

                lastFloor = curFloor;
            }
            System.out.println(totalTime);

            totalTime = 0;
            lastFloor = 0;
        }
    }
}

