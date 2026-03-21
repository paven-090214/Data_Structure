# Data_Structure


## 키보드 입력시 Input, Output처리 과정

1. 키보드에서 입력 발생 (Input)  
2. 인터럽트(Interrupt) 발생 → OS에 알림  
3. OS가 입력 데이터를 RAM(메모리)에 미리 할당된 입력 버퍼(I/O Buffer)에 데이터를 순서대로 기록(Write)  
4. CPU가 메모리에서 데이터를 읽어 처리 (연산)  
5. OS가 출력 시스템에 전달  
   - GUI (그래픽 화면)
   - 콘솔 (터미널)
6. 화면에 출력 (Output)

