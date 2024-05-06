import java.util.Scanner;
import java.util.ArrayList;
public class StudentGrade{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
String nameSubject;

ArrayList<String> Names = new ArrayList<>();
ArrayList<String> subjects = new ArrayList<>();
ArrayList<Integer> scores = new ArrayList<>();

System.out.print("How many students do you have ");
int studentsNumber = input.nextInt();

System.out.print("How many subjects do they offer ");
int numberOfSubjects = input.nextInt();

System.out.print("Saving >>>>>>>>>>>>>>>>>> \n");
System.out.print("Saving succesfully \n");

int i = 0;
	while(i < numberOfSubjects){
		System.out.println("Name of  subject " + (i + 1) + ": ");
		input.nextLine();
		nameSubject = input.next();
		subjects.add(nameSubject);

	System.out.println("what was the score ");
	int scoreOfStudent = input.nextInt();
	if (scoreOfStudent >= 1 && scoreOfStudent <= 100){  
	scores.add(scoreOfStudent);
	}
	else { System.out.print("Invalid. Enter valid score ");
	--i;
	 }
	i++;
		}


int j = 0;
	while(j < studentsNumber){
		System.out.println("Name of  Student " + (j + 1) + ": ");
		String name = input.next();
		input.nextLine();
		Names.add(name);
	j++;
		}

System.out.print("Saving >>>>>>>>>>>>>>>>>> \n");
System.out.print("Saving succesfully \n");

for(String name : Names){
System.out.printf("%10s", name);

	for (int score : scores) {
		System.out.printf("%10d%n", score);
			}

}


}
}