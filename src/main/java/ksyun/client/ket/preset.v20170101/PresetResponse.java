package ksyun.client.ket.preset.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname PresetResponse
* @Description Preset 返回体
*/
@Data
@ToString
public class PresetResponse extends BaseResponseModel {
    /***/
    @JsonProperty("PresetResponse")
    private String PresetResponse;

}
