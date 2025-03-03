package ksyun.client.sqlserver.describedbbackuppolicy.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeDBBackupPolicyResponse
 * @Description DescribeDBBackupPolicy 返回体
 */
@Data
@ToString
public class DescribeDBBackupPolicyResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
