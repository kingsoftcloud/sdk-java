package ksyun.client.kcs.analyzedailyswitch.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AnalyzeDailySwitchResponse
* @Description AnalyzeDailySwitch 返回体
*/
@Data
@ToString
public class AnalyzeDailySwitchResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private String Data;

}
