package ksyun.client.postgresql.restoredbinstancefromdbbackup.v20181225;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RestoreDBInstanceFromDBBackupRequest
* @Description 请求参数
*/
@Data
public class RestoreDBInstanceFromDBBackupRequest{
    /**#### 备份ID*/
    @KsYunField(name="DBBackupIdentifier")
    private String DBBackupIdentifier;

    /**#### 实例类型
区分大小写，取固定值：高可用实例：HRDS_PG，临时实例：TRDS_PG*/
    @KsYunField(name="DBInstanceType")
    private String DBInstanceType;

    /**#### 实例名称
不超过256个字节，仅支持中文、大小写字母、数字、减号和下划线*/
    @KsYunField(name="DBInstanceName")
    private String DBInstanceName;

    /**#### 计费方式
默认值：YEAR_MONTH，取值范围：YEAR_MONTH（包年包月）,DAY（按日计费）。*/
    @KsYunField(name="BillType")
    private String BillType;

    /**#### 购买时长
取值范围：默认1。选择YEAR_MONTH时计费方式必传.*/
    @KsYunField(name="Duration")
    private Integer Duration;

    /**#### 购买时长单位
取值范围：M（月），默认值：M（区分大小写）,选择YEAR_MONTH时计费方式必传.*/
    @KsYunField(name="DurationUnit")
    private String DurationUnit;

    /**#### 可用区字段
示例(AvailabilityZone.1=cn-beijing-6a&AvailabilityZone.2=cn-beijing-6b)，表示实例的主副本在a区，备副本在b区。如果没有跨可用区的需求，建议将实例创建在云主机的可用区内已减少网络延时。*/
    @KsYunField(name="AvailabilityZone",type=1)
    private List<String> AvailabilityZoneList;

    /**##### VPC网络ID，可在网络控制台获取。不传默认与原备份一致*/
    @KsYunField(name="VpcId")
    private String VpcId;

    /**##### 终端子网ID，可在网络控制台获取（注意类型必须为终端子网）。不传默认与原备份一致*/
    @KsYunField(name="SubnetId")
    private String SubnetId;

}
