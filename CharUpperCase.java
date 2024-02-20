class CharUpperCase
{
public static void main(String[]args)
{
char v='A';
String result=(v>=65&&v<=90||v>=47&&v<=122)? ((v>=65&&v<=90)?("char is in upper case"):("the given char is in lower case")):("the given char is not Alphabet");
System.out.println(result);

}
}


