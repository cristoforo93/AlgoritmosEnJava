public class oddEven{
	public static void main(String[] args){
		System.out.println(args[0]);
		int num=Integer.parseInt(args[0]);
		int x;
		x=num%2;
		if (x==0){
			System.out.println("Número Par.");
		}else{
			System.out.println("Número Impar.");
		}
   }
}