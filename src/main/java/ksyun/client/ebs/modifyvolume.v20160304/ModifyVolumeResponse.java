package ksyun.client.ebs.modifyvolume.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyVolumeResponse
* @Description ModifyVolume 返回体
*/
@Data
@ToString
public class ModifyVolumeResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**true：表示成功*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
