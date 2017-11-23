import java.util.ArrayList;
import java.util.Collections;

public class TestSortItems {

	public static void main(String[] args) {
		ArrayList<ItemC> items= new ArrayList<>();
		items.add(new ItemC(1,"phone",500));
		items.add(new ItemC(2,"car",600));
		items.add(new ItemC(3,"phone",900));
    
		
		Collections.sort(items);
		for(ItemC item : items)
		{
			System.out.println("id:"+item.getId());
		}
		{
			
		}
	}

}
