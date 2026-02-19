package LinkedList;

public class IntersectionofTwoLinkedLists {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node common = new Node(8);
        common.next = new Node(5);
        common.next.next = new Node(3);//common list :8 -> 5-> 3 ->End

        Node headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = common;//headA: 1 -> 2 -> 8 -> 5-> 3 ->End

        Node headB = new Node(9);
        headB.next = new Node(7);
        headB.next.next = new Node(4);
        headB.next.next.next = common;// headB : 9 -> 7 -> 4 -> 8 -> 5-> 3 ->End

        Node Intersection = getIntersection(headA, headB);

        System.out.println((Intersection != null) ? " Intersection of node at " + Intersection.data : "No Intersection");
    }

    private static Node getIntersection(Node headA, Node headB) {
        Node pA = headA;
        Node pB = headB;
        while (pA != pB) {
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }
        return pA;
    }
}
