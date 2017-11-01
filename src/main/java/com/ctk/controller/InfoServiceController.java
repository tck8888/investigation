package com.ctk.controller;


import com.ctk.JsonCallback;
import com.ctk.service.InfoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
        String str = "";
        JsonCallback jsonCallback = new JsonCallback();
        jsonCallback.setmDataList(infoService.getAllInfo());
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            str = objectMapper.writeValueAsString(jsonCallback);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "success_jsonpCallback(" + str + ")";
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
