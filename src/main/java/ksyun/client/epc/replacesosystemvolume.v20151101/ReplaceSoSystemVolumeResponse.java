package ksyun.client.epc.replacesosystemvolume.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ReplaceSoSystemVolumeResponse
* @Description ReplaceSoSystemVolume 返回体
*/
@Data
@ToString
public class ReplaceSoSystemVolumeResponse extends BaseResponseModel {

    /**1ded7233-54f8-44d1-a2ea-b6fcc0ca7390*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**true*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
