package assignment2pdc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Husse
 */
public class User {

    //An array of the user's tickets.
    private TicketList tickets;
    //A unique number identifying the user.
    private int id;
    //The username of the user.
    public String name;
    //The password of the user
    private String password = "";

    //Initialize the user with a specified name and id.
    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //Add a ticket to the user by appending the array.
    public void addTicket(Ticket t) {
        //Simple ArrayList add
        this.tickets.add(t);
    }

    //Set all the tickets to a given array.
    public void setTickets(Ticket[] t) {
        this.tickets = new TicketList();
        
        for(Ticket ticket : t) {
            this.tickets.add(ticket);
        }
    }

    //Return the tickets array.
    public Ticket[] getTickets() {
        Ticket[] aTickets = new Ticket[this.tickets.size()];
        
        for(int i = 0; i < aTickets.length; i++) {
            aTickets[i] = this.tickets.get(i);
        }
        
        return aTickets;
    }

    //Return the id number of the user.
    public int getId() {
        return this.id;
    }

    //Check if the usernames are equal between the current user and another.
    public boolean equals(User other) {
        return this.name.equalsIgnoreCase(other.name);
    }

    //Sets the password of the user
    public void setPassword(String p) {
        this.password = p;
    }
    
    public boolean isPassword(String p) {
        return this.password.equals(p);
    }
}
