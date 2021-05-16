package iamyeong.intelijproject;

import iamyeong.intelijproject.easyspub.exercise.chap01.JudgeSign;
import iamyeong.intelijproject.easyspub.exercise.chap01.Max3;
import iamyeong.intelijproject.easyspub.exercise.chap01.Median;

public class Main {

    public static void main(String[] args) {
	// write your code here

        DadolCodingTest dadol = new DadolCodingTest();
        dadol.checkNumber(3, 8, -333, 888);

        Shuffle shuffle = new Shuffle();
        shuffle.shuffle(10);

        Max3 max3 = new Max3();
        max3.max3(1, 2, 3);

        Median median = new Median();
        median.med3(1, 2, 3);

        JudgeSign judgeSign = new JudgeSign();
        judgeSign.judgeSign(-1);
    }
}
