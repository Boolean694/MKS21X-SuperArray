public class SuperArray {
	private String[] data;
	private int size;
	
	public SuperArray() {
		size = 0;
		data = new String[10];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		size = 0;
	}
	
	public boolean add(String bean) {
		size++;
		data = new String[size];
		data[size - 1] = bean;
		return true;
	}
	
	public String get(int i) {
		return data[i];
	}
	
	public String set(int i, String e) {
		String er = data[i];
		data[i] = e;
		return "Old value: " + er;
	}
	
	public String toString() {
		String r = "[";
		for(int q = 0; q < size; q++) {
			r = r + data[q] + ",";
		}
		return r;
	}
	
	public boolean contains(String e) {
		boolean bool = false;
		for(int q = 0; q < size; q++) {
			if(data[q] == e){bool = true;}
		}
		return bool;
	}
	
	
}