# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None or head.next == None:
            return head
        
        prevNode = head
        currentNode = head.next
        nextNode = currentNode.next
        prevNode.next = None

        while nextNode is not None:
            currentNode.next = prevNode
            prevNode = currentNode
            currentNode = nextNode
            nextNode = nextNode.next

        currentNode.next = prevNode
        return currentNode