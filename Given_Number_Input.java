   class Given_Number_Input
{
public static void main (String[]args)
{
int number=48;
int keyValue =2;

switch(keyValue)
{
case 1:if(number%2==0)
{
System.out.println("number is even");
}
else
{
System.out.println("number is odd");
}
break;
case 2:if(number%7==0 || number%10==7)
{
System.out.println("number is buzz");
}
else
{
System.out.println("number is not buzz");
}
break;
case 3: if(number>=0)
{
System.out.println("number is positive");
}
else
{
System.out.println("number is negative");
}
break;
case 4: if(number>=10 && number<=99)
{
System.out.println("number is digit");
}
else
{
System.out.println("number is not digit");
}
break;
default: System.out.println("out of case");
break;
}
}
}





