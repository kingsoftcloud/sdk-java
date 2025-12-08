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
        private ParametersDto Parameters;

        @Data
        @ToString
        public static class ParametersDto {
            /***/
            @JsonProperty("autovacuum_analyze_scale_factor")
            private Autovacuum_analyze_scale_factorDto Autovacuum_analyze_scale_factor;

            @Data
            @ToString
            public static class Autovacuum_analyze_scale_factorDto {
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
            private Autovacuum_vacuum_thresholdDto Autovacuum_vacuum_threshold;

            @Data
            @ToString
            public static class Autovacuum_vacuum_thresholdDto {
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
            private Log_temp_filesDto Log_temp_files;

            @Data
            @ToString
            public static class Log_temp_filesDto {
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
            private Autovacuum_freeze_max_ageDto Autovacuum_freeze_max_age;

            @Data
            @ToString
            public static class Autovacuum_freeze_max_ageDto {
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
            private Vacuum_freeze_table_ageDto Vacuum_freeze_table_age;

            @Data
            @ToString
            public static class Vacuum_freeze_table_ageDto {
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
            private Wal_levelDto Wal_level;

            @Data
            @ToString
            public static class Wal_levelDto {
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
            private Autovacuum_vacuum_cost_limitDto Autovacuum_vacuum_cost_limit;

            @Data
            @ToString
            public static class Autovacuum_vacuum_cost_limitDto {
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
            private Autovacuum_vacuum_scale_factorDto Autovacuum_vacuum_scale_factor;

            @Data
            @ToString
            public static class Autovacuum_vacuum_scale_factorDto {
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
            private Track_activity_query_sizeDto Track_activity_query_size;

            @Data
            @ToString
            public static class Track_activity_query_sizeDto {
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
            private Autovacuum_max_workersDto Autovacuum_max_workers;

            @Data
            @ToString
            public static class Autovacuum_max_workersDto {
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
            private Checkpoint_timeoutDto Checkpoint_timeout;

            @Data
            @ToString
            public static class Checkpoint_timeoutDto {
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
            private Autovacuum_vacuum_cost_delayDto Autovacuum_vacuum_cost_delay;

            @Data
            @ToString
            public static class Autovacuum_vacuum_cost_delayDto {
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
            private Wal_keep_segmentsDto Wal_keep_segments;

            @Data
            @ToString
            public static class Wal_keep_segmentsDto {
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
            private Autovacuum_naptimeDto Autovacuum_naptime;

            @Data
            @ToString
            public static class Autovacuum_naptimeDto {
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
            private Autovacuum_analyze_thresholdDto Autovacuum_analyze_threshold;

            @Data
            @ToString
            public static class Autovacuum_analyze_thresholdDto {
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
            private Default_statistics_targetDto Default_statistics_target;

            @Data
            @ToString
            public static class Default_statistics_targetDto {
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
            private Log_autovacuum_min_durationDto Log_autovacuum_min_duration;

            @Data
            @ToString
            public static class Log_autovacuum_min_durationDto {
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
