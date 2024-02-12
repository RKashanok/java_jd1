package pl.roka.it.lesson8.finalization;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<SimpleObject> soList  = new ArrayList<>();

        for (int i = 0; i < 2_500_0; i++)
        {
//            createObject(i);
			soList.add(createObject(i));
        }

// 		int i = 0;
//		while (true) {
//			soList.add(createObject(i));
//			i++;
//		}

        System.out.println("******************** Size of my list: " + soList.size());
    }

    private static SimpleObject createObject(int number)
    {
        return new SimpleObject("so" + number);
    }
}
