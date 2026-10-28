import linkedList.MyLinkedList;
//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    MyLinkedList list = new MyLinkedList();
    list.addFirst(10);
    list.addFirst(20);
    list.addFirst(80);
    list.addFirst(30);
    list.addAny(2, 60);
    list.addAny(2, 40);
    list.addAny(2, 50);

    list.printList();
    list.popNode(4);
    list.printList();
}
