package ksyun.client.aicp.describememorystoragemonitor.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeMemoryStorageMonitorResponse
* @Description DescribeMemoryStorageMonitor 返回体
*/
@Data
@ToString
public class DescribeMemoryStorageMonitorResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**当前存储用量（GB）*/
    @JsonProperty("CurrentStorage")
    private Double CurrentStorage;

    /**今日存储增量（GB）*/
    @JsonProperty("TodayIncrement")
    private Double TodayIncrement;

    /**存储趋势*/
    @JsonProperty("StorageTrend")
    private List<StorageTrendDto> StorageTrend;

    @Data
    @ToString
    public static class StorageTrendDto {
        /**时间戳*/
        @JsonProperty("Timestamp")
        private Long Timestamp;

        /**存储值（GB）*/
        @JsonProperty("Value")
        private Double Value;

    }

}
