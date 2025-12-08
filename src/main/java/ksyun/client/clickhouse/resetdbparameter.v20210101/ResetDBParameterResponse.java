package ksyun.client.clickhouse.resetdbparameter.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ResetDBParameterResponse
* @Description ResetDBParameter 返回体
*/
@Data
@ToString
public class ResetDBParameterResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Code")
    private String Code;

    /***/
    @JsonProperty("Message")
    private String Message;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("configuration")
        private ConfigurationDto Configuration;

        @Data
        @ToString
        public static class ConfigurationDto {
            /***/
            @JsonProperty("description")
            private String Description;

            /***/
            @JsonProperty("id")
            private String Id;

            /***/
            @JsonProperty("name")
            private String Name;

            /***/
            @JsonProperty("values")
            private ValuesDto Values;

            @Data
            @ToString
            public static class ValuesDto {
                /***/
                @JsonProperty("compile_aggregate_expressions")
                private String Compile_aggregate_expressions;

                /***/
                @JsonProperty("enable_unaligned_array_join")
                private String Enable_unaligned_array_join;

                /***/
                @JsonProperty("max_memory_usage_for_user")
                private String Max_memory_usage_for_user;

                /***/
                @JsonProperty("enable_optimize_predicate_expression")
                private String Enable_optimize_predicate_expression;

                /***/
                @JsonProperty("prefer_global_in_and_join")
                private String Prefer_global_in_and_join;

                /***/
                @JsonProperty("max_bytes_in_join")
                private String Max_bytes_in_join;

                /***/
                @JsonProperty("join_use_nulls")
                private String Join_use_nulls;

                /***/
                @JsonProperty("join_default_strictness")
                private String Join_default_strictness;

                /***/
                @JsonProperty("max_rows_in_join")
                private String Max_rows_in_join;

                /***/
                @JsonProperty("distributed_aggregation_memory_efficient")
                private String Distributed_aggregation_memory_efficient;

                /***/
                @JsonProperty("join_on_disk_max_files_to_merge")
                private String Join_on_disk_max_files_to_merge;

                /***/
                @JsonProperty("union_default_mode")
                private String Union_default_mode;

                /***/
                @JsonProperty("optimize_move_to_prewhere")
                private String Optimize_move_to_prewhere;

                /***/
                @JsonProperty("max_rows_to_group_by")
                private String Max_rows_to_group_by;

                /***/
                @JsonProperty("optimize_throw_if_noop")
                private String Optimize_throw_if_noop;

                /***/
                @JsonProperty("join_any_take_last_row")
                private String Join_any_take_last_row;

                /***/
                @JsonProperty("max_memory_usage")
                private String Max_memory_usage;

                /***/
                @JsonProperty("min_count_to_compile_aggregate_expression")
                private String Min_count_to_compile_aggregate_expression;

                /***/
                @JsonProperty("max_block_size")
                private String Max_block_size;

                /***/
                @JsonProperty("min_count_to_compile_expression")
                private String Min_count_to_compile_expression;

                /***/
                @JsonProperty("mutations_sync")
                private String Mutations_sync;

                /***/
                @JsonProperty("max_execution_time")
                private String Max_execution_time;

                /***/
                @JsonProperty("partial_merge_join_rows_in_right_blocks")
                private String Partial_merge_join_rows_in_right_blocks;

                /***/
                @JsonProperty("max_bytes_before_external_group_by")
                private String Max_bytes_before_external_group_by;

                /***/
                @JsonProperty("compile_expressions")
                private String Compile_expressions;

                /***/
                @JsonProperty("distributed_product_mode")
                private String Distributed_product_mode;

                /***/
                @JsonProperty("max_insert_block_size")
                private String Max_insert_block_size;

                /***/
                @JsonProperty("totals_mode")
                private String Totals_mode;

                /***/
                @JsonProperty("join_algorithm")
                private String Join_algorithm;

                /***/
                @JsonProperty("optimize_aggregation_in_order")
                private String Optimize_aggregation_in_order;

                /***/
                @JsonProperty("join_overflow_mode")
                private String Join_overflow_mode;

                /***/
                @JsonProperty("use_uncompressed_cache")
                private String Use_uncompressed_cache;

                /***/
                @JsonProperty("allow_experimental_alter_materialized_view_structure")
                private String Allow_experimental_alter_materialized_view_structure;

                /***/
                @JsonProperty("insert_null_as_default")
                private String Insert_null_as_default;

                /***/
                @JsonProperty("optimize_read_in_order")
                private String Optimize_read_in_order;

                /***/
                @JsonProperty("max_bytes_before_external_sort")
                private String Max_bytes_before_external_sort;

                /***/
                @JsonProperty("any_join_distinct_right_table_keys")
                private String Any_join_distinct_right_table_keys;

                /***/
                @JsonProperty("group_by_overflow_mode")
                private String Group_by_overflow_mode;

                /***/
                @JsonProperty("optimize_move_to_prewhere_if_final")
                private String Optimize_move_to_prewhere_if_final;

                /***/
                @JsonProperty("partial_merge_join_optimizations")
                private String Partial_merge_join_optimizations;

            }

            /***/
            @JsonProperty("datastore_version_id")
            private String Datastore_version_id;

        }

    }

}
