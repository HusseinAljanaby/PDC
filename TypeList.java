/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2pdc;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Husse
 */
public class TypeList<E> implements Iterable<E> {

    ArrayList<E> list;
    
    public TypeList() {
        this.list = new ArrayList<E>();
    }

    public E get(int index) {
        return this.list.get(index);
    }
    
    public void add(E u) {
        list.add(u);
    }

    public void remove(E u) {
        list.remove(u);
    }

    public int size() {
        return list.size();
    }
    
    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }
}
