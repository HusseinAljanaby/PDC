/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2pdc;

import java.util.Random;

/**
 *
 * @author Husse
 */
public class Ticket {

    //A 3-Dimensional array that stores hard-coded ticket types and their respective classes (Not source code classes).
    //The syntax is as follows: 
    //{{{"Ticket Type1"}, {Type1-Class1, Type1-Class1 $Price}, {Type1-Class2, Type1-Class2 $Price}}, 
    //  {"Ticket Type2"}, {Type2-Class1, Type2-Class1 $Price}, {Type2-Class2, Type2-Class2 $Price}}}
    public static String[][][] types = {{{"Game"}, {"Front Row", "149.99"}, {"Middle Row", "99.99"}, {"Back Row", "49.99"}},
    {{"Movie"}, {"Regular", "29.99"}, {"3D", "39.99"}, {"Luxury", "49.99"}},
    {{"Transport"}, {"Taxi", "89.99"}, {"Bus", "2.99"}, {"Train", "3.99"}, {"Ferry", "5.99"}},
    {{"Flight"}, {"Economy", "129.99"}, {"Business", "249.99"}, {"First Class", "499.99"}}};
    //The type indices of the current ticket instance.
    private int[] type = new int[2];
    //The id instance of the current ticket
    private Id id;
    //An instsnce of the Random class.
    private Random rand;
    //The price of the ticket.
    private float price;
    
    //Initialize the ticket completely, used when initializing from memory.
    public Ticket(int[] t, String id) {
        rand = new Random();
        this.id = new Id(id);
        this.type = t;
        this.price = Float.parseFloat(types[this.type[0]][this.type[1]][1]);
    }

    //Initialize a ticket with a certain type, used for new tickets.
    public Ticket(int[] t) {
        rand = new Random();
        this.type = t;
        this.price = Float.parseFloat(types[this.type[0]][this.type[1]][1]);
    }

    //Set the id for the ticket by checking if an id already exists.
    public void setId(Id[] ids) {
        boolean exists = false;

        //Initialize the id to avoid a null-pointer-exception.
        if (this.id == null) {
            this.id = new Id();
        }

        //The loop to check if an id has been used already.
        do {
            exists = false;
            this.id.token = this.id.setId();

            for (Id hex : ids) {
                if (hex != null) {
                    if (hex.equals(this.id)) {
                        exists = true;
                        break;
                    }
                }
            }
        } while (exists);
    }
    
    //Return the id instance.
    public Id getId() {
        return this.id;
    }

    //Return the indices of the ticket type.
    public String getType() {
        return this.type[0] + " " + this.type[1];
    }

    //Return the type of the ticket as a readable string.
    public String getName() {
        return types[this.type[0]][this.type[1]][0];
    }

    //Return the price of the ticket.
    public float getPrice() {
        return this.price;
    }

    //Return a readable representation of the ticket.
    public String toString() {
        String s = "";

        String genre = types[this.type[0]][0][0];
        String tClass = types[this.type[0]][this.type[1]][0];

        s += tClass + " " + genre;

        return s;
    }
}