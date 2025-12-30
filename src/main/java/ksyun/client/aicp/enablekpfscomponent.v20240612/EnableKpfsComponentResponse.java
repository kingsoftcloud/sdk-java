package ksyun.client.aicp.enablekpfscomponent.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname EnableKpfsComponentResponse
* @Description EnableKpfsComponent 返回体
*/
@Data
@ToString
public class EnableKpfsComponentResponse extends BaseResponseModel {

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
