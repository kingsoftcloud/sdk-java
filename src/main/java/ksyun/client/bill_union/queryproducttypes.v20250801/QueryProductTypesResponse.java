package ksyun.client.bill_union.queryproducttypes.v20250801;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname QueryProductTypesResponse
* @Description QueryProductTypes 返回体
*/
@Data
@ToString
public class QueryProductTypesResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
