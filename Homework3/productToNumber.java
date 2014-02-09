public class productToNumber{
	public static void main(String[] args){
		int num=Integer.parseInt(args[0]);
		System.out.println(args[0]);
		int w=1;
		for(int x=num;x > 1; x--){
			w=w*x;
		}
		System.out.println("El producto es: "+w);
   }

}