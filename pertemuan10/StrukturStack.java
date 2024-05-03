package pertemuan10;

public class StrukturStack {
	// LATIHAN 1
	public void push(int data) {
		if (isFull()) {
			System.out.println("Stack penuh");
		} else {
			TOP++;
			array[TOP] = data;
		}
	}
	
	// LATIHAN 2
	private int[] array;
	private int capacity;
	private int TOP;
	private int temp;
	
	public final int MIN = -1;
	
	public StrukturStack(int capacity) {
		super();
		array = new int[capacity];
		this.capacity = capacity;
		TOP = MIN;
	}
	
	//LATIHAN 3
	public boolean isEmpty() {
		return (TOP == MIN);
		
	}
	
	public boolean isFull() {
		return (TOP == capacity);
		
	}
	
	public int size() {
		return TOP + 1;
	}
	
	public int TOP() {
		return TOP != -1 ? array[TOP] : -1;
		
	}
	
	 public void displayElements() {
		 System.out.println("Element From Top: ");
	        if (isEmpty()) {
	            System.out.println("Stack Kosong !!");
	        } else {
	           for (int i = TOP; i >= 0; i--) {
	        	   System.out.print(array[i] + "");
	           }
            }
	            System.out.println(); // Baris baru setelah semua elemen ditampilkan
    }	
	 
	public int Pop() {
		if (isEmpty()) {
			System.out.println("Stack Kosong");
		} else {
			temp = array[TOP];
			TOP = TOP -1;
		}
		return temp;
		
	}
	    
}
