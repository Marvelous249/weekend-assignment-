public class SevenSegment{
	public static void display(int number){
	String[][] segment ={ {" __\n|  | \n|__|"},
			      
			      {"   \n  |\n  |"},
			      
			      {" __ \n __|\n|__"},
			      
			      {" __\n __|\n __|"},
			      
			      {"   \n|__|\n   |"},
			      
			      {" __ \n|__ \n __|"},
			      
			      {" __ \n|__ \n|__|"},
			      
			      {" __ \n   |\n   |"},
			      
			      {" __ \n|__|\n|__|"},
			      
			      {" __ \n|__|\n __|"}
};

if(number >= 0 && number <= 9){
String[] value = segment[number];
for(String val : value){
System.out.println(val);
} 			   
}
}
public static void divine(int number){
String divines = String.valueOf(number);
for(int i = 0; i < divines.length(); i++){
String element = String.valueOf(divines.charAt(i));
int diviness = Integer.parseInt(element); 
display(diviness);
}
}	
}

		