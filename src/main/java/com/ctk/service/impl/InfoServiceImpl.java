package com.ctk.service.impl;


import com.ctk.base.BaseData;
import com.ctk.entity.InfoBean;
import com.ctk.mappper.InfoMapper;
import com.ctk.service.InfoService;
import com.ctk.utils.GetBaseDataUtil;
import com.ctk.utils.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by tck on 2017/10/30.
 */
@Service
public class InfoServiceImpl implements InfoService {

    @Autowired
    private InfoMapper infoMapper;

    @Override
    public String getAllInfo() {
        String str = "";
        try {
            List<InfoBean> allInfo = infoMapper.getAllInfo();
            if (allInfo == null) {
                BaseData<List<InfoBean>> infoBeanList = GetBaseDataUtil.<List<InfoBean>>getData(allInfo, 500, "请求失败");
                str = JsonUtils.getInstance().getObjectMapper().writeValueAsString(infoBeanList);
            } else {
                BaseData<List<InfoBean>> infoBeanList = GetBaseDataUtil.<List<InfoBean>>getData(allInfo, 200, "请求成功");
                str = JsonUtils.getInstance().getObjectMapper().writeValueAsString(infoBeanList);
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return str;
    }

    @Override
    public String addInfo(String sex, String grade, String major, String playGame, String playGameName, String playGameTime, String playGameAdvantages, String playGameWorth, String playGameLocation, String playGameReason) {
        Boolean aBoolean = infoMapper.addInfo(sex,
                grade,
                major,
                playGame,
                playGameName,
                playGameTime,
                playGameAdvantages,
                playGameWorth,
                playGameLocation,
                playGameReason
        );
        String str = "";
        try {
            if (aBoolean) {
                BaseData<String> data = GetBaseDataUtil.<String>getData("插入成功", 200, "请求成功");
                str = JsonUtils.getInstance().getObjectMapper().writeValueAsString(data);
            } else {
                BaseData<String> data = GetBaseDataUtil.<String>getData("插入失败", 500, "请求成功");
                str = JsonUtils.getInstance().getObjectMapper().writeValueAsString(data);
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return str;
    }
}
