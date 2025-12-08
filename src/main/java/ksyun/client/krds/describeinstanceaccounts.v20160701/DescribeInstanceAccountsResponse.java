package ksyun.client.krds.describeinstanceaccounts.v20160701;

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
            @JsonProperty("InstanceAccountName")
            private String InstanceAccountName;

            /**账号描述*/
            @JsonProperty("InstanceAccountDescription")
            private String InstanceAccountDescription;

            /**创建时间*/
            @JsonProperty("Created")
            private String Created;

            /**账号类型
Super：管理员
Normal：普通用户*/
            @JsonProperty("InstanceAccountType")
            private String InstanceAccountType;

            /**账号享有权限的列表，账号出发对如下数据库有权限(具体权限)*/
            @JsonProperty("InstanceAccountPrivileges")
            private List<DataDtoAccountsDtoInstanceAccountPrivilegesDto> InstanceAccountPrivileges;

            @Data
            @ToString
            public static class DataDtoAccountsDtoInstanceAccountPrivilegesDto {
                /**库名*/
                @JsonProperty("InstanceDatabaseName")
                private String InstanceDatabaseName;

                /**权限：只读，读写，仅DDL，仅DML
*/
                @JsonProperty("Privilege")
                private String Privilege;

            }

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
