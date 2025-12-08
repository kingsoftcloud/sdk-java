package ksyun.client.slb.describelistenercertgroups.v20250430;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeListenerCertGroupsResponse
* @Description DescribeListenerCertGroups 返回体
*/
@Data
@ToString
public class DescribeListenerCertGroupsResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**证书组的信息*/
    @JsonProperty("ListenerCertGroupSet")
    private List<ListenerCertGroupSetDto> ListenerCertGroupSet;

    @Data
    @ToString
    public static class ListenerCertGroupSetDto {
        /**应用型负载均衡监听器的ID*/
        @JsonProperty("ListenerId")
        private String ListenerId;

        /**证书组ID*/
        @JsonProperty("ListenerCertGroupId")
        private String ListenerCertGroupId;

        /**证书的信息*/
        @JsonProperty("ListenerCertSet")
        private List<ListenerCertSetDto> ListenerCertSet;

        @Data
        @ToString
        public static class ListenerCertSetDto {
            /**创建时间*/
            @JsonProperty("CreateTime")
            private String CreateTime;

            /**证书的ID*/
            @JsonProperty("CertificateId")
            private String CertificateId;

            /**证书的名称*/
            @JsonProperty("CertificateName")
            private String CertificateName;

            /**签发者*/
            @JsonProperty("CertAuthority")
            private String CertAuthority;

            /**域名*/
            @JsonProperty("CommonName")
            private String CommonName;

            /**证书的到期时间*/
            @JsonProperty("ExpireTime")
            private String ExpireTime;

        }

    }

}
