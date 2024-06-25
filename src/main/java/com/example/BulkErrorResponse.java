package com.example;

import java.util.Set;

public class BulkErrorResponse {
    String message;
    Set<ManualConstraintViolation<String>> invalids;

    public String getMessage() {
        return message;
    }

    public Set<ManualConstraintViolation<String>> getInvalids() {
        return invalids;
    }
}
