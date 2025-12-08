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
        private DataDtoParametersDto Parameters;

        @Data
        @ToString
        public static class DataDtoParametersDto {
            /***/
            @JsonProperty("autovacuum_analyze_scale_factor")
            private DataDtoParametersDtoAutovacuum_analyze_scale_factorDto Autovacuum_analyze_scale_factor;

            @Data
            @ToString
            public static class DataDtoParametersDtoAutovacuum_analyze_scale_factorDto {
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
            private DataDtoParametersDtoAutovacuum_vacuum_thresholdDto Autovacuum_vacuum_threshold;

            @Data
            @ToString
            public static class DataDtoParametersDtoAutovacuum_vacuum_thresholdDto {
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
            private DataDtoParametersDtoLog_temp_filesDto Log_temp_files;

            @Data
            @ToString
            public static class DataDtoParametersDtoLog_temp_filesDto {
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
            private DataDtoParametersDtoAutovacuum_freeze_max_ageDto Autovacuum_freeze_max_age;

            @Data
            @ToString
            public static class DataDtoParametersDtoAutovacuum_freeze_max_ageDto {
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
            private DataDtoParametersDtoVacuum_freeze_table_ageDto Vacuum_freeze_table_age;

            @Data
            @ToString
            public static class DataDtoParametersDtoVacuum_freeze_table_ageDto {
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
            private DataDtoParametersDtoWal_levelDto Wal_level;

            @Data
            @ToString
            public static class DataDtoParametersDtoWal_levelDto {
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
            private DataDtoParametersDtoAutovacuum_vacuum_cost_limitDto Autovacuum_vacuum_cost_limit;

            @Data
            @ToString
            public static class DataDtoParametersDtoAutovacuum_vacuum_cost_limitDto {
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
            private DataDtoParametersDtoAutovacuum_vacuum_scale_factorDto Autovacuum_vacuum_scale_factor;

            @Data
            @ToString
            public static class DataDtoParametersDtoAutovacuum_vacuum_scale_factorDto {
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
            private DataDtoParametersDtoTrack_activity_query_sizeDto Track_activity_query_size;

            @Data
            @ToString
            public static class DataDtoParametersDtoTrack_activity_query_sizeDto {
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
            private DataDtoParametersDtoAutovacuum_max_workersDto Autovacuum_max_workers;

            @Data
            @ToString
            public static class DataDtoParametersDtoAutovacuum_max_workersDto {
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
            private DataDtoParametersDtoCheckpoint_timeoutDto Checkpoint_timeout;

            @Data
            @ToString
            public static class DataDtoParametersDtoCheckpoint_timeoutDto {
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
            private DataDtoParametersDtoAutovacuum_vacuum_cost_delayDto Autovacuum_vacuum_cost_delay;

            @Data
            @ToString
            public static class DataDtoParametersDtoAutovacuum_vacuum_cost_delayDto {
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
            private DataDtoParametersDtoWal_keep_segmentsDto Wal_keep_segments;

            @Data
            @ToString
            public static class DataDtoParametersDtoWal_keep_segmentsDto {
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
            private DataDtoParametersDtoAutovacuum_naptimeDto Autovacuum_naptime;

            @Data
            @ToString
            public static class DataDtoParametersDtoAutovacuum_naptimeDto {
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
            private DataDtoParametersDtoAutovacuum_analyze_thresholdDto Autovacuum_analyze_threshold;

            @Data
            @ToString
            public static class DataDtoParametersDtoAutovacuum_analyze_thresholdDto {
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
            private DataDtoParametersDtoDefault_statistics_targetDto Default_statistics_target;

            @Data
            @ToString
            public static class DataDtoParametersDtoDefault_statistics_targetDto {
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
            private DataDtoParametersDtoLog_autovacuum_min_durationDto Log_autovacuum_min_duration;

            @Data
            @ToString
            public static class DataDtoParametersDtoLog_autovacuum_min_durationDto {
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
