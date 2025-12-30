package ksyun.client.klog.createproject.v20200731;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateProjectResponse
* @Description CreateProject 返回体
*/
@Data
@ToString
public class CreateProjectResponse extends BaseResponseModel {

    /**Res*/
    @JsonProperty("Res")
    private String Res;

}
