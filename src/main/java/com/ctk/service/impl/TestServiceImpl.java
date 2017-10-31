package com.ctk.service.impl;

import com.ctk.mappper.TestMapper;
import com.ctk.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/10/31 0031.
 */
@Service
public class TestServiceImpl implements TestService{

    @Autowired
    private TestMapper testMapper;

    @Override
    public Boolean addSex(String sex) {
        return testMapper.addSex(sex);
    }
}
