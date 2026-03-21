#getchar()

getchar() -> I/OBuffer에서 문자 한개를 가져온다
  - I/OBuffer -> Queue의 형태를 띈다.


getchar()은 라이브러리의 입력 버퍼로부터 문자 한개를 가져온다.
이때 사용자에게 키보드로 입력받은 값은 문자 한개와, \n 이다.
getchar()가 코딩되어있는 파일의 추상적 인터페이스에 존재하는 버퍼에 담겨진다.
이때의 버퍼는 Queue형태이다.
putchar() 키워드 사용으로 getchar()로 입력받은 문자를 putchar()가 아웃풋하는 버퍼에 담아준다.
그래서 getchar의 문자 한개가 콘솔 화면에 나타나게 된다.

```
#include <stdio.h>

int main(void) {
	char ch = 0;

	ch = getchar();
	putchar(ch);
	putchar('Z');

	return 0;
}
```



_getch()와 _getche()는 #include <conio.h> 라이브러리를 호출해야한다.
_getch()와 _getche()는 라이브러리의 버퍼를 거치지 않고 운영체제를 통해 직접 데이터를 받아온다.
_getch()와 _getche()는 키보드의 입력하는 상황을 중요시 여긴다.

이 입력 버퍼는 키보드의 인풋으로 들어온 버퍼로부터 받은 데이터를 받는다.
입력 버퍼는 Queue구조로 동작한다.
운영체제는 장치를 파일처럼 다룰 수 있는 추상화된 인터페이스를 제공하며, 이 인터페이스에는 입출력 버퍼가 연결되어있다.
```
#include <stdio.h>
#include <conio.h>

int main(void) {
	char ch = 0;
	printf("아무 키를 누르면 다음으로 넘어갑니다.\n");
	
	ch = _getch();

	printf("입력한 키는 %c 입니다.\n", ch);

	return 0;
	}
  ```
