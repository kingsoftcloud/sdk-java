package ksyun.client.ebs.recoveryvolume.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RecoveryVolumeRequest
* @Description 请求参数
*/
@Data
public class RecoveryVolumeRequest{
    /**硬盘ID
长度36个字符，包括字母、数字、-*/
    @KsYunField(name="VolumeId")
    private String VolumeId;


}