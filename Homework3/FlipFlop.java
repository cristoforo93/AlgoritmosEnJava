public class FlipFlop{
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);
		System.out.println(args[0]);
		int w;
		w = 0;
		while(w<=num){
			int x,y,z;
			x=w%3;
			y=w%5;
			if ((x == 0)&(y == 0)){
				System.out.println("FlipFlop");
			}else if(x == 0){
				System.out.println("Flip");
			}else if(y == 0){
				System.out.println("Flop");
			}else{
				System.out.println(w);
			}
			w++;
		}
   }

}