import java.util.HashMap;
import java.util.Map;
/**
 * Created by Pranith on 4/19/16.
 */
public class mapWc {

    public static void main(String[] args) {

        Map<String, Integer> unique = new HashMap<String, Integer>();

        String s1 = "Corn Maize Rice Corn Maize Wheat Rice Corn Maize";
        String s2[] = s1.split(" ");

        for (int i = 0; i < s2.length;i++)
        {
            String string=s2[i];
            unique.put(string, (unique.get(string)==null?1:(unique.get(string)+1)));

        }
        System.out.println(unique);


    }
}
