package ksyun.client.ebs.renewvolume.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RenewVolumeRequest
 * @Description 请求参数
 */
@Data
public class RenewVolumeRequest {
    /**
     * 待续费的云硬盘ID，云硬盘和云主机必须在同一可用区。长度36个字符，包括字母、数字、-、_
     */
    @KsYunField(name = "VolumeId")
    private String VolumeId;

    /**
     * 需要续费的月数
     */
    @KsYunField(name = "PurchaseTime")
    private Integer PurchaseTime;


}