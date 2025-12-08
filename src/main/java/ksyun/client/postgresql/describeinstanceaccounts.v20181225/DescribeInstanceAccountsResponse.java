package ksyun.client.postgresql.describeinstanceaccounts.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInstanceAccountsResponse
* @Description DescribeInstanceAccounts 返回体
*/
@Data
@ToString
public class DescribeInstanceAccountsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Accounts")
        private List<DataDtoAccountsDto> Accounts;

        @Data
        @ToString
        public static class DataDtoAccountsDto {
            /**账户名称*/
            @JsonProperty("AccountName")
            private String AccountName;

            /**账号状态*/
            @JsonProperty("AccountStatus")
            private String AccountStatus;

            /**账号类型

```json
1 管理员账户
2 普通账户
```*/
            @JsonProperty("AccountAccType")
            private Integer AccountAccType;

            /**账号描述*/
            @JsonProperty("AccountDescription")
            private String AccountDescription;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
