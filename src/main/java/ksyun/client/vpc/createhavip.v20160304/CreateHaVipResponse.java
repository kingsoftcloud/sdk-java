package ksyun.client.vpc.createhavip.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateHaVipResponse
* @Description CreateHaVip 返回体
*/
@Data
@ToString
public class CreateHaVipResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**高可用虚拟IP的信息*/
    @JsonProperty("HaVip")
    private HaVipDto HaVip;

    @Data
    @ToString
    public static class HaVipDto {
        /**高可用虚拟IP的ID*/
        @JsonProperty("HaVipId")
        private String HaVipId;

        /**子网的ID*/
        @JsonProperty("SubnetId")
        private String SubnetId;

        /**与高可用虚拟IP绑定的主弹性网卡ID*/
        @JsonProperty("MasterNetworkInterfaceId")
        private String MasterNetworkInterfaceId;

        /**Vpc的ID*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**弹性IP的ID*/
        @JsonProperty("AllocationId")
        private String AllocationId;

        /**高可用虚拟IP的IP地址*/
        @JsonProperty("IpAddress")
        private String IpAddress;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**与高可用虚拟IP绑定的弹性网卡ID列表*/
        @JsonProperty("SlaveNetworkInterfaceIdSet")
        private List<String> SlaveNetworkInterfaceIdSet;

    }

}
