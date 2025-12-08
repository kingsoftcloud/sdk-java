package ksyun.client.kad.describeoverview.v20161122;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeOverviewRequest
* @Description 请求参数
*/
@Data
public class DescribeOverviewRequest{
    /**实例id*/
    @KsYunField(name="KadId")
    private String KadId;

    /**开始时间。例：2024-01-01 00:00:00*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**结束时间*/
    @KsYunField(name="EndTime")
    private String EndTime;

}
