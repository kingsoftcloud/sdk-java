package ksyun.client.sqlserver.describeinstancedatabases.v20190425;

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
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**数据库列表*/
        @JsonProperty("InstanceDatabases")
        private List<InstanceDatabasesDto> InstanceDatabases;

        @Data
        @ToString
        public static class InstanceDatabasesDto {
            /**数据库名称*/
            @JsonProperty("InstanceDatabaseName")
            private String InstanceDatabaseName;

            /**数据库排序规则*/
            @JsonProperty("InstanceDatabaseCollation")
            private String InstanceDatabaseCollation;

            /**数据库描述*/
            @JsonProperty("InstanceDatabaseDescription")
            private String InstanceDatabaseDescription;

            /**数据库状态*/
            @JsonProperty("InstanceDatabaseStatus")
            private String InstanceDatabaseStatus;

            /**创建时间*/
            @JsonProperty("Created")
            private String Created;

            /**账号权限列表*/
            @JsonProperty("InstanceDatabasePrivileges")
            private List<InstanceDatabasePrivilegesDto> InstanceDatabasePrivileges;

            @Data
            @ToString
            public static class InstanceDatabasePrivilegesDto {
                /***/
                @JsonProperty("InstanceAccountName")
                private String InstanceAccountName;

                /**账号名称*/
                @JsonProperty("Privilege")
                private String Privilege;

            }

        }

    }

    /**账号权限*/
    @JsonProperty("RequestId")
    private String RequestId;

}
