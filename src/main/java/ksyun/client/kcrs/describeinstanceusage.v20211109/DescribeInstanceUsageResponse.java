package ksyun.client.kcrs.describeinstanceusage.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname DescribeInstanceUsageResponse
* @Description DescribeInstanceUsage 返回体
*/
@Data
@ToString
public class DescribeInstanceUsageResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
