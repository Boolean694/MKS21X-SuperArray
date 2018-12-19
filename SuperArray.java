public class SuperArray {
	private String[] data;
	private int size;
	
	public SuperArray() {
		size = 0;
		data = new String[10];
	}
	public SuperArray(int ic) {
		if(ic < 0) {
			throw new IllegalArgumentException("e");
		}
	    size = ic;
	    data = new String[ic];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	private void resize() {
        String[] plh = new String[size * 2];
        for (int q = 0; q < data.length; q++) {
          plh[q] = data[q];
        }
        data = plh;
    }
	
	public int size() {
		return size;
	}
	
	public void clear() {
		size = 0;
		data = new String[10];
	}
	
	public boolean add(String bean){
        if(size >= data.length){
          resize();
        }
        data[size] = bean;
		size++;
        return true;
    }
	
	public String get(int i) {
		if(i >= size || i < 0){throw new ArrayIndexOutOfBoundsException("Index doesn't fall into range 0 - (size - 1)");}
		return data[i];
	}
	
	public String set(int i, String e) {
		if(i >= size || i < 0) {throw new ArrayIndexOutOfBoundsException("Index doesn't fall into range 0 - (size - 1)");}
		String er = data[i];
		data[i] = e;
		return "Old value: " + er;
	}
	
	public String toString() {
		String r = "[";
		for(int q = 0; q < size; q++) {
			r = r + data[q] + ",";
		}
		r += "]";
		return r;
	}
	
	public boolean contains(String e) {
		boolean bool = false;
		for(int q = 0; q < size; q++) {
			if(data[q] == e){bool = true;}
		}
		return bool;
	}
	
	public int indexOf(String ye) {
		for(int q = 0; q < data.length; q++) {
			if(data[q] == ye) {
				return q;
			}
		}
		return -1;
	}
	
	public int lastIndexOf(String e) {
		for(int q = data.length - 1; q >= 0; q -= 1) {
			if(data[q] == e) {return q;}
		}
		return -1;
	}
	
	public void add(int ind, String s) {
		if(ind > size + 1 || ind < 0) {throw new ArrayIndexOutOfBoundsException("Index doesn't fall into range 0 - (size - 1)");}
		else {
			if(size >= data.length) {resize();}
			String plh = data[ind];
			String plht = "";
			data[ind] = s;
			for(int w = ind; w < size - 1; w++) {
				plht = data[w + 1];
				data[w + 1] = plh;
				plh = plht;
			}
			size++;
		}
	}
	
	public String remove(int ind) {
	
	    if(ind >= size || ind < 0) {
	        throw new ArrayIndexOutOfBoundsException("Index doesn't fall into range 0 - (size - 1)");
	    }
	    else {
			size -= 1;
	        String[] plh = new String[data.length];
	        for(int q = 0; q < ind; q++) {
	            plh[q] = data[q];
	        }
	        for(int w = ind + 1; w < data.length; w++) {
	            plh[w - 1] = data[w];
	        }
	        String b = data[ind];
	        data = plh;
	        return b;
	    }
   	}
   	
   	public boolean remove(String tj) {
		size -= 1;
   	    boolean bool = false;
   	    for(int qwe = 0; qwe < data.length; qwe++) {
   	        if(data[qwe] == tj){bool = true;}
   	    }
   	    if(!bool){return false;}
   	    else {
   	        int ind = 0;
   	        for(int wer = 0; wer < data.length; wer++) {
   	            if(data[wer] == tj){ind = wer;}
   	        }
			String[] plh = new String[data.length];
	        for(int q = 0; q < ind; q++) {
	            plh[q] = data[q];
	        }
	        for(int w = ind + 1; w < data.length; w++) {
	            plh[w - 1] = data[w];
	        }
			data = plh;
			return true;
   	    }
   	    
   	     
   	}
   	 public String toStringDebug() {
   	        String s = "[";
   	        for(int q = 0; q < size; q++) {
   	            s += data[q];
   	            s += ",";
   	        }
   	        s += "]";
   	        return s;
   	    } 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
