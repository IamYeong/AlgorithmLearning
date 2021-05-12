package iamyeong.intelijproject;

import java.util.ArrayList;
import java.util.List;

public class DadolCodingTest {

    //코딩테스트 조건 :
    //-333부터 888까지의 숫자 중에 3과 8이 들어가는 값만 출력하는 코드를 작성하고
    // 소스코드와 결과스크린샷을 업로드해주세요.
    // (-3, 31, -13, 38 80... 등과 같이 3과 8이 포함된 문자열이 모두 출력되어야 합니다.) *

    //여기서는 main 메서드가 다른 파일에 있으므로 객체를 만들어서 활용할 수 있게끔 커스텀하겠습니다.

    //조건에 맞는 숫자를 검증된 리스트에 넣을 예정입니다.
    private List<Integer> provenList;

    //기본 생성자를 만듭니다.
    public DadolCodingTest() {

        provenList = new ArrayList<>();

    }

    //입력된 min 부터 max 까지의 숫자 중 target, target2이 들어가는 수를 모두 찾습니다.
    public void checkNumber(int target, int target2, int min, int max) {

        //3. Integer wrapper class의 toString() 보다는 구글링해보니 아래 방식이 더 편해보였습니다.
        String targetStr = target + "";
        String target2Str = target2 + "";

        //4. 인자로 받은 수를 활용하여 -333부터 888까지 반복문을 실행합니다.
        for (int i = min; i <= max; i++) {

            //5. i번째 차레일 때 i를 문자열로 바꿉니다.
            String iStr = i + "";

            //6. i의 자릿수만큼 반복문을 한 번 더 실행하여 3이나 8이 있으면 list에 추가하고 해당 반복문을 종료합니다.
            for (int j = 0; j < iStr.length(); j++) {

                if (iStr.charAt(j) == targetStr.charAt(0) || iStr.charAt(j) == target2Str.charAt(0)) {
                    provenList.add(i);

                    break;
                }

            }

        }

        //리스트를 모두 출력 후 마무리합니다.
        System.out.println(provenList);

    }



}
