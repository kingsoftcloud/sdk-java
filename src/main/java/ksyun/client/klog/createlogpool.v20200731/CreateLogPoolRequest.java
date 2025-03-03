package ksyun.client.klog.createlogpool.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateLogPoolRequest
 * @Description 请求参数
 */
@Data
public class CreateLogPoolRequest {
    /**
     * 工程名称
     */
    @KsYunField(name = "ProjectName")
    private String ProjectName;

    /**
     * 日志池名称
     */
    @KsYunField(name = "LogPoolName")
    private String LogPoolName;

    /**
     * 数据保存时间，单位为天，范围1~3600
     */
    @KsYunField(name = "RetentionDays")
    private Integer RetentionDays;

    /**
     * 分区个数，2-64
     */
    @KsYunField(name = "Partitions")
    private Integer Partitions;

    /**
     * 日志池描述
     */
    @KsYunField(name = "Description")
    private String Description;


}