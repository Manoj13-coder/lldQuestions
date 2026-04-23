package Implementations.Spitwise;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private int groupId;
    private String name;
    private List<User> users;
    private List<TransactionRecord> transactionRecords;

    public Group(String name){
        this.name = name;
        users = new ArrayList<>();
        transactionRecords = new ArrayList<>();
    }

    public void setGroupId(int id){
        this.groupId = id;
    }

    public int getGroupId(){
        return groupId;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void addUser(User user){
        users.add(user);
    }

    public void removeUser(User user){
        users.remove(user);
    }

    public void addTransactionRecord(TransactionRecord transactionRecord){
        transactionRecords.add(transactionRecord);
    }

    public void removeTransactionRecord(TransactionRecord transactionRecord){
        transactionRecords.remove(transactionRecord);
    }

    public List<TransactionRecord> getTransactionRecords(){
        return new ArrayList<>(transactionRecords);
    }

}
