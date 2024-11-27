package Task;

public class ShapesExample {

	public static void main(String[] args) {
		shape<Integer> rectangle = new shape<>();
		rectangle.shapes = 3;
		int value1 = rectangle.shapes;
		System.out.println(value1*value1);
		
		shape<Double> triangle = new shape<>();
		triangle.shapes = 3.0;
		double value2 = triangle.shapes;
		double value3 = value2 * value2 /2;
		System.out.println(value3);

	}

}
