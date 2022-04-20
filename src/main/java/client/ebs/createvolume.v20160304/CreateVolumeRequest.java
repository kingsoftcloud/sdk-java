package client.ebs.createvolume.v20160304;
import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateVolumeRequest
* @Description 请求参数
*/
@Data
public class CreateVolumeRequest{
    /**硬盘名称
长度2-50个字符，包括字母、数字、-、_
不传自动生成*/
    @KsYunField(name="VolumeName")
    private String VolumeName;

    /**硬盘类型，4种，SSD2.0/SSD3.0/EHDD/SATA2.0*/
    @KsYunField(name="VolumeType")
    private String VolumeType;

    /**硬盘描述信息
长度1-128字符
磁盘描述会展示在控制台
不能以 http:// 和 https:// 开头*/
    @KsYunField(name="VolumeDesc")
    private String VolumeDesc;

    /**磁盘容量大小，单位GB
取值范围：【10，32000】，步长：1GB*/
    @KsYunField(name="Size")
    private Integer Size;

    /**购买云硬盘所处的可用区*/
    @KsYunField(name="AvailabilityZone")
    private String AvailabilityZone;

    /**计费类型
- Monthly（预付费，包年包月）
- HourlyInstantSettlement（后付费，按小时实时结算）
- Daily（后付费，按日月结）*/
    @KsYunField(name="ChargeType")
    private String ChargeType;

    /**预付费计费类型必填字段；有效值为1-36，单位月*/
    @KsYunField(name="PurchaseTime")
    private Integer PurchaseTime;

    /**硬盘项目组id，不传该参数将使用默认项目组id*/
    @KsYunField(name="ProjectId")
    private String ProjectId;

    /**子订单ID*/
    @KsYunField(name="SubOrderId")
    private String SubOrderId;


}