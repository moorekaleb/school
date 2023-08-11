import java.util.Scanner;

public class Duplicate{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int array[] = {0,0,0,0,0};
		for(int i=0;i<5;i++){
			System.out.print("Enter number from 10 to 100: ");
			int num = input.nextInt();
			boolean isfound = false;
			int j=0;
			while(array[j]!=0){
				if(array[j]==num){
					isfound = true;
					break;
				}
				j++;
			}
			if(isfound)
				continue;
			else
			{
				array[j]=num;
				for(int k =0;k<5;k++){
					if(array[k]!=0)
						System.out.print(array[k]+" ");
					
				}
				System.out.println();
			}
		}
	}
}