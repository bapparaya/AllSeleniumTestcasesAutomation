package oops;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		emp1.empid=1;
		emp1.empname="bappa";
		emp2.empid=1;
		emp2.empname="bappa";
		emp3.empid=2;
		emp3.empname="muthu";
Map<Employee, Integer> map = new HashMap<Employee, Integer>();
map.put(emp1, 1);
map.put(emp2, 2);
map.put(emp3, 3);

System.out.println(map.toString());
for(Entry<Employee, Integer> set:map.entrySet()) {
	System.out.println(set.getKey().empid+" "+set.getKey().empname+" "+set.getValue());

	//System.out.println(set.toString());
}
	}

}
