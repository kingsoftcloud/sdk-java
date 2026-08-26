package ksyun.client.vpc.describenetworkpath.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeNetworkPathResponse
* @Description DescribeNetworkPath 返回体
*/
@Data
@ToString
public class DescribeNetworkPathResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("NetworkPathSet")
    private List<NetworkPathSetDto> NetworkPathSet;

    @Data
    @ToString
    public static class NetworkPathSetDto {
        /**路径分析名称*/
        @JsonProperty("PathName")
        private String PathName;

        /**路径分析ID*/
        @JsonProperty("PathId")
        private String PathId;

        /**源类型*/
        @JsonProperty("SourceType")
        private String SourceType;

        /**源信息ID*/
        @JsonProperty("SourceId")
        private String SourceId;

        /**源信息IP*/
        @JsonProperty("SourceIp")
        private String SourceIp;

        /**目的类型*/
        @JsonProperty("TargetType")
        private String TargetType;

        /**目的信息ID*/
        @JsonProperty("TargetId")
        private String TargetId;

        /**目的信息IP*/
        @JsonProperty("TargetIp")
        private String TargetIp;

        /**协议*/
        @JsonProperty("Protocol")
        private String Protocol;

        /**端口*/
        @JsonProperty("PublicPort")
        private Integer PublicPort;

        /**分析结果*/
        @JsonProperty("PathTaskReachableResult")
        private String PathTaskReachableResult;

        /**分析时间*/
        @JsonProperty("AnalysesTime")
        private String AnalysesTime;

    }

}
