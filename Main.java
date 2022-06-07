package main;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
	private static boolean IsPracticeMode;
	private int numProblems;
	private String problemType;
	private int Answer;
	private int UserAnswer;
	private ArrayList<String> Problems;
	private ArrayList<Integer> ProblemAnswers;
	private ArrayList<Integer> UserAnswers;
	public static void main(String[] args0) {
		Msg.msg("Welcome to Math Generator");
		askShit();
	}
	public static void generateTestProblems() {
		boolean run = true;
		String[] options= {"Addition", "Subtraction", "Multiplication", "division"};
		Msg.msg("This Is Test Mode.\n Here you are given a chosen amount of problems to practice.\n Input \"Exit\" whenever you feel you are ready to leave and take on the test.\n");
		while(run) {
			int i = Msg.opt(options, "What kind of problem would you like to practice.\n", "MathGenerator");
			if(i == 0) {
				String str = Msg.in("how many problems would you like to do");
				int loop = Integer.parseInt(str);
				boolean loop1 = true;
				for(int j = 0; j < loop; j++) {
					int num = 1;
					int a = (int) (Math.random()*101);
					int b = (int) (Math.random()*101);
					int c = 0;
					boolean loop2 = true;
					while (loop2) {
						if(a+b < 101) {
							c = a+b;
							loop2 = false;
						}
					}
					String s = Msg.in("question" + Integer.toString(num) + "\n\n" + Integer.toString(a) + " + " + Integer.toString(b) + " = \n\nEnter your answer below");
					if (s.equalsIgnoreCase("Exit")){	
						run = false;
						loop1 = false;
					}
				}
			}
			if(i == 1) {
				boolean loop3 = true;
				while(loop3) {
					int num = 1;
					int a = (int) (Math.random()*101);
					int b = (int) (Math.random()*101);
					int c = 0;
					boolean loop4 = true;
					while (loop4) {
						if(a-b > 0) {
							c = a-b;
							loop4 = false;
						}
					}
					String s = Msg.in("question" + Integer.toString(num) + "\n\n" + Integer.toString(a) + " + " + Integer.toString(b) + " = \n\nEnter your answer below");
					if (s.equalsIgnoreCase("Exit")){
						loop3 = false;
						run = false;
					}
					else if(s.equals(Integer.toString(c))) {
						Msg.msg("Correct!");
					}
					else {
						Msg.msg("Inorrect ):");
					}
				}
			}
			if(i == 2) {
				boolean loop5 = true;
				while(loop5) {
					int num = 1;
					int a = (int) (Math.random()*101);
					int b = (int) (Math.random()*101);
					int c = 0;
					boolean loop6 = true;
					while (loop6) {
						if(a*b < 101) {
							c = a*b;
							loop6 = false;
						}
					}
					String s = Msg.in("question" + Integer.toString(num) + "\n\n" + Integer.toString(a) + " + " + Integer.toString(b) + " = \n\nEnter your answer below");
					if (s.equalsIgnoreCase("Exit")){
						loop5 = false;
						run = false;
					}
					else if(s.equals(Integer.toString(c))) {
						Msg.msg("Correct!");
					}
					else {
						Msg.msg("Incorrect ):");
					}
				}
			}
			if(i == 3) {
				boolean loop7 = true;
				while(loop7) {
					int num = 1;
					int a = (int) (Math.random()*101);
					int b = (int) (Math.random()*101*a);
					int c = 0;
					boolean loop8 = true;
					while (loop8) {
						if(b/a < 101) {
							c = b/a;
							loop8 = false;
						}
					}
					String s = Msg.in("question" + Integer.toString(num) + "\n\n" + Integer.toString(b) + " + " + Integer.toString(a) + " = \n\nEnter your answer below");
					if (s.equalsIgnoreCase("Exit")){
						loop7 = false;
						run = false;
					}
					else if(s.equals(Integer.toString(c))) {
						Msg.msg("Correct!");
					}
					else {
						Msg.msg("Incorrect ):\n\nThe correct answer is: " + Integer.toString(c) );
					}
				}
			}
		}
	}
	public static void generatePracticeProblems() {
		boolean run = true;
		String[] options= {"Addition", "Subtraction", "Multiplication", "division"};
		Msg.msg("This Is Practice Mode.\n Here you are given an infinite amount of problems to practice.\n Input \"Exit\" whenever you feel you are ready to leave and take on the test.\n");
		while(run) {
			int i = Msg.opt(options, "What kind of problem would you like to practice.\n", "MathGenerator");
			if(i == 0) {
				boolean loop1 = true;
				while(loop1) {
					int num = 1;
					int a = (int) (Math.random()*101);
					int b = (int) (Math.random()*101);
					int c = 0;
					boolean loop2 = true;
					while (loop2) {
						if(a+b < 101) {
							c = a+b;
							loop2 = false;
						}
					}
					String s = Msg.in("question " + Integer.toString(num) + "\n\n" + Integer.toString(a) + " + " + Integer.toString(b) + " = \n\nEnter your answer below");
					if (s.equalsIgnoreCase("Exit")){
						loop1 = false;
						run = false;
					}
					else if(s.equals(Integer.toString(c))) {
						Msg.msg("Correct!");
					}
					else {
						Msg.msg("Inorrect ):");
					}
				}
			}
			else if(i == 1) {
				boolean loop3 = true;
				while(loop3) {
					int num = 1;
					int a = (int) (Math.random()*101);
					int b = (int) (Math.random()*101);
					int c = 0;
					boolean loop4 = true;
					while (loop4) {
						if(a-b > 0) {
							c = a-b;
							loop4 = false;
						}
					}
					String s = Msg.in("question " + Integer.toString(num) + "\n\n" + Integer.toString(a) + " + " + Integer.toString(b) + " = \n\nEnter your answer below");
					if (s.equalsIgnoreCase("Exit")){
						loop3 = false;
						run = false;
					}
					else if(s.equals(Integer.toString(c))) {
						Msg.msg("Correct!");
					}
					else {
						Msg.msg("Inorrect ):");
					}
				}
			}
			else if(i == 2) {
				boolean loop5 = true;
				while(loop5) {
					int num = 1;
					int a = (int) (Math.random()*101);
					int b = (int) (Math.random()*101);
					int c = 0;
					boolean loop6 = true;
					while (loop6) {
						if(a*b < 101) {
							c = a*b;
							loop6 = false;
						}
					}
					String s = Msg.in("question " + Integer.toString(num) + "\n\n" + Integer.toString(a) + " + " + Integer.toString(b) + " = \n\nEnter your answer below");
					if (s.equalsIgnoreCase("Exit")){
						loop5 = false;
						run = false;
					}
					else if(s.equals(Integer.toString(c))) {
						Msg.msg("Correct!");
					}
					else {
						Msg.msg("Incorrect ):");
					}
				}
			}
			else if(i == 3) {
				boolean loop7 = true;
				while(loop7) {
					int num = 1;
					int a = (int) (Math.random()*101);
					int b = (int) (Math.random()*101*a);
					int c = 0;
					boolean loop8 = true;
					while (loop8) {
						if(b/a < 101) {
							c = b/a;
							loop8 = false;
						}
					}
					String s = Msg.in("question " + Integer.toString(num) + "\n\n" + Integer.toString(b) + " + " + Integer.toString(a) + " = \n\nEnter your answer below");
					if (s.equalsIgnoreCase("Exit")){
						loop7 = false;
						run = false;
					}
					else if(s.equals(Integer.toString(c))) {
						Msg.msg("Correct!");
					}
					else {
						Msg.msg("Incorrect ):\n\nThe correct answer is: " + Integer.toString(c) );
					}
				}
			}
			else {
				run = false;
			}
		}
	}
	public static void askShit() {
		boolean run = true;
		String[] options= {"Practice Mode", "Test Mode", "Exit"};
		while(run) {
			int i = Msg.opt(options, "Choose Between Practice mode or test mode.\n", "MathGenerator");
			if(i == 0) {
				generatePracticeProblems();
			}
			else if(i == 1) {
				generateTestProblems();
			}
			else {
				run = false;
			}
		}
	}
}