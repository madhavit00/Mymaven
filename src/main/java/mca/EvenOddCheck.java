package mca;

public class EvenOddCheck
{
public String checkEvenOdd(int num)
{
if(num % 2 == 0)
return "Even";
else
return "Odd";
}

public static void main(String[] args)
{
EvenOddCheck obj = new EvenOddCheck();
int number = 5;
String result = obj.checkEvenOdd(number);
System.out.println("The number " + number + " is " + result);
}
}


