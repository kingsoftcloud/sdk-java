package ksyun.client.ebs.attachvolume.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AttachVolumeRequest
* @Description 请求参数
*/
@Data
public class AttachVolumeRequest{
    /**待挂载的云硬盘ID，云硬盘和云主机必须在同一可用区。长度36个字符，包括字母、数字、-、_-*/
    @KsYunField(name="VolumeId")
    private String VolumeId;

    /**待挂载的云主机实例ID*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**待挂载的云硬盘是否随云主机删除，默认值为false。取值范围：
true：删除云主机时，该云硬盘随云主机一起删除
false：删除云主机时，保留该云硬盘，仅卸载，不随云主机一起释放*/
    @KsYunField(name="DeleteWithInstance")
    private String DeleteWithInstance;


}