public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 9, 12, 14};
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) { // 현재 값이 10보다 크면 반복문 탈출
                break;
            }
            sum += arr[i]; // 10보다 작은 값 모두 더함, 2+5+7+9
        }
        
        System.out.print(sum);
    }
}
/*① 위 프로그램의 for 반복문 내부에서 if 조건식이 참(true)이 되어 break 문이 실행되는 순간의 배열 요소 값(arr[i])은 무엇인지 쓰시오.

② 프로그램이 최종적으로 화면에 출력하는 sum의 결과값을 쓰시오.

정답: ① 12      ② 23 */
