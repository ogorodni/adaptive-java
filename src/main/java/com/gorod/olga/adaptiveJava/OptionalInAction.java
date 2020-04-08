package com.gorod.olga.adaptiveJava;

import java.util.*;
//3.176 Optional in action
//1. You need to write a method findUserByLogin(String login) that returns an optional value of type Optional<User>. If the user exists in the users set you need to return non-empty optional wrapping the user inside, otherwise returned optional should be empty.
//2. Using the method you've written for finding an user by their login, write a new method printBalanceIfNotEmpty(String userLogin)that prints an account balance for an existing user if `balance > 0`. In this case, the result format should print the string:
//        login: balance
//        If the user is not found, account is null or the balance = 0, then the method should not print anything.
//        Do not forget to use optional for avoiding NPE.


public class OptionalInAction {

    private static final Set<User> users = new HashSet<User>();

    OptionalInAction() {
        users.add(new User("User1", 12));
        users.add(new User("User2", 46));
        users.add(new User("User3", 0));
    }

    public static Optional<User> findUserByLogin (String login){
        for (User it : users) {
            if (it.login.equals(login)) {
                return Optional.of(it);
            }
        }
        return Optional.empty();
    }

    public static void printBalanceIfNotEmpty(String userLogin) {
        Optional<User> user = findUserByLogin(userLogin);
        if(user.isPresent() && user.get().account != null && user.get().account.balance>0 ){
            System.out.println(user.get().login + ": " + user.get().account.balance);
        }
    }

    private static class User {
        String login;
        Account account;

        User(String login,int balance) {
            this.login = login;
            this.account = new Account(balance);
        }

        @Override
        public String toString() {
            return "login: " + login + " " + account.toString();
        }
    }

    private static class Account {
        public int balance;

        public Account(int balance) {
            this.balance = balance;
        }

        @Override
        public String toString() {
            return "balance: " + balance;
        }
    }

    public static void main(String[] args) throws Exception {
        OptionalInAction optionalInAction=new OptionalInAction();
        Scanner in = new Scanner(System.in);
        String login = in.next();

        System.out.println(optionalInAction.findUserByLogin(login));
        optionalInAction.printBalanceIfNotEmpty(login);

        in.close();
    }
}