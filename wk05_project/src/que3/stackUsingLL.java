package que3;

import static java.lang.System.exit;

//Driver code
class stackUsingLL {
	public static void main(String[] args)
	{
		LinkedList stk= new LinkedList();
		stk.push(100);
		stk.push(200);
		stk.push(300);
		stk.push(400);

		stk.display();

		System.out.printf("\nTop element is %d\n",stk.peek());
		stk.pop();
		stk.display();

		System.out.printf("\nTop element is %d\n",stk.peek());
	}
}

class LinkedList {

	private class Node {

		int data; 
		Node next; 
	}
	Node top;
	
	LinkedList() { this.top = null; }
	
	public void push(int x) 
	{
		Node temp = new Node();
		temp.data = x;
		temp.next = top;
		top = temp;
	}

	public boolean isEmpty() { 
		return top == null; 
	}

	public int peek(){
		if (!isEmpty()) {
			return top.data;
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public void pop() {
		if (top == null) {
			System.out.print("\nStack Underflow");
			return;
		}
		top = (top).next;
	}
	

	public void display(){
		if (top == null) {
			System.out.printf("\nStack Underflow");
			exit(1);
		}
		else {
			Node temp = top;
			while (temp != null) {
				System.out.print(temp.data);
				temp = temp.next;
				if(temp != null)
					System.out.print(" -> ");
			}
		}
	}
}

