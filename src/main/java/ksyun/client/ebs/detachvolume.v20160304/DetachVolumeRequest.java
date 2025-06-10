package ksyun.client.ebs.detachvolume.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DetachVolumeRequest
 * @Description 请求参数
 */
@Data
public class DetachVolumeRequest {
    /**
     * 待卸载的云主机实例ID
     * 如果未传, 则获取当前硬盘挂载的主机ID
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 待卸载的云硬盘ID，云硬盘和云主机必须在同一可用区。长度36个字符，包括字母、数字、-、_
     */
    @KsYunField(name="VolumeId")
    private String VolumeId;

}