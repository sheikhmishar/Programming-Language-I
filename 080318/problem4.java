public class problem4{
    
    public static void main(String[] args){
            int a;
            int sum=0;
            
            for(a=0; a<=600; a++){
            
                if(a%7==0 ^ a%9==0){
                
                    sum+=a;
                
                }
               
            }
            System.out.println(sum);
         
    }
    
}