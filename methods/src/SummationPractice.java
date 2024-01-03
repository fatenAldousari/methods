import java.util.ArrayList;
import java.util.List;

public class SummationPractice {
   
    public static void main(String[] args) {

     List<Integer> value = new ArrayList<>();
    value.add(1);
    value.add(2);
    value.add(3);
    System.out.println(sumCalc(value));

    

    }

    public static int sumCalc(List<Integer> inpuList){ 

    int sum =0;
    for(int i =1; i<inpuList.size();i++){
        sum+=inpuList.get(i);
    }
        
        return sum;

    }
    
    

    }
        
        
    


                           
                        

