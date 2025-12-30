package ksyun.client.bill_union.queryproducttypes.v20250801;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryProductTypesResponse
* @Description QueryProductTypes 返回体
*/
@Data
@ToString
public class QueryProductTypesResponse extends BaseResponseModel {

    /**requestId*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**数据详情*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**产品组ID*/
        @JsonProperty("ProductGroupId")
        private Integer ProductGroupId;

        /**产品组名称*/
        @JsonProperty("ProductGroupName")
        private String ProductGroupName;

        /**产品类型ID*/
        @JsonProperty("ProductTypeId")
        private Integer ProductTypeId;

        /**产品类型名称*/
        @JsonProperty("ProductTypeName")
        private String ProductTypeName;

        /**产品组CODE*/
        @JsonProperty("ProductGroupCode")
        private String ProductGroupCode;

        /**产品类型CODE*/
        @JsonProperty("ProductTypeCode")
        private String ProductTypeCode;

    }

}
