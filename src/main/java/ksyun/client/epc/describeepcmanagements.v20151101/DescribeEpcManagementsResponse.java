package ksyun.client.epc.describeepcmanagements.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeEpcManagementsResponse
* @Description DescribeEpcManagements 返回体
*/
@Data
@ToString
public class DescribeEpcManagementsResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**裸金属服务器总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**物理机带外的信息*/
    @JsonProperty("EpcManagementSet")
    private List<EpcManagementSetDto> EpcManagementSet;

    @Data
    @ToString
    public static class EpcManagementSetDto {
        /**远程管理的ID*/
        @JsonProperty("EpcManagementId")
        private String EpcManagementId;

        /**远程管理的Ip*/
        @JsonProperty("EpcManagementIp")
        private String EpcManagementIp;

        /**远程管理的用户*/
        @JsonProperty("EpcManagementUserName")
        private String EpcManagementUserName;

        /**远程管理的密码*/
        @JsonProperty("Password")
        private String Password;

        /**云物理主机名称*/
        @JsonProperty("HostName")
        private String HostName;

        /**物理主机序列号*/
        @JsonProperty("Sn")
        private String Sn;

    }

}
