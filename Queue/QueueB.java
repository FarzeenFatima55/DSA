package Queue;

public class QueueB {
    static class Queue {
        static int arr[];
        static int size ;
        static int rear;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
        //for normal array O(n)
        /*public static boolean isEmpty(){
            return rear == -1;
        }*/

        //for circular array
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        //for circular array queue
        public static boolean isFull(){
            return(rear+1)%size == front;
        }

       /*  public static void add (int data){
            if(rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }*/

        public static void add (int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            //add first element
            if(front==-1){
                front = 0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;}


        /*public static int Remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = arr[0];
            for(int i = 0 ; i<rear ; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }*/
        //for circular queue
        public static int Remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int result = arr[front];

            //last el delt
            if(rear==front){
                rear = front = -1;
            } else {
                front = (front+1)%size;
            }
            return result;
            }
        
        

        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            //return arr[0]; //front
            return arr[front];//for circular
        }
    }

    
    public static void main(String[] args) {
        Queue qu = new Queue(5);
        qu.add(1); //first in first out
        qu.add(2);
        qu.add(3);
       
        System.out.println(qu.Remove());
        qu.add(4);
        System.out.println(qu.Remove());
        qu.add(5 );

        while(!qu.isEmpty()){
            System.out.println(qu.peek());
            qu.Remove();
        }
    }
}
