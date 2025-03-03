package ksyun.client.bill_union.describeproductcode.v20200101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeProductCodeResponse
 * @Description DescribeProductCode 返回体
 */
@Data
@ToString
public class DescribeProductCodeResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
