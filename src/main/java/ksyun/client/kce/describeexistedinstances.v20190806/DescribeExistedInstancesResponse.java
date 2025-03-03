package ksyun.client.kce.describeexistedinstances.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeExistedInstancesResponse
 * @Description DescribeExistedInstances 返回体
 */
@Data
@ToString
public class DescribeExistedInstancesResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
