package ksyun.client.klog.updatelogpool.v20200731;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateLogPoolResponse
* @Description UpdateLogPool 返回体
*/
@Data
@ToString
public class UpdateLogPoolResponse extends BaseResponseModel {

    /**Res*/
    @JsonProperty("Res")
    private String Res;

}
