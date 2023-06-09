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
public class TicketList extends TypeList<Ticket> {
    
    public TicketList(){
        super();
        this.list = new ArrayList<Ticket>();
    }
    
    public void add(Ticket t) {
        super.add(t);
    }
    
    public void remove(Ticket t) {
        super.remove(t);
    }
    
    public int size(){
        return list.size();
    }

    @Override
    public Iterator<Ticket> iterator() {
        return list.iterator();
    }
}
