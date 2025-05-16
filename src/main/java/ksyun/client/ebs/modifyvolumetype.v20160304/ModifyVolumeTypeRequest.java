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
public class ModifyVolumeTypeRequest {
    /***/
    @KsYunField(name = "VolumeId")
    private String VolumeId;

    /***/
    @KsYunField(name = "PerformanceVolumeSize")
    private String PerformanceVolumeSize;

    /**
     * essd4.0云盘类型
     */
    @KsYunField(name = "PerformanceLevelVolumeCategory")
    private String PerformanceLevelVolumeCategory;

}