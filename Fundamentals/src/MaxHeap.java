
public class MaxHeap {

	private int[] Array; 
    private int size; 
    private int maxsize; 
    
    public MaxHeap(int maxsize) 
    { 
        this.maxsize = maxsize; 
        this.size = 0; 
        Array = new int[this.maxsize + 1]; 
        Array[0] = Integer.MAX_VALUE; 
        
    } 
    private int parent(int pos) 
    { 
        return pos / 2; 
    } 
    
    public void print() 
    { 
        for (int i = 1; i <= size / 2; i++) { 
            System.out.print(" PARENT : " + Array[i] + " LEFT CHILD : " + 
                      Array[2 * i] + " RIGHT CHILD :" + Array[2 * i + 1]); 
            System.out.println(); 
        } 
    } 
  
    private void swap(int fpos, int spos) 
    { 
        int tmp; 
        tmp = Array[fpos]; 
        Array[fpos] = Array[spos]; 
        Array[spos] = tmp; 
    } 
    public void insert(int element) 
    { 
    	System.out.println("siza inside insert is "+size);
        Array[++size] = element; 
  
        // Traverse up and fix violated property 
        int current = size; 
        while (Array[current] > Array[parent(current)]) { 
            swap(current, parent(current)); 
            current = parent(current); 
        } 
    } 
    
    public static void main(String[] arg) 
    { 
        System.out.println("The Max Heap is "); 
        MaxHeap maxHeap = new MaxHeap(15); 
        maxHeap.insert(5); 
        maxHeap.insert(3); 
        maxHeap.insert(17); 
        maxHeap.insert(10); 
        maxHeap.insert(84); 
        maxHeap.insert(19); 
        maxHeap.insert(6); 
        maxHeap.insert(22); 
        maxHeap.insert(9); 
        maxHeap.insert(119); 
        maxHeap.print(); 
        
    } 
}
