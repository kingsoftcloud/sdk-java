package ksyun.client.iam.createproject.v20151101;

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
    /**成功创建的项目ID*/
    @JsonProperty("Result")
    private Integer Result;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
