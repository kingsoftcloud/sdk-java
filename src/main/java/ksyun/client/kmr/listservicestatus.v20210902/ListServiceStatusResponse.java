package ksyun.client.kmr.listservicestatus.v20210902;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListServiceStatusResponse
* @Description ListServiceStatus 返回体
*/
@Data
@ToString
public class ListServiceStatusResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**服务列表*/
    @JsonProperty("Services")
    private List<ServicesDto> Services;

    @Data
    @ToString
    public static class ServicesDto {
        /**集群ID*/
        @JsonProperty("ClusterId")
        private String ClusterId;

        /**服务ID*/
        @JsonProperty("ServiceId")
        private String ServiceId;

        /**服务名称
*/
        @JsonProperty("ServiceName")
        private String ServiceName;

        /**服务状态（1 红 2黄 3绿 4 灰 5 Loading）*/
        @JsonProperty("Status")
        private Integer Status;

        /**服务是否Ready*/
        @JsonProperty("Steady")
        private Boolean Steady;

        /**服务版本*/
        @JsonProperty("Version")
        private String Version;

        /**异常组件数量*/
        @JsonProperty("AbnormalCount")
        private Integer AbnormalCount;

        /**服务详情ComponentInfo*/
        @JsonProperty("ComponentInfo")
        private List<String> ComponentInfo;

        /**最近启动时间*/
        @JsonProperty("LastStartTime")
        private String LastStartTime;

        /**服务WebUI IP*/
        @JsonProperty("WebUrl")
        private String WebUrl;

        /**Port*/
        @JsonProperty("Port")
        private List<String> Port;

        /**	
WebInfo*/
        @JsonProperty("WebInfo")
        private List<String> WebInfo;

    }

    /**是否开启EIP*/
    @JsonProperty("EnableEip")
    private Boolean EnableEip;

    /**是否确认配置*/
    @JsonProperty("IsConfComplete")
    private Boolean IsConfComplete;

    /**状态码*/
    @JsonProperty("StatusCode")
    private Integer StatusCode;

}
