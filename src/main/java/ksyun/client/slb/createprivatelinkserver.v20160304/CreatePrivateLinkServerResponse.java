package ksyun.client.slb.createprivatelinkserver.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreatePrivateLinkServerResponse
* @Description CreatePrivateLinkServer 返回体
*/
@Data
@ToString
public class CreatePrivateLinkServerResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**PrivateLinkServer的信息*/
    @JsonProperty("PrivateLinkServer")
    private PrivateLinkServerDto PrivateLinkServer;

    @Data
    @ToString
    public static class PrivateLinkServerDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**PrivateLink名称*/
        @JsonProperty("PrivateLinkServerName")
        private String PrivateLinkServerName;

        /**PrivateLinkServer的ID*/
        @JsonProperty("PrivateLinkServerId")
        private String PrivateLinkServerId;

        /**关联监听器ID*/
        @JsonProperty("ListenerId")
        private String ListenerId;

        /**PrivateLinkServer的描述*/
        @JsonProperty("Description")
        private String Description;

        /**项目的ID*/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /**PrivateLink的数量*/
        @JsonProperty("PrivateLinkNum")
        private Integer PrivateLinkNum;

        /**服务结束时间*/
        @JsonProperty("ServiceEndTime")
        private String ServiceEndTime;

        /**删除保护*/
        @JsonProperty("DeleteProtection")
        private String DeleteProtection;

    }

}
