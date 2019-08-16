package main;

public class Main {

	public static void main(String[] args) {
		// ArrayStack<Integer> stack = new ArrayStack<>();

		ArrayStack arrayStack = new ArrayStack(5);

		System.out.println("Array Stack 테스트");

		// 스택에 데이터 삽입
		for (int i = 1; i <= 5; i++) {
			arrayStack.push("ArrayStack 데이터-" + i);
		}

		System.out.println(arrayStack.pop());
		System.out.println(arrayStack.pop());
		System.out.println(arrayStack.peek());
		System.out.println(arrayStack.peek());
		System.out.println(arrayStack.pop());
		System.out.println(arrayStack.pop());
		System.out.println(arrayStack.pop());

		System.out.println();

	}
}