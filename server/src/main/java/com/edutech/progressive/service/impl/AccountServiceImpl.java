package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.edutech.progressive.dao.AccountDAO;
import com.edutech.progressive.dao.AccountDAOImpl;
import com.edutech.progressive.entity.Accounts;

public class AccountServiceImpl  {


    private AccountDAO accountDAO;
public AccountServiceImpl(AccountDAOImpl accountDAO) {
this.accountDAO = accountDAO;
}
public List<Accounts> getAllAccounts() throws SQLException{
    return null;
}
public int addAccount(Accounts accounts) throws SQLException {
    return -1;
}
public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
    return null;
}
public List<Accounts> getAccountsByUser(int userld) throws SQLException {
    return null;
}
public Accounts getAccountById(int accountld) throws SQLException {
    return null;
}
public void updateAccount(Accounts accounts) throws SQLException {
    return;
}
public void deleteAccount(int accountld) throws SQLException {
    return;
}
}