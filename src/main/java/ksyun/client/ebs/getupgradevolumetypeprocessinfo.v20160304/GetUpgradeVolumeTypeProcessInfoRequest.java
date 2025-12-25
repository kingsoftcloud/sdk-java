package ksyun.client.ebs.getupgradevolumetypeprocessinfo.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetUpgradeVolumeTypeProcessInfoRequest
* @Description 请求参数
*/
@Data
public class GetUpgradeVolumeTypeProcessInfoRequest{
    /**要查询的云盘*/
    @KsYunField(name = "VolumeId", type = 1)
    private List<String> VolumeIdList;

}
