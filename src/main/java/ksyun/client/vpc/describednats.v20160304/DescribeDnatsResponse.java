package ksyun.client.vpc.describednats.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDnatsResponse
* @Description DescribeDnats 返回体
*/
@Data
@ToString
public class DescribeDnatsResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**Dnat的信息*/
    @JsonProperty("DnatSet")
    private List<DnatSetDto> DnatSet;

    @Data
    @ToString
    public static class DnatSetDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**Dnat的ID*/
        @JsonProperty("DnatId")
        private String DnatId;

        /**Nat的ID*/
        @JsonProperty("NatId")
        private String NatId;

        /**Dnat的名称*/
        @JsonProperty("DnatName")
        private String DnatName;

        /**协议类型*/
        @JsonProperty("IpProtocol")
        private String IpProtocol;

        /**Nat的IP*/
        @JsonProperty("NatIp")
        private String NatIp;

        /**公网端口*/
        @JsonProperty("PublicPort")
        private String PublicPort;

        /**服务器私网IP*/
        @JsonProperty("PrivateIpAddress")
        private String PrivateIpAddress;

        /**服务器端口*/
        @JsonProperty("PrivatePort")
        private String PrivatePort;

        /**描述*/
        @JsonProperty("Description")
        private String Description;

        /**生效状态*/
        @JsonProperty("Enabled")
        private Boolean Enabled;

    }

}
