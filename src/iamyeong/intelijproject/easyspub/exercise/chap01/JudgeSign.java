package iamyeong.intelijproject.easyspub.exercise.chap01;
import java.util.Scanner;
// 입력한 정숫값이 양수인지 음수인지 0인지 판단합니다.

public class JudgeSign {

	public void judgeSign(int n) {

		if (n > 0) {

			System.out.println("입력된 정수는 양수입니다.");


		} else if (n == 0) {

			System.out.println("입력된 정수는 0입니다.");

		} else {
			System.out.println("입력된 정수는 음수입니다.");
		}




	}


}