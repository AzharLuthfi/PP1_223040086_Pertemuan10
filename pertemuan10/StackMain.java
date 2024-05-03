package pertemuan10;

public class StackMain {
	public static void main(String[] args) {
		StrukturStack Stack = new StrukturStack(3);
		// SEBELUM PUSH 3X
		System.out.println("# Sebelum push 3x #");
		System.out.println("size: " + Stack.size());
		System.out.println("isEmpty: " + Stack.isEmpty());
		System.out.println("isFull: " + Stack.isFull());
		System.out.println("Top: "+ Stack.TOP());
		Stack.displayElements();
		
		// SEBELUM PUSH 3X
		System.out.println("# Setelah push 3x #");
		Stack.push(2);
		Stack.push(4);
		Stack.push(1);
		System.out.println("size: " + Stack.size());
		System.out.println("isEmpty: " + Stack.isEmpty());
		System.out.println("isFull: " + Stack.isFull());
		System.out.println("Top: "+ Stack.TOP());
		Stack.displayElements();
		
		// TUGAS BUAT FUNGSI POP
		Stack.Pop();
		Stack.displayElements();
	}
}
