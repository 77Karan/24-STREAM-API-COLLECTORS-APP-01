package pack01.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsToList 
{
	//Collecting only the names of Employees in List
	public static void main(String[] args)
	{
		Employee e1 = new Employee("Ramu",23, 2000);
		Employee e2 = new Employee("Ashok",25, 3000);
		Employee e3 = new Employee("Suresh",33, 25000);
		
		List<Employee> employess = Arrays.asList(e1,e2,e3);
		
		List<String> names =employess.stream()
		.map(e -> e.getName())
		.collect(Collectors.toList());
		
		System.out.println(names);
		
		
	}


}
