package ksyun.client.klog.deletelogpool.v20200731;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteLogPoolResponse
* @Description DeleteLogPool 返回体
*/
@Data
@ToString
public class DeleteLogPoolResponse extends BaseResponseModel {

    /**Res*/
    @JsonProperty("Res")
    private String Res;

}
