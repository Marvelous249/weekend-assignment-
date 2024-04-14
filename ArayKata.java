public class ArayKata {

 public static int ArraySum(int[] numbers) {

        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total;
    }


public static int maximumIn (int[]  numbers){

int maximum = numbers[0];

for(int i=0; i < numbers.length; i++){

if (i < numbers[i])

max = numbers[i];
}

return maximum;
}

public static int minimumIn (int[] numbers){

int minimum = numbers[0];

for (int i = 0; i < numbers.length; i++){

if (i > numbers[i])

min = numbers[i];
}
return minimum;
} 


public static int sumOfEvenNumbersIn (int[] numbers){

int sumOfEvenNumbers = 0;
for (int i = 0; i < numbers.length; i++){
if (numbers[i]  % 2 == 0) 
sunOfEvenNumbers += numbers[i];
}
return sumOfEvenNumbers;
}

public static int sumOfOddNumbersIn ( int [] numbers){

int sumOfOddNumber = 0;

for (int i = 0; i < numbers.length; i ++){
if (numbers[i] % 2 != 0)
sumofOddNumber += numbers[i];
}
return sumOfOddNumber;
}


public static int[] maximumAndMinimumOf(int[] numbers){

int[] total = new int [2];

int minimum = numbers[0];

for (int i = 0; i < numbers.length; i++){

if (i > numbers[i])

minimum = numbers[i];
}
total [0] = minimum;


int maximum = numbers[0];

for(int i=0; i < numbers.length; i++){

if (i < numbers[i])

maximum = numbers[i];
}

total[1] = maximum;

return total;

} 

public static int noOfOddNumbersIn ( int [] numbers){

int noOfOddNumber = 0;

for (int i = 0; i < numbers.length; i ++){
if (numbers[i] % 2 != 0)
noOfOddNumber ++;
}
return noOfOddNumber;
}


public static int noOfEvenNumbersIn ( int [] numbers){

int noOfEvenNumbersIn = 0;

for (int i = 0; i < numbers.length; i ++){
if (numbers[i] % 2 == 0)
sumOfEvenNumbersIn ++;
}
return noOfEvenNumbersIn;
}
}






