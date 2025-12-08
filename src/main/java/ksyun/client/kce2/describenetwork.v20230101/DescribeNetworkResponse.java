package ksyun.client.kce2.describenetwork.v20230101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeNetworkResponse
* @Description DescribeNetwork 返回体
*/
@Data
@ToString
public class DescribeNetworkResponse extends BaseResponseModel {
    /**集群ID*/
    @JsonProperty("ClusterId")
    private String ClusterId;

    /**网络ID*/
    @JsonProperty("NetworkId")
    private String NetworkId;

    /**公网SLB状态*/
    @JsonProperty("PublicSLB")
    private PublicSLBDto PublicSLB;

    @Data
    @ToString
    public static class PublicSLBDto {
        /**状态阶段*/
        @JsonProperty("Phase")
        private String Phase;

        /**原因*/
        @JsonProperty("Reason")
        private String Reason;

    }

    /**内网SLB状态*/
    @JsonProperty("PrivateSLB")
    private PrivateSLBDto PrivateSLB;

    @Data
    @ToString
    public static class PrivateSLBDto {
        /**内网SLB ID*/
        @JsonProperty("SLBId")
        private String SLBId;

        /**内网SLB IP*/
        @JsonProperty("SLBIp")
        private String SLBIp;

        /**状态阶段*/
        @JsonProperty("Phase")
        private String Phase;

        /**原因*/
        @JsonProperty("Reason")
        private String Reason;

    }

    /**私链状态*/
    @JsonProperty("PrivateLink")
    private PrivateLinkDto PrivateLink;

    @Data
    @ToString
    public static class PrivateLinkDto {
        /**私链IP*/
        @JsonProperty("LinkIp")
        private String LinkIp;

        /**私链端口*/
        @JsonProperty("LinkPort")
        private String LinkPort;

        /**状态阶段*/
        @JsonProperty("Phase")
        private String Phase;

        /**原因*/
        @JsonProperty("Reason")
        private String Reason;

    }

    /**EIP 状态*/
    @JsonProperty("EIP")
    private EIPDto EIP;

    @Data
    @ToString
    public static class EIPDto {
        /**EIP ID*/
        @JsonProperty("EIPId")
        private String EIPId;

        /**状态阶段*/
        @JsonProperty("Phase")
        private String Phase;

        /**原因*/
        @JsonProperty("Reason")
        private String Reason;

    }

    /**是否开启公网访问*/
    @JsonProperty("PublicAccess")
    private Boolean PublicAccess;

    /**创建时间*/
    @JsonProperty("CreatedTime")
    private String CreatedTime;

    /**更新时间*/
    @JsonProperty("UpdatedTime")
    private String UpdatedTime;

}
