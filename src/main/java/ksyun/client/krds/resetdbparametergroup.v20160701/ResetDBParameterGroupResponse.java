package ksyun.client.krds.resetdbparametergroup.v20160701;

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

    /**参数组列表
*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**参数组列表
*/
        @JsonProperty("DBParameterGroup")
        private DataDBParameterGroupDto DBParameterGroup;

        @Data
        @ToString
        public static class DataDBParameterGroupDto {
            /**参数组ID
*/
            @JsonProperty("DBParameterGroupId")
            private String DBParameterGroupId;

            /**参数组名称
*/
            @JsonProperty("DBParameterGroupName")
            private String DBParameterGroupName;

            /**数据库引擎版本
*/
            @JsonProperty("EngineVersion")
            private String EngineVersion;

            /**参数组描述
*/
            @JsonProperty("Description")
            private String Description;

            /**参数组参数值
*/
            @JsonProperty("Parameters")
            private DataDBParameterGroupParametersDto Parameters;

            @Data
            @ToString
            public static class DataDBParameterGroupParametersDto {
                /***/
                @JsonProperty("delay_key_write")
                private String Delay_key_write;

                /***/
                @JsonProperty("connect_timeout")
                private Integer Connect_timeout;

                /***/
                @JsonProperty("innodb_purge_batch_size")
                private Integer Innodb_purge_batch_size;

                /***/
                @JsonProperty("myisam_sort_buffer_size")
                private Integer Myisam_sort_buffer_size;

                /***/
                @JsonProperty("bulk_insert_buffer_size")
                private Integer Bulk_insert_buffer_size;

                /***/
                @JsonProperty("innodb_concurrency_tickets")
                private Integer Innodb_concurrency_tickets;

                /***/
                @JsonProperty("div_precision_increment")
                private Integer Div_precision_increment;

                /***/
                @JsonProperty("max_prepared_stmt_count")
                private Integer Max_prepared_stmt_count;

                /***/
                @JsonProperty("tx_isolation")
                private String Tx_isolation;

                /***/
                @JsonProperty("wait_timeout")
                private Integer Wait_timeout;

                /***/
                @JsonProperty("table_definition_cache")
                private Integer Table_definition_cache;

                /***/
                @JsonProperty("auto_increment_increment")
                private Integer Auto_increment_increment;

                /***/
                @JsonProperty("ft_query_expansion_limit")
                private Integer Ft_query_expansion_limit;

                /***/
                @JsonProperty("innodb_stats_sample_pages")
                private Integer Innodb_stats_sample_pages;

                /***/
                @JsonProperty("innodb_old_blocks_time")
                private Integer Innodb_old_blocks_time;

                /***/
                @JsonProperty("innodb_print_all_deadlocks")
                private String Innodb_print_all_deadlocks;

                /***/
                @JsonProperty("sync_binlog")
                private Integer Sync_binlog;

                /***/
                @JsonProperty("innodb_stats_method")
                private String Innodb_stats_method;

                /***/
                @JsonProperty("lock_wait_timeout")
                private Integer Lock_wait_timeout;

                /***/
                @JsonProperty("net_read_timeout")
                private Integer Net_read_timeout;

                /***/
                @JsonProperty("query_prealloc_size")
                private Integer Query_prealloc_size;

                /***/
                @JsonProperty("max_error_count")
                private Integer Max_error_count;

                /***/
                @JsonProperty("back_log")
                private Integer Back_log;

                /***/
                @JsonProperty("key_cache_age_threshold")
                private Integer Key_cache_age_threshold;

                /***/
                @JsonProperty("innodb_log_file_size")
                private Integer Innodb_log_file_size;

                /***/
                @JsonProperty("innodb_thread_concurrency")
                private Integer Innodb_thread_concurrency;

                /***/
                @JsonProperty("innodb_flush_log_at_trx_commit")
                private Integer Innodb_flush_log_at_trx_commit;

                /***/
                @JsonProperty("innodb_strict_mode")
                private String Innodb_strict_mode;

                /***/
                @JsonProperty("default_time_zone")
                private String Default_time_zone;

                /***/
                @JsonProperty("performance_schema")
                private String Performance_schema;

                /***/
                @JsonProperty("innodb_write_io_threads")
                private Integer Innodb_write_io_threads;

                /***/
                @JsonProperty("rpl_semi_sync_master_timeout")
                private Integer Rpl_semi_sync_master_timeout;

                /***/
                @JsonProperty("max_connect_errors")
                private Integer Max_connect_errors;

                /***/
                @JsonProperty("join_buffer_size")
                private Integer Join_buffer_size;

                /***/
                @JsonProperty("rpl_semi_sync_slave_enabled")
                private String Rpl_semi_sync_slave_enabled;

                /***/
                @JsonProperty("innodb_rollback_on_timeout")
                private String Innodb_rollback_on_timeout;

                /***/
                @JsonProperty("old_alter_table")
                private String Old_alter_table;

                /***/
                @JsonProperty("binlog_row_image")
                private String Binlog_row_image;

                /***/
                @JsonProperty("key_cache_block_size")
                private Integer Key_cache_block_size;

                /***/
                @JsonProperty("query_cache_type")
                private String Query_cache_type;

                /***/
                @JsonProperty("local_infile")
                private String Local_infile;

                /***/
                @JsonProperty("init_connect")
                private String Init_connect;

                /***/
                @JsonProperty("binlog_format")
                private String Binlog_format;

                /***/
                @JsonProperty("log_slave_updates")
                private String Log_slave_updates;

                /***/
                @JsonProperty("slow_launch_time")
                private Integer Slow_launch_time;

                /***/
                @JsonProperty("net_write_timeout")
                private Integer Net_write_timeout;

                /***/
                @JsonProperty("innodb_table_locks")
                private String Innodb_table_locks;

                /***/
                @JsonProperty("query_alloc_block_size")
                private Integer Query_alloc_block_size;

                /***/
                @JsonProperty("tmp_table_size")
                private Integer Tmp_table_size;

                /***/
                @JsonProperty("lower_case_table_names")
                private Integer Lower_case_table_names;

                /***/
                @JsonProperty("default_week_format")
                private Integer Default_week_format;

                /***/
                @JsonProperty("key_cache_division_limit")
                private Integer Key_cache_division_limit;

                /***/
                @JsonProperty("innodb_lock_wait_timeout")
                private Integer Innodb_lock_wait_timeout;

                /***/
                @JsonProperty("delayed_insert_timeout")
                private Integer Delayed_insert_timeout;

                /***/
                @JsonProperty("net_retry_count")
                private Integer Net_retry_count;

                /***/
                @JsonProperty("innodb_purge_threads")
                private Integer Innodb_purge_threads;

                /***/
                @JsonProperty("binlog_cache_size")
                private Integer Binlog_cache_size;

                /***/
                @JsonProperty("low_priority_updates")
                private String Low_priority_updates;

                /***/
                @JsonProperty("auto_increment_offset")
                private Integer Auto_increment_offset;

                /***/
                @JsonProperty("query_cache_limit")
                private Integer Query_cache_limit;

                /***/
                @JsonProperty("innodb_read_ahead_threshold")
                private Integer Innodb_read_ahead_threshold;

                /***/
                @JsonProperty("innodb_max_dirty_pages_pct")
                private Integer Innodb_max_dirty_pages_pct;

                /***/
                @JsonProperty("ft_min_word_len")
                private Integer Ft_min_word_len;

                /***/
                @JsonProperty("concurrent_insert")
                private String Concurrent_insert;

                /***/
                @JsonProperty("long_query_time")
                private Integer Long_query_time;

                /***/
                @JsonProperty("slow_query_log")
                private String Slow_query_log;

                /***/
                @JsonProperty("sort_buffer_size")
                private Integer Sort_buffer_size;

                /***/
                @JsonProperty("interactive_timeout")
                private Integer Interactive_timeout;

                /***/
                @JsonProperty("query_cache_size")
                private Integer Query_cache_size;

                /***/
                @JsonProperty("innodb_read_io_threads")
                private Integer Innodb_read_io_threads;

                /***/
                @JsonProperty("rpl_semi_sync_master_enabled")
                private String Rpl_semi_sync_master_enabled;

                /***/
                @JsonProperty("max_allowed_packet")
                private Integer Max_allowed_packet;

                /***/
                @JsonProperty("delayed_insert_limit")
                private Integer Delayed_insert_limit;

                /***/
                @JsonProperty("innodb_open_files")
                private Integer Innodb_open_files;

                /***/
                @JsonProperty("character_set_server")
                private String Character_set_server;

                /***/
                @JsonProperty("delayed_queue_size")
                private Integer Delayed_queue_size;

                /***/
                @JsonProperty("max_user_connections")
                private Integer Max_user_connections;

                /***/
                @JsonProperty("innodb_old_blocks_pct")
                private Integer Innodb_old_blocks_pct;

                /***/
                @JsonProperty("table_open_cache")
                private Integer Table_open_cache;

                /***/
                @JsonProperty("log_slow_admin_statements")
                private String Log_slow_admin_statements;

                /***/
                @JsonProperty("log_bin_trust_function_creators")
                private String Log_bin_trust_function_creators;

                /***/
                @JsonProperty("log_queries_not_using_indexes")
                private String Log_queries_not_using_indexes;

                /***/
                @JsonProperty("innodb_stats_on_metadata")
                private String Innodb_stats_on_metadata;

                /***/
                @JsonProperty("table_open_cache_instances")
                private Integer Table_open_cache_instances;

                /***/
                @JsonProperty("group_concat_max_len")
                private Integer Group_concat_max_len;

                /***/
                @JsonProperty("innodb_sort_buffer_size")
                private Integer Innodb_sort_buffer_size;

            }

            /**数据库引擎版本
*/
            @JsonProperty("Engine")
            private String Engine;

        }

    }

    /**请求ID
*/
    @JsonProperty("RequestId")
    private String RequestId;

}
