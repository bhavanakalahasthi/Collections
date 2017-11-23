import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
	HashMap<String,String> callingcodes = new HashMap();
	
	callingcodes.put("USA", "001");
	callingcodes.put("UK", "044");
	callingcodes.put("INDIA", "001");
	
	HashMap<String,String> callingcodes2 = new HashMap<>();
	
	callingcodes2.put("AUS","006");
	callingcodes2.put("Can", "001");
	
	callingcodes.putAll(callingcodes2);
	Set<Entry<String,String>> entries = callingcodes.entrySet();
	for(Entry<String,String> entry : entries)
	{
		System.out.println(entry.getKey()+" :"+entry.getValue());
	}
	
	
	}
	
	
	

}
