package ksyun.client.clickhouse.describeinstancedatabases.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInstanceDatabasesResponse
* @Description DescribeInstanceDatabases 返回体
*/
@Data
@ToString
public class DescribeInstanceDatabasesResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**数据库库列表*/
        @JsonProperty("databases")
        private List<DataDatabasesDto> Databases;

        @Data
        @ToString
        public static class DataDatabasesDto {
            /**数据库名称*/
            @JsonProperty("name")
            private String Name;

            /**对此数据库有权限的账号列表+对应权限*/
            @JsonProperty("accounts")
            private List<DataDatabasesAccountsDto> Accounts;

            @Data
            @ToString
            public static class DataDatabasesAccountsDto {
                /**账号名称*/
                @JsonProperty("name")
                private String Name;

                /**账号权限*/
                @JsonProperty("privileges")
                private String Privileges;

            }

            /**数据库状态*/
            @JsonProperty("status")
            private String Status;

        }

    }

}
