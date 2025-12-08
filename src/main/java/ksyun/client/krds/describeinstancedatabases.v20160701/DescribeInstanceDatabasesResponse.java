package ksyun.client.krds.describeinstancedatabases.v20160701;

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
    /**数据库列表	
–*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**数据库列表	
–*/
        @JsonProperty("InstanceDatabases")
        private List<DataDtoInstanceDatabasesDto> InstanceDatabases;

        @Data
        @ToString
        public static class DataDtoInstanceDatabasesDto {
            /**数据库名称	
*/
            @JsonProperty("InstanceDatabaseName")
            private String InstanceDatabaseName;

            /**数据库字符集	
*/
            @JsonProperty("InstanceDatabaseCollation")
            private String InstanceDatabaseCollation;

            /**数据库字符集	
*/
            @JsonProperty("InstanceDatabaseCollationSet")
            private String InstanceDatabaseCollationSet;

            /**数据库描述	
创建时添加了描述才会返回*/
            @JsonProperty("InstanceDatabaseDescription")
            private String InstanceDatabaseDescription;

            /**数据库状态：CREATING, ACTIVE, TASKS	
*/
            @JsonProperty("InstanceDatabaseStatus")
            private String InstanceDatabaseStatus;

            /**数据库权限(权限拥有者及对应权限)	
*/
            @JsonProperty("InstanceDatabasePrivileges")
            private DataDtoInstanceDatabasesDtoInstanceDatabasePrivilegesDto InstanceDatabasePrivileges;

            @Data
            @ToString
            public static class DataDtoInstanceDatabasesDtoInstanceDatabasePrivilegesDto {
            }

        }

    }

    /**请求ID	
–*/
    @JsonProperty("RequestId")
    private String RequestId;

}
