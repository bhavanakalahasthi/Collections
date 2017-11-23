import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class TestSort {

	public static void main(String[] args) {
		
	
	LinkedList<String> lists= new LinkedList<>();
	lists.add("alex");
	lists.add("jon");
	lists.add("chelsey");
	Collections.sort(lists);
	for(String str : lists)
	{
		System.out.println(str);
	}
	
	}
}

