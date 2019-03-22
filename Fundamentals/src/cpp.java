
public class cpp {
	
	
	
	void FunctionToMerge(char arr[],int l, int m, int r)
	{
	   // int i,j,k;
	    
	    int first_data = m - l + 1;
	    int left[first_data];
	    int second_data = r - m;
	    int right[second_data];
	    
	    for (int x = 0; x < first_data; x++)
	    {
	        left[x] = arr[l + x];
	    }
	    for (int y = 0; y < second_data; y++)
	    {
	        right[y] = arr[m+1+r];
	    }
	    
	    int a=0;
	    int b=0;
	    int c=l;
	    
	    while (a < first_data && b < second_data)
	    {
	        if (left[a] < right[b]) {
	            arr[c] = left[a];
	            a++;
	            c++;
	        } else {
	            arr[c] = right[b];
	            b++;
	            c++;
	        }
	    }
	    while (a < first_data) {
	        arr[c] = left[a];
	        a++;
	        c++;
	    }
	    
	    while (b < second_data) {
	        arr[c] = right[b];
	        b++;
	        c++;
	    }
	}




}


