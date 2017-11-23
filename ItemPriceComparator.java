import java.util.Comparator;

public class ItemPriceComparator implements Comparator<ItemC> {

	public int compare(ItemC i1, ItemC i2)
	{
	
	if(i1.getPrice() > i2.getPrice())
	{
		return 1;
	}else if(i1.getPrice()<i2.getPrice())
	{
		return -1;
	}
	return 0;
	}

}
