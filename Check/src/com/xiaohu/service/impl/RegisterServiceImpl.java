package com.xiaohu.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xiaohu.dao.UserDao;
import com.xiaohu.domain.User;
import com.xiaohu.domain.UserExample;
import com.xiaohu.service.IRegisterService;

@Service("registerService")  
public class RegisterServiceImpl implements IRegisterService{  
    @Resource  
    private UserDao userDao;  
  
    @Override  
    public int insert(User record) {      
        try {  
            return userDao.insert(record);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return 0;  
    }  
  
    @Override  
    public int countByExample(UserExample example) {  
        try {  
            return userDao.countByExample(example);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return 0;  
    }  
  
}  
