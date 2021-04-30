import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumerosPares{
	
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int entrada = Integer.parseInt(br.readLine());
      if (entrada > 0){
      	for (int i = 1 ; i <= entrada; i++) {
      		if (i % 2 == 0) System.out.println(i);
      	}
      }
    }
}