package com.dbgs.xiaozhong.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sanba")
public class SanBa {

    @RequestMapping("/happy")
    public String beauty(){
        return "女神节快乐！";
    }

}
