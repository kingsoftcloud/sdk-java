package ksyun.client.mongodb.describeinstanceparams.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeInstanceParamsResponse
 * @Description DescribeInstanceParams 返回体
 */
@Data
@ToString
public class DescribeInstanceParamsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
