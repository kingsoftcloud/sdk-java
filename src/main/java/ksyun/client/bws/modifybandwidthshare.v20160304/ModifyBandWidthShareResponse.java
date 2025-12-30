package ksyun.client.bws.modifybandwidthshare.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyBandWidthShareResponse
* @Description ModifyBandWidthShare 返回体
*/
@Data
@ToString
public class ModifyBandWidthShareResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**共享带宽的信息*/
    @JsonProperty("BandWidthShare")
    private BandWidthShareDto BandWidthShare;

    @Data
    @ToString
    public static class BandWidthShareDto {
        /**共享带宽的ID*/
        @JsonProperty("BandWidthShareId")
        private String BandWidthShareId;

        /**共享带宽的带宽*/
        @JsonProperty("BandWidth")
        private Integer BandWidth;

        /**共享带宽的名称*/
        @JsonProperty("BandWidthShareName")
        private String BandWidthShareName;

        /**共享带宽创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**线路类型的ID*/
        @JsonProperty("LineId")
        private String LineId;

        /**项目的ID*/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /**链路名称*/
        @JsonProperty("LineName")
        private String LineName;

        /**关联EIP列表*/
        @JsonProperty("AssociateBandWidthShareInfoSet")
        private List<BandWidthShareAssociateBandWidthShareInfoSetDto> AssociateBandWidthShareInfoSet;

        @Data
        @ToString
        public static class BandWidthShareAssociateBandWidthShareInfoSetDto {
            /**弹性IP的ID*/
            @JsonProperty("AllocationId")
            private String AllocationId;

        }

        /**Nat的计费类型*/
        @JsonProperty("ChargeType")
        private String ChargeType;

        /**服务结束时间*/
        @JsonProperty("ServiceEndTime")
        private String ServiceEndTime;

    }

}
