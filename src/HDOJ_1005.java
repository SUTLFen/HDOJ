import java.util.Scanner;
/**
 * Created by Fairy_LFEn on 2016/6/15/0015.
 */

class HDOJ_1005 {

    public static void main(String[] strs){
        while(true){
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int num = scanner.nextInt();

            if(a == 0 && b == 0 && num == 0 ) System.exit(0);

            int[] f = new int[50];
            f[1] = f[2] = 1;
            int k = 0;
            for(int i = 3; i <= 49; i++){
                f[i] = (a * f[i -1] + b * f[i - 2]) % 7;

                if(f[i] == f[2] && f[i-1] == f[1]){
                    k = i - 2;
                }
            }
            System.out.println(f[num % k]);
        }
    }
}
