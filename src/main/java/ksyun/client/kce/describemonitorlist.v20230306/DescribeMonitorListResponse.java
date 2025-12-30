package ksyun.client.kce.describemonitorlist.v20230306;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeMonitorListResponse
* @Description DescribeMonitorList 返回体
*/
@Data
@ToString
public class DescribeMonitorListResponse extends BaseResponseModel {

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**分页标识*/
    @JsonProperty("Marker")
    private Integer Marker;

    /**监控数量*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**监控列表*/
    @JsonProperty("MonitorSet")
    private List<MonitorSetDto> MonitorSet;

    @Data
    @ToString
    public static class MonitorSetDto {
    }

}
