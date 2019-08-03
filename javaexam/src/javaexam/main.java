package javaexam;
public class main {

	public static void main(String[] argv) {
		//new main().compare();
		int total = 0;
		for( int i=1; i<=5; i++ ) {
			for( int j=1; j<=i; i++ ) { 
				total ++;
				System.out.println( total );
			}
		}
		
		System.out.println( total );
		// test from studio 7707
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
