import java.util.LinkedList;

public class LeetCode21_ListNode {

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(3);
        list2.add(4);

//        System.out.println(mergeTwoLists(list1, list2));
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

//    public static ListNode mergeTwoLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
//        return list1;
//    }
}
