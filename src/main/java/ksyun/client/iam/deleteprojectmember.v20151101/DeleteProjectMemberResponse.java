package ksyun.client.iam.deleteprojectmember.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteProjectMemberResponse
* @Description DeleteProjectMember 返回体
*/
@Data
@ToString
public class DeleteProjectMemberResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Result")
    private Boolean Result;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
