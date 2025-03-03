package ksyun.client.aicp.getjobmetrics.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetJobMetricsRequest
 * @Description 请求参数
 */
@Data
public class GetJobMetricsRequest {
    /**
     * 任务ID
     */
    @KsYunField(name = "job_id")
    private Integer Job_id;

    /**
     * 任务taskID
     * 如果不传，默认为该job下最新的task
     */
    @KsYunField(name = "task_id")
    private Integer Task_id;

    /**
     * 开始时间
     * 默认一小时前，时间戳格式，支持10位或者13位时间戳
     */
    @KsYunField(name = "start_time")
    private String Start_time;

    /**
     * 结束时间
     * 默认当前，时间戳格式，支持10位或者13位时间戳
     */
    @KsYunField(name = "end_time")
    private String End_time;

    /**
     * 查询步长
     * 时间单位支持s(秒)、m（分钟）、h（小时）
     */
    @KsYunField(name = "time_step")
    private String Time_step;

    /**
     * 指标类型
     * 注：结果值说明，其中GpuCoreUsage、GpuMemoryUsage、CpuCoreUsage、MemoryUsage、SmUsage结果为普通数，不带有%。例显示结果为0.4，表示40%。其余指标结算结果没有经过任何单位处理。
     * <p>
     * 支持查询的类型包括以下：
     * GpuCoreUsage
     * GPU使用率（pod维度）
     * 聚合值为平均值
     * <p>
     * GpuMemoryUsage
     * GPU显存使用率（pod维度）
     * 聚合值为平均值
     * <p>
     * <p>
     * CpuCoreUsage
     * CPU使用率（pod维度）
     * 聚合值为平均值
     * <p>
     * MemoryUsage
     * 内存使用率（pod维度）
     * 聚合值为平均值
     * <p>
     * NetworkInputRate
     * 网络写入速率（pod维度）
     * 聚合值为总和值
     * <p>
     * NetworkOutputRate
     * 网络写出速率（pod维度）
     * 聚合值为总和值
     * <p>
     * IBInputRate
     * IB传输速率（节点维度）
     * 聚合值为总和值
     * <p>
     * IBOutputRate
     * IB接收速率（节点维度）
     * 聚合值为总和值
     * <p>
     * GpuTemperature
     * GPU温度（pod维度）
     * 聚合值为平均值
     * <p>
     * SmUsage
     * SM使用率（pod维度）
     * 聚合值为平均值
     * <p>
     * NasClientReadIOPS
     * Nas客户端读取IOPS（节点维度）
     * 聚合值为总和值
     * <p>
     * NasClientWriteIOPS
     * Nas客户端写入IOPS（节点维度）
     * 聚合值为总和值
     * <p>
     * NasClientReadLatency
     * Nas客户端读取延迟（节点维度）
     * 聚合值为总和值
     * <p>
     * NasClientWriteLatency
     * Nas客户端写入延迟（节点维度）
     * 聚合值为总和值
     * <p>
     * NasClientReadRate
     * Nas客户端读取速率（节点维度）
     * 聚合值为总和值
     * <p>
     * NasClientWriteRate
     * Nas客户端写入速率（节点维度）
     * 聚合值为总和值
     */
    @KsYunField(name = "metric_type")
    private String Metric_type;

    /**
     * 是否返回每个pod的详细数据
     * 1：是
     * 0：否
     */
    @KsYunField(name = "metric_detail")
    private Integer Metric_detail;

    /**
     * 空间ID
     */
    @KsYunField(name = "space_id")
    private Integer Space_id;

}