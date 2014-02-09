public class whileValue{
	public static void main(String[] args){
		int valor=Integer.parseInt(args[0]);
		System.out.println(args[0]);
		int w=0;
		while(w<valor){
			System.out.println("El valor actual es: "+w);
			w++;
		}
   }

}