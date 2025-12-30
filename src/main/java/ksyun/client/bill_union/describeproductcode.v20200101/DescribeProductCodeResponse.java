package ksyun.client.bill_union.describeproductcode.v20200101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeProductCodeResponse
* @Description DescribeProductCode 返回体
*/
@Data
@ToString
public class DescribeProductCodeResponse extends BaseResponseModel {

    /**当前请求的RequestId*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**产品线集合*/
    @JsonProperty("ProductGroupSet")
    private List<ProductGroupSetDto> ProductGroupSet;

    @Data
    @ToString
    public static class ProductGroupSetDto {
        /**产品线code*/
        @JsonProperty("Key")
        private String Key;

        /**产品线name*/
        @JsonProperty("Value")
        private String Value;

    }

}
