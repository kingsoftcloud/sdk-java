package ksyun.client.aicp.addsession.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AddSessionResponse
* @Description AddSession 返回体
*/
@Data
@ToString
public class AddSessionResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Data")
    private String Data;

}
