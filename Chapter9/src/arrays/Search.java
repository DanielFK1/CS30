package arrays;

public class Search {
		public static int linear(String[] array, String nametofind) 
		{
			int index = 0;
			
			if (array[index].equals(nametofind)) 
			{
				return(index);
			} 
			
			while ((array[index] != nametofind) && (index < array.length - 1))
			{
				index += 1;
			}
			
			if (array[index].equals(nametofind)) 
			{
				return(index);
			} 
			
			else 
			{
				return(-1);
			}
		}
	}
