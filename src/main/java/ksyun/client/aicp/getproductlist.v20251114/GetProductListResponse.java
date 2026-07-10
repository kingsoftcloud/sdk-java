package ksyun.client.aicp.getproductlist.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetProductListResponse
* @Description GetProductList 返回体
*/
@Data
@ToString
public class GetProductListResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**产品列表*/
    @JsonProperty("ProductInfoList")
    private List<ProductInfoListDto> ProductInfoList;

    @Data
    @ToString
    public static class ProductInfoListDto {
        /**服务名称*/
        @JsonProperty("ApiService")
        private String ApiService;

        /**服务中文名称*/
        @JsonProperty("ApiServiceName")
        private String ApiServiceName;

        /**版本列表*/
        @JsonProperty("Versions")
        private List<String> Versions;

    }

}
