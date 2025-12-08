package ksyun.client.vpc.modifyprivateipaddressattribute.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyPrivateIpAddressAttributeResponse
* @Description ModifyPrivateIpAddressAttribute 返回体
*/
@Data
@ToString
public class ModifyPrivateIpAddressAttributeResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**私网IP属性信息*/
    @JsonProperty("PrivateIpAddressAttribute")
    private PrivateIpAddressAttributeDto PrivateIpAddressAttribute;

    @Data
    @ToString
    public static class PrivateIpAddressAttributeDto {
        /**私网IP地址ID*/
        @JsonProperty("privateIpAddressId")
        private String PrivateIpAddressId;

        /**子网ID*/
        @JsonProperty("SubnetId")
        private String SubnetId;

        /**私网IP地址*/
        @JsonProperty("PrivateIpAddress")
        private String PrivateIpAddress;

        /**IP地址状态*/
        @JsonProperty("Status")
        private String Status;

        /**IP分配方法,specific为只能指定IP分配，默认为random随机分配*/
        @JsonProperty("AllocateStatus")
        private String AllocateStatus;

    }

}
