package random_game;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		First_method fm = new First_method();
		
		double score = 100;
		int ch = 0;
		int tr = 0;
		boolean end = false;
		
		System.out.println("랜덤게임 !!!");
		System.out.println("4000점 이상이 되면 성공 0점 이하가 되면 실패");
		System.out.println();
		System.out.println("1 - 80% 확률로 + 100점 / 20% 확률로 - 110점");
		System.out.println("2 - 50% 확률로 + 200점 / 50% 확률로 - 220점");
		System.out.println("3 - 30% 확률로 + 500점 / 70% 확룰로 - 550점");
		System.out.println("4 - 40% 확률로 점수 2배 / 60% 확률로 점수 1/2배");
		System.out.println("5 - 20% 확률로 점수 3배 / 80% 확률로 점수 1/3배");
		System.out.println("6 - 10% 확률로 점수 4배 / 90% 확률로 점수 1/4배");
		System.out.println();
		
		while (end == false) {
		System.out.println("현재 점수 : " + score + " / 현재 도전횟수 : " + tr);
		System.out.println();
		System.out.println("번호를 적어주세요.");
		System.out.print("-> ");
		ch = s.nextInt();
		System.out.println();
		
		if (ch >= 1 && ch <= 6) {
			score = fm.point(score, ch);
			tr = tr + 1;
		} else {
			System.out.println("1 ~ 6 까지의 숫자를 입력해주세요.");
			System.out.println();
		}
		
		if (score >= 4000) {
			System.out.println("랜덤게임 성공 !!");
			end = true;
		} else if (score <= 0 ){
			System.out.println("랜덤게임 실패...");
			end = true;
		}
		
		}
		
		System.out.println();
		System.out.println("총 도전횟수 : " + tr);
		System.out.println();
		System.out.println("제작자 : minigold649");
		
		s.close();
	}

}
