#include <stdio.h>
#include <string.h>
int main(void) {    
  char str[] = "COMPUTER";
  char *p = str;    
  printf("%c%c%d", *(p + 1), *(p + 5), strlen(str));  
return 0;
}

/*다음 C언어 프로그램의 실행 결과를 쓰시오.
● 소스코드 옆에 주석(설명)을 적으세요
① *(p + 1)과 *(p + 5)가 각각 가리키는 문자를 쓰시오.② 프로그램의 최종 출력 결과를 쓰시오.
① O T ② OT8 
*/
