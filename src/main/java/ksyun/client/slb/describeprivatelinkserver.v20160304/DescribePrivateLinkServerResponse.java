package ksyun.client.slb.describeprivatelinkserver.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribePrivateLinkServerResponse
* @Description DescribePrivateLinkServer 返回体
*/
@Data
@ToString
public class DescribePrivateLinkServerResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**总条数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**PrivateLinkServer的信息*/
    @JsonProperty("PrivateLinkServerSet")
    private List<PrivateLinkServerSetDto> PrivateLinkServerSet;

    @Data
    @ToString
    public static class PrivateLinkServerSetDto {
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

    }

}
