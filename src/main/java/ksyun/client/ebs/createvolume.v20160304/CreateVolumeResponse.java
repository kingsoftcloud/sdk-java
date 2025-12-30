package ksyun.client.ebs.createvolume.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateVolumeResponse
* @Description CreateVolume 返回体
*/
@Data
@ToString
public class CreateVolumeResponse extends BaseResponseModel {

    /**请求流水号*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**硬盘ID*/
    @JsonProperty("VolumeId")
    private String VolumeId;

}
