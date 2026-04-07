package com.example.transactiondb.service;

import com.example.transactiondb.model.Transaction;
import com.example.transactiondb.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

@Autowired
private TransactionRepository repository;

public List<Transaction> getAllTransactions() {
return repository.findAll();
}

public Transaction saveTransaction(Transaction transaction) {
return repository.save(transaction);
}

public void deleteTransaction(Long id){
repository.deleteById(id);
}

}