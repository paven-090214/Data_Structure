# getchar()

> getchar() -> I/OBuffer에서 문자 한개를 가져온다
> - I/OBuffer -> Queue의 형태를 띈다.

## 처리 과정
1. getchar()은 라이브러리의 입력 버퍼로부터 문자 한개를 가져온다.  
2. 이때 사용자에게 키보드로 입력받은 값은 `문자 한 개, \n` 이다.  
3. getchar()가 코딩되어있는 파일의 추상적 인터페이스에 존재하는 버퍼에 담겨진다.  
4. 이때의 버퍼는 Queue형태이다.  
5. putchar() 키워드 사용으로 getchar()로 입력받은 문자를 putchar()가 아웃풋하는 버퍼에 담아준다.  
6. 그래서 getchar의 문자 한개가 콘솔 화면에 나타나게 된다.  

```C
#include <stdio.h>

int main(void) {
    char ch = 0;

    ch = getchar();   // 문자 1개 입력
    putchar(ch);      // 입력한 문자 출력
    putchar('Z');     // 문자 Z 출력

    return 0;
}
```



## _getch() & _getche()
- `#include <conio.h>` 라이브러리를 호출해야한다.
- 라이브러리의 버퍼를 거치지 않고 운영체제를 통해 직접 데이터를 받아온다.
- 키보드의 입력하는 상황을 중요시 여긴다.
- _getch()
	- _getch()는 입력 문자를 화면에 표시하지 않는다.
- _getche()
	- _getche()는 _getche()는 입력 문자를 화면에 표시한다.
```C
#include <stdio.h>
#include <conio.h>

int main(void) {
    char ch = 0;

    printf("아무 키를 누르면 다음으로 넘어갑니다.\n");

    ch = _getch();   // 즉시 입력, 화면에 보이지 않는다.

    printf("입력한 키는 %c 입니다.\n", ch);

    return 0;
}
  ```
**키보드 입력 → 입력 버퍼 (Queue) → getchar()**
