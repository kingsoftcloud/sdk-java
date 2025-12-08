package ksyun.client.iam.addprojectmember.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AddProjectMemberResponse
* @Description AddProjectMember 返回体
*/
@Data
@ToString
public class AddProjectMemberResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Result")
    private Integer Result;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
