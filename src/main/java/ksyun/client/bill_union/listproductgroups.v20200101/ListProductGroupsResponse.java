package ksyun.client.bill_union.listproductgroups.v20200101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListProductGroupsResponse
* @Description ListProductGroups 返回体
*/
@Data
@ToString
public class ListProductGroupsResponse extends BaseResponseModel {
    /**请求RequestId*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**为true时，代表成功；为fasle代表失败。*/
    @JsonProperty("Success")
    private Boolean Success;

    /**产品线列表节点*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /** 产品线Id*/
        @JsonProperty("Id")
        private Integer Id;

        /**产品线Code*/
        @JsonProperty("Code")
        private String Code;

        /** 产品线名称*/
        @JsonProperty("Name")
        private String Name;

        /** 产品线英文名称*/
        @JsonProperty("EnName")
        private String EnName;

    }

}
