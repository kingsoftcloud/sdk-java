package ksyun.client.cloud_advisor.listinspectionitem.v20250610;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListInspectionItemResponse
* @Description ListInspectionItem 返回体
*/
@Data
@ToString
public class ListInspectionItemResponse extends BaseResponseModel {
    /***/
    @JsonProperty("code")
    private Integer Code;

    /***/
    @JsonProperty("msg")
    private String Msg;

    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("items")
        private List<ItemsDto> Items;

        @Data
        @ToString
        public static class ItemsDto {
            /***/
            @JsonProperty("customerId")
            private Integer CustomerId;

            /***/
            @JsonProperty("inspectionItemId")
            private Integer InspectionItemId;

            /***/
            @JsonProperty("inspectionItemName")
            private String InspectionItemName;

            /***/
            @JsonProperty("productGroupId")
            private Integer ProductGroupId;

            /***/
            @JsonProperty("productGroupName")
            private String ProductGroupName;

            /***/
            @JsonProperty("type")
            private Integer Type;

            /***/
            @JsonProperty("typeName")
            private String TypeName;

            /***/
            @JsonProperty("status")
            private Integer Status;

            /***/
            @JsonProperty("StatusName")
            private String StatusName;

            /***/
            @JsonProperty("remark")
            private String Remark;

            /***/
            @JsonProperty("id")
            private Integer Id;

            /**告警内容的 json 格式*/
            @JsonProperty("riskDetails")
            private String RiskDetails;

        }

        /***/
        @JsonProperty("total")
        private Integer Total;

        /***/
        @JsonProperty("page")
        private Integer Page;

        /***/
        @JsonProperty("size")
        private Integer Size;

    }

}
