package ksyun.client.cdn.setvideoseekconfig.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetVideoSeekConfigResponse
* @Description SetVideoSeekConfig 返回体
*/
@Data
@ToString
public class SetVideoSeekConfigResponse extends BaseResponseModel {

    /***/
    @JsonProperty("SetVideoSeekConfigResponse")
    private String SetVideoSeekConfigResponse;

}
