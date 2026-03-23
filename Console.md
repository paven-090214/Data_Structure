# Colsole


## 키보드 입력시 Input, Output처리 과정

1. 키보드에서 입력 발생한다.(Input)  
2. 인터럽트(Interrupt) 발생한다. → OS에 알린다.
3. OS가 입력 데이터를 RAM(메모리)에 미리 할당된 입력 버퍼(I/O Buffer)에 데이터를 순서대로 기록한다.(Write)  
4. CPU가 메모리에서 데이터를 읽어 처리한다. (연산)  
5. OS가 출력 시스템에 전달한다.
   - GUI (그래픽 화면)
   - 콘솔 (터미널)
6. 화면에 출력한다. (Output)
## CPU
- 컴퓨터는 크게 `소프트웨어(S/W)`와 `하드웨어(H/W)`로 구분한다.
- CPU의 동장 모드는 `User mode`와 `Kernel mode`로 나뉜다.
- CPU는 Kernel mode와 User mode를 오가며 동작한다.
### user mode
- User mode에서는 주로 사용자가 작업을 하거나 볼 수 있는 모드이다.
- VS Code, 크롬, 게임등의 프로그램이 실행된다.
### Kernel mode
- Kernel mode에서는 OS가 실행된다.
- 주로 하드웨어 접근과 같은 권한이 필요한 작업을 수행한다.

## Hello World.C 실행 과정
1. Hello World.C파일을 컴파일 하면서 실행파일(exe)이 생성된다.
2. 그 파일(exe)을 실행하는 순간 운영체제(OS)가 프로세스(Process)를 생성한다. -> "Hello World.exe프로세스가 생성되었다."
3. 프로세스가 생성된 후 main() -> printf()가 실행된다. -> 문자열은 유저 영역 stdout Buffer에 저장된다.
4. 프로세스는 파일형식의 추상화된 인터페이스(write)를 OS에 요청한다.
5. 프로세스는 `3번의 유저 영역 stdout Buffer에 저장된 문자열`을 커널 영역으로 복사하기위해 printf의 내부에서 C라이브러리를 통해서 시스템 콜(Write)을 요청한다. ->  파일형식의 추상화된 인터페이스의 형식들 중에서 write() 사용
- 시스템 콜 호출 조건
   - `\n`을 만난다.
   - 버퍼가 꽉 찼다.
   - fflush() -> 버퍼를 비우는 기능
6. 이제 User mode에서 Kernel mode로 전환되어, 운영체제가 해당 데이터를 출력 장치로 전달한다.
7. stdio 버퍼에 저장된 데이터가 write() 시스템콜을 통해 커널로 전달되고, 커널이 이를 터미널(콘솔)에 출력한다.

## 익셉션
- CPU가 현재 실행을 중단하고, OS(커널)에게 제어를 넘기는 트리
### 익셉션의 종류
1. Trap
   - 의도적인 익셉션이다.
   - 시스템콜이 들어있다.
   - 정상 흐름의 일부이다.
2. Fault
   - 의도치 않은 익셉션이다.
   - 복구가 가능하다.
   - 고치고 다시 실행이 가능하다.
3. Aborts
   - 프로그램의 실행을 정지한다.
   - > EX). Divide by zero
   - 심각한 오류

## 시그널(Signal)
- 운영체제 커널이 프로세스에 특정 이벤트가 발생했음을 알리기 위해 보내는 비동기적인 알림 메시지
## 익셉션 시스템 콜 과정
- 익섹션 테이블에 적합한 주소 찾음
<img width="969" height="310" alt="image" src="https://github.com/user-attachments/assets/301812d0-5d0c-4dbd-a8ac-79b034e12db6" />
