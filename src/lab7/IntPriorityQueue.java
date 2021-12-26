/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author saum
 */
public interface IntPriorityQueue<K, V> {

    int size();

    boolean isEmpty();

    public interface Entry<K, V> {

        K getKey();

        V getValue();
    }

    Entry<K, V> insert(K key, V value) throws IllegalArgumentException;

    Entry<K, V> min();

    Entry<K, V> removeMin();
}
