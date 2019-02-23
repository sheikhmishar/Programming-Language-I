public class problem1d{
    
    public static void main(String[] args){
        
        for(int a = 18; a <= 63; a+=9){
            
            if (a == 63){
                
                System.out.print(-a+"\n");
                
            }
            else{
                if (a%2==0){
                    
                    System.out.print(a+", ");
                }
                if (a%2!=0){
                    
                    System.out.print(-a+", ");
                }
                
            }
            
        }
        
    }
    
}