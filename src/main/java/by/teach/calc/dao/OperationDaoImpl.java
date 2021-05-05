package by.teach.calc.dao;

import by.teach.calc.entity.Operation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OperationDaoImpl implements OperationDao {
    private static List<Operation> operations = new ArrayList<>();

    public void add(Operation operation){
        operations.add(operation);
    }

    public List<Operation> getOperations() {
        return operations;
    }
}
