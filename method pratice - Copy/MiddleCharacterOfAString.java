public class MiddleCharacterOfAString{
	public static int middleCharacter(int number){
	
	int number.lenght;
	int position;
	int lenght;

	if(number.lenght() % 2 == 0){
	position = number.lenght() / 2 - 1;
	lenght = 2;
}
	else{
	position = number.lenght() / 2;
	lenght = 1;
}
	
	return (position + lenght);	


}
	public static void main(String... arg){

	System.out.print(middleCharacter(350));

}


}