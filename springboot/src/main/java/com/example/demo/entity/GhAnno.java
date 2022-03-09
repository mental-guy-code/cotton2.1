package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("gh_anno")
@Data
public class GhAnno {
    @TableId(value = "geneid", type = IdType.AUTO)
    private String geneid;
    private String at_id;
    private String at_desc;
    private String swiss_id;
    private String swiss_desc;


}
