package com.ctk.controller;

import com.ctk.InfoBean;
import com.ctk.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by tck on 2017/10/30.
 */
@RestController
public class InfoServiceController {
    @Autowired
    private InfoService infoService;

    @RequestMapping("/getAllInfo")
    public List<InfoBean> getAllInfo() {

        return infoService.getAllInfo();
    }

    @RequestMapping("/addInfo")
    public void addInfo(@RequestParam("sex") String sex,
                        @RequestParam("grade") String grade,
                        @RequestParam("major") String major,
                        @RequestParam("playGame") String playGame,
                        @RequestParam("playGameName") String playGameName,
                        @RequestParam("playGameTime") String playGameTime,
                        @RequestParam("playGameAdvantages") String playGameAdvantages,
                        @RequestParam("playGameWorth") String playGameWorth,
                        @RequestParam("playGameLocation") String playGameLocation,
                        @RequestParam("playGameReason") String playGameReason) {
        infoService.addInfo(sex,
                grade,
                major,
                playGame,
                playGameName,
                playGameTime,
                playGameAdvantages,
                playGameWorth,
                playGameLocation,
                playGameReason);
    }
}
