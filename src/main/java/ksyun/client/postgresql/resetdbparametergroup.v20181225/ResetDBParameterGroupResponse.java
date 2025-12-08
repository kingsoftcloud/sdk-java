package ksyun.client.postgresql.resetdbparametergroup.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ResetDBParameterGroupResponse
* @Description ResetDBParameterGroup 返回体
*/
@Data
@ToString
public class ResetDBParameterGroupResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("DBParameterGroup")
        private DBParameterGroupDto DBParameterGroup;

        @Data
        @ToString
        public static class DBParameterGroupDto {
            /***/
            @JsonProperty("DBParameterGroupId")
            private String DBParameterGroupId;

            /***/
            @JsonProperty("DBParameterGroupName")
            private String DBParameterGroupName;

            /***/
            @JsonProperty("EngineVersion")
            private String EngineVersion;

            /***/
            @JsonProperty("Description")
            private String Description;

            /***/
            @JsonProperty("Parameters")
            private ParametersDto Parameters;

            @Data
            @ToString
            public static class ParametersDto {
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

            /***/
            @JsonProperty("Engine")
            private String Engine;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
