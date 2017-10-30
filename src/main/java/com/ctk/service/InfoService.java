package com.ctk.service;

import com.ctk.InfoBean;

import java.util.List;

/**
 * Created by tck on 2017/10/30.
 */
public interface InfoService {

    List<InfoBean> getAllInfo();

    Boolean addInfo(String sex,
                    String grade,
                    String major,
                    String playGame,
                    String playGameName,
                    String playGameTime,
                    String playGameAdvantages,
                    String playGameWorth,
                    String playGameLocation,
                    String playGameReason);
}
