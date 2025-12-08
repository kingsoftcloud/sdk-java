package ksyun.client.eip.createeippool.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateEipPoolResponse
* @Description CreateEipPool 返回体
*/
@Data
@ToString
public class CreateEipPoolResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
