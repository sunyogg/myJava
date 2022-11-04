package java.basics;

public class Greetingarr{
	public static void main(String[] args){
		String [] names = {"ansh", "sanskar", "john"};
		for(int i=0; i<names.length; i++){
			if (names[i]=="ansh"){
				System.out.println("kyu be! "+names[i].toUpperCase());
			}else{
				System.out.println("Hello! "+names[i].toUpperCase());
			}
		}	
	}		
}