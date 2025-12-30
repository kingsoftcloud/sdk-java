package ksyun.client.kcs.analyzedaily.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AnalyzeDailyResponse
* @Description AnalyzeDaily 返回体
*/
@Data
@ToString
public class AnalyzeDailyResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private String Data;

}
