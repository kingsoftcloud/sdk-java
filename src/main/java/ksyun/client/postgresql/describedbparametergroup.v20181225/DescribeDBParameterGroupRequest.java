package ksyun.client.postgresql.describedbparametergroup.v20181225;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeDBParameterGroupRequest
* @Description 请求参数
*/
@Data
public class DescribeDBParameterGroupRequest{
    /**参数组id*/
    @KsYunField(name="DBParameterGroupId")
    private String DBParameterGroupId;

    /**获取记录开始偏移量

##### 默认：0,仅查询列表生效*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**每页结果中包含的最大条数

##### 默认：10,区间10~100，仅查询列表生效*/
    @KsYunField(name="MaxRecords")
    private Integer MaxRecords;

    /**参数模版类型

##### 默认查询：TEMPLATE 自建；DEFAULT 系统默认模版；INSTANCE 实例本身模版(参数配置)
##### 注意：切勿修改操作内置和实例本身模板(可能造成实例异常)！！！！！*/
    @KsYunField(name="Source")
    private String Source;

}
