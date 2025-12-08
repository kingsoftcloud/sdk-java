package ksyun.client.kcs.analyzehotkeys.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AnalyzeHotKeysResponse
* @Description AnalyzeHotKeys 返回体
*/
@Data
@ToString
public class AnalyzeHotKeysResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
