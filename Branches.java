
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;


public class Branches {

public static void main(String[] args) {
			
				HashMap<String,List<String>> c = new HashMap<>();
				c.put("Hyderabad",Arrays.asList(new String[]{"ameerpet","panjaguuta","srnagar"}));
				c.put("Mumbai",Arrays.asList(new String[]{"marine drive","juhu","worli"}));
				c.put("Chennai",Arrays.asList(new String[]{"Tnagar","omr","cmbt"}));
				Set<Entry<String,List<String>>> entries  = c.entrySet();
				List<String> branches = c.get("Hyderabad");
				for(String str : branches)
				{
					System.out.println(str);
				}
				

			}

		


	}


