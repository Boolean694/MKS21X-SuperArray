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
		
		System.out.println("Array: " + arr.toString());
		
		System.out.println("Contains 'third': " + arr.contains("third"));
		System.out.println("Contains 'fifth': " + arr.contains("fifth"));
		
		System.out.println("Index of 'third': " + arr.indexOf("third"));
		System.out.println("Index of 'fifth': " + arr.indexOf("fifth"));
		
		arr.add("first");
		System.out.println("Last index of 'first': " + arr.lastIndexOf("first"));
		
		arr.add(2, "woah");
		System.out.println(arr.toString());
		
		System.out.println(arr.remove(3));
		System.out.println(arr.toString());
		
		System.out.println(arr.remove("woah"));
		System.out.println(arr.toString());
		
		try {
			System.out.println(arr.get(-1));
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is not in the range");
		}
	}
}
