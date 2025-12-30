package ksyun.client.eip.deleteeippool.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteEipPoolResponse
* @Description DeleteEipPool 返回体
*/
@Data
@ToString
public class DeleteEipPoolResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
