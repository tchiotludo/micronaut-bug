package com.example;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Path;
import jakarta.validation.metadata.ConstraintDescriptor;

public class ManualConstraintViolation<T> implements ConstraintViolation<T> {
    @Override
    public <C> C unwrap(Class<C> type) {
        throw new IllegalArgumentException("Type " + type.getName() + " not supported for unwrapping.");
    }

    @Override
    public String getMessage() {
        return "";
    }

    @Override
    public String getMessageTemplate() {
        return "";
    }

    @Override
    public T getRootBean() {
        return null;
    }

    @Override
    public Class<T> getRootBeanClass() {
        return null;
    }

    @Override
    public Object getLeafBean() {
        return null;
    }

    @Override
    public Object[] getExecutableParameters() {
        return new Object[0];
    }

    @Override
    public Object getExecutableReturnValue() {
        return null;
    }

    @Override
    public Path getPropertyPath() {
        return null;
    }

    @Override
    public Object getInvalidValue() {
        return null;
    }

    @Override
    public ConstraintDescriptor<?> getConstraintDescriptor() {
        return null;
    }
}
