//Fig. 5.5: Sum.java
//Summing integers with the for statement

public class Sum
{
public static void main(String[] args)
{
int total = 0;
//total even intergers from 2 through 20
for (int number = 2; number <= 20; number += 2)
total += number;

System.out.printf("Sum: %d\n", total);
}
}//end class Sum

