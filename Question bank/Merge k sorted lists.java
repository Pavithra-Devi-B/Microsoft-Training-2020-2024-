class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        return partition(lists, 0, lists.length-1);
    }
    
    public ListNode partition(ListNode[] lists, int start, int end) {
        if (start == end) return lists[start];
        int mid = (start + end) / 2;
        ListNode l1 = partition(lists, start, mid);
        ListNode l2 = partition(lists, mid+1, end);
        return mergeTwo(l1, l2);
    }    
    public ListNode mergeTwo(ListNode l1, ListNode l2) {
        if (l1==null) return l2;
        if (l2==null) return l1;
        
        if (l1.val < l2.val) {
            l1.next = mergeTwo(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwo(l1, l2.next);
            return l2;
        }
    }
}
