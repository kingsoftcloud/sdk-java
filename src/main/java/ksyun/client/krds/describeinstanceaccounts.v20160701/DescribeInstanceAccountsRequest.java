package ksyun.client.krds.describeinstanceaccounts.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeInstanceAccountsRequest
 * @Description 请求参数
 */
@Data
public class DescribeInstanceAccountsRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 模糊查询。
     */
    @KsYunField(name = "Keyword")
    private String Keyword;

}