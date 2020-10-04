
public class coding_assignment {

	public static void main(String[] args) {

	System.out.println("    -----Int Array-----    ");		
		int[] ages = new int[9]; 
			ages[0] = 3;
			ages[1] = 9;
			ages[2] = 23;
			ages[3] = 64;
			ages[4] = 2;
			ages[5] = 8;
			ages[6] = 28;
			ages[7] = 93;
			ages[8] = 200; 
		
		
	System.out.println("The first element in this array is " + ages[0]);
	System.out.println("The last element in this array is " + ages[ages.length - 1]);
		
		int subtractAges = ages[ages.length-1] - ages[0]; 
		
	System.out.println("The last array minus the first array is " + subtractAges);
		
		int sumOfAges = 0;
		
		for(int i = 0; i < ages.length; i++) {
			
			sumOfAges += ages[i]; 
				
	}
		
	
	System.out.println("The average age in this array is " + (sumOfAges/ages.length));

	System.out.println("    -----String Array-----    ");
	
		String[] names = new String[6];
		
		names[0] = "Tommy";
		names[1] = "Tim";
		names[2] = "Sally";
		names[3] = "Buck";
		names[4] = "Bob";
		names[5] = "Sam"; 
		
		double letterTotal = 0;  
				
		for(int i = 0; i < names.length; i++) {
			letterTotal += names[i].length();
		}
		
	System.out.println("The average amount of letters in each name is " + (letterTotal/6));
		
	System.out.println(names[0].concat(", " + names[1].concat(", " + names [2].concat(", " + names[3].concat(", " + names [4].concat(", "+ names[5].concat(", " + names [5])))))));
		
		
	
		int[] nameLengths = new int[names.length];  
		
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length(); 
			System.out.print(nameLengths[i] + " ");			
		} 	
	System.out.println(" ");
		
		int sumOfLengths = 0;  

		
		for (int i = 0; i < nameLengths.length; i++) {
			sumOfLengths += nameLengths[i]; 
			
		}
		
	System.out.println(sumOfLengths);
	
	System.out.println("    -----Methods Section-----    ");
	
	//public static void repeatedWord (Word and x amount of times)
	
	String firstName = "Caleb"; 
	
	int repeatWord = 3; 
	String repeatedWord = repeatThisWord (firstName, repeatWord); 
	System.out.println(repeatedWord); 
	
	
	String lastName = "Gendron"; 
	
	String fullName = createFullName(firstName, lastName); 
	System.out.println(fullName);
	
	System.out.println(ages.length);
	
	int someNumber = 3;
	int anotherNumber = 4;
	int exponents = toThePowerOf(someNumber, anotherNumber);
	
	System.out.println(exponents);
	
	}
	public static String repeatThisWord(String word, int number) {
		for (int i=0; i<number; i++) {
		word+=word;
		}
		return word;  
	}
	
	public static int toThePowerOf (int x, int y) {
		int num =1; 
		for (int i = 0; i < y; i++) {
			num *= x; 
		}
		return num; 
	}
	
	public static boolean isOverOneHundred(Object[] objects) {
		int sumOfObjects = 0;
		
		for(int i = 0; i < objects.length; i++) {
			
		sumOfObjects += objects[i]; 
				
	}
		if (sumOfObjects > 100) {
			return true;
		}else {
		
		return false; 
	}
	}
	
	public static String createFullName (String x, String y) { 
			return x + " " + y; 
	}
	
//	public static double (object[]) {
//		double a = 0
//		if (i = 0; i < object[].length; i++) {
//			a + object[i]; 
//		}
//		
//		return a / object[].length; 
	}
		

