package application;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Random;

public class Hangman{
   final int  size = 100000;
   public int livesCounter=10;
   public int i=0;
   public String[] words = new String[size];
   public String secret ;
   public String guess;
   public int state=0;
   public char[] charword;
   public File file;
   public int score = 0;
   
   
   public void readfile(String fileName) {
	   try {
	  	 file = new File(fileName);
	  	 if(!file.exists()) {
	  		 System.out.println("not found");
	  	 }
		   FileReader freader = new FileReader(fileName);
		   BufferedReader breader = new BufferedReader(freader);
		   String word= null;
		   while((word= breader.readLine())!= null)
		   {
			   words[i]=word.toLowerCase();
			   i++;
		    }
		   breader.close();
	   }
	   catch(IOException e){
		   System.out.println("cant find file");
	   }
   }
	
	public void selectRandomSecretWord() {
		Random rand = new Random();
		int random = rand.nextInt(i);
		secret = words[random];
		charword = new char[secret.length()];
		for(int k=0;k<secret.length();k++) {
			charword[k]='-';
		}
		guess = new String(charword);
	}

	
	public String guess(Character c){
			int wrong = 0;
			for(int k=0;k<secret.length();k++) {
			if( secret.charAt(k)==Character.toLowerCase(c)) {
			charword[k]=c;	
			wrong =1;
			}
			}
		if(wrong == 0) {
	    System.out.println("Wrong guess\n");
		  livesCounter--;
		}	
		else if(wrong==1) {
			System.out.println("Good guess\n");
		}
		if(livesCounter == 0) {
			System.out.println("you are a loser\n");
			return null;
		}
		 guess = new String(charword);
		 System.out.println(guess);
		 if(guess.equals(secret.toUpperCase())) {
			 state = 1;
			System.out.println(" you're a winner\n");
			return guess;
			
		 }
		 return guess;
		}
	
}
