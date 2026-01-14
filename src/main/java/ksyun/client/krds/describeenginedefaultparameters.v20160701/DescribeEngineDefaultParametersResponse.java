package ksyun.client.krds.describeenginedefaultparameters.v20160701;

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

    /**-
*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**引擎名称
*/
        @JsonProperty("Engine")
        private String Engine;

        /**引擎版本
*/
        @JsonProperty("EngineVersion")
        private String EngineVersion;

        /**参数列表
*/
        @JsonProperty("Parameters")
        private DataParametersDto Parameters;

        @Data
        @ToString
        public static class DataParametersDto {
            /***/
            @JsonProperty("connect_timeout")
            private DataParametersConnect_timeoutDto Connect_timeout;

            @Data
            @ToString
            public static class DataParametersConnect_timeoutDto {
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
            @JsonProperty("delay_key_write")
            private DataParametersDelay_key_writeDto Delay_key_write;

            @Data
            @ToString
            public static class DataParametersDelay_key_writeDto {
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
            @JsonProperty("innodb_purge_batch_size")
            private DataParametersInnodb_purge_batch_sizeDto Innodb_purge_batch_size;

            @Data
            @ToString
            public static class DataParametersInnodb_purge_batch_sizeDto {
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
            @JsonProperty("myisam_sort_buffer_size")
            private DataParametersMyisam_sort_buffer_sizeDto Myisam_sort_buffer_size;

            @Data
            @ToString
            public static class DataParametersMyisam_sort_buffer_sizeDto {
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
            @JsonProperty("bulk_insert_buffer_size")
            private DataParametersBulk_insert_buffer_sizeDto Bulk_insert_buffer_size;

            @Data
            @ToString
            public static class DataParametersBulk_insert_buffer_sizeDto {
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
            @JsonProperty("div_precision_increment")
            private DataParametersDiv_precision_incrementDto Div_precision_increment;

            @Data
            @ToString
            public static class DataParametersDiv_precision_incrementDto {
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
            @JsonProperty("innodb_concurrency_tickets")
            private DataParametersInnodb_concurrency_ticketsDto Innodb_concurrency_tickets;

            @Data
            @ToString
            public static class DataParametersInnodb_concurrency_ticketsDto {
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
            @JsonProperty("max_prepared_stmt_count")
            private DataParametersMax_prepared_stmt_countDto Max_prepared_stmt_count;

            @Data
            @ToString
            public static class DataParametersMax_prepared_stmt_countDto {
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
            @JsonProperty("wait_timeout")
            private DataParametersWait_timeoutDto Wait_timeout;

            @Data
            @ToString
            public static class DataParametersWait_timeoutDto {
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
            @JsonProperty("tx_isolation")
            private DataParametersTx_isolationDto Tx_isolation;

            @Data
            @ToString
            public static class DataParametersTx_isolationDto {
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
                @JsonProperty("Alias")
                private String Alias;

                /***/
                @JsonProperty("Enums")
                private List<String> Enums;

            }

            /***/
            @JsonProperty("table_definition_cache")
            private DataParametersTable_definition_cacheDto Table_definition_cache;

            @Data
            @ToString
            public static class DataParametersTable_definition_cacheDto {
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
            @JsonProperty("auto_increment_increment")
            private DataParametersAuto_increment_incrementDto Auto_increment_increment;

            @Data
            @ToString
            public static class DataParametersAuto_increment_incrementDto {
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
            @JsonProperty("ft_query_expansion_limit")
            private DataParametersFt_query_expansion_limitDto Ft_query_expansion_limit;

            @Data
            @ToString
            public static class DataParametersFt_query_expansion_limitDto {
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
            @JsonProperty("innodb_old_blocks_time")
            private DataParametersInnodb_old_blocks_timeDto Innodb_old_blocks_time;

            @Data
            @ToString
            public static class DataParametersInnodb_old_blocks_timeDto {
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
            @JsonProperty("innodb_stats_sample_pages")
            private DataParametersInnodb_stats_sample_pagesDto Innodb_stats_sample_pages;

            @Data
            @ToString
            public static class DataParametersInnodb_stats_sample_pagesDto {
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
            @JsonProperty("innodb_print_all_deadlocks")
            private DataParametersInnodb_print_all_deadlocksDto Innodb_print_all_deadlocks;

            @Data
            @ToString
            public static class DataParametersInnodb_print_all_deadlocksDto {
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
            @JsonProperty("sync_binlog")
            private DataParametersSync_binlogDto Sync_binlog;

            @Data
            @ToString
            public static class DataParametersSync_binlogDto {
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
            @JsonProperty("innodb_stats_method")
            private DataParametersInnodb_stats_methodDto Innodb_stats_method;

            @Data
            @ToString
            public static class DataParametersInnodb_stats_methodDto {
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
            @JsonProperty("lock_wait_timeout")
            private DataParametersLock_wait_timeoutDto Lock_wait_timeout;

            @Data
            @ToString
            public static class DataParametersLock_wait_timeoutDto {
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
            @JsonProperty("net_read_timeout")
            private DataParametersNet_read_timeoutDto Net_read_timeout;

            @Data
            @ToString
            public static class DataParametersNet_read_timeoutDto {
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
            @JsonProperty("query_prealloc_size")
            private DataParametersQuery_prealloc_sizeDto Query_prealloc_size;

            @Data
            @ToString
            public static class DataParametersQuery_prealloc_sizeDto {
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

                /***/
                @JsonProperty("Step")
                private Integer Step;

            }

            /***/
            @JsonProperty("back_log")
            private DataParametersBack_logDto Back_log;

            @Data
            @ToString
            public static class DataParametersBack_logDto {
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
            @JsonProperty("max_error_count")
            private DataParametersMax_error_countDto Max_error_count;

            @Data
            @ToString
            public static class DataParametersMax_error_countDto {
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
            @JsonProperty("key_cache_age_threshold")
            private DataParametersKey_cache_age_thresholdDto Key_cache_age_threshold;

            @Data
            @ToString
            public static class DataParametersKey_cache_age_thresholdDto {
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

                /***/
                @JsonProperty("Step")
                private Integer Step;

            }

            /***/
            @JsonProperty("innodb_log_file_size")
            private DataParametersInnodb_log_file_sizeDto Innodb_log_file_size;

            @Data
            @ToString
            public static class DataParametersInnodb_log_file_sizeDto {
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

                /***/
                @JsonProperty("Step")
                private Integer Step;

            }

            /***/
            @JsonProperty("innodb_thread_concurrency")
            private DataParametersInnodb_thread_concurrencyDto Innodb_thread_concurrency;

            @Data
            @ToString
            public static class DataParametersInnodb_thread_concurrencyDto {
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
            @JsonProperty("innodb_strict_mode")
            private DataParametersInnodb_strict_modeDto Innodb_strict_mode;

            @Data
            @ToString
            public static class DataParametersInnodb_strict_modeDto {
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
            @JsonProperty("innodb_flush_log_at_trx_commit")
            private DataParametersInnodb_flush_log_at_trx_commitDto Innodb_flush_log_at_trx_commit;

            @Data
            @ToString
            public static class DataParametersInnodb_flush_log_at_trx_commitDto {
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
            @JsonProperty("default_time_zone")
            private DataParametersDefault_time_zoneDto Default_time_zone;

            @Data
            @ToString
            public static class DataParametersDefault_time_zoneDto {
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
            @JsonProperty("performance_schema")
            private DataParametersPerformance_schemaDto Performance_schema;

            @Data
            @ToString
            public static class DataParametersPerformance_schemaDto {
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
            @JsonProperty("innodb_write_io_threads")
            private DataParametersInnodb_write_io_threadsDto Innodb_write_io_threads;

            @Data
            @ToString
            public static class DataParametersInnodb_write_io_threadsDto {
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
            @JsonProperty("rpl_semi_sync_master_timeout")
            private DataParametersRpl_semi_sync_master_timeoutDto Rpl_semi_sync_master_timeout;

            @Data
            @ToString
            public static class DataParametersRpl_semi_sync_master_timeoutDto {
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
            @JsonProperty("max_connect_errors")
            private DataParametersMax_connect_errorsDto Max_connect_errors;

            @Data
            @ToString
            public static class DataParametersMax_connect_errorsDto {
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
            @JsonProperty("join_buffer_size")
            private DataParametersJoin_buffer_sizeDto Join_buffer_size;

            @Data
            @ToString
            public static class DataParametersJoin_buffer_sizeDto {
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

                /***/
                @JsonProperty("Step")
                private Integer Step;

            }

            /***/
            @JsonProperty("rpl_semi_sync_slave_enabled")
            private DataParametersRpl_semi_sync_slave_enabledDto Rpl_semi_sync_slave_enabled;

            @Data
            @ToString
            public static class DataParametersRpl_semi_sync_slave_enabledDto {
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
            @JsonProperty("innodb_rollback_on_timeout")
            private DataParametersInnodb_rollback_on_timeoutDto Innodb_rollback_on_timeout;

            @Data
            @ToString
            public static class DataParametersInnodb_rollback_on_timeoutDto {
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
            @JsonProperty("old_alter_table")
            private DataParametersOld_alter_tableDto Old_alter_table;

            @Data
            @ToString
            public static class DataParametersOld_alter_tableDto {
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
            @JsonProperty("binlog_row_image")
            private DataParametersBinlog_row_imageDto Binlog_row_image;

            @Data
            @ToString
            public static class DataParametersBinlog_row_imageDto {
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
            @JsonProperty("key_cache_block_size")
            private DataParametersKey_cache_block_sizeDto Key_cache_block_size;

            @Data
            @ToString
            public static class DataParametersKey_cache_block_sizeDto {
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

                /***/
                @JsonProperty("Step")
                private Integer Step;

            }

            /***/
            @JsonProperty("query_cache_type")
            private DataParametersQuery_cache_typeDto Query_cache_type;

            @Data
            @ToString
            public static class DataParametersQuery_cache_typeDto {
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
                @JsonProperty("Ignore")
                private Boolean Ignore;

                /***/
                @JsonProperty("Enums")
                private List<String> Enums;

            }

            /***/
            @JsonProperty("init_connect")
            private DataParametersInit_connectDto Init_connect;

            @Data
            @ToString
            public static class DataParametersInit_connectDto {
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
            @JsonProperty("local_infile")
            private DataParametersLocal_infileDto Local_infile;

            @Data
            @ToString
            public static class DataParametersLocal_infileDto {
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
            @JsonProperty("binlog_format")
            private DataParametersBinlog_formatDto Binlog_format;

            @Data
            @ToString
            public static class DataParametersBinlog_formatDto {
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
            @JsonProperty("log_slave_updates")
            private DataParametersLog_slave_updatesDto Log_slave_updates;

            @Data
            @ToString
            public static class DataParametersLog_slave_updatesDto {
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
            @JsonProperty("slow_launch_time")
            private DataParametersSlow_launch_timeDto Slow_launch_time;

            @Data
            @ToString
            public static class DataParametersSlow_launch_timeDto {
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
            @JsonProperty("innodb_table_locks")
            private DataParametersInnodb_table_locksDto Innodb_table_locks;

            @Data
            @ToString
            public static class DataParametersInnodb_table_locksDto {
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
            @JsonProperty("net_write_timeout")
            private DataParametersNet_write_timeoutDto Net_write_timeout;

            @Data
            @ToString
            public static class DataParametersNet_write_timeoutDto {
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
            @JsonProperty("query_alloc_block_size")
            private DataParametersQuery_alloc_block_sizeDto Query_alloc_block_size;

            @Data
            @ToString
            public static class DataParametersQuery_alloc_block_sizeDto {
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

                /***/
                @JsonProperty("Step")
                private Integer Step;

            }

            /***/
            @JsonProperty("lower_case_table_names")
            private DataParametersLower_case_table_namesDto Lower_case_table_names;

            @Data
            @ToString
            public static class DataParametersLower_case_table_namesDto {
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
            @JsonProperty("tmp_table_size")
            private DataParametersTmp_table_sizeDto Tmp_table_size;

            @Data
            @ToString
            public static class DataParametersTmp_table_sizeDto {
                /***/
                @JsonProperty("Min")
                private Integer Min;

                /***/
                @JsonProperty("Default")
                private String DefaultField;

                /***/
                @JsonProperty("Max")
                private String Max;

                /***/
                @JsonProperty("RestartRequired")
                private Boolean RestartRequired;

                /***/
                @JsonProperty("Type")
                private String Type;

                /***/
                @JsonProperty("DefaultScaleFactor")
                private String DefaultScaleFactor;

                /***/
                @JsonProperty("MaxScaleFactor")
                private String MaxScaleFactor;

                /***/
                @JsonProperty("Variable")
                private String Variable;

            }

            /***/
            @JsonProperty("default_week_format")
            private DataParametersDefault_week_formatDto Default_week_format;

            @Data
            @ToString
            public static class DataParametersDefault_week_formatDto {
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
            @JsonProperty("key_cache_division_limit")
            private DataParametersKey_cache_division_limitDto Key_cache_division_limit;

            @Data
            @ToString
            public static class DataParametersKey_cache_division_limitDto {
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
            @JsonProperty("innodb_lock_wait_timeout")
            private DataParametersInnodb_lock_wait_timeoutDto Innodb_lock_wait_timeout;

            @Data
            @ToString
            public static class DataParametersInnodb_lock_wait_timeoutDto {
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
            @JsonProperty("delayed_insert_timeout")
            private DataParametersDelayed_insert_timeoutDto Delayed_insert_timeout;

            @Data
            @ToString
            public static class DataParametersDelayed_insert_timeoutDto {
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
            @JsonProperty("net_retry_count")
            private DataParametersNet_retry_countDto Net_retry_count;

            @Data
            @ToString
            public static class DataParametersNet_retry_countDto {
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
            @JsonProperty("innodb_purge_threads")
            private DataParametersInnodb_purge_threadsDto Innodb_purge_threads;

            @Data
            @ToString
            public static class DataParametersInnodb_purge_threadsDto {
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
            @JsonProperty("binlog_cache_size")
            private DataParametersBinlog_cache_sizeDto Binlog_cache_size;

            @Data
            @ToString
            public static class DataParametersBinlog_cache_sizeDto {
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
            @JsonProperty("low_priority_updates")
            private DataParametersLow_priority_updatesDto Low_priority_updates;

            @Data
            @ToString
            public static class DataParametersLow_priority_updatesDto {
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
            @JsonProperty("auto_increment_offset")
            private DataParametersAuto_increment_offsetDto Auto_increment_offset;

            @Data
            @ToString
            public static class DataParametersAuto_increment_offsetDto {
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
            @JsonProperty("innodb_max_dirty_pages_pct")
            private DataParametersInnodb_max_dirty_pages_pctDto Innodb_max_dirty_pages_pct;

            @Data
            @ToString
            public static class DataParametersInnodb_max_dirty_pages_pctDto {
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
            @JsonProperty("innodb_read_ahead_threshold")
            private DataParametersInnodb_read_ahead_thresholdDto Innodb_read_ahead_threshold;

            @Data
            @ToString
            public static class DataParametersInnodb_read_ahead_thresholdDto {
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
            @JsonProperty("query_cache_limit")
            private DataParametersQuery_cache_limitDto Query_cache_limit;

            @Data
            @ToString
            public static class DataParametersQuery_cache_limitDto {
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
            @JsonProperty("ft_min_word_len")
            private DataParametersFt_min_word_lenDto Ft_min_word_len;

            @Data
            @ToString
            public static class DataParametersFt_min_word_lenDto {
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
            @JsonProperty("concurrent_insert")
            private DataParametersConcurrent_insertDto Concurrent_insert;

            @Data
            @ToString
            public static class DataParametersConcurrent_insertDto {
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
            @JsonProperty("long_query_time")
            private DataParametersLong_query_timeDto Long_query_time;

            @Data
            @ToString
            public static class DataParametersLong_query_timeDto {
                /***/
                @JsonProperty("Min")
                private Integer Min;

                /***/
                @JsonProperty("Default")
                private Double DefaultField;

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
            @JsonProperty("slow_query_log")
            private DataParametersSlow_query_logDto Slow_query_log;

            @Data
            @ToString
            public static class DataParametersSlow_query_logDto {
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
            @JsonProperty("sort_buffer_size")
            private DataParametersSort_buffer_sizeDto Sort_buffer_size;

            @Data
            @ToString
            public static class DataParametersSort_buffer_sizeDto {
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
            @JsonProperty("interactive_timeout")
            private DataParametersInteractive_timeoutDto Interactive_timeout;

            @Data
            @ToString
            public static class DataParametersInteractive_timeoutDto {
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
            @JsonProperty("query_cache_size")
            private DataParametersQuery_cache_sizeDto Query_cache_size;

            @Data
            @ToString
            public static class DataParametersQuery_cache_sizeDto {
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

                /***/
                @JsonProperty("SecondMin")
                private Integer SecondMin;

                /***/
                @JsonProperty("Step")
                private Integer Step;

            }

            /***/
            @JsonProperty("innodb_read_io_threads")
            private DataParametersInnodb_read_io_threadsDto Innodb_read_io_threads;

            @Data
            @ToString
            public static class DataParametersInnodb_read_io_threadsDto {
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
            @JsonProperty("max_allowed_packet")
            private DataParametersMax_allowed_packetDto Max_allowed_packet;

            @Data
            @ToString
            public static class DataParametersMax_allowed_packetDto {
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

                /***/
                @JsonProperty("Step")
                private Integer Step;

            }

            /***/
            @JsonProperty("rpl_semi_sync_master_enabled")
            private DataParametersRpl_semi_sync_master_enabledDto Rpl_semi_sync_master_enabled;

            @Data
            @ToString
            public static class DataParametersRpl_semi_sync_master_enabledDto {
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
            @JsonProperty("delayed_insert_limit")
            private DataParametersDelayed_insert_limitDto Delayed_insert_limit;

            @Data
            @ToString
            public static class DataParametersDelayed_insert_limitDto {
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
            @JsonProperty("innodb_open_files")
            private DataParametersInnodb_open_filesDto Innodb_open_files;

            @Data
            @ToString
            public static class DataParametersInnodb_open_filesDto {
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
            @JsonProperty("character_set_server")
            private DataParametersCharacter_set_serverDto Character_set_server;

            @Data
            @ToString
            public static class DataParametersCharacter_set_serverDto {
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
            @JsonProperty("delayed_queue_size")
            private DataParametersDelayed_queue_sizeDto Delayed_queue_size;

            @Data
            @ToString
            public static class DataParametersDelayed_queue_sizeDto {
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
            @JsonProperty("max_user_connections")
            private DataParametersMax_user_connectionsDto Max_user_connections;

            @Data
            @ToString
            public static class DataParametersMax_user_connectionsDto {
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
            @JsonProperty("innodb_old_blocks_pct")
            private DataParametersInnodb_old_blocks_pctDto Innodb_old_blocks_pct;

            @Data
            @ToString
            public static class DataParametersInnodb_old_blocks_pctDto {
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
            @JsonProperty("table_open_cache")
            private DataParametersTable_open_cacheDto Table_open_cache;

            @Data
            @ToString
            public static class DataParametersTable_open_cacheDto {
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
            @JsonProperty("log_slow_admin_statements")
            private DataParametersLog_slow_admin_statementsDto Log_slow_admin_statements;

            @Data
            @ToString
            public static class DataParametersLog_slow_admin_statementsDto {
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
            @JsonProperty("log_bin_trust_function_creators")
            private DataParametersLog_bin_trust_function_creatorsDto Log_bin_trust_function_creators;

            @Data
            @ToString
            public static class DataParametersLog_bin_trust_function_creatorsDto {
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
            @JsonProperty("log_queries_not_using_indexes")
            private DataParametersLog_queries_not_using_indexesDto Log_queries_not_using_indexes;

            @Data
            @ToString
            public static class DataParametersLog_queries_not_using_indexesDto {
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
            @JsonProperty("innodb_stats_on_metadata")
            private DataParametersInnodb_stats_on_metadataDto Innodb_stats_on_metadata;

            @Data
            @ToString
            public static class DataParametersInnodb_stats_on_metadataDto {
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
            @JsonProperty("table_open_cache_instances")
            private DataParametersTable_open_cache_instancesDto Table_open_cache_instances;

            @Data
            @ToString
            public static class DataParametersTable_open_cache_instancesDto {
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
            @JsonProperty("group_concat_max_len")
            private DataParametersGroup_concat_max_lenDto Group_concat_max_len;

            @Data
            @ToString
            public static class DataParametersGroup_concat_max_lenDto {
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
            @JsonProperty("innodb_sort_buffer_size")
            private DataParametersInnodb_sort_buffer_sizeDto Innodb_sort_buffer_size;

            @Data
            @ToString
            public static class DataParametersInnodb_sort_buffer_sizeDto {
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

    /**请求ID
*/
    @JsonProperty("RequestId")
    private String RequestId;

}
