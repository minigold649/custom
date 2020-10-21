package random_game;

import java.util.Random;

public class First_method implements Interface {
	
	public int random() {
	
		Random r = new Random();
		int result = r.nextInt(10);
		return result;
	}
	
	public double one(double score) {
		
		int ra = random();
		if (ra >= 0 && ra < 8) {
			System.out.println("성공");
			System.out.println();
			score = score + 100;
		} else {
			System.out.println("실패");
			System.out.println();
			score = score - 110;
		}
		
		return score;
	}
	
	public double two(double score) {
		
		int ra = random();
		if (ra >= 0 && ra < 5) {
			System.out.println("성공");
			System.out.println();
			score = score + 200;
		} else {
			System.out.println("실패");
			System.out.println();
			score = score - 220;
		}
		
		return score;
	}
	
	public double three(double score) {
		
		int ra = random();
		if (ra >= 0 && ra < 3) {
			System.out.println("성공");
			System.out.println();
			score = score + 500;
		} else {
			System.out.println("실패");
			System.out.println();
			score = score - 550;
		}
		
		return score;
	}
	
}
