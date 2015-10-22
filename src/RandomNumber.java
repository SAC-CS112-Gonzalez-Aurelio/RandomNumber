
import java.util.Random;
public class RandomNumber {
	

	public int GetANumber_Between_1_and_10() {
		Random rand = new Random();
		return rand.nextInt(10) + 1;
	
	}
}