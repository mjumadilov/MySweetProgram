package OCApractice;

public class Vowel{ 
private char var;

public static void main(String[] args) { 
char var1 = 'a';
char var2 = var1; 
var2 = 'e';
Vowel obj1 = new Vowel(); 
Vowel obj2 = obj1; 
obj1.var = 'i';// this part might be o
obj2.var = 'o'; // this part might be i

System.out.println(var1 + ", "+ var2);
System.out.println(obj1.var + ", "+ obj2.var); }
}		