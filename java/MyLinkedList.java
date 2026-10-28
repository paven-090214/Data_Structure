package linkedList;

public class MyLinkedList {

    private Node head = null;
    private int size = 0;

    public MyLinkedList(){};

    public void addAny(int index, int item) {

        if (1 > index || index > size + 1) {
            System.out.println("index error max size : 0 ~ " + size);
            return ;
        }
        Node newNode = new Node(index, item);
        Node prev = head;

        if (index == 1) {
            addFirst(item);
            return;
        }
        else {
            for (int cur = 1; cur < index - 1; cur++) {
                prev = prev.getNext();
            }
            newNode.setNext(prev.getNext());
            prev.setNext(newNode);
        }

        System.out.println(index + "번 째에 노드 추가 : " + item);
        size++;
    }

    public void addFirst(int item) {
        Node cur = new Node(item);
        cur.setNext(head);
        head = cur;
        size++;
        System.out.println("addFisrt : " + item);
    }

    public void popLast() {
        if (size == 0) {
            System.out.println("배열이 비어있음.");
            return;
        }
        Node prev = head;
        int i = 1;
        while (i < size - 1) {
            prev = prev.getNext();
            i++;
        }
        System.out.println("popLast / item : " + prev.getItem());
        prev.setNext(null);
        size--;
    }

    public void popNode(int index) {
        Node prev = head;
        if (index < 1 || index > size) {
            System.out.println("1 ~ " + size + "의 크기를 입력");
            return;
        }
        System.out.println("-----popNode-----");

        for (int i = 1; i < index - 1; i++) {
            prev = prev.getNext();
        }

        Node temp = prev;
        prev = prev.getNext();
        temp.setNext(prev.getNext());
        prev.setNext(null);
        size--;
        System.out.println("index : " + index + "\n" +
                "popNode item : " + prev.getItem());
    }

    public void printList() {
        Node prev = head;
        System.out.println("-----printList-----");
        int i = 1;
        while (i <= size) {
            System.out.println(i + " 번째 item : " + prev.getItem());
            prev = prev.getNext();
            i++;
        }
    }
}
