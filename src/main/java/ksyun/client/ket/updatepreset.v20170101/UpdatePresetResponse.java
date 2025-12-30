package ksyun.client.ket.updatepreset.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdatePresetResponse
* @Description UpdatePreset 返回体
*/
@Data
@ToString
public class UpdatePresetResponse extends BaseResponseModel {

    /***/
    @JsonProperty("UpdatePresetResponse")
    private String UpdatePresetResponse;

}
