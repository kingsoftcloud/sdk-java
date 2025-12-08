package ksyun.client.slb.modifyhostheader.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyHostHeaderResponse
* @Description ModifyHostHeader 返回体
*/
@Data
@ToString
public class ModifyHostHeaderResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**域名的信息*/
    @JsonProperty("HostHeader")
    private HostHeaderDto HostHeader;

    @Data
    @ToString
    public static class HostHeaderDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**域名的ID*/
        @JsonProperty("HostHeaderId")
        private String HostHeaderId;

        /**监听器的ID*/
        @JsonProperty("ListenerId")
        private String ListenerId;

        /**证书的ID*/
        @JsonProperty("CertificateId")
        private String CertificateId;

        /**域名*/
        @JsonProperty("HostHeader")
        private String HostHeader;

    }

}
