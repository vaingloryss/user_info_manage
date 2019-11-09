package com.vainglory.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author vaingloryss
 * @date 2019/11/8 0008 下午 5:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private String phone;
    @JSONField(format = "yyyy/MM/dd HH:mm:ss")
    private Date gmt_create;
    @JSONField(format = "yyyy/MM/dd HH:mm:ss")
    private Date gmt_modified;
}
