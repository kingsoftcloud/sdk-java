package ksyun.client.postgresql.describeinstancedatabases.v20181225;

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
        /***/
        @JsonProperty("InstanceDatabases")
        private List<DataInstanceDatabasesDto> InstanceDatabases;

        @Data
        @ToString
        public static class DataInstanceDatabasesDto {
            /**数据库名称*/
            @JsonProperty("InstanceDatabaseName")
            private String InstanceDatabaseName;

            /**排序规则*/
            @JsonProperty("InstanceDatabaseCollation")
            private String InstanceDatabaseCollation;

            /**数据库'Owner'*/
            @JsonProperty("InstanceDatabaseOwner")
            private String InstanceDatabaseOwner;

            /**字符集*/
            @JsonProperty("InstanceDatabaseCharacterSet")
            private String InstanceDatabaseCharacterSet;

            /**实例数据库状态

```json
数据库状态：CREATING, ACTIVE, TASKS 
```*/
            @JsonProperty("InstanceDatabaseStatus")
            private String InstanceDatabaseStatus;

            /**描述*/
            @JsonProperty("InstanceDatabaseDescription")
            private String InstanceDatabaseDescription;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
