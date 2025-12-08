package ksyun.client.mongodb.describemodifyhistory.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeModifyHistoryRequest
* @Description 请求参数
*/
@Data
public class DescribeModifyHistoryRequest{
    /**指定查询某个参数项的修改历史。*/
    @KsYunField(name="ParamName")
    private String ParamName;

    /**偏移量*/
    @KsYunField(name="Offset")
    private Integer Offset;

    /**每页最大返回记录数*/
    @KsYunField(name="Limit")
    private Integer Limit;

}
