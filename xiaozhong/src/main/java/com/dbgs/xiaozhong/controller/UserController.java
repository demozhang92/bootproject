package com.dbgs.xiaozhong.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

        @RestController
        @RequestMapping("/user")
        public class UserController {

            /**
             *
             *
             * @return
             */
            @RequestMapping("/get")
            public String gett(){
        System.out.println("你好啊！");
        return "正山小种";
    }
}
