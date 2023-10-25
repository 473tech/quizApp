package com.tolux.beans;

import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class QuestionService 
{
	Question question[]=new Question[15];
	
	
	public void playQuiz() {
		Random random = new Random();
		int id=random.nextInt(1000);
		int score=0;
		String answer;
		
		Scanner scan=new Scanner(System.in);
		

		question[0] = new Question(random.nextInt(1000), "What is the capital of Nigeria?", "A. Akure", "B. Lagos", "C. Abuja", "D. Enugu", "C");
		question[1] = new Question(random.nextInt(1000), "Which planet is known as the Red Planet?", "A. Saturn", "B. Venus", "C. Jupiter", "D. Mars", "D");
		question[2] = new Question(random.nextInt(1000), "Who wrote the play 'Romeo and Juliet'?", "A. William Shakespeare", "B. Charles Dickens", "C. Jane Austen", "D. Mark Twain", "A");
		question[3] = new Question(random.nextInt(1000), "What is the chemical symbol for water?", "A. Fe", "B. CO2", "C. H2O", "D. NaCl", "C");
		question[4] = new Question(random.nextInt(1000), "Which gas do plants absorb from the atmosphere?", "A. Carbon Dioxide (CO2)", "B. Oxygen (O2)", "C. Nitrogen (N2)", "D. Methane (CH4)", "A");
		question[5] = new Question(random.nextInt(1000), "Who is known as the Father of Physics?", "A. Albert Einstein", "B. Isaac Newton", "C. Galileo Galilei", "D. Niels Bohr", "B");
		question[6] = new Question(random.nextInt(1000), "What is the currency of Japan?", "A. Yen", "B. Dollar", "C. Euro", "D. Pound", "A");
		question[7] = new Question(random.nextInt(1000), "Who directed the movie 'Inception'?", "A. Quentin Tarantino", "B. Christopher Nolan", "C. Steven Spielberg", "D. Martin Scorsese", "B");
		question[8] = new Question(random.nextInt(1000), "What is the largest planet in our solar system?", "A. Earth", "B. Jupiter", "C. Venus", "D. Saturn", "B");
		question[9] = new Question(random.nextInt(1000), "What is the boiling point of water?", "A. 0°C", "B. 50°C", "C. 100°C", "D. 212°C", "C");
		question[10] = new Question(random.nextInt(1000), "Who is the author of 'Pride and Prejudice'?", "A. Jane Austen", "B. Emily Bronte", "C. Mark Twain", "D. F. Scott Fitzgerald", "A");
		question[11] = new Question(random.nextInt(1000), "What is the main ingredient of a Margherita pizza?", "A. Pineapple", "B. Pepperoni", "C. Tomato", "D. Chicken", "C");
		question[12] = new Question(random.nextInt(1000), "What is the national bird of the United States?", "A. Bald Eagle", "B. Sparrow", "C. Parrot", "D. Hummingbird", "A");
		question[13] = new Question(random.nextInt(1000), "Which country won the FIFA World Cup in 2018?", "A. Argentina", "B. Brazil", "C. France", "D. Germany", "C");
		question[14] = new Question(random.nextInt(1000), "What is the atomic number of hydrogen?", "A. 1", "B. 2", "C. 3", "D. 4", "A");

		List<Question> playList=new ArrayList<>(Arrays.asList(question));
	
		Collections.shuffle(playList);
		
		int counter=0;
		int questionNumber=1;
		System.out.println("Please answer the following Questions, your Id is "+random.nextInt(1000));
		for(Question elem:playList) {
			System.out.println(questionNumber+". "+elem.getQuestion());
			System.out.println(elem.getA());
			System.out.println(elem.getB());
			System.out.println(elem.getC());
			System.out.println(elem.getD());
			answer=scan.next();
			if(answer.equalsIgnoreCase(elem.getAns())) {
				score++;
			}
			counter++;
			questionNumber++;
			if (counter==5) {
				break;
			}
		}
		System.out.println("Your total Score is "+score);
	}

}
