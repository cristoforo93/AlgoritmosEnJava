public class rangeSum{
	public static void main(String[] args){
		int lim1=Integer.parseInt(args[0]);
		int lim2=Integer.parseInt(args[1]);
		System.out.println("Límites: "+args[0]+" "+args[1]);
		int w = lim1+1;
		while(w!=lim2){
			System.out.println("Número actual es: "+w);
			w++;
		}
   }

}