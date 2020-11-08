package com.a_linOnline.demo.user.entity;

import com.a_linOnline.demo.util.BaseEntity;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class UserBatch extends BaseEntity implements Serializable {
    private String tokenBackend;  // 管理员token
    private List<String> userList;  // 用户列表
}
