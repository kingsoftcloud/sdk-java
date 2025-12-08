package ksyun.client.sqlserver.describedbinstancerestorabletime.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname DescribeDBInstanceRestorableTimeResponse
* @Description DescribeDBInstanceRestorableTime 返回体
*/
@Data
@ToString
public class DescribeDBInstanceRestorableTimeResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
