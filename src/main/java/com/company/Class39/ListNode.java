package com.company.Class39;


public class ListNode {

     int val;
     ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public static void main(String[] args) {
        // System.out.println(mergeTwoLists());
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node;
        if(list1 == null){
            return list2;
        } else if(list2 == null){
            return list1;
        }
        if(list1.val <= list2.val){
            node = new ListNode(list1.val);
            list1 = list1.next;
        } else {
            node = new ListNode(list2.val);
            list2 = list2.next;
        }
        ListNode head = node;
        while(list1 != null){
            if(list2 == null){
                node.next = list1;
                list1 = list1.next;
            }else if(list1.val <= list2.val){
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }
        if(list2 != null){
            node.next = list2;
        }
        return head;
    }

}

