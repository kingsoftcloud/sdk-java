package ksyun.client.kce.editeventcollecting.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname EditEventCollectingResponse
* @Description EditEventCollecting 返回体
*/
@Data
@ToString
public class EditEventCollectingResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
