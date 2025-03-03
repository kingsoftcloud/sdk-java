package ksyun.client.iam.deleteprojectmember.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DeleteProjectMemberResponse
 * @Description DeleteProjectMember 返回体
 */
@Data
@ToString
public class DeleteProjectMemberResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
