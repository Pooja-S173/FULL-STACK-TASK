package com.example.transactiondb.controller;

import com.example.transactiondb.model.Transaction;
import com.example.transactiondb.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
@CrossOrigin
public class TransactionController {

@Autowired
private TransactionService service;

@GetMapping
public List<Transaction> getTransactions(){
return service.getAllTransactions();
}

@PostMapping
public Transaction addTransaction(@RequestBody Transaction transaction){
return service.saveTransaction(transaction);
}

@DeleteMapping("/{id}")
public void deleteTransaction(@PathVariable Long id){
service.deleteTransaction(id);
}

}