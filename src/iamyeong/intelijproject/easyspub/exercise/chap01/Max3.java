package iamyeong.intelijproject.easyspub.exercise.chap01;
import java.util.Scanner;
// 3개의 정숫값을 입력하고 최댓값을 구합니다.

public class Max3 {

	public Max3() {}

	//Return max Integer from input number
	public void max3(int a, int b, int c) {

		int n = 0;

		if (a > b && a > c) {
			n = a;
		} else if (b > a && b > c) {
			n = b;
		} else {
			n = c;
		}


		System.out.println("Input integer : " + a + ", " + b + ", " + c);
		System.out.println("Max is " + n);

	}


}