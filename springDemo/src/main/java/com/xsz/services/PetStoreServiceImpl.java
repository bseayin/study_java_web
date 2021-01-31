package com.xsz.services;

import com.xsz.dao.JpaAccountDao;
import com.xsz.dao.JpaItemDao;

import java.util.Arrays;
import java.util.List;

public class PetStoreServiceImpl implements PetStoreService {
    public JpaAccountDao accountDao;
    public JpaItemDao itemDao;
    @Override
    public List<String> getUsernameList() {
        return Arrays.asList("张三","李四","周瑜");
    }

    public JpaAccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(JpaAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public JpaItemDao getItemDao() {
        return itemDao;
    }

    public void setItemDao(JpaItemDao itemDao) {
        this.itemDao = itemDao;
    }
}
