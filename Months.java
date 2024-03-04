class Months
{
public static void main(String[]args)
{
int monthnumber=4;
switch(monthnumber)
{
case 1:System.out.println("Jan");
break;
case 2:System.out.println("Feb");
break;
case 3:System.out.println("Mar");
break;
case 4:System.out.println("Ape");
break;
case 5:System.out.println("May");
break;
case 6:System.out.println("Jun");
break;
case 7:System.out.println("July");
break;
case 8:System.out.println("Aug");
break;
case 9:System.out.println("Sep");
break;
case 10:System.out.println("Oct");
break;
case 11:System.out.println("nov");
break;
case 12:System.out.println("dec");
break;
default:System.out.println("invalid month");
break;
}
if (monthnumber%2==0)
{
System.out.println("month is even");
}
else
{
System.out.println("month is odd");
}
}
}