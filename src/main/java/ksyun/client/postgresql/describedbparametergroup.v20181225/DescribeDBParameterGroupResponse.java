package ksyun.client.postgresql.describedbparametergroup.v20181225;

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

    /**##### 实例列表返回：
```json
{
    "Data": {
        "DBParameterGroups": [
            {
                "DBParameterGroupId": "59464b2e-80f2-4887-9449-bb7d510dddf0",
                "DBParameterGroupName": "liurong_AutoTest_CPG_20210511193106193",
                "EngineVersion": "11",
                "Description": "auto test create DBParameterGroup ",
                "Engine": "postgresql"
            }
        ],
        "Source": "TEMPLATE",
        "MaxRecords": 10,
        "TotalCount": 32,
        "Marker": 10
    },
    "RequestId": "fcdcb4e8-5197-479f-869d-f52aca7349ca"
}
```

##### 实例详情返回：
```json
{
    "Data": {
        "DBParameterGroups": [
            {
                "DBParameterGroupId": "564210c3-46f9-49ba-8f69-9a2507aabea1",
                "DBParameterGroupName": "lb_test_parameter",
                "EngineVersion": "9.6",
                "Description": "修改测试",
                "Parameters": {
                    "autovacuum_analyze_scale_factor": 0.1
                },
                "Engine": "postgresql"
            }
        ]
    },
    "RequestId": "31316bb8-37dc-47c1-b746-8b3a443e26c4"
}
```*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("DBParameterGroups")
        private List<DataDBParameterGroupsDto> DBParameterGroups;

        @Data
        @ToString
        public static class DataDBParameterGroupsDto {
            /**参数组ID*/
            @JsonProperty("DBParameterGroupId")
            private String DBParameterGroupId;

            /**参数组名称*/
            @JsonProperty("DBParameterGroupName")
            private String DBParameterGroupName;

            /**引擎版本*/
            @JsonProperty("EngineVersion")
            private String EngineVersion;

            /**描述*/
            @JsonProperty("Description")
            private String Description;

            /**引擎*/
            @JsonProperty("Engine")
            private String Engine;

            /**参数模版中参数详情，仅指定参数组查询才会返回此字段*/
            @JsonProperty("Parameters")
            private DataDBParameterGroupsParametersDto Parameters;

            @Data
            @ToString
            public static class DataDBParameterGroupsParametersDto {
                /***/
                @JsonProperty("autovacuum_analyze_scale_factor")
                private Integer Autovacuum_analyze_scale_factor;

                /***/
                @JsonProperty("log_temp_files")
                private Integer Log_temp_files;

                /***/
                @JsonProperty("autovacuum_vacuum_threshold")
                private Integer Autovacuum_vacuum_threshold;

                /***/
                @JsonProperty("vacuum_freeze_table_age")
                private Integer Vacuum_freeze_table_age;

                /***/
                @JsonProperty("autovacuum_freeze_max_age")
                private Integer Autovacuum_freeze_max_age;

                /***/
                @JsonProperty("wal_level")
                private String Wal_level;

                /***/
                @JsonProperty("autovacuum_vacuum_cost_limit")
                private Integer Autovacuum_vacuum_cost_limit;

                /***/
                @JsonProperty("autovacuum_vacuum_scale_factor")
                private Integer Autovacuum_vacuum_scale_factor;

                /***/
                @JsonProperty("track_activity_query_size")
                private Integer Track_activity_query_size;

                /***/
                @JsonProperty("autovacuum_max_workers")
                private Integer Autovacuum_max_workers;

                /***/
                @JsonProperty("checkpoint_timeout")
                private Integer Checkpoint_timeout;

                /***/
                @JsonProperty("wal_keep_segments")
                private Integer Wal_keep_segments;

                /***/
                @JsonProperty("autovacuum_vacuum_cost_delay")
                private Integer Autovacuum_vacuum_cost_delay;

                /***/
                @JsonProperty("autovacuum_naptime")
                private Integer Autovacuum_naptime;

                /***/
                @JsonProperty("autovacuum_analyze_threshold")
                private Integer Autovacuum_analyze_threshold;

                /***/
                @JsonProperty("default_statistics_target")
                private Integer Default_statistics_target;

                /***/
                @JsonProperty("log_autovacuum_min_duration")
                private Integer Log_autovacuum_min_duration;

            }

        }

        /***/
        @JsonProperty("Source")
        private String Source;

        /***/
        @JsonProperty("MaxRecords")
        private Integer MaxRecords;

        /***/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /***/
        @JsonProperty("Marker")
        private Integer Marker;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
