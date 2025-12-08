package ksyun.client.ebs.modifyvolumepreset.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyVolumePresetRequest
* @Description 请求参数
*/
@Data
public class ModifyVolumePresetRequest{
    /***/
    @KsYunField(name="VolumeId")
    private String VolumeId;

    /***/
    @KsYunField(name="ProvisionedIops")
    private Integer ProvisionedIops;

}
