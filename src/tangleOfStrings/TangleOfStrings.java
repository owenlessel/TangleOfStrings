package tangleOfStrings;

import java.util.Scanner;

public class TangleOfStrings {
public static String phrase;	
public static String phrase2;
public static String phrase3;
public static String phrase4;
public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter(System.lineSeparator());
		myPassword(sc);
		menu(sc);
		// END OF THE PASSWORD CODE
		
	
	
	}
public static void myPassword(Scanner sc) { 
	System.out.println("Enter in your password");
	String pass=sc.next();
	if (pass.equals("me")) {
		System.out.println("access granted");
	}		else { 
				System.out.println("access denied");
				myPassword(sc);
	
	} 
}




public static void menu(Scanner sc) {
System.out.println("1-backwards");
System.out.println("2-list of words");
System.out.println("3-print vowels");
System.out.println("4-inverse character case");
System.out.println("5-compare to a second string for content equality");
System.out.println("6-replace a word in your string with a new string");
System.out.println("7-quit");
System.out.println("Enter your phrase");
phrase=sc.next();
System.out.print("Please enter your choice: ");

int choice=sc.nextInt();
	if(choice==1) {	
		 phraseReverse(phrase);
	}
	
	if(choice==2) {
		System.out.println("What Character Length?");
		int length=sc.nextInt();
		wordlist(phrase,length);
	}
	if (choice==3) {
		vowels(phrase);
	}
	if (choice==4) {
		caseInverse(phrase);
	}
	if (choice==5) {
		System.out.println("Enter your second phrase");
		phrase2=sc.next();
		isMatch(phrase,phrase2);
	}
	if (choice==6) {
		System.out.println("Enter the word you want to find");
		phrase3=sc.next();
		System.out.println("Enter the word you want to replace it with");
		phrase4=sc.next();
		findReplace(phrase3,phrase4);
	}
	if (choice==7) {
		quit();
	}
}




public static void  phraseReverse(String str){
	str=str+' ';
	for(int i=phrase.length();i>0;i--){
	System.out.print(phrase.substring(i-1,i));


}
}
public static void wordlist(String phrase,int wordsize) {	
String word="";
phrase=phrase+' ';

for(int i=0;i<phrase.length();i++) {
	if(phrase.charAt(i)!=' ') {
		word=word+phrase.charAt(i);
	
	
	}
	else {
		if(word.length()==wordsize) {
			System.out.print(word);
		}
		word="";
	}


}
}

public static void vowels(String phrase) {
 int count=0;
phrase=phrase+" ";
 	for(int i=0; i<phrase.length(); i++) {
       if(phrase.charAt(i) == 'a'|| phrase.charAt(i) == 'e'|| phrase.charAt(i) == 'i' || phrase.charAt(i) == 'o' || phrase.charAt(i) == 'u') {
    	   count ++;
       }
       
 	}
 	System.out.print("Number of vowels: "+count);
}
public static void caseInverse(String phrase) {
    StringBuilder phraseSB = new StringBuilder(phrase);
    for(int i = 0; i < phrase.length(); i++) {
        if(phrase.charAt(i) > 64 && phrase.charAt(i) < 91)
            phraseSB.setCharAt(i, (char)(phrase.charAt(i) + 32));
        else if(phrase.charAt(i) > 96 && phrase.charAt(i) < 123)
            phraseSB.setCharAt(i, (char)(phrase.charAt(i) - 32));
    }
    System.out.print(phraseSB);
}
public static void isMatch(String phrase,String phrase2) {
	if(phrase.equals(phrase2)) {
		System.out.print("True");
}
	else {
		System.out.print("False");
	
	
	
}
}
public static void findReplace(String phrase3,String phrase4) {
	String replaceString=phrase.replace(phrase3,phrase4);
	System.out.print("Your New String is: ");
	System.out.print(replaceString);
	
	
	
}
public static void quit() {
	System.out.print("Thanks for using the program!");
}



}	
	
	
	


