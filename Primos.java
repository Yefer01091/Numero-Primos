import java.util.Scanner;

public class Primos{
	public static void main(String[] arg){
		System.out.println("");
		System.out.println("Tarea");
		System.out.println("");
		System.out.println("\n\n\t Ejercicio N°3");
		System.out.println("");
		System.out.println("");
	
		Scanner sc = new Scanner(System.in);
      	        int a=0,i,n;
         	System.out.println("Ingrese numero");
         	n=sc.nextInt();
         	for(i=1;i<(n+1);i++){
      	 	    if(n%i==0){
               		a++;
            	    }
         	}
         	if(a!=2){
          	    System.out.println("No es Primo");
            	}else{
                    System.out.println("Si es Primo");
         	}
	}
}