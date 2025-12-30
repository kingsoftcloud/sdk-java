package ksyun.client.kec.rollbacklocalvolume.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RollbackLocalVolumeResponse
* @Description RollbackLocalVolume 返回体
*/
@Data
@ToString
public class RollbackLocalVolumeResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
