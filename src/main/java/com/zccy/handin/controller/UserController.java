package com.zccy.handin.controller;

import com.zccy.handin.entity.User;
import com.zccy.handin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getuser/{id}",method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    /*
    * @ResponseBody并不是以json返回。不加@ResponseBody，
    * 是将方法返回的值作为视图名称，并自动匹配视图去显示，
    * 而加上@ResponseBody就仅仅是将方法返回值当作内容直接返回到客户端，
    * 并且会自适应响应头的content-type，返回的字符串符合json，
    * 那么content-type就是application/json，如果是普通字符串，
    * 就是text/plain，但是加上注解属性produces=application/json，
    * 那么不管内容是什么格式，响应头的content-type就一直是application/json，
    * 不再去做自适应，至于内容是不是json都不重要了
    * */
    public User GetUser(@PathVariable int id){
        return userService.Sel(id);
    }
}
