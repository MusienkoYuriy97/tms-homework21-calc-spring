package by.teach.calc.dao;

import by.teach.calc.entity.Operation;

import java.util.List;

public interface OperationDao {
    void add(Operation operation);
    List<Operation> getOperations();
}
