import java.util.LinkedList;
import java.util.List;

class cell{
	int x,y;
	cell(int x,int y){
		this.x=x;
		this.y=y;
		
	}
}
public class MinSteps {
	
 
	public static List<cell> list= new LinkedList<cell>();
	static int X[]= {-2, -1, 1, 2, -2, -1, 1, 2};
	static int Y[] = {-1, -2, -2, -1, 1, 2, 2, 1};
	
	static int minStepsToTarget(int startX,int startY, int endX,int endY, int N) {
		
		int arr[][]= new int[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				arr[i][i]=9999;
			}
		}
		arr[startX][startY]=0;
	
		list.add(new cell(startX,startY));
		
		while(!list.isEmpty()) {
			cell celll= list.remove(0);
			
			cell[] cells = getTransformations(celll);
			for(cell c: cells) {
				if(c.x<0 || c.x>N-1 || c.y<0 || c.y>N-1 || arr[c.x][c.y]!=9999)
					continue;
				arr[c.x][c.y] = Math.min(arr[celll.x][celll.y]+1,arr[celll.x][celll.y]);
				list.add(c);
				if(c.x==startX && c.y==startY) 
					return arr[c.x][c.y]; 
				
			}
			}
			return  -1;
		}

	public static cell[] getTransformations(cell cell) {
		cell[] cells = new cell[8];
		for(int i=0;i<8;i++) {
			cells[i] = new cell(cell.x+X[i],cell.y+Y[i]);
		}
		return cells;
	}
	public static void main(String[] args)
	{
		int N=10;
		int startX= 0;
		int startY= 0;
		int endX=0;
		int endY=0;
		int minSteps = minStepsToTarget(startX,startY,endX,endY,N);
		System.out.println(minSteps);
		
	}

}
