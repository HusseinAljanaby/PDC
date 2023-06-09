/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2pdc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Husse
 */
public class UserList extends TypeList<User> {

    public UserList() {
        super();
        this.list = new ArrayList<User>();
    }

    public void add(User u) {
        super.add(u);
    }

    public void remove(User u) {
        super.remove(u);
    }

    public int size() {
        return list.size();
    }

    public void getUsers(DBManager manager) throws SQLException {
        ResultSet userSet = manager.queryDB("SELECT * FROM USERS");
        while (userSet.next()) {
            String name = userSet.getString("name");
            int id = userSet.getInt("id");
            String password = userSet.getString("password");

            User user = new User(name, id);
            user.setPassword(password);
            
            this.add(user);
        }
    }

    @Override
    public Iterator<User> iterator() {
        return list.iterator();
    }
}
