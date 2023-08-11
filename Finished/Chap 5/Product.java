public class Product{
	public static void main(String[] args){
		int product = 0;
		for(int counter = 1;counter<=15;counter+=2){
			if(counter == 1){
				product = counter;
			}
			product = product * counter;
		}
		System.out.println(product);
	}
}