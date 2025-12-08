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
        private ParametersDto Parameters;

        @Data
        @ToString
        public static class ParametersDto {
            /***/
            @JsonProperty("connect_timeout")
            private Connect_timeoutDto Connect_timeout;

            @Data
            @ToString
            public static class Connect_timeoutDto {
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
            private Delay_key_writeDto Delay_key_write;

            @Data
            @ToString
            public static class Delay_key_writeDto {
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
            private Innodb_purge_batch_sizeDto Innodb_purge_batch_size;

            @Data
            @ToString
            public static class Innodb_purge_batch_sizeDto {
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
            private Myisam_sort_buffer_sizeDto Myisam_sort_buffer_size;

            @Data
            @ToString
            public static class Myisam_sort_buffer_sizeDto {
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
            private Bulk_insert_buffer_sizeDto Bulk_insert_buffer_size;

            @Data
            @ToString
            public static class Bulk_insert_buffer_sizeDto {
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
            private Div_precision_incrementDto Div_precision_increment;

            @Data
            @ToString
            public static class Div_precision_incrementDto {
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
            private Innodb_concurrency_ticketsDto Innodb_concurrency_tickets;

            @Data
            @ToString
            public static class Innodb_concurrency_ticketsDto {
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
            private Max_prepared_stmt_countDto Max_prepared_stmt_count;

            @Data
            @ToString
            public static class Max_prepared_stmt_countDto {
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
            private Wait_timeoutDto Wait_timeout;

            @Data
            @ToString
            public static class Wait_timeoutDto {
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
            private Tx_isolationDto Tx_isolation;

            @Data
            @ToString
            public static class Tx_isolationDto {
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
            private Table_definition_cacheDto Table_definition_cache;

            @Data
            @ToString
            public static class Table_definition_cacheDto {
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
            private Auto_increment_incrementDto Auto_increment_increment;

            @Data
            @ToString
            public static class Auto_increment_incrementDto {
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
            private Ft_query_expansion_limitDto Ft_query_expansion_limit;

            @Data
            @ToString
            public static class Ft_query_expansion_limitDto {
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
            private Innodb_old_blocks_timeDto Innodb_old_blocks_time;

            @Data
            @ToString
            public static class Innodb_old_blocks_timeDto {
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
            private Innodb_stats_sample_pagesDto Innodb_stats_sample_pages;

            @Data
            @ToString
            public static class Innodb_stats_sample_pagesDto {
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
            private Innodb_print_all_deadlocksDto Innodb_print_all_deadlocks;

            @Data
            @ToString
            public static class Innodb_print_all_deadlocksDto {
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
            private Sync_binlogDto Sync_binlog;

            @Data
            @ToString
            public static class Sync_binlogDto {
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
            private Innodb_stats_methodDto Innodb_stats_method;

            @Data
            @ToString
            public static class Innodb_stats_methodDto {
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
            private Lock_wait_timeoutDto Lock_wait_timeout;

            @Data
            @ToString
            public static class Lock_wait_timeoutDto {
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
            private Net_read_timeoutDto Net_read_timeout;

            @Data
            @ToString
            public static class Net_read_timeoutDto {
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
            private Query_prealloc_sizeDto Query_prealloc_size;

            @Data
            @ToString
            public static class Query_prealloc_sizeDto {
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
            private Back_logDto Back_log;

            @Data
            @ToString
            public static class Back_logDto {
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
            private Max_error_countDto Max_error_count;

            @Data
            @ToString
            public static class Max_error_countDto {
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
            private Key_cache_age_thresholdDto Key_cache_age_threshold;

            @Data
            @ToString
            public static class Key_cache_age_thresholdDto {
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
            private Innodb_log_file_sizeDto Innodb_log_file_size;

            @Data
            @ToString
            public static class Innodb_log_file_sizeDto {
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
            private Innodb_thread_concurrencyDto Innodb_thread_concurrency;

            @Data
            @ToString
            public static class Innodb_thread_concurrencyDto {
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
            private Innodb_strict_modeDto Innodb_strict_mode;

            @Data
            @ToString
            public static class Innodb_strict_modeDto {
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
            private Innodb_flush_log_at_trx_commitDto Innodb_flush_log_at_trx_commit;

            @Data
            @ToString
            public static class Innodb_flush_log_at_trx_commitDto {
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
            private Default_time_zoneDto Default_time_zone;

            @Data
            @ToString
            public static class Default_time_zoneDto {
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
            private Performance_schemaDto Performance_schema;

            @Data
            @ToString
            public static class Performance_schemaDto {
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
            private Innodb_write_io_threadsDto Innodb_write_io_threads;

            @Data
            @ToString
            public static class Innodb_write_io_threadsDto {
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
            private Rpl_semi_sync_master_timeoutDto Rpl_semi_sync_master_timeout;

            @Data
            @ToString
            public static class Rpl_semi_sync_master_timeoutDto {
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
            private Max_connect_errorsDto Max_connect_errors;

            @Data
            @ToString
            public static class Max_connect_errorsDto {
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
            private Join_buffer_sizeDto Join_buffer_size;

            @Data
            @ToString
            public static class Join_buffer_sizeDto {
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
            private Rpl_semi_sync_slave_enabledDto Rpl_semi_sync_slave_enabled;

            @Data
            @ToString
            public static class Rpl_semi_sync_slave_enabledDto {
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
            private Innodb_rollback_on_timeoutDto Innodb_rollback_on_timeout;

            @Data
            @ToString
            public static class Innodb_rollback_on_timeoutDto {
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
            private Old_alter_tableDto Old_alter_table;

            @Data
            @ToString
            public static class Old_alter_tableDto {
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
            private Binlog_row_imageDto Binlog_row_image;

            @Data
            @ToString
            public static class Binlog_row_imageDto {
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
            private Key_cache_block_sizeDto Key_cache_block_size;

            @Data
            @ToString
            public static class Key_cache_block_sizeDto {
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
            private Query_cache_typeDto Query_cache_type;

            @Data
            @ToString
            public static class Query_cache_typeDto {
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
            private Init_connectDto Init_connect;

            @Data
            @ToString
            public static class Init_connectDto {
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
            private Local_infileDto Local_infile;

            @Data
            @ToString
            public static class Local_infileDto {
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
            private Binlog_formatDto Binlog_format;

            @Data
            @ToString
            public static class Binlog_formatDto {
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
            private Log_slave_updatesDto Log_slave_updates;

            @Data
            @ToString
            public static class Log_slave_updatesDto {
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
            private Slow_launch_timeDto Slow_launch_time;

            @Data
            @ToString
            public static class Slow_launch_timeDto {
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
            private Innodb_table_locksDto Innodb_table_locks;

            @Data
            @ToString
            public static class Innodb_table_locksDto {
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
            private Net_write_timeoutDto Net_write_timeout;

            @Data
            @ToString
            public static class Net_write_timeoutDto {
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
            private Query_alloc_block_sizeDto Query_alloc_block_size;

            @Data
            @ToString
            public static class Query_alloc_block_sizeDto {
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
            private Lower_case_table_namesDto Lower_case_table_names;

            @Data
            @ToString
            public static class Lower_case_table_namesDto {
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
            private Tmp_table_sizeDto Tmp_table_size;

            @Data
            @ToString
            public static class Tmp_table_sizeDto {
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
            private Default_week_formatDto Default_week_format;

            @Data
            @ToString
            public static class Default_week_formatDto {
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
            private Key_cache_division_limitDto Key_cache_division_limit;

            @Data
            @ToString
            public static class Key_cache_division_limitDto {
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
            private Innodb_lock_wait_timeoutDto Innodb_lock_wait_timeout;

            @Data
            @ToString
            public static class Innodb_lock_wait_timeoutDto {
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
            private Delayed_insert_timeoutDto Delayed_insert_timeout;

            @Data
            @ToString
            public static class Delayed_insert_timeoutDto {
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
            private Net_retry_countDto Net_retry_count;

            @Data
            @ToString
            public static class Net_retry_countDto {
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
            private Innodb_purge_threadsDto Innodb_purge_threads;

            @Data
            @ToString
            public static class Innodb_purge_threadsDto {
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
            private Binlog_cache_sizeDto Binlog_cache_size;

            @Data
            @ToString
            public static class Binlog_cache_sizeDto {
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
            private Low_priority_updatesDto Low_priority_updates;

            @Data
            @ToString
            public static class Low_priority_updatesDto {
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
            private Auto_increment_offsetDto Auto_increment_offset;

            @Data
            @ToString
            public static class Auto_increment_offsetDto {
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
            private Innodb_max_dirty_pages_pctDto Innodb_max_dirty_pages_pct;

            @Data
            @ToString
            public static class Innodb_max_dirty_pages_pctDto {
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
            private Innodb_read_ahead_thresholdDto Innodb_read_ahead_threshold;

            @Data
            @ToString
            public static class Innodb_read_ahead_thresholdDto {
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
            private Query_cache_limitDto Query_cache_limit;

            @Data
            @ToString
            public static class Query_cache_limitDto {
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
            private Ft_min_word_lenDto Ft_min_word_len;

            @Data
            @ToString
            public static class Ft_min_word_lenDto {
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
            private Concurrent_insertDto Concurrent_insert;

            @Data
            @ToString
            public static class Concurrent_insertDto {
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
            @JsonProperty("Int_query_time")
            private Int_query_timeDto Int_query_time;

            @Data
            @ToString
            public static class Int_query_timeDto {
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
            private Slow_query_logDto Slow_query_log;

            @Data
            @ToString
            public static class Slow_query_logDto {
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
            private Sort_buffer_sizeDto Sort_buffer_size;

            @Data
            @ToString
            public static class Sort_buffer_sizeDto {
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
            private Interactive_timeoutDto Interactive_timeout;

            @Data
            @ToString
            public static class Interactive_timeoutDto {
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
            private Query_cache_sizeDto Query_cache_size;

            @Data
            @ToString
            public static class Query_cache_sizeDto {
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
            private Innodb_read_io_threadsDto Innodb_read_io_threads;

            @Data
            @ToString
            public static class Innodb_read_io_threadsDto {
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
            private Max_allowed_packetDto Max_allowed_packet;

            @Data
            @ToString
            public static class Max_allowed_packetDto {
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
            private Rpl_semi_sync_master_enabledDto Rpl_semi_sync_master_enabled;

            @Data
            @ToString
            public static class Rpl_semi_sync_master_enabledDto {
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
            private Delayed_insert_limitDto Delayed_insert_limit;

            @Data
            @ToString
            public static class Delayed_insert_limitDto {
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
            private Innodb_open_filesDto Innodb_open_files;

            @Data
            @ToString
            public static class Innodb_open_filesDto {
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
            private Character_set_serverDto Character_set_server;

            @Data
            @ToString
            public static class Character_set_serverDto {
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
            private Delayed_queue_sizeDto Delayed_queue_size;

            @Data
            @ToString
            public static class Delayed_queue_sizeDto {
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
            private Max_user_connectionsDto Max_user_connections;

            @Data
            @ToString
            public static class Max_user_connectionsDto {
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
            private Innodb_old_blocks_pctDto Innodb_old_blocks_pct;

            @Data
            @ToString
            public static class Innodb_old_blocks_pctDto {
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
            private Table_open_cacheDto Table_open_cache;

            @Data
            @ToString
            public static class Table_open_cacheDto {
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
            private Log_slow_admin_statementsDto Log_slow_admin_statements;

            @Data
            @ToString
            public static class Log_slow_admin_statementsDto {
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
            private Log_bin_trust_function_creatorsDto Log_bin_trust_function_creators;

            @Data
            @ToString
            public static class Log_bin_trust_function_creatorsDto {
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
            private Log_queries_not_using_indexesDto Log_queries_not_using_indexes;

            @Data
            @ToString
            public static class Log_queries_not_using_indexesDto {
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
            private Innodb_stats_on_metadataDto Innodb_stats_on_metadata;

            @Data
            @ToString
            public static class Innodb_stats_on_metadataDto {
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
            private Table_open_cache_instancesDto Table_open_cache_instances;

            @Data
            @ToString
            public static class Table_open_cache_instancesDto {
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
            private Group_concat_max_lenDto Group_concat_max_len;

            @Data
            @ToString
            public static class Group_concat_max_lenDto {
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
            private Innodb_sort_buffer_sizeDto Innodb_sort_buffer_size;

            @Data
            @ToString
            public static class Innodb_sort_buffer_sizeDto {
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
