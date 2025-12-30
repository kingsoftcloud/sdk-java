package ksyun.client.ebs.modifyvolumetype.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyVolumeTypeResponse
* @Description ModifyVolumeType 返回体
*/
@Data
@ToString
public class ModifyVolumeTypeResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
