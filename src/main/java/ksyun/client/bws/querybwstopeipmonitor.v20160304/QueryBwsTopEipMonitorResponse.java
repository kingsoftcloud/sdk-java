package ksyun.client.bws.querybwstopeipmonitor.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryBwsTopEipMonitorResponse
* @Description QueryBwsTopEipMonitor 返回体
*/
@Data
@ToString
public class QueryBwsTopEipMonitorResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**BWS相关流量数据*/
    @JsonProperty("BwsMonitorDataList")
    private List<BwsMonitorDataListDto> BwsMonitorDataList;

    @Data
    @ToString
    public static class BwsMonitorDataListDto {
        /**弹性IP实例ID*/
        @JsonProperty("AllocationId")
        private String AllocationId;

        /**弹性IP*/
        @JsonProperty("PublicIp")
        private String PublicIp;

        /**入向流量*/
        @JsonProperty("InBound")
        private String InBound;

        /**出向流量*/
        @JsonProperty("OutBound")
        private String OutBound;

        /**实例排名*/
        @JsonProperty("Num")
        private String Num;

    }

}
