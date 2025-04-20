package algoritmos;

import java.util.List;

public class diffminima {

    
public static long minimumLoss(long resultado,int index, List<Long> price, int n) {
    // Write your code here
        
        if(price.size() == index){
            return resultado;
        }else{
            for (int i = index + 1; i < n; i++) {
                long diff = (price.get(index)- price.get(i));
                
                if( diff< resultado && diff >= 0 || diff >= 0 && resultado < 0) resultado = diff;
            }
                
            resultado= minimumLoss(resultado,index + 1, price,n);
            return resultado;
        }
    }    
}

