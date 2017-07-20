import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {

        List<Integer> list = new ArrayList<Integer>();
        int temp = number;

        if(number == 1) return list;

        for(int i=2;i<=number;i++){
            if(temp%i==0){
                list.add(i);
                temp = temp/i;
                i=1;
            }
        }

        return list;
    }
}