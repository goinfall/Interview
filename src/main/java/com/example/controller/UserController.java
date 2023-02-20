package com.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * user表控制层
 *
 * @author 孙忠忠
 * @since 2022-02-20 16:18:02
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryOne")
    public String queryOne(Long id) {
        return JSONObject.toJSONString(userService.queryOne(id));
    }

    @PostMapping("/insertOne")
    public String insertOne(@RequestBody User user) {
        return JSONObject.toJSONString(userService.insert(user));
    }

    @PostMapping("/edit")
    public String edit(@RequestBody User user) {
        user.setModifyTime(new Date());
        return JSONObject.toJSONString(userService.update(user));
    }

    @GetMapping("/delete")
    public boolean delete(String ids) {
        if(!StringUtils.isEmpty(ids)){
            List<Long> idList = Arrays.stream(ids.split(",")).distinct().map(Long::valueOf).collect(Collectors.toList());
            return userService.delete(idList);
        }else{
            return Boolean.FALSE;
        }
    }

}