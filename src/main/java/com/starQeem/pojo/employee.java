package com.starQeem.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("employee")
public class employee {
    @TableId(type= IdType.AUTO)
    private Integer id;
    private String sex;
    private String nickName;
    private Integer age;
    private String address;
}
