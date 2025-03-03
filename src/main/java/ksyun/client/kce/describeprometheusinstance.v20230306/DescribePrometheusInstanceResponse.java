package ksyun.client.kce.describeprometheusinstance.v20230306;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribePrometheusInstanceResponse
 * @Description DescribePrometheusInstance 返回体
 */
@Data
@ToString
public class DescribePrometheusInstanceResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
