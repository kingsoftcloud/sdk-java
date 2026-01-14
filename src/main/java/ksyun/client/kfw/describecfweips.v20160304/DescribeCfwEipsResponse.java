package ksyun.client.kfw.describecfweips.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeCfwEipsResponse
* @Description DescribeCfwEips 返回体
*/
@Data
@ToString
public class DescribeCfwEipsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("pre_token")
    private String Pre_token;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("AddressesSet")
    private List<AddressesSetDto> AddressesSet;

    @Data
    @ToString
    public static class AddressesSetDto {
        /***/
        @JsonProperty("type")
        private String Type;

        /***/
        @JsonProperty("ingress")
        private Integer Ingress;

        /***/
        @JsonProperty("router_uuid")
        private String Router_uuid;

        /***/
        @JsonProperty("lb_pool_uuid")
        private String Lb_pool_uuid;

        /***/
        @JsonProperty("natpool_id")
        private String Natpool_id;

        /***/
        @JsonProperty("fixed_ip_address")
        private String Fixed_ip_address;

        /***/
        @JsonProperty("port_uuid")
        private String Port_uuid;

        /***/
        @JsonProperty("PublicIp")
        private String PublicIp;

        /***/
        @JsonProperty("AllocationId")
        private String AllocationId;

        /***/
        @JsonProperty("State")
        private String State;

        /***/
        @JsonProperty("IpState")
        private String IpState;

        /***/
        @JsonProperty("LineId")
        private String LineId;

        /***/
        @JsonProperty("NetworkInterfaceId")
        private String NetworkInterfaceId;

        /***/
        @JsonProperty("NetworkInterfaceType")
        private String NetworkInterfaceType;

        /***/
        @JsonProperty("PrivateIpAddress")
        private String PrivateIpAddress;

        /***/
        @JsonProperty("BandWidth")
        private Integer BandWidth;

        /***/
        @JsonProperty("InstanceType")
        private String InstanceType;

        /***/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /***/
        @JsonProperty("InternetGatewayId")
        private String InternetGatewayId;

        /***/
        @JsonProperty("BandWidthShareId")
        private String BandWidthShareId;

        /***/
        @JsonProperty("UserTag")
        private String UserTag;

        /***/
        @JsonProperty("ChargeType")
        private String ChargeType;

        /***/
        @JsonProperty("ProductType")
        private String ProductType;

        /***/
        @JsonProperty("ProductWhat")
        private String ProductWhat;

        /***/
        @JsonProperty("ServiceEndTime")
        private String ServiceEndTime;

        /***/
        @JsonProperty("IpVersion")
        private String IpVersion;

        /***/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /***/
        @JsonProperty("Mode")
        private String Mode;

        /***/
        @JsonProperty("HostType")
        private String HostType;

        /***/
        @JsonProperty("EipPoolId")
        private String EipPoolId;

        /***/
        @JsonProperty("FirewallId")
        private String FirewallId;

    }

    /***/
    @JsonProperty("NextToken")
    private String NextToken;

    /***/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

}
