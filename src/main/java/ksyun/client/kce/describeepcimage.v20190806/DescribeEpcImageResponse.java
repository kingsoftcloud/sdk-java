package ksyun.client.kce.describeepcimage.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeEpcImageResponse
 * @Description DescribeEpcImage 返回体
 */
@Data
@ToString
public class DescribeEpcImageResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
