package ksyun.client.clickhouse.describeinstanceaccounts.v20210101;

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
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Code")
    private String Code;

    /***/
    @JsonProperty("Message")
    private String Message;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**账号列表*/
        @JsonProperty("accounts")
        private List<DataDtoAccountsDto> Accounts;

        @Data
        @ToString
        public static class DataDtoAccountsDto {
            /**账号状态*/
            @JsonProperty("status")
            private String Status;

            /**数据库列表 管理员的为空(管理员有所有权限)*/
            @JsonProperty("databases")
            private List<DataDtoAccountsDtoDatabasesDto> Databases;

            @Data
            @ToString
            public static class DataDtoAccountsDtoDatabasesDto {
                /**数据库名称*/
                @JsonProperty("name")
                private String Name;

                /**数据库权限

```json
ReadOnly 只读
ReadWrite 读写
DDLOnly DDL
```*/
                @JsonProperty("privileges")
                private String Privileges;

            }

            /***/
            @JsonProperty("name")
            private String Name;

            /**账户类型：1 管理员  2 普通用户*/
            @JsonProperty("acc_type")
            private Integer Acc_type;

        }

    }

}
