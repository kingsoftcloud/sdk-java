package ksyun.client.epc.describeepcstocks.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeEpcStocksResponse
* @Description DescribeEpcStocks 返回体
*/
@Data
@ToString
public class DescribeEpcStocksResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**库存的信息*/
    @JsonProperty("EpcStockSet")
    private List<EpcStockSetDto> EpcStockSet;

    @Data
    @ToString
    public static class EpcStockSetDto {
        /**库存数量*/
        @JsonProperty("InstanceCount")
        private Integer InstanceCount;

        /**云物理主机机型*/
        @JsonProperty("HostType")
        private String HostType;

        /**可用区的名称*/
        @JsonProperty("AvailabilityZone")
        private String AvailabilityZone;

        /**磁盘信息*/
        @JsonProperty("AvailableRaidLevelSet")
        private List<String> AvailableRaidLevelSet;

        /**库存属性*/
        @JsonProperty("Attribute")
        private String Attribute;

    }

}
