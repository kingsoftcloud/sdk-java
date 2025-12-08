package ksyun.client.epc.detachvolume.v20151101;

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
public class DetachVolumeRequest{
    /**裸金属服务器资源ID*/
    @KsYunField(name="HostId")
    private String HostId;

    /**EBS的ID*/
    @KsYunField(name="VolumeId")
    private String VolumeId;

}
