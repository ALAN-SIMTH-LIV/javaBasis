package org.demo.mybaitsplusmysql.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName(value = "users")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @TableId(type = IdType.AUTO)
    private Integer id;
    @TableField(value = "name")
    private String name;
    @TableField(value = "age")
    private String age;
    @TableField(value = "sex")
    private Integer sex;
}
