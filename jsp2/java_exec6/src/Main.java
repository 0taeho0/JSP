import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		int A = Integer.parseInt(bf.readLine());
		int B = Integer.parseInt(bf.readLine());
		
		int Aon = 1;
		int Bon = 1;
		int temp = 0;
		
		for(int i=0; i<N; i++) {
			Aon += A; Bon += B;
			System.out.println(Aon+" "+Bon);
			if(Aon < Bon) {
				temp = Aon;
				Aon = Bon;
				Bon = temp;
				System.out.println(Aon+" "+Bon);
			}else if(Aon == Bon) Bon -= 1;
		}
		System.out.println(Aon+" "+Bon);
	}

}
