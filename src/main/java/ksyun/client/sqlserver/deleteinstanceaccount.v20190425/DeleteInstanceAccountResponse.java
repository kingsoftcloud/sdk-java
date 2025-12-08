package ksyun.client.sqlserver.deleteinstanceaccount.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteInstanceAccountResponse
* @Description DeleteInstanceAccount 返回体
*/
@Data
@ToString
public class DeleteInstanceAccountResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
