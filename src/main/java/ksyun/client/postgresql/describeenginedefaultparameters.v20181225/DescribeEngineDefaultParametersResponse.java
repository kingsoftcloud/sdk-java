package ksyun.client.postgresql.describeenginedefaultparameters.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeEngineDefaultParametersResponse
* @Description DescribeEngineDefaultParameters 返回体
*/
@Data
@ToString
public class DescribeEngineDefaultParametersResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Engine")
        private String Engine;

        /***/
        @JsonProperty("EngineVersion")
        private String EngineVersion;

        /***/
        @JsonProperty("Parameters")
        private DataParametersDto Parameters;

        @Data
        @ToString
        public static class DataParametersDto {
            /***/
            @JsonProperty("autovacuum_analyze_scale_factor")
            private DataParametersAutovacuum_analyze_scale_factorDto Autovacuum_analyze_scale_factor;

            @Data
            @ToString
            public static class DataParametersAutovacuum_analyze_scale_factorDto {
                /***/
                @JsonProperty("Min")
                private Integer Min;

                /***/
                @JsonProperty("Default")
                private Integer DefaultField;

                /***/
                @JsonProperty("Max")
                private Integer Max;

                /***/
                @JsonProperty("RestartRequired")
                private Boolean RestartRequired;

                /***/
                @JsonProperty("Type")
                private String Type;

            }

            /***/
            @JsonProperty("autovacuum_vacuum_threshold")
            private DataParametersAutovacuum_vacuum_thresholdDto Autovacuum_vacuum_threshold;

            @Data
            @ToString
            public static class DataParametersAutovacuum_vacuum_thresholdDto {
                /***/
                @JsonProperty("Min")
                private Integer Min;

                /***/
                @JsonProperty("Default")
                private Integer DefaultField;

                /***/
                @JsonProperty("Max")
                private Integer Max;

                /***/
                @JsonProperty("RestartRequired")
                private Boolean RestartRequired;

                /***/
                @JsonProperty("Type")
                private String Type;

            }

            /***/
            @JsonProperty("log_temp_files")
            private DataParametersLog_temp_filesDto Log_temp_files;

            @Data
            @ToString
            public static class DataParametersLog_temp_filesDto {
                /***/
                @JsonProperty("Min")
                private Integer Min;

                /***/
                @JsonProperty("Default")
                private Integer DefaultField;

                /***/
                @JsonProperty("Max")
                private Integer Max;

                /***/
                @JsonProperty("RestartRequired")
                private Boolean RestartRequired;

                /***/
                @JsonProperty("Type")
                private String Type;

            }

            /***/
            @JsonProperty("autovacuum_freeze_max_age")
            private DataParametersAutovacuum_freeze_max_ageDto Autovacuum_freeze_max_age;

            @Data
            @ToString
            public static class DataParametersAutovacuum_freeze_max_ageDto {
                /***/
                @JsonProperty("Min")
                private Integer Min;

                /***/
                @JsonProperty("Default")
                private Integer DefaultField;

                /***/
                @JsonProperty("Max")
                private Integer Max;

                /***/
                @JsonProperty("RestartRequired")
                private Boolean RestartRequired;

                /***/
                @JsonProperty("Type")
                private String Type;

            }

            /***/
            @JsonProperty("vacuum_freeze_table_age")
            private DataParametersVacuum_freeze_table_ageDto Vacuum_freeze_table_age;

            @Data
            @ToString
            public static class DataParametersVacuum_freeze_table_ageDto {
                /***/
                @JsonProperty("Min")
                private Integer Min;

                /***/
                @JsonProperty("Default")
                private Integer DefaultField;

                /***/
                @JsonProperty("Max")
                private Integer Max;

                /***/
                @JsonProperty("RestartRequired")
                private Boolean RestartRequired;

                /***/
                @JsonProperty("Type")
                private String Type;

            }

            /***/
            @JsonProperty("wal_level")
            private DataParametersWal_levelDto Wal_level;

            @Data
            @ToString
            public static class DataParametersWal_levelDto {
                /***/
                @JsonProperty("Default")
                private String DefaultField;

                /***/
                @JsonProperty("RestartRequired")
                private Boolean RestartRequired;

                /***/
                @JsonProperty("Type")
                private String Type;

                /***/
                @JsonProperty("Enums")
                private List<String> Enums;

            }

            /***/
            @JsonProperty("autovacuum_vacuum_cost_limit")
            private DataParametersAutovacuum_vacuum_cost_limitDto Autovacuum_vacuum_cost_limit;

            @Data
            @ToString
            public static class DataParametersAutovacuum_vacuum_cost_limitDto {
                /***/
                @JsonProperty("Min")
                private Integer Min;

                /***/
                @JsonProperty("Default")
                private Integer DefaultField;

                /***/
                @JsonProperty("Max")
                private Integer Max;

                /***/
                @JsonProperty("RestartRequired")
                private Boolean RestartRequired;

                /***/
                @JsonProperty("Type")
                private String Type;

            }

            /***/
            @JsonProperty("autovacuum_vacuum_scale_factor")
            private DataParametersAutovacuum_vacuum_scale_factorDto Autovacuum_vacuum_scale_factor;

            @Data
            @ToString
            public static class DataParametersAutovacuum_vacuum_scale_factorDto {
                /***/
                @JsonProperty("Min")
                private Integer Min;

                /***/
                @JsonProperty("Default")
                private Integer DefaultField;

                /***/
                @JsonProperty("Max")
                private Integer Max;

                /***/
                @JsonProperty("RestartRequired")
                private Boolean RestartRequired;

                /***/
                @JsonProperty("Type")
                private String Type;

            }

            /***/
            @JsonProperty("track_activity_query_size")
            private DataParametersTrack_activity_query_sizeDto Track_activity_query_size;

            @Data
            @ToString
            public static class DataParametersTrack_activity_query_sizeDto {
                /***/
                @JsonProperty("Min")
                private Integer Min;

                /***/
                @JsonProperty("Default")
                private Integer DefaultField;

                /***/
                @JsonProperty("Max")
                private Integer Max;

                /***/
                @JsonProperty("RestartRequired")
                private Boolean RestartRequired;

                /***/
                @JsonProperty("Type")
                private String Type;

            }

            /***/
            @JsonProperty("autovacuum_max_workers")
            private DataParametersAutovacuum_max_workersDto Autovacuum_max_workers;

            @Data
            @ToString
            public static class DataParametersAutovacuum_max_workersDto {
                /***/
                @JsonProperty("Min")
                private Integer Min;

                /***/
                @JsonProperty("Default")
                private Integer DefaultField;

                /***/
                @JsonProperty("Max")
                private Integer Max;

                /***/
                @JsonProperty("RestartRequired")
                private Boolean RestartRequired;

                /***/
                @JsonProperty("Type")
                private String Type;

            }

            /***/
            @JsonProperty("checkpoint_timeout")
            private DataParametersCheckpoint_timeoutDto Checkpoint_timeout;

            @Data
            @ToString
            public static class DataParametersCheckpoint_timeoutDto {
                /***/
                @JsonProperty("Min")
                private Integer Min;

                /***/
                @JsonProperty("Default")
                private Integer DefaultField;

                /***/
                @JsonProperty("Max")
                private Integer Max;

                /***/
                @JsonProperty("RestartRequired")
                private Boolean RestartRequired;

                /***/
                @JsonProperty("Type")
                private String Type;

            }

            /***/
            @JsonProperty("autovacuum_vacuum_cost_delay")
            private DataParametersAutovacuum_vacuum_cost_delayDto Autovacuum_vacuum_cost_delay;

            @Data
            @ToString
            public static class DataParametersAutovacuum_vacuum_cost_delayDto {
                /***/
                @JsonProperty("Min")
                private Integer Min;

                /***/
                @JsonProperty("Default")
                private Integer DefaultField;

                /***/
                @JsonProperty("Max")
                private Integer Max;

                /***/
                @JsonProperty("RestartRequired")
                private Boolean RestartRequired;

                /***/
                @JsonProperty("Type")
                private String Type;

            }

            /***/
            @JsonProperty("wal_keep_segments")
            private DataParametersWal_keep_segmentsDto Wal_keep_segments;

            @Data
            @ToString
            public static class DataParametersWal_keep_segmentsDto {
                /***/
                @JsonProperty("Min")
                private Integer Min;

                /***/
                @JsonProperty("Default")
                private Integer DefaultField;

                /***/
                @JsonProperty("Max")
                private Integer Max;

                /***/
                @JsonProperty("RestartRequired")
                private Boolean RestartRequired;

                /***/
                @JsonProperty("Type")
                private String Type;

            }

            /***/
            @JsonProperty("autovacuum_naptime")
            private DataParametersAutovacuum_naptimeDto Autovacuum_naptime;

            @Data
            @ToString
            public static class DataParametersAutovacuum_naptimeDto {
                /***/
                @JsonProperty("Min")
                private Integer Min;

                /***/
                @JsonProperty("Default")
                private Integer DefaultField;

                /***/
                @JsonProperty("Max")
                private Integer Max;

                /***/
                @JsonProperty("RestartRequired")
                private Boolean RestartRequired;

                /***/
                @JsonProperty("Type")
                private String Type;

            }

            /***/
            @JsonProperty("autovacuum_analyze_threshold")
            private DataParametersAutovacuum_analyze_thresholdDto Autovacuum_analyze_threshold;

            @Data
            @ToString
            public static class DataParametersAutovacuum_analyze_thresholdDto {
                /***/
                @JsonProperty("Min")
                private Integer Min;

                /***/
                @JsonProperty("Default")
                private Integer DefaultField;

                /***/
                @JsonProperty("Max")
                private Integer Max;

                /***/
                @JsonProperty("RestartRequired")
                private Boolean RestartRequired;

                /***/
                @JsonProperty("Type")
                private String Type;

            }

            /***/
            @JsonProperty("default_statistics_target")
            private DataParametersDefault_statistics_targetDto Default_statistics_target;

            @Data
            @ToString
            public static class DataParametersDefault_statistics_targetDto {
                /***/
                @JsonProperty("Min")
                private Integer Min;

                /***/
                @JsonProperty("Default")
                private Integer DefaultField;

                /***/
                @JsonProperty("Max")
                private Integer Max;

                /***/
                @JsonProperty("RestartRequired")
                private Boolean RestartRequired;

                /***/
                @JsonProperty("Type")
                private String Type;

            }

            /***/
            @JsonProperty("log_autovacuum_min_duration")
            private DataParametersLog_autovacuum_min_durationDto Log_autovacuum_min_duration;

            @Data
            @ToString
            public static class DataParametersLog_autovacuum_min_durationDto {
                /***/
                @JsonProperty("Min")
                private Integer Min;

                /***/
                @JsonProperty("Default")
                private Integer DefaultField;

                /***/
                @JsonProperty("Max")
                private Integer Max;

                /***/
                @JsonProperty("RestartRequired")
                private Boolean RestartRequired;

                /***/
                @JsonProperty("Type")
                private String Type;

            }

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
