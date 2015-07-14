
public class FooBarBaz {
	private final static int MAXIMO = 3 * 5 * 7; 
			
	public static void main(String[] args) {
		for (int i = 1; i <= MAXIMO; i++) {
			StringBuilder sb = new StringBuilder();
		
			sb.append(i + ". ");
			if (i % 3 == 0)
				sb.append("foo ");
			if (i % 5 == 0)
				sb.append("bar ");
			if (i % 7 == 0)
				sb.append("baz ");
			
			System.out.println(sb.toString());
		}
	}
}
