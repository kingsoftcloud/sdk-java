package ksyun.client.ket.getpresetlist.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetPresetListResponse
* @Description GetPresetList 返回体
*/
@Data
@ToString
public class GetPresetListResponse extends BaseResponseModel {
    /***/
    @JsonProperty("GetPresetListResponse")
    private String GetPresetListResponse;

}
