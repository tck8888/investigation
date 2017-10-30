package com.ctk.service.impl;

import com.ctk.InfoBean;
import com.ctk.mappper.InfoMapper;
import com.ctk.service.InfoService;
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
    public List<InfoBean> getAllInfo() {

        return infoMapper.getAllInfo();
    }

    @Override
    public Boolean addInfo(String sex, String grade, String major, String playGame, String playGameName, String playGameTime, String playGameAdvantages, String playGameWorth, String playGameLocation, String playGameReason) {
        infoMapper.addInfo(sex,
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
        return null;
    }
}
