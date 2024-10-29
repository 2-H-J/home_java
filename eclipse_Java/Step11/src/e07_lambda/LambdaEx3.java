package e07_lambda;

public class LambdaEx3 {
	public static <T> void run(Method<T> m, T v1, T v2) { // <T> 메서드에 generic
		System.out.println(m.run(v1, v2));
	}
	public static void main(String[] args) {
		
		Method<Double> m1 = (a, b) -> a + b;
		Method<Integer> m2 = (a, b) -> a + b;
		Method<String> m3 = (a, b) -> a + b;
		
		run(m1, 20.5, 10.0);
		run(m2, 10, 20);
		run(m3, "Hello", "World");
		
	}
}
