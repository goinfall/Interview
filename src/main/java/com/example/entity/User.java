package com.example.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * user表实体
 *
 * @author 孙忠忠
 * @since 2022-02-20 16:27:02
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    
    private String userName;
    
    private String nickName;

    private Integer age;

    private Integer isDelete;

    private String createBy;

    @JSONField(format = "yyyy-MM-dd")
    private Date createTime;

    private String modifyBy;
    @JSONField(format = "yyyy-MM-dd")
    private Date modifyTime;
}