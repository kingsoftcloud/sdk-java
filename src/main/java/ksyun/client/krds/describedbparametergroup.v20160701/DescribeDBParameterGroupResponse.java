package ksyun.client.krds.describedbparametergroup.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDBParameterGroupResponse
* @Description DescribeDBParameterGroup 返回体
*/
@Data
@ToString
public class DescribeDBParameterGroupResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("DBParameterGroups")
        private List<DBParameterGroupsDto> DBParameterGroups;

        @Data
        @ToString
        public static class DBParameterGroupsDto {
            /**参数组ID*/
            @JsonProperty("DBParameterGroupId")
            private String DBParameterGroupId;

            /**参数组名称*/
            @JsonProperty("DBParameterGroupName")
            private String DBParameterGroupName;

            /**数据库引擎版本*/
            @JsonProperty("EngineVersion")
            private String EngineVersion;

            /**数据库引擎*/
            @JsonProperty("Engine")
            private String Engine;

        }

        /**参数组类型*/
        @JsonProperty("Source")
        private String Source;

        /***/
        @JsonProperty("MaxRecords")
        private Integer MaxRecords;

        /***/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
