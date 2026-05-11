package ksyun.client.kscc.describeailogdetail.v1;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeAiLogDetailRequest
* @Description 请求参数
*/
@Data
public class DescribeAiLogDetailRequest{
    /**日志开始时间，格式：yyyy-MM-dd HH:mm:ss*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**日志结束时间，格式：yyyy-MM-dd HH:mm:ss*/
    @KsYunField(name="EndTime")
    private String EndTime;

    /**用户邮箱前缀*/
    @KsYunField(name="UserName")
    private String UserName;

    /**模型列表，多个用逗号分隔*/
    @KsYunField(name="ModelList")
    private String ModelList;

    /**页码，默认1*/
    @KsYunField(name="Page")
    private Integer Page;

    /**每页条数，默认10*/
    @KsYunField(name="Size")
    private Integer Size;

}
