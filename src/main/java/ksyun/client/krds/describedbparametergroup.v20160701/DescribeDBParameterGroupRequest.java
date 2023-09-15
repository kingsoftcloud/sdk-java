package ksyun.client.krds.describedbparametergroup.v20160701;

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
    /**参数组ID	UUID*/
    @KsYunField(name="DBParameterGroupId")
    private String DBParameterGroupId;

    /**搜索关键字	根据name或description匹配出对应参数组*/
    @KsYunField(name="Keyword")
    private String Keyword;

    /**开始查询条数	默认：0*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**每页展示条数	默认：10，区间：[10,100]*/
    @KsYunField(name="MaxRecords")
    private Integer MaxRecords;

    /**模板类型	模板类型，取值范围：TEMPLATE/DEFAULT/INSTANCE<br>默认值：<br>TEMPLATE*/
    @KsYunField(name="Source")
    private String Source;


}