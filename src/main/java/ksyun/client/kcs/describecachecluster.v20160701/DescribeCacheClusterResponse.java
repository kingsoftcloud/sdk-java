package ksyun.client.kcs.describecachecluster.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeCacheClusterResponse
* @Description DescribeCacheCluster 返回体
*/
@Data
@ToString
public class DescribeCacheClusterResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("cacheId")
        private String CacheId;

        /***/
        @JsonProperty("az")
        private String Az;

        /***/
        @JsonProperty("name")
        private String Name;

        /***/
        @JsonProperty("securityGroupId")
        private String SecurityGroupId;

        /***/
        @JsonProperty("engine")
        private String Engine;

        /***/
        @JsonProperty("mode")
        private Integer Mode;

        /***/
        @JsonProperty("size")
        private Integer Size;

        /***/
        @JsonProperty("port")
        private Integer Port;

        /***/
        @JsonProperty("vip")
        private String Vip;

        /***/
        @JsonProperty("slaveVip")
        private String SlaveVip;

        /***/
        @JsonProperty("slaveNum")
        private Integer SlaveNum;

        /***/
        @JsonProperty("status")
        private Integer Status;

        /***/
        @JsonProperty("createTime")
        private String CreateTime;

        /***/
        @JsonProperty("netType")
        private Integer NetType;

        /***/
        @JsonProperty("vpcId")
        private String VpcId;

        /***/
        @JsonProperty("vnetId")
        private String VnetId;

        /***/
        @JsonProperty("timingSwitch")
        private String TimingSwitch;

        /***/
        @JsonProperty("timezone")
        private String Timezone;

        /***/
        @JsonProperty("usedMemory")
        private Integer UsedMemory;

        /***/
        @JsonProperty("subOrderId")
        private String SubOrderId;

        /***/
        @JsonProperty("productId")
        private String ProductId;

        /***/
        @JsonProperty("billType")
        private Integer BillType;

        /***/
        @JsonProperty("orderType")
        private Integer OrderType;

        /***/
        @JsonProperty("orderUse")
        private Integer OrderUse;

        /***/
        @JsonProperty("serviceBeginTime")
        private String ServiceBeginTime;

        /***/
        @JsonProperty("serviceEndTime")
        private String ServiceEndTime;

        /***/
        @JsonProperty("iamProjectId")
        private String IamProjectId;

        /***/
        @JsonProperty("iamProjectName")
        private String IamProjectName;

        /***/
        @JsonProperty("protocol")
        private String Protocol;

    }

}
