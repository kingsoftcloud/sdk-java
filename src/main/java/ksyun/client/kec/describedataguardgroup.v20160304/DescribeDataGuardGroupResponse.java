package ksyun.client.kec.describedataguardgroup.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDataGuardGroupResponse
* @Description DescribeDataGuardGroup 返回体
*/
@Data
@ToString
public class DescribeDataGuardGroupResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("DataGuardsSet")
    private List<DataGuardsSetDto> DataGuardsSet;

    @Data
    @ToString
    public static class DataGuardsSetDto {
        /***/
        @JsonProperty("DataGuardId")
        private String DataGuardId;

        /***/
        @JsonProperty("DataGuardName")
        private String DataGuardName;

        /***/
        @JsonProperty("DataGuardLevel")
        private String DataGuardLevel;

        /***/
        @JsonProperty("DataGuardCapacity")
        private Integer DataGuardCapacity;

        /***/
        @JsonProperty("DataGuardUsedSize")
        private Integer DataGuardUsedSize;

        /***/
        @JsonProperty("DataGuardInstancesList")
        private List<DataGuardInstancesListDto> DataGuardInstancesList;

        @Data
        @ToString
        public static class DataGuardInstancesListDto {
            /***/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /***/
            @JsonProperty("InstanceName")
            private String InstanceName;

        }

        /***/
        @JsonProperty("DataGuardType")
        private String DataGuardType;

    }

    /***/
    @JsonProperty("isSupportDomain")
    private Boolean IsSupportDomain;

}
