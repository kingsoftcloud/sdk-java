package ksyun.client.sqlserver.describeinstanceaccounts.v20190425;

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
        /**数据库账户列表*/
        @JsonProperty("Accounts")
        private List<DataAccountsDto> Accounts;

        @Data
        @ToString
        public static class DataAccountsDto {
            /**账号名称*/
            @JsonProperty("InstanceAccountName")
            private String InstanceAccountName;

            /**账号描述*/
            @JsonProperty("InstanceAccountDescription")
            private String InstanceAccountDescription;

            /**创建时间*/
            @JsonProperty("Created")
            private String Created;

            /**账号类型

```json
Super 管理员，Normal 一般用户
```*/
            @JsonProperty("InstanceAccountType")
            private String InstanceAccountType;

            /**数据库权限列表*/
            @JsonProperty("InstanceAccountPrivileges")
            private List<DataAccountsInstanceAccountPrivilegesDto> InstanceAccountPrivileges;

            @Data
            @ToString
            public static class DataAccountsInstanceAccountPrivilegesDto {
                /**数据库名称*/
                @JsonProperty("InstanceDatabaseName")
                private String InstanceDatabaseName;

                /**数据库权限*/
                @JsonProperty("Privilege")
                private String Privilege;

            }

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
