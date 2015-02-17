package assignment1.Interface;

import java.util.ArrayList;

public interface Calculation{
	
	//calculation for the final score for one student
	void individualAverageCalculation(int asg1, int asg2, int asg3, int test1, int test2, int test3);
	
	//transfer the numeric score to letter score
	String numericToLetter(int score);
	
	//calculate the group average
	int groupAverageCalculation(ArrayList<Integer> score);
	
	//calculate the total number of student 
	//that had obtained a score which has at least 60%
	int passingStudentCalculation(ArrayList<Integer> score);
	
	//calculate the positions which stored the top two best score in the ArrayList
	void findBestScore(ArrayList<Integer> score);
	
	//find the name of top two students
	String findBestStudent(int first, int second);
}