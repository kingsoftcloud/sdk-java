package ksyun.client.ket.delpreset.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DelPresetResponse
* @Description DelPreset 返回体
*/
@Data
@ToString
public class DelPresetResponse extends BaseResponseModel {
    /***/
    @JsonProperty("DelPresetResponse")
    private String DelPresetResponse;

}
