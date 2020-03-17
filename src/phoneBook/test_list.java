package phoneBook;


	import java.util.*; 

	public class test_list { 
		public static void main(String args[]) 
		{ 

			// Creating an empty ArrayList 
			Collection<String> 
				list = new ArrayList<String>(); 

			// adding data to list
		//	list.add("adadeeads");
			
			// Displaying the list 
			System.out.println("Result: " + list); 

			try { 
				// Appending the null to the list 
				list.add(null); 
			} 
			catch (Exception e) { 
				System.out.println("enter #1-10: " + e); 
				
			} 
			Scanner input = new Scanner(System.in);
	        
	        System.out.println("Enter strings:");
	        String[] a = input.nextLine().split(" ");
		
	        for(int i = 0; i < a.length; i++){
	            System.out.println(a[i]);
	        }
			
			
//			int[] x = new int[10];
//			x=expandArray(x, 11);
//	
//			}
//	
//			//method to expand an array
//			public static int[] expandArray(int[] source, int num)
//			{
//			int[] temp = new int [source.length +1];
//			for (int i=0; i<source.length; i++)
//			{
//			int x = source[i];
//			temp[i] = x;
//			}
//			temp[temp.length-1]=num;
//			return temp;
//	
//			}
		} 
	} 


