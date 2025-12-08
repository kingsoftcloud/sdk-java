package ksyun.client.kce.addfavor.v20180314;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AddFavorResponse
* @Description AddFavor 返回体
*/
@Data
@ToString
public class AddFavorResponse extends BaseResponseModel {
    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
