package ksyun.client.knad.modifyknadname.v20230323;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ModifyKnadNameResponse
 * @Description ModifyKnadName 返回体
 */
@Data
@ToString
public class ModifyKnadNameResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
