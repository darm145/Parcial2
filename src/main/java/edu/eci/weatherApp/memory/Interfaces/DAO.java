package edu.eci.weatherApp.memory.Interfaces;

import java.io.Serializable;
import java.util.List;

public interface DAO<T extends Serializable, PK> {
    public List<T> findAll();
    public T find(PK id);
    public PK save(T entity);
}