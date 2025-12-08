package ksyun.client.ebs.attachvolume.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AttachVolumeResponse
* @Description AttachVolume 返回体
*/
@Data
@ToString
public class AttachVolumeResponse extends BaseResponseModel {
    /**请求流水号*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**true表示挂载成功*/
    @JsonProperty("Return")
    private String ReturnField;

}
