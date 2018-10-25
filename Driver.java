public class Driver {
	public static void main(String[] args) {
		SuperArray arr = new SuperArray();
		System.out.println(arr.isEmpty());
		
		arr.add("zeroth");
		System.out.println("elements added");
		
		System.out.println(arr.size());
		
		arr.add("first");
		arr.add("second");
		arr.add("third");
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(2));
		
		System.out.println(arr.set(1, "HEEHEE"));
		System.out.println("element changed");
		
		System.out.println(arr.get(1));
	}
}