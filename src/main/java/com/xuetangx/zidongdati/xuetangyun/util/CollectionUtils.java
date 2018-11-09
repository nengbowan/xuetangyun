package com.xuetangx.zidongdati.xuetangyun.util;

import java.util.Collection;
import java.util.List;

public class CollectionUtils {
    public static boolean isEmpty(List list){
        return list == null || list.size() == 0;
    }
    public static boolean isNotEmpty(List list){
        return !isEmpty(list);
    }
}
