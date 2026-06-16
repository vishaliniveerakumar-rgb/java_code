public class Main
{
	public static void main(String[] args) {
	    int[] queue = new int[3];
	   int front=0,rear=-1;
	    queue[++rear]=(10);
	    queue[++rear]=(20);
	    queue[++rear]=(30);
	    for(int i=front;i<=rear;i++){
	        System.out.println(queue[i]+" ");
	    }
	    System.out.println("remove"+queue[front]);
	    front++;
	    	    for(int i=front;i<=rear;i++){
	        System.out.print(queue[i]+" ");
	    
	    	    }
	    
		
	}
}
