package ksyun.client.ebs.validateattachinstance.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ValidateAttachInstanceRequest
* @Description 请求参数
*/
@Data
public class ValidateAttachInstanceRequest{
    /**硬盘类型，有效值SSD2.0/SSD3.0/EHDD*/
    @KsYunField(name="VolumeType")
    private String VolumeType;

    /**需要校验的主机实例ID，长度为36个字符，包括字母，数字，-*/
    @KsYunField(name="InstanceId")
    private String InstanceId;


}