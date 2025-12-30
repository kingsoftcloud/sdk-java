package ksyun.client.ked.createlabel.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateLabelResponse
* @Description CreateLabel 返回体
*/
@Data
@ToString
public class CreateLabelResponse extends BaseResponseModel {

    /**请求唯一id*/
    @JsonProperty("requestId")
    private String RequestId;

    /**创建状态*/
    @JsonProperty("data")
    private Boolean Data;

}
