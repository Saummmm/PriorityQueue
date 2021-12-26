/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.Comparator;
import java.util.Iterator;
import lab7.PositionalList.Position;

/**
 *
 * @author saum
 */
public class PriorityQueue<K, V> extends AbstractPriorityQueue<K, V> {

    private LinkedPositionalList<Entry<K, V>> list = new LinkedPositionalList<>();

    public PriorityQueue() {
        super();
    }

    public PriorityQueue(Comparator<K> comp) {
        super(comp);
    }

    @Override
    public Entry<K, V> insert(K key, V value) throws IllegalArgumentException, NullPointerException {

        checkKey(key);
        Entry<K, V> newest = new PQEntry<>(key, value);
        Position<Entry<K, V>> walk = list.first();
        while (walk != null && compare(newest, walk.getElement()) >= 0) {
            walk = list.before(walk);
        }
        if (walk == null) {
            list.addLast(newest);
        } else {
            list.addBefore(walk, newest);
        }
        return newest;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Entry<K, V> min() {
        if (list.isEmpty()) {
            return null;
        }
        return list.first().getElement();
    }

    @Override
    public Entry<K, V> removeMin() {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(list.first());
    }

    public void traverse() {
        Iterable<Position<Entry<K, V>>> it = list.positions();
        Iterator<Position<Entry<K, V>>> i = it.iterator();
        while (i.hasNext()) {
            System.out.println(i.next().getElement().getValue());
        }
    }
}
