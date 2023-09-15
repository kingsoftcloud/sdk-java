package ksyun.client.krds.createdbinstancereadreplica.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateDBInstanceReadReplicaRequest
* @Description 请求参数
*/
@Data
public class CreateDBInstanceReadReplicaRequest{
    /**主实例ID。一个主实例最多只能有3个只读实例。*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**实例名称	不超过256个字节，仅支持中文、大小写字母、数字、减号和下划线*/
    @KsYunField(name="DBInstanceName")
    private String DBInstanceName;

    /**共享同一主实例下的只读实例IP，默认创建一个新的IP*/
    @KsYunField(name="AttachedVipId")
    private String AttachedVipId;

    /**计费方式	YEAR_MONTH（包年包月）,DAY（按日计费），默认值：YEAR_MONTH*/
    @KsYunField(name="BillType")
    private String BillType;

    /**购买时长	时长 默认值：1(单位:月) 注：billType=1(包年包月)则必填*/
    @KsYunField(name="Duration")
    private String Duration;

    /**购买时长单位	 取值范围：M（月），默认值：M（区分大小写）*/
    @KsYunField(name="DurationUnit")
    private String DurationUnit;

    /**可用区	示例(AvailabilityZone.1=cn-beijing-6a)，默认情况下只读实例可用区与主实例一致，如果主实例是跨可用区实例，只读实例会随机分布。*/
    @KsYunField(name="AvailabilityZone.1")
    private String AvailabilityZone1;

    /**项目ID	可从IAM获取ProjectId*/
    @KsYunField(name="ProjectId")
    private Integer ProjectId;

    /**只读IP地址	选定的IP地址*/
    @KsYunField(name="Vip")
    private String Vip;

    /**实例内存	实例内存大小*/
    @KsYunField(name="Mem")
    private Integer Mem;

    /**实例硬盘	实例硬盘大小*/
    @KsYunField(name="Disk")
    private Integer Disk;


}