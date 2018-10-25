public class Driver {
	public static void main(String[] args) {
		SuperArray arr = new SuperArray();
		System.out.println(arr.isEmpty());
		
		arr.add("first");
		System.out.println("Array was changed, elements added");
		
		System.out.println(arr.size());
		
	}
}