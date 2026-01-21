package ksyun.client.aicp.deleteimage.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteImageResponse
* @Description DeleteImage 返回体
*/
@Data
@ToString
public class DeleteImageResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**镜像ID*/
    @JsonProperty("ImageId")
    private String ImageId;

}
