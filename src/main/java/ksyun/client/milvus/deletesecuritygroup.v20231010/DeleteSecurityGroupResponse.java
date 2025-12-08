package ksyun.client.milvus.deletesecuritygroup.v20231010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteSecurityGroupResponse
* @Description DeleteSecurityGroup 返回体
*/
@Data
@ToString
public class DeleteSecurityGroupResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Code")
    private String Code;

    /**请求状态*/
    @JsonProperty("Message")
    private String Message;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**当前操作的安全组ID*/
        @JsonProperty("SecurityGroupId")
        private String SecurityGroupId;

        /**当前安全组删除操作状态*/
        @JsonProperty("OperStatus")
        private String OperStatus;

        /**当前操作返回信息*/
        @JsonProperty("Msg")
        private String Msg;

    }

}
