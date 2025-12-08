package ksyun.client.kec.createimage.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateImageResponse
* @Description CreateImage 返回体
*/
@Data
@ToString
public class CreateImageResponse extends BaseResponseModel {
    /**请求ID。*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**新创建的镜像ID。*/
    @JsonProperty("ImageId")
    private String ImageId;

}
