package ksyun.client.kscc.describeusertokenusage.v1;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeUserTokenUsageRequest
* @Description 请求参数
*/
@Data
public class DescribeUserTokenUsageRequest{
    /**开始时间，格式：yyyy-MM-dd HH:mm:ss*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**结束时间，格式：yyyy-MM-dd HH:mm:ss*/
    @KsYunField(name="EndTime")
    private String EndTime;

    /**用户邮箱前缀，不传则不过滤用户*/
    @KsYunField(name="UserName")
    private String UserName;

    /**部门全路径（需要带所有父部门，例如：xx公司/xx事业部/研发部），不传则不过滤部门*/
    @KsYunField(name="Department")
    private String Department;

}
