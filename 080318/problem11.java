public class problem11{
    
    public static void main(String[] args){
        
        for(int num=40; num<=50; num++){
            int divCount=0;
            for(int count = 1; count <= num; count++){
                if ( num%count==0){
                    divCount++;
                }
            }
            if ( divCount==2){
                System.out.println(num);
            }
        }
    }
    
}