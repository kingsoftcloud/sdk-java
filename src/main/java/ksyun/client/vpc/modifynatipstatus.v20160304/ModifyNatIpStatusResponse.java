package ksyun.client.vpc.modifynatipstatus.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyNatIpStatusResponse
* @Description ModifyNatIpStatus 返回体
*/
@Data
@ToString
public class ModifyNatIpStatusResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**Nat Ip的信息*/
    @JsonProperty("NatIp")
    private NatIpDto NatIp;

    @Data
    @ToString
    public static class NatIpDto {
        /**Nat的Ip地址*/
        @JsonProperty("NatIp")
        private String NatIp;

        /**Nat Ip的ID*/
        @JsonProperty("NatIpId")
        private String NatIpId;

        /**Nat Ip的启用状态*/
        @JsonProperty("Enabled")
        private Boolean Enabled;

    }

}
