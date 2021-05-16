package iamyeong.intelijproject.easyspub.exercise.chap01;
import java.util.Scanner;
// 3개의 정숫값을 입력하고 중앙값을 구한 다음 출력합니다.

public class Median {


	public void med3(int a, int b, int c) {

		int x = a;

		if (a >= b)
			if (b >= c)
				x = b;
			else if (a <= c)
				 x = a;
			else
				x = c;
		else if (a > c)
			x = a;
		else if (b > c)
			x = c;
		else
			x = b;

		System.out.println("중앙값 :" + x);

	}


}