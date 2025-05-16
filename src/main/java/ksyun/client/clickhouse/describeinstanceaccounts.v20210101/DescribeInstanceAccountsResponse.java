package ksyun.client.clickhouse.describeinstanceaccounts.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

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
