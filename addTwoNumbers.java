class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example: l1 = [2,4,3] (represents 342)
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        
        // Example: l2 = [5,6,4] (represents 465)
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        
        // Calculate sum: 342 + 465 = 807 -> [7,0,8]
        ListNode result = solution.addTwoNumbers(l1, l2);
        
        // Print result
        System.out.print("Result: ");
        printList(result); // Output: 7 -> 0 -> 8
    }
    
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;
        
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            
            int sum = x + y + carry;
            carry = sum / 10;
            
            current.next = new ListNode(sum % 10);
            current = current.next;
            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        return dummyHead.next;
    }
}
