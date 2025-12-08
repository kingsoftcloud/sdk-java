package ksyun.client.ebs.deletevolume.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteVolumeResponse
* @Description DeleteVolume 返回体
*/
@Data
@ToString
public class DeleteVolumeResponse extends BaseResponseModel {
    /**请求流水号*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**true表示删除成功*/
    @JsonProperty("Return")
    private String ReturnField;

}
