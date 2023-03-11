package ListeSinifi;

public class Mylist<T>{

    private T[] list;
    
    Mylist(){
        this.list= (T[])new Object[10];

    }
    Mylist(int capacity){
        this.list= (T[])new Object[capacity];

    }
    int getCapacity(){
        int total=0;
       for(int i=0;i<list.length;i++){
           total++;
       }
        return total ;
    }
    public int size(){
        int total=0;
        for (int i = 0;i<list.length;i++){
            if (list[i]==null){
                total++;
            }
        }
        return list.length-total;
    }

    public void add(T data){
        if (list[list.length-1]!=null){
            int a = list.length*2;
            T[] copylist= (T[])new Object[a];
            for(int i=0;i<list.length;i++){
                copylist[i]=list[i];
            }
           this.list=(T[])new Object[a];
            for(int i=0;i<list.length;i++){
                list[i]=copylist[i];
            }

        }
        int total=0;
        for (int i = 0;i<list.length;i++){
            if (list[i]==null){
                list[i]=data;
                break;
            }
        }

    }

    public void get(int index){
        if (this.list[index]==null){
            System.out.println("null");
        }
        System.out.println(this.list[index]);
    }

   public void remove(int index){
       if (this.list[index]==null){
           System.out.println("null");
       }
       this.list[index]=null;
       for (int i=0;i<list.length;i++){
           if(this.list[i]==null){
               if (i==this.list.length-1) break;
               this.list[i]=this.list[i+1];
               this.list[i+1]=null;
           }
       }
   }

    public void set(int index, T data){
        this.list[index]=data;
    }
    public void  tooString(){
        for (int i=0;i<this.list.length;i++){
            if (this.list[i]!=null){

                System.out.print(this.list[i]+"  ");
            }
        }
        System.out.println();
    }
     public int indexOf(T data){
        for(int i=0;i<this.list.length;i++){
            if (this.list[i]==data){
                return i;
            }
        }

     return -1;
    }

     public int lastIndexOf(T data){
        for(int i=this.list.length-1;0<=i;i--){
            if (this.list[i]==data){
                return i;
            }
        }
    return -1;
    }

   public void clear(){

        for (int i=0;i<this.list.length;i++){
            this.list[i]=null;
        }
       this.list=(T[])new Object[10];
   }

   public boolean isEmpty(){
        for (int i=0;i<this.list.length;i++){
            if (this.list[i]!=null) return false;
        }
        return true;
   }

    boolean contains(T data){
        for (int i=0;i<this.list.length;i++){
            if (this.list[i]==data) return true;
        }
        return false;
    }

    public T []toArray(){

        T[] yeni=(T[])new Object[this.getCapacity()];


        for (int i =0;i<this.list.length;i++){
            yeni[i]=this.list[i];
        }

           return yeni;
    }
   public T [] sublist(int start, int finish){
       int size=finish+1-start;
       T[] yeni1=(T[])new Object[size];

       for (int i =start;i<finish;i++){
           yeni1[i]= (T) this.list[i];
       }
       return yeni1;
    }

}
