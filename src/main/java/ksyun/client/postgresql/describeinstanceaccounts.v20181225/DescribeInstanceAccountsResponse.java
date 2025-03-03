package ksyun.client.postgresql.describeinstanceaccounts.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeInstanceAccountsResponse
 * @Description DescribeInstanceAccounts 返回体
 */
@Data
@ToString
public class DescribeInstanceAccountsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
