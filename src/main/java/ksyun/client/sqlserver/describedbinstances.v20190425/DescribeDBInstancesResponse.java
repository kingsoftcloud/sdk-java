package ksyun.client.sqlserver.describedbinstances.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeDBInstancesResponse
 * @Description DescribeDBInstances 返回体
 */
@Data
@ToString
public class DescribeDBInstancesResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
