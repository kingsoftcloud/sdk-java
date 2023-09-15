package ksyun.client.krds.describedbinstanceparameters.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname DescribeDBInstanceParametersResponse
* @Description DescribeDBInstanceParameters 返回体
*/
@Data
@ToString
public class DescribeDBInstanceParametersResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
