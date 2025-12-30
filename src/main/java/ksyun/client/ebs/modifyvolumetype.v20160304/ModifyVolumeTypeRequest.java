package ksyun.client.ebs.modifyvolumetype.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyVolumeTypeRequest
* @Description 请求参数
*/
@Data
public class ModifyVolumeTypeRequest{
    /**云盘ID*/
    @KsYunField(name="VolumeId")
    private String VolumeId;

    /**变配目标云盘的容量值*/
    @KsYunField(name="PerformanceVolumeSize")
    private String PerformanceVolumeSize;

    /**ESSD盘类型，默认是ESSD_PL1*/
    @KsYunField(name="PerformanceLevelVolumeCategory")
    private String PerformanceLevelVolumeCategory;

}
