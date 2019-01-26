package com.lizq.design.behavioral.memento;

import java.lang.instrument.UnmodifiableClassException;
import java.util.HashMap;
import java.util.Map;

/**
 * 操作备忘录，备忘录的管理员
 * 保存多个时刻的快照
 *
 * @author lizq
 * @date 2019/01/26 21:24
 */
public class MultipartCaretaker {

    /**
     * 允许保存的快照最大数量， 因为无限的保存会导致内存泄露
     */
    private static final int MAX_MEMENTO = 10;

    private Map<String, Memento> mementoMap = new HashMap<>();

    public void setMemento(String id, Memento memento) throws Exception {
        if (mementoMap.size() > MAX_MEMENTO) {
            throw new Exception("最多缓存" + MAX_MEMENTO + "份快照");
        }
        mementoMap.put(id, memento);
    }

    public Memento getMemento(String id) {
        return mementoMap.get(id);
    }

    public Memento removeMemento(String id) {
        return mementoMap.remove(id);
    }

}
