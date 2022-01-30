package com.medium.linkedlist;

public class Design_Browser_History_1472 {
	private ListNode current;

    public void BrowserHistory(String homepage) {
        this.current = new ListNode(homepage, null, null);
    }

    public void visit(String url) {
        ListNode newNode = new ListNode(url, current, null);
        current.next = newNode;
        current = newNode;
    }

    public String back(int steps) {
        while (this.current.prev != null && steps > 0) {
            current = current.prev;
            steps--;
        }
        return current.val;
    }

    public String forward(int steps) {
        while (this.current.next != null && steps > 0) {
            current = current.next;
            steps--;
        }
        return current.val;
    }

    private class ListNode {
        String val;
        ListNode next;
        ListNode prev;

        public ListNode(String val, ListNode prev, ListNode next) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

}
