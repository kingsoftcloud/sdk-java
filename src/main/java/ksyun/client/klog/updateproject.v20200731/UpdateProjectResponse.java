package ksyun.client.klog.updateproject.v20200731;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateProjectResponse
* @Description UpdateProject 返回体
*/
@Data
@ToString
public class UpdateProjectResponse extends BaseResponseModel {

    /**Res*/
    @JsonProperty("Res")
    private String Res;

}
