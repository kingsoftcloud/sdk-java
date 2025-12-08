package ksyun.client.influxdb.describeretentionpolicylist.v20191010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname DescribeRetentionPolicyListResponse
* @Description DescribeRetentionPolicyList 返回体
*/
@Data
@ToString
public class DescribeRetentionPolicyListResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
