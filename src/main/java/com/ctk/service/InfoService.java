package com.ctk.service;

import com.ctk.entity.InfoBean;

import javax.print.DocFlavor;
import java.util.List;

/**
 * Created by tck on 2017/10/30.
 */
public interface InfoService {

    String getAllInfo();

    String addInfo(String sex,
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
