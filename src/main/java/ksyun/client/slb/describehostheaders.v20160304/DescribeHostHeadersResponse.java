package ksyun.client.slb.describehostheaders.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeHostHeadersResponse
* @Description DescribeHostHeaders 返回体
*/
@Data
@ToString
public class DescribeHostHeadersResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**的信息*/
    @JsonProperty("HostHeaderSet")
    private List<HostHeaderSetDto> HostHeaderSet;

    @Data
    @ToString
    public static class HostHeaderSetDto {
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
