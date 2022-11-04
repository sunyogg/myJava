package myJava.basics;

public class Question{

	int counter = 0;
	public static void main(String[] args){
		for (int i=0; i<5; i++){
			meth(i);
		}
		
	}

	static void meth(int num){
		Question q1 = new Question();
		q1.counter += 1;
		System.out.println(q1.counter);
	}	

}



	