/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9_12.lab9;

/**
 *
 * @author LAB203_04
 */

public class Customer {

    private String firstName;
    private String lastName;
    private Account acct[];
    private int numOfAccount;

    public Customer() {
        this("", "");
        acct = new Account[5];
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
    }

    public void addAccount(Account acct) {
        this.acct[numOfAccount] = acct;
        numOfAccount++;
    }

    public Account getAccount(int index) {
        return acct[index];
    }

    public int getNumOfAccount() {
        return numOfAccount;
    }

    public String toString() {
        if (acct == null) {
            return (firstName + " " + lastName + " doesn’t have account.");
        } else {
            return (firstName + " " + lastName + " has " + getNumOfAccount() + " accounts.");
        }
    }
}