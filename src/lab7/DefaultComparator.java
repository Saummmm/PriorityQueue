/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 *
 * @author saum
 */
public class DefaultComparator<E> implements Comparator<E>{

    @Override
    public int compare(E a, E b) throws ClassCastException{
        return ((Comparable<E>)a).compareTo(b);
    }

    @Override
    public Comparator<E> reversed() {
        return Comparator.super.reversed(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comparator<E> thenComparing(Comparator<? super E> other) {
        return Comparator.super.thenComparing(other); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <U> Comparator<E> thenComparing(Function<? super E, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<E> thenComparing(Function<? super E, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comparator<E> thenComparingInt(ToIntFunction<? super E> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comparator<E> thenComparingLong(ToLongFunction<? super E> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comparator<E> thenComparingDouble(ToDoubleFunction<? super E> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor); //To change body of generated methods, choose Tools | Templates.
    }
    
}
