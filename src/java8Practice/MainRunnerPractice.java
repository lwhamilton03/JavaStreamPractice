package java8Practice;

import java.util.List;

public class MainRunnerPractice {

	public static void main (String args[])
	{
		Exercise1 ex = new Exercise1();
		String[] test = {"12", "try", "22"};
		ex.exercise(test);
		
		StreamExercise1 exercise = new StreamExercise1();
		exercise.streamExercise();
		
		Exercise2 exer = new Exercise2();
		String[] fire = {"A123", "B111", "C453", "C3312", "D12", "A2333", "D344", "A9000001"};
		String[] water = {"A123",
				"B111",
				"C453",
				"C3331",
				"D3456",
				"D2245",
				"C111",
				"A1",
				"B22"};
		exer.exercise2(fire);
		System.out.println("");
		exer.exercise2(water);
	}
	
}
