package de.st.logic;

import java.util.ArrayList;
import java.util.List;

public class GeneratePrimes implements NumberGenerator<Number>{
    @Override
    public List<Number> generateNumbers(int length) {
        ArrayList<Number> result = new ArrayList<>();
        do {
            fillAndExpand(result);
            primeSieve(result)
        } while(result.size() < length);
        return result.subList(0, length);
    }

    private void fillAndExpand(List<Number> toExpand){
        if(toExpand != null){
            for(int i = (int) toExpand.get(toExpand.size()); i < Math.max(toExpand.size()*5/4, 5); i++){
                toExpand.add(i);
            }
        }
    }
    private void primeSieve(List<Number> toFilter){

        System.out.println("""
        Being locked within an old and lost animation studio you are confronted
        with the studios greatest creation and must find a way through its grave depths.
        """);

    }
}
