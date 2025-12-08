package ksyun.client.cloud_advisor.getreport.v20250610;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetReportRequest
* @Description 请求参数
*/
@Data
public class GetReportRequest{
    /**要下载的巡检报告任务 ID 列表*/
    @KsYunField(name="taskIDs",type=2)
    private List<String> TaskIDsList;

    /**下载指定时间范围内的巡检报告*/
    @KsYunField(name="startTime")
    private String StartTime;

    /**下载指定时间范围内的巡检报告*/
    @KsYunField(name="endTime")
    private String EndTime;

}
