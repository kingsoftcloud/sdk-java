package ksyun.client.aicp.createusagedownloadtask.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateUsageDownloadTaskRequest
* @Description 请求参数
*/
@Data
public class CreateUsageDownloadTaskRequest{
    /**查询任务数据起始时间（UTC Unix 时间戳，单位：秒），需校验：StartTimestamp≤EndTimestamp
*/
    @KsYunField(name="StartTimestamp")
    private Long StartTimestamp;

    /**查询任务数据结束时间（UTC Unix 时间戳，单位：秒），需校验：EndTimestamp ≤ 当前时间；EndTimestamp - StartTimestamp ≤ 604800（最大时间跨度7天）*/
    @KsYunField(name="EndTimestamp")
    private Long EndTimestamp;

    /***/
    @KsYunField(name="Filter")
    private FilterDto Filter;

    @Data
    @ToString
    public static class FilterDto {
        /**value值包括线上所有模型*/
        @KsYunField(name="ModelName",type=2)
        private List<String> ModelNameList;

        /**接入点ID*/
        @KsYunField(name="EndPointID",type=2)
        private List<String> EndPointIDList;

        /**API Key ID*/
        @KsYunField(name="KeyId",type=2)
        private List<String> KeyIdList;

        /**项目ID*/
        @KsYunField(name="ProjectId",type=2)
        private List<String> ProjectIdList;

    }

}
