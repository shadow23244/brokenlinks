package a123;

import java.util.HashMap;
import java.util.Set;

public class sample6 
{
	public static void main(String[] args) 
	{
		String s1 = "My name is kamlesh is name name";
		
		String[] a1 = s1.split(" ");
		
		HashMap<String, Integer> am = new HashMap<>();
		
		for(String a2 : a1)
		{
			Integer a3 = am.get(a2);
			
			if(a3== null)
			{
				am.put(a2, 1);
			}
			else
			{
				am.put(a2, a3+1);
			}
		}
		
		Set<String> keys = am.keySet();
		for(String key : keys)
		{
			System.out.println(key+" :"+am.get(key));
		}
		System.out.println(am);
		
		
	}

}
