package com.xiaohu.service;

import com.xiaohu.domain.User;
import com.xiaohu.domain.UserExample;

public interface IRegisterService {  
    
    public int insert(User record);  
      
    public int countByExample(UserExample example);  
  
}  