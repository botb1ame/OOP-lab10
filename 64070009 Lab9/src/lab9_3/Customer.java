/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9_3;

/**
 *
 * @author LAB203_04
 */

import java.util.*;

public class Customer {

    private String firstName;
    private String lastName;
    private ArrayList acct;
    private int numOfAccount;

    public Customer() {
        this("", "");
        acct = new ArrayList();
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList();
    }

    public void addAccount(Account acct) {
        this.acct.add(acct);
        numOfAccount++;
    }

    public Account getAccount(int index) {
        return (Account)acct.get(index);
    }

    public int getNumOfAccount() {
        return acct.size();
    }

    public String toString() {
        if (acct == null) {
            return (firstName + " " + lastName + " doesn’t have account.");
        } else {
            return (firstName + " " + lastName + " has " + getNumOfAccount() + " accounts.");
        }
    }
}