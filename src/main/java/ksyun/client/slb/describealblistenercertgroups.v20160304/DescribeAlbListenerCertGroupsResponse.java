package ksyun.client.slb.describealblistenercertgroups.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeAlbListenerCertGroupsResponse
* @Description DescribeAlbListenerCertGroups 返回体
*/
@Data
@ToString
public class DescribeAlbListenerCertGroupsResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**证书组的信息*/
    @JsonProperty("AlbListenerCertGroupSet")
    private List<AlbListenerCertGroupSetDto> AlbListenerCertGroupSet;

    @Data
    @ToString
    public static class AlbListenerCertGroupSetDto {
        /**应用型负载均衡监听器的ID*/
        @JsonProperty("AlbListenerId")
        private String AlbListenerId;

        /**证书组ID*/
        @JsonProperty("AlbListenerCertGroupId")
        private String AlbListenerCertGroupId;

        /**证书的信息*/
        @JsonProperty("AlbListenerCertSet")
        private List<AlbListenerCertGroupSetAlbListenerCertSetDto> AlbListenerCertSet;

        @Data
        @ToString
        public static class AlbListenerCertGroupSetAlbListenerCertSetDto {
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
