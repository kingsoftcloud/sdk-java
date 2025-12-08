package ksyun.client.slb.createalblistenercertgroup.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateAlbListenerCertGroupResponse
* @Description CreateAlbListenerCertGroup 返回体
*/
@Data
@ToString
public class CreateAlbListenerCertGroupResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**证书组的信息*/
    @JsonProperty("AlbListenerCertGroup")
    private AlbListenerCertGroupDto AlbListenerCertGroup;

    @Data
    @ToString
    public static class AlbListenerCertGroupDto {
        /**应用型负载均衡监听器的ID*/
        @JsonProperty("AlbListenerId")
        private String AlbListenerId;

        /**证书组ID*/
        @JsonProperty("AlbListenerCertGroupId")
        private String AlbListenerCertGroupId;

        /**证书的信息*/
        @JsonProperty("AlbListenerCertSet")
        private List<AlbListenerCertSetDto> AlbListenerCertSet;

        @Data
        @ToString
        public static class AlbListenerCertSetDto {
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
