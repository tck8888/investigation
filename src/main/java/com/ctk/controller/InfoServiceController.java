package com.ctk.controller;

import com.ctk.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by tck on 2017/10/30.
 */
@RestController
public class InfoServiceController {

    @Autowired
    private InfoService infoService;

    @RequestMapping("/getAllInfo")
    public String getAllInfo() {

        return "success_jsonpCallback(" + infoService.getAllInfo() + ")";
    }

    @RequestMapping("/app/getAllInfo")
    public String getAllInfo1() {

        return infoService.getAllInfo();
    }

    @RequestMapping("/addInfo")
    public String addInfo(@RequestParam("sex") String sex,
                          @RequestParam("grade") String grade,
                          @RequestParam("major") String major,
                          @RequestParam("playGame") String playGame,
                          @RequestParam("playGameName") String playGameName,
                          @RequestParam("playGameTime") String playGameTime,
                          @RequestParam("playGameAdvantages") String playGameAdvantages,
                          @RequestParam("playGameWorth") String playGameWorth,
                          @RequestParam("playGameLocation") String playGameLocation,
                          @RequestParam("playGameReason") String playGameReason) {
        String addInfo = infoService.addInfo(sex,
                grade,
                major,
                playGame,
                playGameName,
                playGameTime,
                playGameAdvantages,
                playGameWorth,
                playGameLocation,
                playGameReason);

        return "success_jsonpCallback(" + addInfo + ")";
    }

    @RequestMapping("/app/addInfo")
    public String addInfo1(@RequestParam("sex") String sex,
                           @RequestParam("grade") String grade,
                           @RequestParam("major") String major,
                           @RequestParam("playGame") String playGame,
                           @RequestParam("playGameName") String playGameName,
                           @RequestParam("playGameTime") String playGameTime,
                           @RequestParam("playGameAdvantages") String playGameAdvantages,
                           @RequestParam("playGameWorth") String playGameWorth,
                           @RequestParam("playGameLocation") String playGameLocation,
                           @RequestParam("playGameReason") String playGameReason) {
        String addInfo = infoService.addInfo(sex,
                grade,
                major,
                playGame,
                playGameName,
                playGameTime,
                playGameAdvantages,
                playGameWorth,
                playGameLocation,
                playGameReason);

        return "success_jsonpCallback(" + addInfo + ")";
    }
}
