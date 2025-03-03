package ksyun.client.sqlserver.describesecuritygroup.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeSecurityGroupResponse
 * @Description DescribeSecurityGroup 返回体
 */
@Data
@ToString
public class DescribeSecurityGroupResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
