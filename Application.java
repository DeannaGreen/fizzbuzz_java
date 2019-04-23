public class Application {

	public static void main(String[] args) {
		for(int counter = 0; counter < 100; counter++) {
			if(counter % 15 == 0) {
				System.out.println("FizzBuzz");
			}
			else if(counter % 3 == 0) {
				System.out.println("Fizz");
			}
			else if(counter % 5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(counter);
			}
		}
	}

}
