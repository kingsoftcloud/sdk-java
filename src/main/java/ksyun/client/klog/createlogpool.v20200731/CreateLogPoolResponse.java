package ksyun.client.klog.createlogpool.v20200731;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateLogPoolResponse
* @Description CreateLogPool 返回体
*/
@Data
@ToString
public class CreateLogPoolResponse extends BaseResponseModel {
    /**Res*/
    @JsonProperty("Res")
    private String Res;

}
