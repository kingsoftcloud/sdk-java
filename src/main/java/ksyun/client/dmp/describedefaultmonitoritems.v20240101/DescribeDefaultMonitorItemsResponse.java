package ksyun.client.dmp.describedefaultmonitoritems.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDefaultMonitorItemsResponse
* @Description DescribeDefaultMonitorItems 返回体
*/
@Data
@ToString
public class DescribeDefaultMonitorItemsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("MonitorItems")
        private MonitorItemsDto MonitorItems;

        @Data
        @ToString
        public static class MonitorItemsDto {
            /***/
            @JsonProperty("rds.innodb_rows_inserted")
            private String Rdsinnodb_rows_inserted;

            /***/
            @JsonProperty("rds.innodb_buffer_pool_pages_total")
            private String Rdsinnodb_buffer_pool_pages_total;

            /***/
            @JsonProperty("rds.select_scan")
            private String Rdsselect_scan;

            /***/
            @JsonProperty("rds.innodb_os_log_fsyncs")
            private String Rdsinnodb_os_log_fsyncs;

            /***/
            @JsonProperty("rds.connection_used_percent")
            private String Rdsconnection_used_percent;

            /***/
            @JsonProperty("rds.cpu_used_percent")
            private String Rdscpu_used_percent;

            /***/
            @JsonProperty("rds.resident_memory_size")
            private String Rdsresident_memory_size;

            /***/
            @JsonProperty("rds.space_used")
            private String Rdsspace_used;

            /***/
            @JsonProperty("rds.handler_read_rnd_next")
            private String Rdshandler_read_rnd_next;

            /***/
            @JsonProperty("rds.innodb_buffer_pool_use_ratio")
            private String Rdsinnodb_buffer_pool_use_ratio;

            /***/
            @JsonProperty("rds.com_delete")
            private String Rdscom_delete;

            /***/
            @JsonProperty("rds.slow_queries")
            private String Rdsslow_queries;

            /***/
            @JsonProperty("rds.innodb_num_open_files")
            private String Rdsinnodb_num_open_files;

            /***/
            @JsonProperty("rds.space_used_percent")
            private String Rdsspace_used_percent;

            /***/
            @JsonProperty("rds.innodb_buffer_pool_pages_free")
            private String Rdsinnodb_buffer_pool_pages_free;

            /***/
            @JsonProperty("rds.tps")
            private String Rdstps;

            /***/
            @JsonProperty("rds.innodb_buffer_pool_pages_flushed_ps")
            private String Rdsinnodb_buffer_pool_pages_flushed_ps;

            /***/
            @JsonProperty("rds.bytes_sent")
            private String Rdsbytes_sent;

            /***/
            @JsonProperty("rds.innodb_buffer_pool_reads")
            private String Rdsinnodb_buffer_pool_reads;

            /***/
            @JsonProperty("rds.qcache_used_percent")
            private String Rdsqcache_used_percent;

            /***/
            @JsonProperty("rds.threads_created")
            private String Rdsthreads_created;

            /***/
            @JsonProperty("rds.rbps")
            private String Rdsrbps;

            /***/
            @JsonProperty("rds.innodb_buffer_pool_read_requests")
            private String Rdsinnodb_buffer_pool_read_requests;

            /***/
            @JsonProperty("rds.innodb_data_fsyncs")
            private String Rdsinnodb_data_fsyncs;

            /***/
            @JsonProperty("rds.com_commit")
            private String Rdscom_commit;

            /***/
            @JsonProperty("rds.riops")
            private String Rdsriops;

            /***/
            @JsonProperty("rds.com_select")
            private String Rdscom_select;

            /***/
            @JsonProperty("rds.queries")
            private String Rdsqueries;

            /***/
            @JsonProperty("rds.bytes_received")
            private String Rdsbytes_received;

            /***/
            @JsonProperty("rds.table_locks_waited")
            private String Rdstable_locks_waited;

            /***/
            @JsonProperty("rds.innodb_row_lock_waits")
            private String Rdsinnodb_row_lock_waits;

            /***/
            @JsonProperty("rds.threads_connected")
            private String Rdsthreads_connected;

            /***/
            @JsonProperty("rds.innodb_buffer_pool_hit_ratio")
            private String Rdsinnodb_buffer_pool_hit_ratio;

            /***/
            @JsonProperty("rds.innodb_rows_updated")
            private String Rdsinnodb_rows_updated;

            /***/
            @JsonProperty("rds.innodb_log_writes_ps")
            private String Rdsinnodb_log_writes_ps;

            /***/
            @JsonProperty("rds.innodb_rows_deleted")
            private String Rdsinnodb_rows_deleted;

            /***/
            @JsonProperty("rds.innodb_rows_read")
            private String Rdsinnodb_rows_read;

            /***/
            @JsonProperty("rds.com_rollback")
            private String Rdscom_rollback;

            /***/
            @JsonProperty("rds.qps")
            private String Rdsqps;

            /***/
            @JsonProperty("rds.com_replace")
            private String Rdscom_replace;

            /***/
            @JsonProperty("rds.threads_running")
            private String Rdsthreads_running;

            /***/
            @JsonProperty("rds.innodb_row_lock_time_avg")
            private String Rdsinnodb_row_lock_time_avg;

            /***/
            @JsonProperty("rds.innodb_row_lock_waits_total")
            private String Rdsinnodb_row_lock_waits_total;

            /***/
            @JsonProperty("rds.wbps")
            private String Rdswbps;

            /***/
            @JsonProperty("rds.wiops")
            private String Rdswiops;

            /***/
            @JsonProperty("rds.com_update")
            private String Rdscom_update;

            /***/
            @JsonProperty("rds.com_insert")
            private String Rdscom_insert;

            /***/
            @JsonProperty("rds.innodb_data_reads")
            private String Rdsinnodb_data_reads;

            /***/
            @JsonProperty("rds.innodb_data_writes")
            private String Rdsinnodb_data_writes;

            /***/
            @JsonProperty("rds.max_connections")
            private String Rdsmax_connections;

            /***/
            @JsonProperty("rds.temp_space_used")
            private String Rdstemp_space_used;

            /***/
            @JsonProperty("rds.opened_tables")
            private String Rdsopened_tables;

            /***/
            @JsonProperty("rds.innodb_buffer_pool_write_requests_ps")
            private String Rdsinnodb_buffer_pool_write_requests_ps;

            /***/
            @JsonProperty("rds.memory_used_percent")
            private String Rdsmemory_used_percent;

        }

        /***/
        @JsonProperty("Total")
        private Integer Total;

    }

}
