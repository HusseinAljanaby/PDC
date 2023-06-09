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
public class Id implements Comparable<Id> {

    //Random instance.
    Random rand;
    //A hexadecimal hash identifying the Id.
    String token;

    //Initialize a new ID instance with a new ID,
    public Id() {
        //Set the id.
        this.token = setId();
    }

    //Initialze a previously used ID.
    public Id(String id) {
        this.token = id;
    }

    //Set a random hexadecimal hash as the token.
    public String setId() {
        this.rand = new Random();
        String hash = "";

        //For each digitt out of 16, change a random integer from 0 16 to a hexadecimal number.
        for (int i = 0; i < 16; i++) {
            hash += Integer.toHexString(rand.nextInt(16));
        }

        return hash;
    }

    //Compare between two Ids by returning the difference in value of the tokens.
    //Between the current and other Id.
    @Override
    public int compareTo(Id o) {
        int a = Integer.parseInt(this.token, 16);
        int b = Integer.parseInt(o.token, 16);

        return a - b;
    }

    //Check if the Id are equal (having equal tokens).
    public boolean equals(Id o) {
        return this.token.equals(o.token);
    }

    //Return the token as a representation of the Id.
    public String toString() {
        return this.token;
    }
}
