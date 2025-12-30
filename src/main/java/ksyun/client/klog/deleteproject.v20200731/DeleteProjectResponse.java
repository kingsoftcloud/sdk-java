package ksyun.client.klog.deleteproject.v20200731;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteProjectResponse
* @Description DeleteProject 返回体
*/
@Data
@ToString
public class DeleteProjectResponse extends BaseResponseModel {

    /**Res*/
    @JsonProperty("Res")
    private String Res;

}
