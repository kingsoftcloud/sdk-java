package ksyun.client.mongodb.describemongodbinstances.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeMongoDBInstancesResponse
 * @Description DescribeMongoDBInstances 返回体
 */
@Data
@ToString
public class DescribeMongoDBInstancesResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
