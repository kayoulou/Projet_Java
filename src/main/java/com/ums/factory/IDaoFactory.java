package com.ums.factory;

import com.ums.dao.IDao;

public interface IDaoFactory {
    <T> IDao<T> getDao(Class<T> entityClass);
}
