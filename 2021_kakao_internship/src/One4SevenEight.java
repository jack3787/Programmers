// 숫자 문자열과 영단어 문제
// 숫자 사이에 문자로 입력된 영문 숫자명을 Integer로 바꾸어 숫자로 바꾸어주는 문제입니다.

class Solution {
    public int solution(String s) {
        int answer = 0;

        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i=0; i<10; i++) {
            s = s.replace(num[i], Integer.toString(i));
        }

        answer = Integer.parseInt(s);

        return answer;
    }
}

public class One4SevenEight {

}
