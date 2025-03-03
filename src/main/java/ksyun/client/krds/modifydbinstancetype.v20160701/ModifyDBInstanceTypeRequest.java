package ksyun.client.krds.modifydbinstancetype.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyDBInstanceTypeRequest
 * @Description 请求参数
 */
@Data
public class ModifyDBInstanceTypeRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 实例类型	目前支持：<br>1：HRDS（临时实例）升级为HA（高可用）<br>2：仅mysql5.7版本的高可用升级为（ERDS）三节点企业版
     */
    @KsYunField(name = "DBInstanceType")
    private String DBInstanceType;

    /**
     * 计费类型	计费类型<br>'YEAR_MONTH'：包年包月 <br>'DAY'：按天结
     */
    @KsYunField(name = "BillType")
    private String BillType;

    /**
     * 时长
     */
    @KsYunField(name = "Duration")
    private Integer Duration;

    /**
     * 时长单位
     */
    @KsYunField(name = "DurationUnit")
    private String DurationUnit;

    /**
     * 可用区名称	可用区名称（升级为ERDS不支持此参数）
     */
    @KsYunField(name = "AvailabilityZone")
    private String AvailabilityZone;


}