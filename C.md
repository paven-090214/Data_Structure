key input -> scan code -> virtual key
& => 주소 연산자
쓰기 => 주소를 반드시 기재하도록 되어있다.
ex). 
scanf_s() 
%*c -> 다음 문자를 없애는 방법, 대행문자 제거
매핑시 만드시 메모리 주소가 와야함

읽기 => 주소를 기재하지 않아도 된다.
ex). printf
```C
	printf("나이 : ");
	scanf_s("%d%*c", &age);
	printf("이름 : ");
	gets(szName);
```
