package TopInterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class TopInterview380 {
    HashMap<Integer, Integer> hashMap;
    ArrayList<Integer> arrayList;
    Random random = new Random();

    public TopInterview380() {
        hashMap = new HashMap<>();
        arrayList = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (hashMap.containsKey(val))
            return false;
        arrayList.add(val);
        hashMap.put(val, arrayList.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!hashMap.containsKey(val))
            return false;
        int lastindex = arrayList.size() - 1;
        int lastvalue = arrayList.get(lastindex);
        int valindex = hashMap.get(val);
        arrayList.set(valindex, lastvalue);
        hashMap.put(lastvalue, valindex);
        arrayList.remove(lastindex);
        hashMap.remove(val);
        return true;
    }

    public int getRandom() {
        return arrayList.get(random.nextInt(arrayList.size()));
    }
}
