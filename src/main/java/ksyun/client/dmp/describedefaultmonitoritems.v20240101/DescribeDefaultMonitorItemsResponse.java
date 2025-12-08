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
            private String RdsInnodb_rows_inserted;

            /***/
            @JsonProperty("rds.innodb_buffer_pool_pages_total")
            private String RdsInnodb_buffer_pool_pages_total;

            /***/
            @JsonProperty("rds.select_scan")
            private String RdsSelect_scan;

            /***/
            @JsonProperty("rds.innodb_os_log_fsyncs")
            private String RdsInnodb_os_log_fsyncs;

            /***/
            @JsonProperty("rds.connection_used_percent")
            private String RdsConnection_used_percent;

            /***/
            @JsonProperty("rds.cpu_used_percent")
            private String RdsCpu_used_percent;

            /***/
            @JsonProperty("rds.resident_memory_size")
            private String RdsResident_memory_size;

            /***/
            @JsonProperty("rds.space_used")
            private String RdsSpace_used;

            /***/
            @JsonProperty("rds.handler_read_rnd_next")
            private String RdsHandler_read_rnd_next;

            /***/
            @JsonProperty("rds.innodb_buffer_pool_use_ratio")
            private String RdsInnodb_buffer_pool_use_ratio;

            /***/
            @JsonProperty("rds.com_delete")
            private String RdsCom_delete;

            /***/
            @JsonProperty("rds.slow_queries")
            private String RdsSlow_queries;

            /***/
            @JsonProperty("rds.innodb_num_open_files")
            private String RdsInnodb_num_open_files;

            /***/
            @JsonProperty("rds.space_used_percent")
            private String RdsSpace_used_percent;

            /***/
            @JsonProperty("rds.innodb_buffer_pool_pages_free")
            private String RdsInnodb_buffer_pool_pages_free;

            /***/
            @JsonProperty("rds.tps")
            private String RdsTps;

            /***/
            @JsonProperty("rds.innodb_buffer_pool_pages_flushed_ps")
            private String RdsInnodb_buffer_pool_pages_flushed_ps;

            /***/
            @JsonProperty("rds.bytes_sent")
            private String RdsBytes_sent;

            /***/
            @JsonProperty("rds.innodb_buffer_pool_reads")
            private String RdsInnodb_buffer_pool_reads;

            /***/
            @JsonProperty("rds.qcache_used_percent")
            private String RdsQcache_used_percent;

            /***/
            @JsonProperty("rds.threads_created")
            private String RdsThreads_created;

            /***/
            @JsonProperty("rds.rbps")
            private String RdsRbps;

            /***/
            @JsonProperty("rds.innodb_buffer_pool_read_requests")
            private String RdsInnodb_buffer_pool_read_requests;

            /***/
            @JsonProperty("rds.innodb_data_fsyncs")
            private String RdsInnodb_data_fsyncs;

            /***/
            @JsonProperty("rds.com_commit")
            private String RdsCom_commit;

            /***/
            @JsonProperty("rds.riops")
            private String RdsRiops;

            /***/
            @JsonProperty("rds.com_select")
            private String RdsCom_select;

            /***/
            @JsonProperty("rds.queries")
            private String RdsQueries;

            /***/
            @JsonProperty("rds.bytes_received")
            private String RdsBytes_received;

            /***/
            @JsonProperty("rds.table_locks_waited")
            private String RdsTable_locks_waited;

            /***/
            @JsonProperty("rds.innodb_row_lock_waits")
            private String RdsInnodb_row_lock_waits;

            /***/
            @JsonProperty("rds.threads_connected")
            private String RdsThreads_connected;

            /***/
            @JsonProperty("rds.innodb_buffer_pool_hit_ratio")
            private String RdsInnodb_buffer_pool_hit_ratio;

            /***/
            @JsonProperty("rds.innodb_rows_updated")
            private String RdsInnodb_rows_updated;

            /***/
            @JsonProperty("rds.innodb_log_writes_ps")
            private String RdsInnodb_log_writes_ps;

            /***/
            @JsonProperty("rds.innodb_rows_deleted")
            private String RdsInnodb_rows_deleted;

            /***/
            @JsonProperty("rds.innodb_rows_read")
            private String RdsInnodb_rows_read;

            /***/
            @JsonProperty("rds.com_rollback")
            private String RdsCom_rollback;

            /***/
            @JsonProperty("rds.qps")
            private String RdsQps;

            /***/
            @JsonProperty("rds.com_replace")
            private String RdsCom_replace;

            /***/
            @JsonProperty("rds.threads_running")
            private String RdsThreads_running;

            /***/
            @JsonProperty("rds.innodb_row_lock_time_avg")
            private String RdsInnodb_row_lock_time_avg;

            /***/
            @JsonProperty("rds.innodb_row_lock_waits_total")
            private String RdsInnodb_row_lock_waits_total;

            /***/
            @JsonProperty("rds.wbps")
            private String RdsWbps;

            /***/
            @JsonProperty("rds.wiops")
            private String RdsWiops;

            /***/
            @JsonProperty("rds.com_update")
            private String RdsCom_update;

            /***/
            @JsonProperty("rds.com_insert")
            private String RdsCom_insert;

            /***/
            @JsonProperty("rds.innodb_data_reads")
            private String RdsInnodb_data_reads;

            /***/
            @JsonProperty("rds.innodb_data_writes")
            private String RdsInnodb_data_writes;

            /***/
            @JsonProperty("rds.max_connections")
            private String RdsMax_connections;

            /***/
            @JsonProperty("rds.temp_space_used")
            private String RdsTemp_space_used;

            /***/
            @JsonProperty("rds.opened_tables")
            private String RdsOpened_tables;

            /***/
            @JsonProperty("rds.innodb_buffer_pool_write_requests_ps")
            private String RdsInnodb_buffer_pool_write_requests_ps;

            /***/
            @JsonProperty("rds.memory_used_percent")
            private String RdsMemory_used_percent;

        }

        /***/
        @JsonProperty("Total")
        private Integer Total;

    }

}
