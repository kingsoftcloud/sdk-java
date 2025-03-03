package ksyun.client.dts.describeconsistencycheck.v20180108;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeConsistencyCheckResponse
 * @Description DescribeConsistencyCheck 返回体
 */
@Data
@ToString
public class DescribeConsistencyCheckResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
