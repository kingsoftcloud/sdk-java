package ksyun.client.kscc.describeshareduserpointusage.v1;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeSharedUserPointUsageRequest
* @Description 请求参数
*/
@Data
public class DescribeSharedUserPointUsageRequest{
    /**开始时间，格式：yyyy-MM-dd HH:mm:ss*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**结束时间，格式：yyyy-MM-dd HH:mm:ss*/
    @KsYunField(name="EndTime")
    private String EndTime;

    /**用户名，不传则不过滤用户*/
    @KsYunField(name="UserName")
    private String UserName;

    /**部门名称或路径，不传则不过滤部门*/
    @KsYunField(name="Department")
    private String Department;

}
