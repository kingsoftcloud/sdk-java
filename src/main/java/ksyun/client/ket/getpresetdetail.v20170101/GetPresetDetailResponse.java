package ksyun.client.ket.getpresetdetail.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetPresetDetailResponse
* @Description GetPresetDetail 返回体
*/
@Data
@ToString
public class GetPresetDetailResponse extends BaseResponseModel {

    /***/
    @JsonProperty("GetPresetDetailResponse")
    private String GetPresetDetailResponse;

}
