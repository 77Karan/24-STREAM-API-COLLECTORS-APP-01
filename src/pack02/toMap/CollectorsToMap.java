package pack02.toMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsToMap 
{
	//Representing the data in Map from Stream 
	//or Representing the data in Map from List
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Sachin","Virat","Kl Rahul","Rishab panth");
		Map<String,Integer> namesMap =list.stream().collect(Collectors.toMap(p->p,p->p.length()));
		System.out.println(namesMap);
	}

}
