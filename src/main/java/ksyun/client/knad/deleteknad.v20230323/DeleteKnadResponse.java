package ksyun.client.knad.deleteknad.v20230323;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteKnadResponse
* @Description DeleteKnad 返回体
*/
@Data
@ToString
public class DeleteKnadResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private String ReturnField;

}
