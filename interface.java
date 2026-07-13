interface Calc {
    String concat(String a, String b);
}

class Mod (  ①  )  Calc {
    public String concat(String a, String b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calc c = new Mod();
        System.out.print(c.concat("Java", "2026"));
    }
}

/* ① 빈칸 ①에 들어갈 알맞은 인터페이스 구현 키워드를 쓰시오. 
② c.concat("Java", "2026")의 최종 실행 결과를 쓰시오. 

정답: ①implemets      ②Java2026
*/
