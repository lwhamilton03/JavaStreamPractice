package java8Practice;

public class MainRunnerPractice {

	public static void main (String args[])
	{
		Exercise1 ex = new Exercise1();
		String[] test = {"12", "try", "22"};
		ex.exercise(test);
		
		StreamExercise1 exercise = new StreamExercise1();
		exercise.streamExercise();
		
		Exercise2 exer = new Exercise2();
		exer.exercise2();
	}
	
}
