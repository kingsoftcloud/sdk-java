package ksyun.client.kec.importimage.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ImportImageResponse
* @Description ImportImage 返回体
*/
@Data
@ToString
public class ImportImageResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("ImageId")
    private String ImageId;

}
