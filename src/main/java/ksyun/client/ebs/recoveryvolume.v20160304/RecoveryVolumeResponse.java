package ksyun.client.ebs.recoveryvolume.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RecoveryVolumeResponse
* @Description RecoveryVolume 返回体
*/
@Data
@ToString
public class RecoveryVolumeResponse extends BaseResponseModel {
    /**请求流水号*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**true: 表示成功*/
    @JsonProperty("Return")
    private String ReturnField;

}
