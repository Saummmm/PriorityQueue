/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.Comparator;

/**
 *
 * @author saum
 * @param <K>
 * @param <V>
 */
public abstract class AbstractPriorityQueue<K, V> implements IntPriorityQueue<K, V> {

    protected static class PQEntry<K, V> implements Entry<K,V> {

        private K k;
        private V v;

        public PQEntry(K key, V value) {
            k = key;
            v = value;
        }

        public K getKey() {
            return k;
        }

        public V getValue() {
            return v;
        }

        protected void setKey(K key) {
            k = key;
        }

        protected void setValue(V value) {
            v = value;
        }

    }

    private Comparator<K> comp;

    protected AbstractPriorityQueue(Comparator<K> c) {
        comp = c;
    }

    protected AbstractPriorityQueue() {
        this(new DefaultComparator<K>());
    }

    protected int compare(Entry<K, V> a, Entry<K, V> b) {
        return comp.compare(a.getKey(), b.getKey());
    }

    protected boolean checkKey(K key) throws IllegalArgumentException {
        try {
            return (comp.compare(key, key) == 0);
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("Incompatible Key");
        }
    }
}
