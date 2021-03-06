package _ch2_hutool.collection;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.lang.Console;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollUtilDemo {

    @Test
    public void main() {

        Map<Integer, Integer> map = new HashMap<>();
//        map.put(1, 2);
        List<Integer> list = new ArrayList<>();
        list.add(1);

        Console.log("{} {} {}",
                CollUtil.isNotEmpty(list),
                CollUtil.isNotEmpty(map),
                MapUtils.isNotEmpty(map));
    }


    @Test
    public void isEmpty () {
        List l = null;

        Console.log(CollUtil.isEmpty(l));
        l = new ArrayList();
        Console.log(CollUtil.isEmpty(l));
        l.add(1);
        Console.log(CollUtil.isEmpty(l));
    }

    @Test
    public void isEmptyDemo() {
        ArrayList<Integer> a = new ArrayList<>();
        Console.log(CollectionUtils.isEmpty(a));
    }


    @Test
    public void varNewColl() {
        ArrayList<Object> objects = CollUtil.newArrayList();
        HashMap<Object, Object> objectObjectHashMap = CollUtil.newHashMap();
        BlockingQueue<Object> objects1 = CollUtil.newBlockingQueue(10, false);
        CopyOnWriteArrayList<Object> objects2 = CollUtil.newCopyOnWriteArrayList(null);
    }

}
