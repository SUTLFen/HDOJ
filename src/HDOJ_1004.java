import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Fairy_LFEn on 2016/6/15/0015.
 */
public class HDOJ_1004 {
    public static void main(String[] strs) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 0){ break;}

            Map<String, Integer> map = new HashMap<String, Integer>();
            for(int i = 0; i < num; i++){
                String colorStr = scanner.nextLine();
                if (map.containsKey(colorStr)) {
                    int count = map.get(colorStr);
                    map.put(colorStr, ++count);
                } else {
                    map.put(colorStr, 1);
                }
            }

            Set<String> keyset = map.keySet();
            int max = 0; String colorResult = null;
            for(String colorTmp : keyset){
                if(map.get(colorTmp) > max){
                    max = map.get(colorTmp);
                    colorResult = colorTmp;
                }
            }
            System.out.println(colorResult);
        }
    }
}
