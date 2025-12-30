package ksyun.client.epc.describeremotemanagements.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeRemoteManagementsResponse
* @Description DescribeRemoteManagements 返回体
*/
@Data
@ToString
public class DescribeRemoteManagementsResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**物理机带外的信息*/
    @JsonProperty("RemoteManagementSet")
    private List<RemoteManagementSetDto> RemoteManagementSet;

    @Data
    @ToString
    public static class RemoteManagementSetDto {
        /**带外管理的ID*/
        @JsonProperty("RemoteManagementId")
        private String RemoteManagementId;

        /**手机号码*/
        @JsonProperty("PhoneNumber")
        private String PhoneNumber;

        /**姓名*/
        @JsonProperty("Name")
        private String Name;

    }

}
