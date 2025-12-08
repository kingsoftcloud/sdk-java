package ksyun.client.sks.importkey.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ImportKeyResponse
* @Description ImportKey 返回体
*/
@Data
@ToString
public class ImportKeyResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
