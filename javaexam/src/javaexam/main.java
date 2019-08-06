package javaexam;
public class main {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A' 65 의 문자코드는
		System.out.println(1 + x << 33); //
		System.out.println(y >= 5 || x < 0 && x > 2); // true
		System.out.println(y += 10 - x++); //13
		System.out.println(x+=2); //5
		System.out.println( !('A' <= c && c <='Z') );
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);
		}
	

	private void compare() {
		User a = new User("J", "Lee");
		User b = new User("J", "Lee");
		User c = a;

		System.out.println(a == b); 
		System.out.println(a == c);  
		System.out.println(a.equals(b));  
	}

	public class User {
		private String firstName;
		private String lastName;

		public User(String firstName, String lastName) {
			this.firstName = new String(firstName);
			this.lastName = new String(lastName);
		}

		public boolean equals(User other) {
			System.out.print("a");
			return match(firstName, other.firstName)
					|| match(lastName, other.lastName);
		}

		private boolean match(String part1, String part2) {
			return part1 == part2 && part1.equals(part2);
		}
	}
}
